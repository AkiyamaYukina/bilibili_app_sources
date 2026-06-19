package com.bilibili.ship.theseus.united.page.activitywindow;

import android.view.View;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/activitywindow/f.class */
public final class f implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f98865a;

    public f(View view) {
        this.f98865a = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f98865a.removeOnAttachStateChangeListener(this);
        ViewCompat.requestApplyInsets(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
