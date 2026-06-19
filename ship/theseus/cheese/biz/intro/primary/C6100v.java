package com.bilibili.ship.theseus.cheese.biz.intro.primary;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.primary.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/v.class */
public final class C6100v extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f89776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f89777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f89778c;

    public C6100v(int i7, int i8, int i9) {
        this.f89776a = i7;
        this.f89777b = i8;
        this.f89778c = i9;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        if (itemCount == 0) {
            return;
        }
        int i7 = this.f89777b;
        int i8 = this.f89778c;
        int i9 = this.f89776a;
        if (childAdapterPosition == 0) {
            rect.set(i9, i7, i9, i8);
        } else if (childAdapterPosition == itemCount - 1) {
            rect.set(i9, i8, i9, i7);
        } else {
            rect.set(i9, i8, i9, i8);
        }
    }
}
