package com.bilibili.ship.theseus.united.page.intro.module.season;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.season.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/h.class */
public final class C6346h extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnitedSeasonClockExpandableLayout2 f101659a;

    public C6346h(UnitedSeasonClockExpandableLayout2 unitedSeasonClockExpandableLayout2) {
        this.f101659a = unitedSeasonClockExpandableLayout2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.f101659a.f101528f = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f101659a.f101528f = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        this.f101659a.f101528f = true;
    }
}
