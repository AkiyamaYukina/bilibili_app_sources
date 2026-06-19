package com.bilibili.studio.material.internal.download;

import S9.r;
import com.bilibili.lib.okdownloader.DownloadErrorInfo;
import com.bilibili.lib.okdownloader.DownloadListener2;
import com.bilibili.studio.material.util.UtilsKt;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CancellableContinuationImpl;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/internal/download/a.class */
public final class a implements DownloadListener2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f108548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f108549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f108550c;

    public a(e eVar, String str, String str2) {
        this.f108548a = eVar;
        this.f108549b = str;
        this.f108550c = str2;
    }

    public final void onCancel(String str) {
        CancellableContinuationImpl cancellableContinuationImpl = this.f108548a.f108555b;
        if (cancellableContinuationImpl.isActive()) {
            Result.Companion companion = Result.Companion;
            cancellableContinuationImpl.resumeWith(Result.constructor-impl(ResultKt.createFailure(new Throwable("material_download_task_cancel"))));
        }
    }

    public final void onCheck(String str) {
    }

    public final void onError(String str, List<Integer> list, long j7, long j8) {
    }

    public final void onError2(String str, DownloadErrorInfo downloadErrorInfo) {
        int errorCode = downloadErrorInfo.getErrorCode();
        String message = downloadErrorInfo.getThrowable().getMessage();
        StringBuilder sbA = androidx.constraintlayout.widget.e.a(errorCode, "taskId: ", str, ", code: ", ", reason: ");
        sbA.append(message);
        String string = sbA.toString();
        BLog.e(UtilsKt.Material_TAG, string);
        int errorCode2 = downloadErrorInfo.getErrorCode();
        downloadErrorInfo.getTotalSize();
        downloadErrorInfo.getCurrentLength();
        CancellableContinuationImpl cancellableContinuationImpl = this.f108548a.f108555b;
        if (cancellableContinuationImpl.isActive()) {
            Result.Companion companion = Result.Companion;
            cancellableContinuationImpl.resumeWith(Result.constructor-impl(ResultKt.createFailure(new DownloadThrowable(Integer.valueOf(errorCode2), string))));
        }
    }

    public final void onFinish(String str, String str2, String str3) {
        String str4 = this.f108549b;
        String str5 = this.f108550c;
        CancellableContinuationImpl cancellableContinuationImpl = this.f108548a.f108555b;
        if (cancellableContinuationImpl.isActive()) {
            if (str4.length() != 0 && str5.length() != 0) {
                Result.Companion companion = Result.Companion;
                cancellableContinuationImpl.resumeWith(Result.constructor-impl(new DownloadResponse(str4, str5)));
            } else {
                Throwable th = new Throwable(str4.length() == 0 ? "filePath is null" : "filename is null");
                Result.Companion companion2 = Result.Companion;
                r.b(th, cancellableContinuationImpl);
            }
        }
    }

    public final void onLoading(String str, long j7, long j8, long j9, int i7) {
        if (i7 < 100) {
            float f7 = j7;
            Function3<Float, Integer, Integer, Unit> function3 = this.f108548a.f108554a;
            if (function3 != null) {
                function3.invoke(Float.valueOf(f7), Integer.valueOf(i7), 100);
            }
        }
    }

    public final void onPause(String str, long j7, long j8) {
    }

    public final void onRetry(String str, int i7) {
    }

    public final void onStart(String str) {
    }

    public final void onWait(String str) {
    }
}
