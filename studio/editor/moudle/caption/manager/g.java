package com.bilibili.studio.editor.moudle.caption.manager;

import com.bilibili.okretro.BiliApiCallback;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionBean;
import kotlin.Result;
import kotlin.ResultKt;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/caption/manager/g.class */
public final class g extends BiliApiCallback<GeneralResponse<CaptionBean>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CancellableContinuationImpl f105786b;

    public g(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f105786b = cancellableContinuationImpl;
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        Result.Companion companion = Result.Companion;
        this.f105786b.resumeWith(Result.constructor-impl(ResultKt.createFailure(new Exception(th.getMessage()))));
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onSuccess(GeneralResponse<CaptionBean> generalResponse) {
        CaptionBean captionBean;
        GeneralResponse<CaptionBean> generalResponse2 = generalResponse;
        CancellableContinuationImpl cancellableContinuationImpl = this.f105786b;
        if (generalResponse2 != null && (captionBean = generalResponse2.data) != null) {
            cancellableContinuationImpl.resumeWith(Result.constructor-impl(captionBean));
        } else {
            Result.Companion companion = Result.Companion;
            cancellableContinuationImpl.resumeWith(Result.constructor-impl(ResultKt.createFailure(new Exception("caption bean is null"))));
        }
    }
}
