package com.bilibili.playerbizcommonv2.web;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kotlin.Unit;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/web/i.class */
public final class i extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlayerV3WebGeneralUIComponent f82229a;

    public i(PlayerV3WebGeneralUIComponent playerV3WebGeneralUIComponent) {
        this.f82229a = playerV3WebGeneralUIComponent;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        PlayerV3WebGeneralUIComponent playerV3WebGeneralUIComponent = this.f82229a;
        if (playerV3WebGeneralUIComponent.f82115x == animator) {
            playerV3WebGeneralUIComponent.f82115x = null;
        }
        playerV3WebGeneralUIComponent.f82101j.tryEmit(Unit.INSTANCE);
    }
}
