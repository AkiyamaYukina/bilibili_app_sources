package com.bilibili.playset.editor;

import com.bilibili.okretro.BiliApiDataCallback;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/editor/I.class */
public final class I extends BiliApiDataCallback<Integer> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CancellableContinuationImpl f84746b;

    public I(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f84746b = cancellableContinuationImpl;
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(Integer num) {
        this.f84746b.resumeWith(Result.constructor-impl(Result.box-impl(Result.constructor-impl(num))));
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        Result.Companion companion = Result.Companion;
        this.f84746b.resume(Result.box-impl(Result.constructor-impl(ResultKt.createFailure(th))), (Function1) null);
    }
}
