package com.bilibili.paycoin;

import android.animation.Animator;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/paycoin/x.class */
public final class x implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PayCoinsView f74824a;

    public x(PayCoinsView payCoinsView) {
        this.f74824a = payCoinsView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        PayCoinsView.m(this.f74824a, 2);
    }
}
