package com.bilibili.ogv.feedback;

import android.text.TextUtils;
import com.bilibili.boxing.model.entity.impl.ImageMedia;
import com.bilibili.commons.compress.ZipUtils;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.moduleservice.userfeedback.UserFeedbackService;
import com.bilibili.ogv.feedback.BaseBangumiFeedbackFragment;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;
import tv.danmaku.android.log.BLog;
import vj0.c;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/feedback/a.class */
public final class a implements Callable<Pair<List<String>, String>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BaseBangumiFeedbackFragment f67603a;

    public a(BaseBangumiFeedbackFragment baseBangumiFeedbackFragment) {
        this.f67603a = baseBangumiFeedbackFragment;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0192 -> B:43:0x0186). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Callable
    public final Pair<List<String>, String> call() throws Exception {
        String str;
        ArrayList arrayList = new ArrayList();
        BaseBangumiFeedbackFragment baseBangumiFeedbackFragment = this.f67603a;
        Iterator it = ((ArrayList) baseBangumiFeedbackFragment.f67587j.jf()).iterator();
        while (true) {
            String strUploadFeedbackLog = null;
            if (!it.hasNext()) {
                try {
                    File externalFilesDir = baseBangumiFeedbackFragment.requireContext().getExternalFilesDir("log");
                    if (externalFilesDir == null) {
                        str = "";
                    } else {
                        if (!externalFilesDir.exists()) {
                            externalFilesDir.mkdirs();
                        }
                        String absolutePath = externalFilesDir.getAbsolutePath();
                        StringBuilder sb = new StringBuilder(absolutePath);
                        if (StringsKt.w(absolutePath, "/")) {
                            sb.append("player_report_");
                            sb.append(System.currentTimeMillis());
                        } else {
                            sb.append("player_report_");
                            sb.append(System.currentTimeMillis());
                        }
                        sb.append(".zip");
                        File file = new File(sb.toString());
                        File[] logFilesByDate = BLog.getLogFilesByDate(1, new Date(System.currentTimeMillis()));
                        File[] fileArr = logFilesByDate;
                        if (logFilesByDate == null) {
                            fileArr = new File[0];
                        }
                        ZipUtils.zip(file, (File[]) Arrays.copyOf(fileArr, fileArr.length));
                        String absolutePath2 = file.getAbsolutePath();
                        UserFeedbackService userFeedbackService = (UserFeedbackService) BLRouter.INSTANCE.get(UserFeedbackService.class, "default");
                        String strUploadFeedbackLog2 = null;
                        if (userFeedbackService != null) {
                            strUploadFeedbackLog2 = userFeedbackService.uploadFeedbackLog(absolutePath2, null);
                        }
                        str = "";
                        if (strUploadFeedbackLog2 != null) {
                            str = (String) ((JSONObject) new JSONObject(strUploadFeedbackLog2).get("data")).get("url");
                            c.a(str);
                        }
                    }
                } catch (Exception e7) {
                    str = "";
                }
                return new Pair<>(arrayList, str);
            }
            String path = ((ImageMedia) it.next()).getPath();
            UserFeedbackService userFeedbackService2 = (UserFeedbackService) BLRouter.INSTANCE.get(UserFeedbackService.class, "default");
            if (userFeedbackService2 != null) {
                strUploadFeedbackLog = userFeedbackService2.uploadFeedbackLog(path, null);
            }
            if (TextUtils.isEmpty(strUploadFeedbackLog)) {
                throw new BaseBangumiFeedbackFragment.UploadFailedException();
            }
            try {
                arrayList.add(new JSONObject(strUploadFeedbackLog).getJSONObject("data").getString("url"));
            } catch (JSONException e8) {
                throw new BaseBangumiFeedbackFragment.UploadFailedException(e8);
            }
        }
    }
}
