package com.bilibili.ship.theseus.playlist.selector;

import androidx.recyclerview.widget.GridLayoutManager;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/selector/l.class */
public final class l extends GridLayoutManager.SpanSizeLookup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f95902a;

    public l(k kVar) {
        this.f95902a = kVar;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
    public final int getSpanSize(int i7) {
        int itemViewType = this.f95902a.f95884f.getItemViewType(i7);
        int i8 = 2;
        if (itemViewType == 2) {
            i8 = 1;
        }
        return i8;
    }
}
