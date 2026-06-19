package com.bilibili.lib.ui;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;

/* JADX INFO: renamed from: com.bilibili.lib.ui.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/n.class */
public final class C5353n implements OnContextAvailableListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractActivityC5354o f64905a;

    public C5353n(AbstractActivityC5354o abstractActivityC5354o) {
        this.f64905a = abstractActivityC5354o;
    }

    @Override // androidx.activity.contextaware.OnContextAvailableListener
    public final void onContextAvailable(Context context) {
        AbstractActivityC5354o abstractActivityC5354o = this.f64905a;
        if (abstractActivityC5354o.f64906A) {
            return;
        }
        abstractActivityC5354o.f64906A = true;
        InterfaceC5346g interfaceC5346g = (InterfaceC5346g) abstractActivityC5354o.generatedComponent();
        interfaceC5346g.getClass();
    }
}
