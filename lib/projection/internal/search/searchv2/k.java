package com.bilibili.lib.projection.internal.search.searchv2;

import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/search/searchv2/k.class */
public final class k extends DefaultItemAnimator {
    @Override // androidx.recyclerview.widget.DefaultItemAnimator, androidx.recyclerview.widget.SimpleItemAnimator
    public final boolean animateChange(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i7, int i8, int i9, int i10) {
        return super.animateChange(viewHolder, viewHolder2, i7, i8, i7, i8);
    }
}
