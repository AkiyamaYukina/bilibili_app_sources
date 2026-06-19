package com.bilibili.playerbizcommonv2.web;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/web/q.class */
public final class q extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlayerV3WebGeneralUIComponent f82240a;

    public q(PlayerV3WebGeneralUIComponent playerV3WebGeneralUIComponent) {
        this.f82240a = playerV3WebGeneralUIComponent;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        PlayerV3WebGeneralUIComponent playerV3WebGeneralUIComponent = this.f82240a;
        if (playerV3WebGeneralUIComponent.f82115x == animator) {
            playerV3WebGeneralUIComponent.f82115x = null;
        }
        playerV3WebGeneralUIComponent.f82113v = true;
    }
}
