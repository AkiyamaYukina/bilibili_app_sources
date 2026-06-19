package com.bilibili.module.vip.mall;

import android.content.DialogInterface;
import kotlin.Unit;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/mall/f.class */
public final class f implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CancellableContinuationImpl f66254a;

    public f(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f66254a = cancellableContinuationImpl;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        com.bilibili.ogv.infra.coroutine.a.a(this.f66254a, Unit.INSTANCE);
    }
}
