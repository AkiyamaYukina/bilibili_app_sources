package com.bilibili.ship.theseus.cheese.biz.catalog.adapter;

import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import eu0.C7006y;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/catalog/adapter/a.class */
@StabilityInferred(parameters = 0)
public final class a extends RecyclerView.Adapter<bu0.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Dd1.b f89153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<C7006y> f89154b = new ArrayList();

    public a(@Nullable Dd1.b bVar) {
        this.f89153a = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return ((ArrayList) this.f89154b).size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        bu0.b bVar = (bu0.b) viewHolder;
        C7006y c7006y = (C7006y) CollectionsKt.getOrNull(this.f89154b, i7);
        if (c7006y == null) {
            return;
        }
        boolean z6 = c7006y.f117600e;
        bVar.f57019b.setText(c7006y.f117596a);
        bVar.f57019b.setSelected(z6);
        bVar.itemView.setTag(2131313229, Integer.valueOf(i7));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        int i8 = bu0.b.f57017c;
        return new bu0.b(p.a(viewGroup, 2131500234, viewGroup, false), new CheeseCatalogEpSectionSelectAdapter$onCreateViewHolder$1(this));
    }
}
