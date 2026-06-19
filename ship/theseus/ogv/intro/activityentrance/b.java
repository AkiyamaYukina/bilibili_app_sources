package com.bilibili.ship.theseus.ogv.intro.activityentrance;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ObservableArrayList;
import androidx.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/activityentrance/b.class */
@StabilityInferred(parameters = 0)
public final class b extends androidx.databinding.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ObservableArrayList<com.bilibili.ship.theseus.ogv.intro.activityentrance.a> f92311a = new ObservableArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final a f92312b = new RecyclerView.ItemDecoration();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f92313c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/activityentrance/b$a.class */
    public static final class a extends RecyclerView.ItemDecoration {
        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            RecyclerView.ViewHolder viewHolderFindContainingViewHolder = recyclerView.findContainingViewHolder(view);
            rect.left = Uj0.c.b((viewHolderFindContainingViewHolder != null ? viewHolderFindContainingViewHolder.getLayoutPosition() : -1) == 0 ? 0 : 8, view.getContext());
        }
    }
}
