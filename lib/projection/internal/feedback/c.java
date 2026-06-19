package com.bilibili.lib.projection.internal.feedback;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.bilibili.base.BiliContext;
import com.bilibili.commons.compress.ZipUtils;
import com.bilibili.gripper.laser.LegacyLaserFetcher;
import com.bilibili.lib.biliid.api.BuvidHelper;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.foundation.Foundation;
import com.bilibili.lib.projection.internal.feedback.PlayerCastFeedbackFragment;
import com.bilibili.moduleservice.userfeedback.UserFeedbackService;
import com.common.bili.laser.api.Laser;
import dagger.hilt.EntryPoints;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import kotlin.text.StringsKt;
import okhttp3.Callback;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import tv.danmaku.android.log.BLog;
import w8.y;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/feedback/c.class */
public final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f63199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final WeakReference<a> f63200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final d f63201c = new d(this, Looper.getMainLooper());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f63202d = "532";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final String f63203e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/feedback/c$a.class */
    public interface a {
        void onFailed();

        void onSuccess();
    }

    public c(Context context, PlayerCastFeedbackFragment.b bVar, String str) {
        this.f63199a = context.getApplicationContext();
        this.f63203e = str;
        this.f63200b = new WeakReference<>(bVar);
    }

    public final String a() throws Exception {
        String string;
        File externalFilesDir = this.f63199a.getExternalFilesDir("log");
        if (externalFilesDir == null) {
            string = null;
        } else {
            if (!externalFilesDir.exists()) {
                externalFilesDir.mkdirs();
            }
            String absolutePath = externalFilesDir.getAbsolutePath();
            StringBuilder sb = new StringBuilder(absolutePath);
            if (StringsKt.w(absolutePath, "/")) {
                sb.append("player_cast_report_");
                sb.append(System.currentTimeMillis());
            } else {
                sb.append(File.separator);
                sb.append("player_cast_report_");
                sb.append(System.currentTimeMillis());
            }
            sb.append(".zip");
            File file = new File(sb.toString());
            ArrayList arrayList = new ArrayList(1);
            File[] logFilesByDate = BLog.getLogFilesByDate(1, new Date(System.currentTimeMillis()));
            if (logFilesByDate != null) {
                Collections.addAll(arrayList, Arrays.copyOf(logFilesByDate, logFilesByDate.length));
            }
            File externalFilesDir2 = this.f63199a.getExternalFilesDir("dlna");
            if (externalFilesDir2 != null) {
                String absolutePath2 = externalFilesDir2.getAbsolutePath();
                String str = File.separator;
                File file2 = new File(B0.a.a(absolutePath2, str, "ssdp.log"));
                File file3 = new File(B0.a.a(absolutePath2, str, "soap.log"));
                File file4 = new File(B0.a.a(absolutePath2, str, "xiaomi.log"));
                if (file2.exists()) {
                    arrayList.add(file2);
                }
                if (file3.exists()) {
                    arrayList.add(file3);
                }
                if (file4.exists()) {
                    arrayList.add(file4);
                }
            }
            try {
                File[] fileArr = (File[]) arrayList.toArray(new File[0]);
                ZipUtils.zip(file, (File[]) Arrays.copyOf(fileArr, fileArr.length));
                string = file.toString();
            } catch (IOException e7) {
                string = null;
            }
        }
        if (string == null || TextUtils.isEmpty(string)) {
            BLog.e("PlayerFeedbackTask", "player feedback file save failed");
            return null;
        }
        File file5 = new File(string);
        if (!file5.isFile() || !file5.exists()) {
            return null;
        }
        String absolutePath3 = file5.getAbsolutePath();
        UserFeedbackService userFeedbackService = (UserFeedbackService) BLRouter.INSTANCE.get(UserFeedbackService.class, "default");
        String strUploadFeedbackLog = userFeedbackService != null ? userFeedbackService.uploadFeedbackLog(absolutePath3, null) : null;
        if (!file5.delete()) {
            file5.getAbsoluteFile().delete();
        }
        if (TextUtils.isEmpty(strUploadFeedbackLog)) {
            return null;
        }
        return (String) ((JSONObject) new JSONObject(strUploadFeedbackLog).get("data")).get("url");
    }

    @Override // java.lang.Runnable
    public final void run() {
        String strA;
        UserFeedbackService userFeedbackService;
        Laser.Reporter reporter;
        try {
            strA = a();
        } catch (Exception e7) {
            strA = null;
        }
        if (TextUtils.isEmpty(strA)) {
            this.f63201c.sendEmptyMessage(2);
            return;
        }
        Laser legacyLaser = ((LegacyLaserFetcher) EntryPoints.get(BiliContext.application(), LegacyLaserFetcher.class)).getLegacyLaser();
        if (legacyLaser != null && (reporter = legacyLaser.getReporter()) != null) {
            Laser.Reporter.doFawkesReport$default(reporter, new Laser.Reporter.Request(Foundation.Companion.instance().getApps().getFawkesAppKey(), y.a(), BuvidHelper.getBuvid(), strA == null ? "" : strA), (Callback) null, 2, (Object) null);
        }
        if (strA != null && (userFeedbackService = (UserFeedbackService) BLRouter.INSTANCE.get(UserFeedbackService.class, "default")) != null) {
            userFeedbackService.addReportItem(this.f63199a, this.f63203e, "", strA, this.f63202d, "view");
        }
        this.f63201c.sendEmptyMessage(1);
    }
}
