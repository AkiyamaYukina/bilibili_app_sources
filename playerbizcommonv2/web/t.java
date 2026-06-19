package com.bilibili.playerbizcommonv2.web;

import android.view.View;
import kotlin.Result;
import kotlin.Unit;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/web/t.class */
public final class t implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CancellableContinuationImpl f82243a;

    public t(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f82243a = cancellableContinuationImpl;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        if (this.f82243a.isActive()) {
            CancellableContinuationImpl cancellableContinuationImpl = this.f82243a;
            Result.Companion companion = Result.Companion;
            cancellableContinuationImpl.resumeWith(Result.constructor-impl(Unit.INSTANCE));
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
