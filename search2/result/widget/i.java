package com.bilibili.search2.result.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/widget/i.class */
public final class i extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f88635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RecyclerView.ViewHolder f88636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f88637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ViewPropertyAnimator f88638d;

    public i(View view, ViewPropertyAnimator viewPropertyAnimator, RecyclerView.ViewHolder viewHolder, h hVar) {
        this.f88635a = hVar;
        this.f88636b = viewHolder;
        this.f88637c = view;
        this.f88638d = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f88637c.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f88638d.setListener(null);
        this.f88635a.dispatchAddFinished(this.f88636b);
        this.f88635a.f88616j.remove(this.f88636b);
        this.f88635a.dispatchFinishedWhenDone();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f88635a.dispatchAddStarting(this.f88636b);
    }
}
