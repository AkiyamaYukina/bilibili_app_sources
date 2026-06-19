package com.bilibili.search2.result.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.bilibili.search2.result.widget.h;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/widget/j.class */
public final class j extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f88639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h.a f88640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewPropertyAnimator f88641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f88642d;

    public j(h hVar, h.a aVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f88639a = hVar;
        this.f88640b = aVar;
        this.f88641c = viewPropertyAnimator;
        this.f88642d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f88641c.setListener(null);
        this.f88642d.setAlpha(1.0f);
        this.f88642d.setTranslationX(0.0f);
        this.f88642d.setTranslationY(0.0f);
        this.f88639a.dispatchChangeFinished(this.f88640b.f88621b, true);
        this.f88639a.f88619m.remove(this.f88640b.f88621b);
        this.f88639a.dispatchFinishedWhenDone();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f88639a.dispatchChangeStarting(this.f88640b.f88621b, true);
    }
}
