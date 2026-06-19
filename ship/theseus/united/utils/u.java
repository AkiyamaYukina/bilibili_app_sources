package com.bilibili.ship.theseus.united.utils;

import android.view.View;
import kotlin.Result;
import kotlin.Unit;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.JobKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/utils/u.class */
public final class u implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CancellableContinuationImpl f104878a;

    public u(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f104878a = cancellableContinuationImpl;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
        view.removeOnLayoutChangeListener(this);
        if (JobKt.isActive(this.f104878a.getContext())) {
            CancellableContinuationImpl cancellableContinuationImpl = this.f104878a;
            Result.Companion companion = Result.Companion;
            cancellableContinuationImpl.resumeWith(Result.constructor-impl(Unit.INSTANCE));
        }
    }
}
