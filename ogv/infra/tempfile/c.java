package com.bilibili.ogv.infra.tempfile;

import com.bilibili.lib.okdownloader.BiliDownloader;
import com.bilibili.lib.okdownloader.DownloadErrorInfo;
import com.bilibili.lib.okdownloader.DownloadListener2;
import kotlin.Unit;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/tempfile/c.class */
public final class c implements DownloadListener2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CancellableContinuationImpl f67938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f67939b;

    public c(CancellableContinuationImpl cancellableContinuationImpl, d dVar) {
        this.f67938a = cancellableContinuationImpl;
        this.f67939b = dVar;
    }

    public final void onError2(String str, DownloadErrorInfo downloadErrorInfo) {
        com.bilibili.ogv.infra.coroutine.a.b(downloadErrorInfo.getThrowable(), this.f67938a);
        BiliDownloader.Companion.getInstance(this.f67939b.f67941b).cancel(str);
    }

    public final void onFinish(String str, String str2, String str3) {
        com.bilibili.ogv.infra.coroutine.a.a(this.f67938a, Unit.INSTANCE);
    }
}
