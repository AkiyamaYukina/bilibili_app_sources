package com.bilibili.playerbizcommonv2.widget.seek.v3;

import android.animation.Animator;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/seek/v3/j.class */
public final class j implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f82983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f82984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f82985c;

    public j(k kVar, int i7, int i8) {
        this.f82983a = kVar;
        this.f82984b = i7;
        this.f82985c = i8;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f82983a.e(this.f82984b, this.f82985c);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f82983a.e(this.f82984b, this.f82985c);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
