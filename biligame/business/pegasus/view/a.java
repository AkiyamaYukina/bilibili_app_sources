package com.bilibili.biligame.business.pegasus.view;

import android.view.animation.Animation;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/business/pegasus/view/a.class */
public final class a implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GameBasePanelDialog f62740a;

    public a(GameBasePanelDialog gameBasePanelDialog) {
        this.f62740a = gameBasePanelDialog;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f62740a.f62725g = false;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        this.f62740a.f62725g = true;
    }
}
