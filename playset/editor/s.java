package com.bilibili.playset.editor;

import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.playset.api.PlaySet;
import kotlin.Result;
import kotlin.ResultKt;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/editor/s.class */
public final class s extends BiliApiDataCallback<PlaySet> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CancellableContinuationImpl f84839b;

    public s(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f84839b = cancellableContinuationImpl;
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(PlaySet playSet) {
        this.f84839b.resumeWith(Result.constructor-impl(Result.box-impl(Result.constructor-impl(playSet))));
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        Result.Companion companion = Result.Companion;
        this.f84839b.resumeWith(Result.constructor-impl(Result.box-impl(Result.constructor-impl(ResultKt.createFailure(th)))));
    }
}
