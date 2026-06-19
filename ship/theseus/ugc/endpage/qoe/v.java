package com.bilibili.ship.theseus.ugc.endpage.qoe;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/qoe/v.class */
public final class v extends DividerItemDecoration {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f96770e;

    public v(Context context) {
        super(context, 0);
        this.f96770e = sh1.c.b(5);
    }

    @Override // androidx.recyclerview.widget.DividerItemDecoration, androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i7 = childAdapterPosition / 2;
        int i8 = this.f96770e;
        rect.top = i7 == 0 ? 0 : i8;
        if (childAdapterPosition % 2 == 0) {
            i8 = 0;
        }
        rect.left = i8;
        rect.right = 0;
        rect.bottom = 0;
    }
}
