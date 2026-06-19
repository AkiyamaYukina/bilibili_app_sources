package com.bilibili.search2.result.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.bilibili.search2.result.widget.h;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/widget/k.class */
public final class k extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f88643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h.a f88644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewPropertyAnimator f88645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f88646d;

    public k(h hVar, h.a aVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f88643a = hVar;
        this.f88644b = aVar;
        this.f88645c = viewPropertyAnimator;
        this.f88646d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f88645c.setListener(null);
        this.f88646d.setAlpha(1.0f);
        this.f88646d.setTranslationX(0.0f);
        this.f88646d.setTranslationY(0.0f);
        this.f88643a.dispatchChangeFinished(this.f88644b.f88620a, false);
        this.f88643a.f88619m.remove(this.f88644b.f88620a);
        this.f88643a.dispatchFinishedWhenDone();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f88643a.dispatchChangeStarting(this.f88644b.f88620a, false);
    }
}
