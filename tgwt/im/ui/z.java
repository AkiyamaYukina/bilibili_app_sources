package com.bilibili.tgwt.im.ui;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/z.class */
public final class z extends Nl0.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TogetherWatchChangeRoomFragment f111331b;

    public z(TogetherWatchChangeRoomFragment togetherWatchChangeRoomFragment) {
        this.f111331b = togetherWatchChangeRoomFragment;
    }

    @Override // Nl0.e
    public final void onLastItemVisible() {
        TogetherWatchChangeRoomFragment.hf(this.f111331b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i7) {
        super.onScrollStateChanged(recyclerView, i7);
        if (i7 != 0 || recyclerView.canScrollVertically(1)) {
            return;
        }
        TogetherWatchChangeRoomFragment.hf(this.f111331b);
    }
}
