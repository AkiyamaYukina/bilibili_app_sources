package com.bilibili.ship.theseus.ogv.chathall;

import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import zu0.C9249q;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/chathall/o.class */
public final class o implements DrawerLayout.DrawerListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f91788a;

    public o(p pVar) {
        this.f91788a = pVar;
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public final void onDrawerClosed(View view) {
        C9249q.a aVar = this.f91788a.f91789a;
        if (aVar != null) {
            aVar.onChange();
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public final void onDrawerOpened(View view) {
        C9249q.a aVar = this.f91788a.f91789a;
        if (aVar != null) {
            aVar.onChange();
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public final void onDrawerSlide(View view, float f7) {
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public final void onDrawerStateChanged(int i7) {
    }
}
