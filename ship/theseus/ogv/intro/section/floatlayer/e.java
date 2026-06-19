package com.bilibili.ship.theseus.ogv.intro.section.floatlayer;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/floatlayer/e.class */
public final class e extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.bilibili.app.gemini.ui.f f93653a;

    public e(com.bilibili.app.gemini.ui.f fVar) {
        this.f93653a = fVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        RecyclerView.LayoutParams layoutParams2 = layoutParams instanceof RecyclerView.LayoutParams ? (RecyclerView.LayoutParams) layoutParams : null;
        int absoluteAdapterPosition = layoutParams2 != null ? layoutParams2.getAbsoluteAdapterPosition() : -1;
        if (absoluteAdapterPosition == -1 || absoluteAdapterPosition >= this.f93653a.c.size()) {
            return;
        }
        int iA = (int) Uj0.c.a(4.0f, view.getContext());
        rect.left = iA;
        rect.right = iA;
        int iA2 = (int) Uj0.c.a(8.0f, view.getContext());
        rect.top = iA2;
        rect.bottom = iA2;
    }
}
