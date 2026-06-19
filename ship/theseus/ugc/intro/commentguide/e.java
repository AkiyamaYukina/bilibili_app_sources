package com.bilibili.ship.theseus.ugc.intro.commentguide;

import android.animation.Animator;
import com.bilibili.ship.theseus.united.page.intro.IntroRecycleViewService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/commentguide/e.class */
public final class e implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f96995a;

    public e(f fVar) {
        this.f96995a = fVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        f fVar = this.f96995a;
        ((IntroRecycleViewService) fVar.f96996a.f97004b.f96985f.get()).d(fVar);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
