package com.bilibili.music.podcast.utils;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.bilibili.music.podcast.view.MusicTopCarLayout;
import gi0.C7309M;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/utils/D.class */
public final class D extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F f66902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f66903b;

    public D(F f7, int i7) {
        this.f66902a = f7;
        this.f66903b = i7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f66902a.a();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        MusicTopCarLayout musicTopCarLayout = this.f66902a.f66906a;
        if (musicTopCarLayout != null) {
            musicTopCarLayout.setVisibility(8);
        }
        C7309M c7309m = this.f66902a.f66909d;
        if (c7309m != null) {
            c7309m.U(this.f66903b);
        }
    }
}
