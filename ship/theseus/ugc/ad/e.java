package com.bilibili.ship.theseus.ugc.ad;

import android.animation.Animator;
import com.bilibili.playerbizcommonv2.utils.p;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/ad/e.class */
public final class e implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final df.a f96293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DetailAdService f96294b;

    public e(df.a aVar, DetailAdService detailAdService) {
        this.f96293a = aVar;
        this.f96294b = detailAdService;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) throws NoWhenBranchMatchedException {
        this.f96294b.d();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        df.a aVar = this.f96293a;
        Lazy lazy = p.f81943a;
        aVar.setVisibility(0);
    }
}
