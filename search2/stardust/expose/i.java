package com.bilibili.search2.stardust.expose;

import android.util.LongSparseArray;
import android.view.View;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/stardust/expose/i.class */
public final class i implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SearchDiscoverExposeClient f88760a;

    public i(SearchDiscoverExposeClient searchDiscoverExposeClient) {
        this.f88760a = searchDiscoverExposeClient;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f88760a.a("onViewAttachedToWindow");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        d dVar = this.f88760a.f88738j;
        LongSparseArray<View> longSparseArray = dVar.f88747a;
        int size = longSparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            longSparseArray.keyAt(i7);
            longSparseArray.valueAt(i7).removeOnAttachStateChangeListener(dVar);
        }
        dVar.f88747a.clear();
    }
}
