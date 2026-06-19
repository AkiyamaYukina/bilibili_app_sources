package com.bilibili.pegasus.verticaltab;

import androidx.recyclerview.widget.GridLayoutManager;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/verticaltab/g.class */
public final class g extends GridLayoutManager.SpanSizeLookup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final VerticalTabFragment f78968a;

    public g(VerticalTabFragment verticalTabFragment) {
        this.f78968a = verticalTabFragment;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
    public final int getSpanSize(int i7) {
        return this.f78968a.f78922d.f78934g.get(i7).getSpanCount();
    }
}
