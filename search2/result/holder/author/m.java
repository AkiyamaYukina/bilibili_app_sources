package com.bilibili.search2.result.holder.author;

import android.widget.PopupWindow;
import kotlin.Result;
import kotlin.Unit;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/author/m.class */
public final class m implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CancellableContinuationImpl f87880a;

    public m(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f87880a = cancellableContinuationImpl;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        CancellableContinuationImpl cancellableContinuationImpl = this.f87880a;
        Result.Companion companion = Result.Companion;
        cancellableContinuationImpl.resumeWith(Result.constructor-impl(Unit.INSTANCE));
    }
}
