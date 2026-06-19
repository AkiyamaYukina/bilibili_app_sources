package com.bilibili.pegasus.components.interest.ui.v38.page;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v38/page/c.class */
public final class c extends RecyclerView.ItemDecoration {
    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        boolean z6 = true;
        if ((recyclerView.getChildViewHolder(view).getBindingAdapterPosition() & 1) != 0) {
            z6 = false;
        }
        rect.left = z6 ? 0 : ListExtentionsKt.toPx(5);
        int px = 0;
        if (z6) {
            px = ListExtentionsKt.toPx(5);
        }
        rect.right = px;
        rect.bottom = ListExtentionsKt.toPx(12);
    }
}
