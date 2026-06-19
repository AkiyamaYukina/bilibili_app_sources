package com.bilibili.search2.result.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/widget/l.class */
public final class l extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f88647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RecyclerView.ViewHolder f88648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f88649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f88650d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f88651e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ViewPropertyAnimator f88652f;

    public l(h hVar, RecyclerView.ViewHolder viewHolder, int i7, View view, int i8, ViewPropertyAnimator viewPropertyAnimator) {
        this.f88647a = hVar;
        this.f88648b = viewHolder;
        this.f88649c = i7;
        this.f88650d = view;
        this.f88651e = i8;
        this.f88652f = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (this.f88649c != 0) {
            this.f88650d.setTranslationX(0.0f);
        }
        if (this.f88651e != 0) {
            this.f88650d.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f88652f.setListener(null);
        this.f88647a.dispatchMoveFinished(this.f88648b);
        this.f88647a.f88617k.remove(this.f88648b);
        this.f88647a.dispatchFinishedWhenDone();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f88647a.dispatchMoveStarting(this.f88648b);
    }
}
