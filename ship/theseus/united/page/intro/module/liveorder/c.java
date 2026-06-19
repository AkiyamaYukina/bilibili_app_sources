package com.bilibili.ship.theseus.united.page.intro.module.liveorder;

import android.view.ViewTreeObserver;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/liveorder/c.class */
public final class c implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f100506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f100507b;

    public c(ConstraintLayout constraintLayout, e eVar) {
        this.f100506a = constraintLayout;
        this.f100507b = eVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.f100506a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f100507b.f100515g = this.f100506a.getMeasuredHeight();
    }
}
