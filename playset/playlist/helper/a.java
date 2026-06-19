package com.bilibili.playset.playlist.helper;

import H9.p;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/helper/a.class */
@StabilityInferred(parameters = 0)
public final class a extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Function1<? super Integer, Unit> f85321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f85322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f85323c;

    public a() {
        this(null);
    }

    public a(@Nullable Function1<? super Integer, Unit> function1) {
        this.f85321a = function1;
        this.f85322b = -1;
        this.f85323c = -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(@NotNull RecyclerView recyclerView, int i7, int i8) {
        super.onScrolled(recyclerView, i7, i8);
        Function1<? super Integer, Unit> function1 = this.f85321a;
        if (function1 == null) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        Iterator it = SequencesKt.filter(CollectionsKt.asSequence(new IntRange(iFindFirstVisibleItemPosition, iFindLastVisibleItemPosition)), new p(this, 1)).iterator();
        while (it.hasNext()) {
            function1.invoke(Integer.valueOf(((Number) it.next()).intValue()));
        }
        this.f85322b = iFindFirstVisibleItemPosition;
        this.f85323c = iFindLastVisibleItemPosition;
    }
}
