package com.bilibili.ship.theseus.united.page.tab;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.bilibili.magicasakura.widgets.TintTextView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/tab/h.class */
public final class h extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TintTextView f103189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f103190b;

    public h(View view, TintTextView tintTextView) {
        this.f103189a = tintTextView;
        this.f103190b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f103189a.setTranslationY(0.0f);
        this.f103190b.setTranslationY(0.0f);
        this.f103189a.setVisibility(4);
        this.f103190b.setVisibility(0);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f103189a.setVisibility(4);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f103189a.setAlpha(1.0f);
    }
}
