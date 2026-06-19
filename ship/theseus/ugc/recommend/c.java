package com.bilibili.ship.theseus.ugc.recommend;

import android.animation.Animator;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/recommend/c.class */
public final class c implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f98422a;

    public c(b bVar) {
        this.f98422a = bVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f98422a.g();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f98422a.g();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        FrameLayout frameLayoutH;
        if (this.f98422a.h() == null || (frameLayoutH = this.f98422a.h()) == null) {
            return;
        }
        frameLayoutH.setVisibility(4);
    }
}
