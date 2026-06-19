package com.bilibili.paycoin;

import android.animation.Animator;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/paycoin/w.class */
public final class w implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PayCoinsView f74823a;

    public w(PayCoinsView payCoinsView) {
        this.f74823a = payCoinsView;
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
        View view = this.f74823a.f74741r;
        View view2 = view;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mThunder");
            view2 = null;
        }
        view2.setVisibility(0);
        PayCoinsView.m(this.f74823a, 1);
    }
}
