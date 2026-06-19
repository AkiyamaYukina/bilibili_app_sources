package com.bilibili.playset.editor;

import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.playset.api.PlaySet;
import kotlin.Result;
import kotlin.ResultKt;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: renamed from: com.bilibili.playset.editor.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/editor/q.class */
public final class C5950q extends BiliApiDataCallback<PlaySet> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CancellableContinuationImpl f84831b;

    public C5950q(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f84831b = cancellableContinuationImpl;
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(PlaySet playSet) {
        this.f84831b.resumeWith(Result.constructor-impl(Result.box-impl(Result.constructor-impl(playSet))));
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        Result.Companion companion = Result.Companion;
        this.f84831b.resumeWith(Result.constructor-impl(Result.box-impl(Result.constructor-impl(ResultKt.createFailure(th)))));
    }
}
