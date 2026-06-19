package com.bilibili.ship.theseus.ugc.endpage.qoe;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/qoe/m.class */
public final class m extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f96725a = sh1.c.b(5);

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i7 = childAdapterPosition / 2;
        int i8 = this.f96725a;
        rect.top = i7 == 0 ? 0 : i8;
        if (childAdapterPosition % 2 == 0) {
            i8 = 0;
        }
        rect.left = i8;
        rect.right = 0;
        rect.bottom = 0;
    }
}
