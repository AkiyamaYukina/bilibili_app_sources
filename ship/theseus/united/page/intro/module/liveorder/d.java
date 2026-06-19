package com.bilibili.ship.theseus.united.page.intro.module.liveorder;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/liveorder/d.class */
public final class d extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f100508a;

    public d(e eVar) {
        this.f100508a = eVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        e eVar = this.f100508a;
        eVar.f100513e.invoke(eVar);
    }
}
