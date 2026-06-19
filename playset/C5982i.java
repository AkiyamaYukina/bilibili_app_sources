package com.bilibili.playset;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.bilibili.playset.C5898c;

/* JADX INFO: renamed from: com.bilibili.playset.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/i.class */
public final class C5982i extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5898c.f f85081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewPropertyAnimator f85082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f85083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C5898c f85084d;

    public C5982i(C5898c c5898c, C5898c.f fVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f85084d = c5898c;
        this.f85081a = fVar;
        this.f85082b = viewPropertyAnimator;
        this.f85083c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f85082b.setListener(null);
        this.f85083c.setAlpha(1.0f);
        this.f85083c.setTranslationX(0.0f);
        this.f85083c.setTranslationY(0.0f);
        this.f85084d.dispatchChangeFinished(this.f85081a.f84138b, false);
        this.f85084d.f84122k.remove(this.f85081a.f84138b);
        this.f85084d.dispatchFinishedWhenDone();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f85084d.dispatchChangeStarting(this.f85081a.f84138b, false);
    }
}
