package com.bilibili.ship.theseus.playlist.uicomponent;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.airbnb.lottie.LottieAnimationView;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.uicomponent.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/h.class */
public final class C6259h extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f96045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LottieAnimationView f96046b;

    public C6259h(View view, LottieAnimationView lottieAnimationView) {
        this.f96045a = view;
        this.f96046b = lottieAnimationView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f96045a.setVisibility(8);
        this.f96046b.cancelAnimation();
    }
}
