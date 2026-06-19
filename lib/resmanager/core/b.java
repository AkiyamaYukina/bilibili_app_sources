package com.bilibili.lib.resmanager.core;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.compose.ui.text.font.C4496a;
import com.bilibili.commons.RandomUtils;
import com.bilibili.commons.security.DigestUtils;
import com.bilibili.gripper.downloader.GDownloader;
import com.bilibili.lib.resmanager.ResCallback;
import com.bilibili.lib.resmanager.ResDownloadRequest;
import com.bilibili.lib.resmanager.ResResponse;
import java.io.File;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/resmanager/core/b.class */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f64298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Set<String> f64299b = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Lazy f64300c = LazyKt.lazy(new MS.h(this, 2));

    public b(@NotNull Context context) {
        this.f64298a = context;
    }

    public final GDownloader.Task a(ResDownloadRequest resDownloadRequest, DefaultResCache defaultResCache, ResCallback resCallback, GDownloader.Dispatchers dispatchers) {
        String strC;
        if (TextUtils.isEmpty(resDownloadRequest.getUrl$resmanager_release())) {
            if (resCallback == null) {
                return null;
            }
            resCallback.onFailure(2, "empty url");
            return null;
        }
        if (CollectionsKt.contains(this.f64299b, resDownloadRequest.getUrl$resmanager_release())) {
            if (resCallback == null) {
                return null;
            }
            resCallback.onFailure(3, "task is downloading");
            return null;
        }
        ResResponse resResponseD = defaultResCache != null ? defaultResCache.d(resDownloadRequest) : null;
        if ((defaultResCache != null ? Intrinsics.areEqual(defaultResCache.h(resDownloadRequest), Boolean.TRUE) : false) && resResponseD != null) {
            j4.o.a("File existed, download cancel! url:", resDownloadRequest.getUrl$resmanager_release(), ", key:", resDownloadRequest.getKey$resmanager_release(), "BiliResDownloader");
            if (resCallback == null) {
                return null;
            }
            resCallback.onSuccess(resResponseD);
            return null;
        }
        Context context = this.f64298a;
        if (TextUtils.isEmpty(r.a(resDownloadRequest))) {
            strC = null;
        } else if (resDownloadRequest.getEncrypted$resmanager_release()) {
            int iNextInt = RandomUtils.nextInt(4, 8);
            StringBuilder sb = new StringBuilder();
            for (int i7 = 0; i7 < iNextInt; i7++) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i7);
                sb2.append(jElapsedRealtime);
                sb.append(DigestUtils.md5(sb2.toString()));
                sb.append(File.separator);
            }
            String str = r.f64332a;
            String strC2 = str;
            if (str == null) {
                strC2 = r.c(context);
            }
            strC = strC2 + File.separator + ((Object) sb);
        } else {
            strC = r.f64332a;
            if (strC == null) {
                strC = r.c(context);
            }
        }
        if (TextUtils.isEmpty(strC)) {
            if (resCallback == null) {
                return null;
            }
            resCallback.onFailure(4, "dest path error");
            return null;
        }
        ((CopyOnWriteArraySet) this.f64299b).add(resDownloadRequest.getUrl$resmanager_release());
        GDownloader gDownloader = (GDownloader) this.f64300c.getValue();
        String url$resmanager_release = resDownloadRequest.getUrl$resmanager_release();
        String downloadTag$resmanager_release = resDownloadRequest.getDownloadTag$resmanager_release();
        String strA = downloadTag$resmanager_release;
        if (downloadTag$resmanager_release == null) {
            strA = C4496a.a("ResManager-", resDownloadRequest.getBizType$resmanager_release().name());
        }
        GDownloader.DownloadRequest downloadRequestInto = gDownloader.create(url$resmanager_release, strA).into(strC);
        if (!TextUtils.isEmpty(resDownloadRequest.getMd5$resmanager_release())) {
            downloadRequestInto.md5(resDownloadRequest.getMd5$resmanager_release());
        }
        if (dispatchers != null) {
            downloadRequestInto.callbackOn(dispatchers);
        }
        String strA2 = r.a(resDownloadRequest);
        String str2 = strA2;
        if (strA2 == null) {
            str2 = "";
        }
        return downloadRequestInto.fileName(str2).speedLimit(resDownloadRequest.getSpeedLimit$resmanager_release()).addListener(new a(this, resDownloadRequest, resCallback, defaultResCache)).build();
    }

    public final void b(@NotNull ResDownloadRequest resDownloadRequest, @Nullable DefaultResCache defaultResCache, @Nullable ResCallback resCallback) {
        GDownloader.Task taskA = a(resDownloadRequest, defaultResCache, resCallback, null);
        if (taskA == null) {
            return;
        }
        taskA.enqueue();
    }
}
