package com.bilibili.ship.theseus.ugc.endpage.qoe;

import android.animation.Animator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bilibili.app.screen.adjust.widget.z;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/qoe/l.class */
public final class l implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f96724a;

    public l(ConstraintLayout constraintLayout) {
        this.f96724a = constraintLayout;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        z.a(this.f96724a);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        z.a(this.f96724a);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
