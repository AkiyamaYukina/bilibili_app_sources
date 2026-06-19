package com.bilibili.upper.module.partitionTag.partitiontopicv2;

import QK.v;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.IntRange;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitiontopicv2/c.class */
@StabilityInferred(parameters = 0)
public final class c extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public GI.g f113918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f113919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f113920c;

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(@NotNull RecyclerView recyclerView, int i7, int i8) {
        super.onScrolled(recyclerView, i7, i8);
        GI.g gVar = this.f113918a;
        if (gVar == null) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        LinearLayoutManager linearLayoutManager2 = linearLayoutManager;
        if (linearLayoutManager == null) {
            RecyclerView.LayoutManager layoutManager2 = recyclerView.getLayoutManager();
            GridLayoutManager gridLayoutManager = null;
            if (layoutManager2 instanceof GridLayoutManager) {
                gridLayoutManager = (GridLayoutManager) layoutManager2;
            }
            if (gridLayoutManager == null) {
                return;
            } else {
                linearLayoutManager2 = gridLayoutManager;
            }
        }
        int iFindFirstVisibleItemPosition = linearLayoutManager2.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = linearLayoutManager2.findLastVisibleItemPosition();
        Iterator it = SequencesKt.filter(CollectionsKt.asSequence(new IntRange(iFindFirstVisibleItemPosition, iFindLastVisibleItemPosition)), new v(this, 2)).iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            if (iIntValue != -1) {
                gVar.invoke(Integer.valueOf(iIntValue));
            }
        }
        this.f113919b = iFindFirstVisibleItemPosition;
        this.f113920c = iFindLastVisibleItemPosition;
    }
}
