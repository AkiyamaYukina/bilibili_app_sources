package com.bilibili.ship.theseus.ugc.intro.mhy;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/mhy/e.class */
public final class e extends DividerItemDecoration {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f97109e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, int i7) {
        super(context, 0);
        this.f97109e = i7;
    }

    @Override // androidx.recyclerview.widget.DividerItemDecoration, androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        int itemCount = layoutManager != null ? layoutManager.getItemCount() : 0;
        int i7 = this.f97109e;
        rect.left = childAdapterPosition == 0 ? i7 : 0;
        int i8 = 0;
        if (childAdapterPosition == itemCount - 1) {
            i8 = i7;
        }
        rect.right = i8;
    }
}
