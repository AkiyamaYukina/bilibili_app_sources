package com.bilibili.search2.stardust.expose;

import android.view.View;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/stardust/expose/j.class */
public final class j implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SearchDiscoverExposeClient f88761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f88762b;

    public j(SearchDiscoverExposeClient searchDiscoverExposeClient, String str) {
        this.f88761a = searchDiscoverExposeClient;
        this.f88762b = str;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
        view.removeOnLayoutChangeListener(this);
        if (view.isAttachedToWindow()) {
            this.f88761a.a("triggerExposeOnNextLayout, from = " + this.f88762b);
        }
    }
}
