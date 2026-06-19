package com.bilibili.lib.ui;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/r.class */
public final class r implements OnContextAvailableListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f64916a;

    public r(s sVar) {
        this.f64916a = sVar;
    }

    @Override // androidx.activity.contextaware.OnContextAvailableListener
    public final void onContextAvailable(Context context) {
        s sVar = this.f64916a;
        if (sVar.f64920E) {
            return;
        }
        sVar.f64920E = true;
        InterfaceC5352m interfaceC5352m = (InterfaceC5352m) sVar.generatedComponent();
        interfaceC5352m.getClass();
    }
}
