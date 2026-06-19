package com.bilibili.playset.playlist.adapters;

import IH.c;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.playset.C5989l0;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import os0.C8259e;
import os0.l;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/adapters/a.class */
@StabilityInferred(parameters = 0)
public final class a extends l {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final c f85195f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final C8259e f85196g;

    public a(@NotNull C5989l0 c5989l0, @Nullable c cVar) {
        super(c5989l0);
        this.f85195f = cVar;
        this.f85196g = new C8259e();
    }

    public final void P() {
        C8259e c8259e = this.f85196g;
        int iIndexOf = ((ArrayList) this.f124955c).indexOf(c8259e);
        if (iIndexOf >= 0) {
            BLog.v("FavoritesListFooterAdapter", "notifyFooterChanged = " + c8259e.f124939b);
            notifyItemChanged(iIndexOf);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        return i7 == this.f85196g.f124938a ? FavFooterHolder.f85190d.create(viewGroup, this.f85195f) : super.N(i7, viewGroup);
    }
}
