package com.bilibili.playerbizcommonv2.widget.seek.v3;

import android.animation.Animator;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/seek/v3/i.class */
public final class i implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f82982a;

    public i(k kVar) {
        this.f82982a = kVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        k kVar = this.f82982a;
        kVar.c(kVar.f83015z);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        k kVar = this.f82982a;
        kVar.c(kVar.f83015z);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        k kVar = this.f82982a;
        f fVar = kVar.f82989A[1];
        if (fVar != null) {
            fVar.h = kVar.f82992b;
        }
    }
}
