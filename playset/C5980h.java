package com.bilibili.playset;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.bilibili.playset.C5898c;

/* JADX INFO: renamed from: com.bilibili.playset.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/h.class */
public final class C5980h extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5898c.f f85075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewPropertyAnimator f85076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f85077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C5898c f85078d;

    public C5980h(C5898c c5898c, C5898c.f fVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f85078d = c5898c;
        this.f85075a = fVar;
        this.f85076b = viewPropertyAnimator;
        this.f85077c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f85076b.setListener(null);
        this.f85077c.setAlpha(1.0f);
        this.f85077c.setTranslationX(0.0f);
        this.f85077c.setTranslationY(0.0f);
        this.f85078d.dispatchChangeFinished(this.f85075a.f84137a, true);
        this.f85078d.f84122k.remove(this.f85075a.f84137a);
        this.f85078d.dispatchFinishedWhenDone();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f85078d.dispatchChangeStarting(this.f85075a.f84137a, true);
    }
}
