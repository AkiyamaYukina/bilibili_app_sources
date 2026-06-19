package com.bilibili.ship.theseus.ogv.bugle;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kotlin.jvm.internal.Intrinsics;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/bugle/e.class */
public final class e extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlayerBugleFunctionWidget f91647a;

    public e(PlayerBugleFunctionWidget playerBugleFunctionWidget) {
        this.f91647a = playerBugleFunctionWidget;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        PlayerBugleFunctionWidget playerBugleFunctionWidget = this.f91647a;
        playerBugleFunctionWidget.f91617d = 1.0f;
        AbsFunctionWidgetService absFunctionWidgetService = playerBugleFunctionWidget.f91614a;
        AbsFunctionWidgetService absFunctionWidgetService2 = absFunctionWidgetService;
        if (absFunctionWidgetService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("functionWidgetService");
            absFunctionWidgetService2 = null;
        }
        absFunctionWidgetService2.hideWidget(this.f91647a.getToken());
    }
}
