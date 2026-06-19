package com.bilibili.search2.result.all;

import android.widget.PopupWindow;
import kotlin.Result;
import kotlin.Unit;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: renamed from: com.bilibili.search2.result.all.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/all/d.class */
public final class C6050d implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CancellableContinuationImpl f87276a;

    public C6050d(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f87276a = cancellableContinuationImpl;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        CancellableContinuationImpl cancellableContinuationImpl = this.f87276a;
        Result.Companion companion = Result.Companion;
        cancellableContinuationImpl.resumeWith(Result.constructor-impl(Unit.INSTANCE));
    }
}
