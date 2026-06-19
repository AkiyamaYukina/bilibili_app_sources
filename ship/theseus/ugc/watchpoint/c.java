package com.bilibili.ship.theseus.ugc.watchpoint;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/watchpoint/c.class */
public final class c extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WatchPointLayerComponent f98585a;

    public c(WatchPointLayerComponent watchPointLayerComponent) {
        this.f98585a = watchPointLayerComponent;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i7) {
        super.onScrollStateChanged(recyclerView, i7);
        if (i7 == 1) {
            WatchPointLayerComponent watchPointLayerComponent = this.f98585a;
            if (watchPointLayerComponent.f98567b) {
                watchPointLayerComponent.f98567b = false;
            }
        }
    }
}
