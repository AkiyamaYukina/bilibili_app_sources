package com.bilibili.ogv.operation2;

import android.content.DialogInterface;
import kotlin.Result;
import kotlin.Unit;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/h.class */
public final class h implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CancellableContinuationImpl f70838a;

    public h(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f70838a = cancellableContinuationImpl;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        CancellableContinuationImpl cancellableContinuationImpl = this.f70838a;
        Result.Companion companion = Result.Companion;
        cancellableContinuationImpl.resumeWith(Result.constructor-impl(Unit.INSTANCE));
    }
}
