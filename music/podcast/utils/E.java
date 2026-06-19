package com.bilibili.music.podcast.utils;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.bilibili.music.podcast.view.MusicTopCarLayout;
import gi0.C7309M;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/utils/E.class */
public final class E extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F f66904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f66905b;

    public E(F f7, int i7) {
        this.f66904a = f7;
        this.f66905b = i7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.f66904a.b();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        C7309M c7309m = this.f66904a.f66909d;
        if (c7309m != null) {
            c7309m.U(this.f66905b);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        MusicTopCarLayout musicTopCarLayout = this.f66904a.f66906a;
        if (musicTopCarLayout != null) {
            musicTopCarLayout.setVisibility(0);
        }
    }
}
