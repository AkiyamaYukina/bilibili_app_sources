package com.bilibili.ogv.operation.modular.modules;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/modular/modules/M.class */
public final class M extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f70386a;

    public M(int i7) {
        this.f70386a = i7;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        int i7 = this.f70386a;
        rect.left = i7 / 2;
        rect.right = i7 / 2;
    }
}
