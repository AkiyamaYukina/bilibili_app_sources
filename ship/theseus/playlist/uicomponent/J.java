package com.bilibili.ship.theseus.playlist.uicomponent;

import androidx.recyclerview.widget.GridLayoutManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/J.class */
public final class J extends GridLayoutManager.SpanSizeLookup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D f95999a;

    public J(D d7) {
        this.f95999a = d7;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
    public final int getSpanSize(int i7) {
        int spanCount;
        D d7 = this.f95999a;
        if (d7.f95939o.getItemViewType(i7) == 2) {
            spanCount = 1;
        } else {
            GridLayoutManager gridLayoutManager = d7.f95927b;
            GridLayoutManager gridLayoutManager2 = gridLayoutManager;
            if (gridLayoutManager == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutManager");
                gridLayoutManager2 = null;
            }
            spanCount = gridLayoutManager2.getSpanCount();
        }
        return spanCount;
    }
}
