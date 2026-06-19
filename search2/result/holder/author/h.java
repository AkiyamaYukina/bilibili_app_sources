package com.bilibili.search2.result.holder.author;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/author/h.class */
public final class h extends RecyclerView.ItemDecoration {
    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        int adapterPosition = recyclerView.getChildViewHolder(view).getAdapterPosition();
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        int itemCount = layoutManager != null ? layoutManager.getItemCount() : 0;
        rect.left = adapterPosition == 0 ? ListExtentionsKt.toPx(12.0f) : ListExtentionsKt.toPx(8.0f);
        rect.right = adapterPosition < itemCount - 1 ? 0 : ListExtentionsKt.toPx(12.0f);
    }
}
