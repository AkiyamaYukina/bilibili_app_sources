package com.bilibili.ship.theseus.ogv.intro.section.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/ui/o.class */
public final class o extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f93865a;

    public o(Context context) {
        this.f93865a = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        if (recyclerView.getChildAdapterPosition(view) == 0) {
            rect.left = 0;
        } else {
            rect.left = (int) Uj0.c.a(5, this.f93865a);
        }
    }
}
