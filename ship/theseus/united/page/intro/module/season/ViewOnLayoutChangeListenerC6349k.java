package com.bilibili.ship.theseus.united.page.intro.module.season;

import android.view.View;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.season.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/k.class */
public final class ViewOnLayoutChangeListenerC6349k implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnitedSeasonClockExpandableLayout2 f101662a;

    public ViewOnLayoutChangeListenerC6349k(UnitedSeasonClockExpandableLayout2 unitedSeasonClockExpandableLayout2) {
        this.f101662a = unitedSeasonClockExpandableLayout2;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
        UnitedSeasonClockExpandableLayout2 unitedSeasonClockExpandableLayout2 = this.f101662a;
        if (i10 - i8 == unitedSeasonClockExpandableLayout2.f101523a) {
            unitedSeasonClockExpandableLayout2.post(new com.bilibili.bplus.im.business.client.manager.o(unitedSeasonClockExpandableLayout2, 2));
            this.f101662a.removeOnLayoutChangeListener(this);
        }
    }
}
