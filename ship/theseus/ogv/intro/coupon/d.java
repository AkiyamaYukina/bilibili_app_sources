package com.bilibili.ship.theseus.ogv.intro.coupon;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/coupon/d.class */
public final class d extends RecyclerView.ItemDecoration {
    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        if (recyclerView.getChildLayoutPosition(view) != recyclerView.getAdapter().getItemCount() - 1) {
            rect.bottom = Uj0.c.b(12, view.getContext());
        }
    }
}
