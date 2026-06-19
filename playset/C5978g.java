package com.bilibili.playset;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: com.bilibili.playset.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/g.class */
public final class C5978g extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecyclerView.ViewHolder f85066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f85067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f85068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f85069d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ViewPropertyAnimator f85070e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C5898c f85071f;

    public C5978g(C5898c c5898c, RecyclerView.ViewHolder viewHolder, int i7, View view, int i8, ViewPropertyAnimator viewPropertyAnimator) {
        this.f85071f = c5898c;
        this.f85066a = viewHolder;
        this.f85067b = i7;
        this.f85068c = view;
        this.f85069d = i8;
        this.f85070e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (this.f85067b != 0) {
            this.f85068c.setTranslationX(0.0f);
        }
        if (this.f85069d != 0) {
            this.f85068c.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f85070e.setListener(null);
        this.f85071f.dispatchMoveFinished(this.f85066a);
        this.f85071f.f84120i.remove(this.f85066a);
        this.f85071f.dispatchFinishedWhenDone();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f85071f.dispatchMoveStarting(this.f85066a);
    }
}
