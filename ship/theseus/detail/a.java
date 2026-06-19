package com.bilibili.ship.theseus.detail;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;
import dagger.hilt.internal.UnsafeCasts;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/a.class */
public final class a implements OnContextAvailableListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f90868a;

    public a(b bVar) {
        this.f90868a = bVar;
    }

    @Override // androidx.activity.contextaware.OnContextAvailableListener
    public final void onContextAvailable(Context context) {
        b bVar = this.f90868a;
        if (bVar.f90872E) {
            return;
        }
        bVar.f90872E = true;
        ((j) bVar.generatedComponent()).b((UnitedBizDetailsActivity) UnsafeCasts.unsafeCast(bVar));
    }
}
