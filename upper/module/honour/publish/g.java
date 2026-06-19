package com.bilibili.upper.module.honour.publish;

import com.bilibili.okretro.BiliApiCallback;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.studio.videoeditor.generalrender.bean.GRContributeResult;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.SafeContinuation;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/honour/publish/g.class */
public final class g extends BiliApiCallback<GeneralResponse<GRContributeResult>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SafeContinuation f113195b;

    public g(SafeContinuation safeContinuation) {
        this.f113195b = safeContinuation;
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        if (th != null) {
            Result.Companion companion = Result.Companion;
            this.f113195b.resumeWith(Result.constructor-impl(ResultKt.createFailure(th)));
        }
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onSuccess(GeneralResponse<GRContributeResult> generalResponse) {
        GeneralResponse<GRContributeResult> generalResponse2 = generalResponse;
        SafeContinuation safeContinuation = this.f113195b;
        if (generalResponse2 == null || generalResponse2.code != 0) {
            Result.Companion companion = Result.Companion;
            safeContinuation.resumeWith(Result.constructor-impl(ResultKt.createFailure(new RuntimeException(generalResponse2 != null ? generalResponse2.message : null))));
        } else if (generalResponse2.data != null) {
            safeContinuation.resumeWith(Result.constructor-impl(generalResponse2));
        } else {
            Result.Companion companion2 = Result.Companion;
            safeContinuation.resumeWith(Result.constructor-impl(ResultKt.createFailure(new RuntimeException("result is null"))));
        }
    }
}
