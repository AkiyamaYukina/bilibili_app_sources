package com.bilibili.ship.theseus.playlist.offline;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import dv0.C6853a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/offline/f.class */
public final class f extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C6853a f95826a;

    public f(C6853a c6853a) {
        this.f95826a = c6853a;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f95826a.f116888e.setImageResource(2131234761);
    }
}
