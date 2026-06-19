package com.bilibili.ship.theseus.ogv.intro.section.floatlayer;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.gemini.ui.UIComponent;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/floatlayer/q.class */
public final class q extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.bilibili.app.gemini.ui.f f93708a;

    public q(com.bilibili.app.gemini.ui.f fVar) {
        this.f93708a = fVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        RecyclerView.LayoutParams layoutParams2 = layoutParams instanceof RecyclerView.LayoutParams ? (RecyclerView.LayoutParams) layoutParams : null;
        int absoluteAdapterPosition = layoutParams2 != null ? layoutParams2.getAbsoluteAdapterPosition() : -1;
        if (absoluteAdapterPosition != -1) {
            com.bilibili.app.gemini.ui.f fVar = this.f93708a;
            if (absoluteAdapterPosition >= fVar.c.size()) {
                return;
            }
            UIComponent uIComponent = (UIComponent) fVar.c.get(absoluteAdapterPosition);
            if (uIComponent instanceof com.bilibili.ship.theseus.ogv.intro.section.ui.b) {
                int iA = (int) Uj0.c.a(4.0f, view.getContext());
                rect.left = iA;
                rect.right = iA;
                int iA2 = (int) Uj0.c.a(8.0f, view.getContext());
                rect.top = iA2;
                rect.bottom = iA2;
                return;
            }
            if ((uIComponent instanceof com.bilibili.ship.theseus.ogv.intro.section.ui.g) || (uIComponent instanceof com.bilibili.ship.theseus.ogv.intro.section.ui.k) || (uIComponent instanceof com.bilibili.ship.theseus.ogv.intro.section.ui.i)) {
                int iA3 = (int) Uj0.c.a(4.0f, view.getContext());
                rect.left = iA3;
                rect.right = iA3;
                int iA4 = (int) Uj0.c.a(4.0f, view.getContext());
                rect.top = iA4;
                rect.bottom = iA4;
            }
        }
    }
}
