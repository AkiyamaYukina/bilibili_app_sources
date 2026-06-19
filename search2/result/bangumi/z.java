package com.bilibili.search2.result.bangumi;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import tv.danmaku.bili.widget.recycler.DividerDecoration;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/bangumi/z.class */
public final class z extends DividerDecoration {
    public final boolean needDrawDivider(RecyclerView.ViewHolder viewHolder) {
        Integer numValueOf = viewHolder != null ? Integer.valueOf(viewHolder.getAbsoluteAdapterPosition()) : null;
        Integer numValueOf2 = null;
        if (viewHolder != null) {
            RecyclerView.Adapter<? extends RecyclerView.ViewHolder> bindingAdapter = viewHolder.getBindingAdapter();
            numValueOf2 = null;
            if (bindingAdapter != null) {
                numValueOf2 = Integer.valueOf(bindingAdapter.getItemCount() - 1);
            }
        }
        return !Intrinsics.areEqual(numValueOf, numValueOf2);
    }
}
