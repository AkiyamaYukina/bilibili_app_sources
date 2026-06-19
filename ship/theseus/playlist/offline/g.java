package com.bilibili.ship.theseus.playlist.offline;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import dv0.C6853a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/offline/g.class */
public final class g extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C6853a f95827a;

    public g(C6853a c6853a) {
        this.f95827a = c6853a;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f95827a.f116888e.setImageResource(2131234769);
    }
}
