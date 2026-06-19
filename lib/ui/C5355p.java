package com.bilibili.lib.ui;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;

/* JADX INFO: renamed from: com.bilibili.lib.ui.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/p.class */
public final class C5355p implements OnContextAvailableListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f64910a;

    public C5355p(q qVar) {
        this.f64910a = qVar;
    }

    @Override // androidx.activity.contextaware.OnContextAvailableListener
    public final void onContextAvailable(Context context) {
        q qVar = this.f64910a;
        if (qVar.f64912A) {
            return;
        }
        qVar.f64912A = true;
        InterfaceC5349j interfaceC5349j = (InterfaceC5349j) qVar.generatedComponent();
        interfaceC5349j.getClass();
    }
}
