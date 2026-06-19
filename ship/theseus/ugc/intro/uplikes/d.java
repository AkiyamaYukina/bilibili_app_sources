package com.bilibili.ship.theseus.ugc.intro.uplikes;

import Vu0.I;
import android.animation.Animator;
import com.bilibili.ship.theseus.ugc.intro.uplikes.c;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uplikes/d.class */
public final class d implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f97720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f97721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final I f97722c;

    public d(int i7, c cVar, I i8) {
        this.f97720a = i7;
        this.f97721b = cVar;
        this.f97722c = i8;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        c.c(this.f97722c, this.f97720a);
        this.f97721b.f97706d.tryEmit(c.a.C0889c.f97711a);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        c.c(this.f97722c, this.f97720a);
        this.f97721b.f97706d.tryEmit(c.a.C0889c.f97711a);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
