package com.bilibili.playerbizcommon.features.gif;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/gif/f.class */
public final class f implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f79803a;

    public f(b bVar) {
        this.f79803a = bVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ViewTreeObserver viewTreeObserver;
        ViewGroup viewGroup = this.f79803a.f79771e;
        if (viewGroup != null && (viewTreeObserver = viewGroup.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
        this.f79803a.o();
    }
}
