package com.bilibili.studio.editor.asr.zip2ai;

import com.bilibili.lib.fileupload.bean.FileUploadInfo;
import kotlin.TuplesKt;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/zip2ai/c.class */
public final class c extends M90.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CancellableContinuationImpl f105681a;

    public c(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f105681a = cancellableContinuationImpl;
    }

    public final void onCancel(FileUploadInfo fileUploadInfo) {
        super.onCancel(fileUploadInfo);
        yC0.a.a(this.f105681a, TuplesKt.to("", -1));
    }

    public final void onFail(FileUploadInfo fileUploadInfo, int i7) {
        super.onFail(fileUploadInfo, i7);
        yC0.a.a(this.f105681a, TuplesKt.to("", Integer.valueOf(i7)));
    }

    public final void onSuccess(FileUploadInfo fileUploadInfo, String str) {
        super.onSuccess(fileUploadInfo, str);
        yC0.a.a(this.f105681a, TuplesKt.to(fileUploadInfo.getUposUri(), 0));
    }
}
