package com.bilibili.upper.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/H.class */
public final class H extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UpperLooperAvatar f114395a;

    public H(UpperLooperAvatar upperLooperAvatar) {
        this.f114395a = upperLooperAvatar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        UpperLooperAvatar upperLooperAvatar = this.f114395a;
        upperLooperAvatar.f114458e = 0;
        upperLooperAvatar.removeViewAt(0);
    }
}
