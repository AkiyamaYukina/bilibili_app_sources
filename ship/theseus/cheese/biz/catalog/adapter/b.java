package com.bilibili.ship.theseus.cheese.biz.catalog.adapter;

import Wr.i;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import eu0.C6979B;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/catalog/adapter/b.class */
@StabilityInferred(parameters = 0)
public final class b extends RecyclerView.Adapter<bu0.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final i f89155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<C6979B> f89156b = new ArrayList();

    public b(@Nullable i iVar) {
        this.f89155a = iVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return ((ArrayList) this.f89156b).size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        bu0.b bVar = (bu0.b) viewHolder;
        C6979B c6979b = (C6979B) CollectionsKt.getOrNull(this.f89156b, i7);
        if (c6979b == null) {
            return;
        }
        boolean z6 = c6979b.f117497f;
        bVar.f57019b.setText(c6979b.f117493b);
        bVar.f57019b.setSelected(z6);
        bVar.itemView.setTag(2131313229, Integer.valueOf(i7));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        int i8 = bu0.b.f57017c;
        return new bu0.b(p.a(viewGroup, 2131500234, viewGroup, false), new CheeseCatalogSectionSelectAdapter$onCreateViewHolder$1(this));
    }
}
