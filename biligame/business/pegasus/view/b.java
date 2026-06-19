package com.bilibili.biligame.business.pegasus.view;

import android.view.animation.Animation;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/business/pegasus/view/b.class */
public final class b implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GameBasePanelDialog f62741a;

    public b(GameBasePanelDialog gameBasePanelDialog) {
        this.f62741a = gameBasePanelDialog;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f62741a.h = false;
        this.f62741a.superDismiss();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        this.f62741a.h = true;
    }
}
