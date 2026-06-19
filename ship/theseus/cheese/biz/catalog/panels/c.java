package com.bilibili.ship.theseus.cheese.biz.catalog.panels;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bu0.p;
import bu0.t;
import bu0.u;
import com.bilibili.droid.DimenUtilsKt;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/catalog/panels/c.class */
public final class c extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ref.ObjectRef<p> f89199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f89200b;

    public c(d dVar, Ref.ObjectRef objectRef) {
        this.f89199a = objectRef;
        this.f89200b = dVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        u uVar;
        super.getItemOffsets(rect, view, recyclerView, state);
        RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(view);
        if ((childViewHolder instanceof bu0.i) || (childViewHolder instanceof bu0.k)) {
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            List<? extends u> list = ((p) this.f89199a.element).f57098c;
            boolean z6 = (list == null || (uVar = (u) CollectionsKt.getOrNull(list, childAdapterPosition + 1)) == null) ? true : uVar instanceof t;
            d dVar = this.f89200b;
            if (!z6 || ((Boolean) dVar.f89204o.getValue()).booleanValue()) {
                rect.bottom = Lh1.b.b(8.0f);
            } else {
                rect.bottom = 0;
            }
            if (((Boolean) dVar.f89204o.getValue()).booleanValue() && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                GridLayoutManager.SpanSizeLookup spanSizeLookup = ((GridLayoutManager) recyclerView.getLayoutManager()).getSpanSizeLookup();
                if (spanSizeLookup.getSpanSize(childAdapterPosition) == 1) {
                    int spanIndex = spanSizeLookup.getSpanIndex(childAdapterPosition, 2);
                    int iDpToPx = DimenUtilsKt.dpToPx(16);
                    if (spanIndex == 0) {
                        rect.right = iDpToPx / 2;
                    } else {
                        if (spanIndex != 1) {
                            return;
                        }
                        rect.left = iDpToPx / 2;
                    }
                }
            }
        }
    }
}
