package com.bilibili.playset.playlist.adapters;

import Nt0.c;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.playset.playlist.search2.CollectionSearchResultFragment;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import os0.l;
import os0.q;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/adapters/b.class */
@StabilityInferred(parameters = 0)
public final class b extends l {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final c f85197f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final q f85198g;

    @NotNull
    public String h;

    public b(@NotNull CollectionSearchResultFragment.e eVar, @Nullable c cVar) {
        super(eVar);
        this.f85197f = cVar;
        this.f85198g = new q();
        this.h = "";
    }

    public final void P() {
        q qVar = this.f85198g;
        int iIndexOf = ((ArrayList) this.f124955c).indexOf(qVar);
        if (iIndexOf >= 0) {
            BLog.v("FavoritesListFooterAdapter", "notifyFooterChanged = " + qVar.f124964b);
            notifyItemChanged(iIndexOf);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        return i7 == this.f85198g.f124938a ? SearchFooterHolder.f85193d.create(viewGroup, this.f85197f) : super.N(i7, viewGroup);
    }
}
