package com.bilibili.music.podcast.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/d.class */
public final class d extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoadingErrorEmptyView f67189a;

    public d(LoadingErrorEmptyView loadingErrorEmptyView) {
        this.f67189a = loadingErrorEmptyView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f67189a.setVisibility(8);
    }
}
