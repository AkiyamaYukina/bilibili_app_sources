package com.bilibili.ship.theseus.ogv.chathall;

import android.content.DialogInterface;
import kotlin.Unit;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/chathall/i.class */
public final class i implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CancellableContinuationImpl f91778a;

    public i(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f91778a = cancellableContinuationImpl;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        com.bilibili.ogv.infra.coroutine.a.a(this.f91778a, Unit.INSTANCE);
    }
}
