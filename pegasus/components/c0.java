package com.bilibili.pegasus.components;

import com.bilibili.okretro.BiliApiCallback;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.SafeContinuation;
import kotlinx.coroutines.JobKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/c0.class */
public final class c0 extends BiliApiCallback<BiliNotice> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SafeContinuation f75897b;

    public c0(SafeContinuation safeContinuation) {
        this.f75897b = safeContinuation;
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final boolean isCancel() {
        return !JobKt.isActive(this.f75897b.getContext());
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        Result.Companion companion = Result.Companion;
        Throwable th2 = th;
        if (th == null) {
            th2 = new Throwable();
        }
        this.f75897b.resumeWith(Result.constructor-impl(ResultKt.createFailure(th2)));
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onSuccess(BiliNotice biliNotice) {
        this.f75897b.resumeWith(Result.constructor-impl(biliNotice));
    }
}
