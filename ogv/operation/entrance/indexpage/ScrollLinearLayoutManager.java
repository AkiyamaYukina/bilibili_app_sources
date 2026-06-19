package com.bilibili.ogv.operation.entrance.indexpage;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/entrance/indexpage/ScrollLinearLayoutManager.class */
@StabilityInferred(parameters = 0)
public final class ScrollLinearLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f70165a;

    public ScrollLinearLayoutManager(@NotNull Context context) {
        super(context);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollVertically() {
        return this.f70165a && super.canScrollVertically();
    }
}
