package com.bilibili.ship.theseus.united.page.activitywindow;

import android.view.View;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/activitywindow/k.class */
public final class k implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f98872a;

    public k(View view) {
        this.f98872a = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f98872a.removeOnAttachStateChangeListener(this);
        ViewCompat.requestApplyInsets(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
