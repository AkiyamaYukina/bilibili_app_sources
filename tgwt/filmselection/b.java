package com.bilibili.tgwt.filmselection;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/filmselection/b.class */
public final class b extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f111182a;

    public b(Context context) {
        this.f111182a = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int iB = Uj0.c.b(6.0f, this.f111182a);
        rect.left = iB;
        rect.right = iB;
    }
}
