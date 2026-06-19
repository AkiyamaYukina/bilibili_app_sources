package com.bilibili.ogv.operation.entrance.indexpage;

import android.animation.Animator;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/entrance/indexpage/b.class */
public final class b implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BangumFilterLayout f70169a;

    public b(BangumFilterLayout bangumFilterLayout) {
        this.f70169a = bangumFilterLayout;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        BangumFilterLayout bangumFilterLayout = this.f70169a;
        bangumFilterLayout.setFoldTvState(bangumFilterLayout.f70105l);
        InterceptRecyclerView interceptRecyclerView = this.f70169a.f70099e;
        if (interceptRecyclerView != null) {
            interceptRecyclerView.setNestedScrollingEnabled(!r0.f70105l);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
