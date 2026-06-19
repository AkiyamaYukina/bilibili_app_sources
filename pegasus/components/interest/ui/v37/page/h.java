package com.bilibili.pegasus.components.interest.ui.v37.page;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v37/page/h.class */
public final class h extends RecyclerView.ItemDecoration {
    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(view);
        if (childViewHolder == null) {
            return;
        }
        int bindingAdapterPosition = childViewHolder.getBindingAdapterPosition();
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
        if (gridLayoutManager == null) {
            return;
        }
        int spanIndex = gridLayoutManager.getSpanSizeLookup().getSpanIndex(bindingAdapterPosition, gridLayoutManager.getSpanCount());
        boolean z6 = gridLayoutManager.getSpanSizeLookup().getSpanSize(bindingAdapterPosition) == 2;
        if (z6 && bindingAdapterPosition > 0) {
            rect.top = ListExtentionsKt.toPx(8);
        } else if (!z6) {
            boolean z7 = spanIndex == 0;
            rect.left = z7 ? 0 : ListExtentionsKt.toPx(5);
            int px = 0;
            if (z7) {
                px = ListExtentionsKt.toPx(5);
            }
            rect.right = px;
        }
        rect.bottom = ListExtentionsKt.toPx(12);
    }
}
