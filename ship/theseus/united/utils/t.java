package com.bilibili.ship.theseus.united.utils;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.Result;
import kotlin.Unit;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.JobKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/utils/t.class */
public final class t implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f104876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CancellableContinuationImpl f104877b;

    public t(View view, CancellableContinuationImpl cancellableContinuationImpl) {
        this.f104876a = view;
        this.f104877b = cancellableContinuationImpl;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.f104876a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        if (JobKt.isActive(this.f104877b.getContext())) {
            CancellableContinuationImpl cancellableContinuationImpl = this.f104877b;
            Result.Companion companion = Result.Companion;
            cancellableContinuationImpl.resumeWith(Result.constructor-impl(Unit.INSTANCE));
        }
    }
}
