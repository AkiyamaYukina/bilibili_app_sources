package com.bilibili.lib.ui;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/t.class */
public final class t implements OnContextAvailableListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f64934a;

    public t(u uVar) {
        this.f64934a = uVar;
    }

    @Override // androidx.activity.contextaware.OnContextAvailableListener
    public final void onContextAvailable(Context context) {
        u uVar = this.f64934a;
        if (uVar.f64941E) {
            return;
        }
        uVar.f64941E = true;
        N n7 = (N) uVar.generatedComponent();
        n7.getClass();
    }
}
