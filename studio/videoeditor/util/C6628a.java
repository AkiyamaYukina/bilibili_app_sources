package com.bilibili.studio.videoeditor.util;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: com.bilibili.studio.videoeditor.util.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/util/a.class */
public final class C6628a extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C6629b f110222a;

    public C6628a(C6629b c6629b) {
        this.f110222a = c6629b;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f110222a.f110223a.setVisibility(4);
        this.f110222a.f110224b = 0L;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f110222a.f110224b = System.currentTimeMillis();
    }
}
