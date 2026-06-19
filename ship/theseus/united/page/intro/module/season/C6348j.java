package com.bilibili.ship.theseus.united.page.intro.module.season;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.season.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/j.class */
public final class C6348j extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnitedSeasonClockExpandableLayout2 f101661a;

    public C6348j(UnitedSeasonClockExpandableLayout2 unitedSeasonClockExpandableLayout2) {
        this.f101661a = unitedSeasonClockExpandableLayout2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.f101661a.f101528f = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        UnitedSeasonClockExpandableLayout2 unitedSeasonClockExpandableLayout2 = this.f101661a;
        CharSequence charSequence = unitedSeasonClockExpandableLayout2.f101531j;
        if (charSequence != null && charSequence.length() != 0 && unitedSeasonClockExpandableLayout2.f101526d && unitedSeasonClockExpandableLayout2.f101525c) {
            unitedSeasonClockExpandableLayout2.f101525c = false;
            TextView textView = unitedSeasonClockExpandableLayout2.f101532k;
            if (textView != null) {
                textView.setText(unitedSeasonClockExpandableLayout2.f101531j);
            }
            InterfaceC6341c interfaceC6341c = unitedSeasonClockExpandableLayout2.h;
            if (interfaceC6341c != null) {
                interfaceC6341c.onStateChange();
            }
        }
        this.f101661a.f101528f = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        this.f101661a.f101528f = true;
    }
}
