package com.bilibili.opd.app.bizcommon.imageselector.page;

import android.animation.Animator;
import android.view.View;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/page/r.class */
public final class r implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MallMediaFragment f73922a;

    public r(MallMediaFragment mallMediaFragment) {
        this.f73922a = mallMediaFragment;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view = this.f73922a.f73789l;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
