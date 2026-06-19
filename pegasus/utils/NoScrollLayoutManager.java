package com.bilibili.pegasus.utils;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.GridLayoutManager;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/utils/NoScrollLayoutManager.class */
@StabilityInferred(parameters = 0)
public final class NoScrollLayoutManager extends GridLayoutManager {
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollHorizontally() {
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollVertically() {
        return false;
    }
}
