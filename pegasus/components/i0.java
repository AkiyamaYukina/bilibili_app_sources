package com.bilibili.pegasus.components;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/i0.class */
public final class i0 extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecommendGuidanceComponent f76270a;

    public i0(RecommendGuidanceComponent recommendGuidanceComponent) {
        this.f76270a = recommendGuidanceComponent;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i7) {
        super.onScrollStateChanged(recyclerView, i7);
        if (i7 == 0) {
            RecommendGuidanceComponent.b(this.f76270a.getFragment());
            recyclerView.removeOnScrollListener(this);
        }
    }
}
