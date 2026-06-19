package com.bilibili.search2.result.ogv.aggregate.subpage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import tv.danmaku.bili.widget.recycler.DividerDecoration;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/ogv/aggregate/subpage/b.class */
public final class b extends DividerDecoration {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RecyclerView f88423f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(RecyclerView recyclerView, int i7, int i8, int i9) {
        super(i7, i8, i9, 0);
        this.f88423f = recyclerView;
    }

    public final boolean needDrawDivider(RecyclerView.ViewHolder viewHolder) {
        RecyclerView.Adapter adapter = this.f88423f.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        Integer numValueOf = viewHolder != null ? Integer.valueOf(viewHolder.getAbsoluteAdapterPosition()) : null;
        IntRange intRangeUntil = RangesKt.until(0, itemCount - 1);
        boolean z6 = false;
        if (numValueOf != null) {
            z6 = false;
            if (intRangeUntil.contains(numValueOf.intValue())) {
                z6 = true;
            }
        }
        return z6;
    }
}
