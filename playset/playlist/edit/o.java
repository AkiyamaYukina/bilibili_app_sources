package com.bilibili.playset.playlist.edit;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/edit/o.class */
@StabilityInferred(parameters = 0)
public final class o extends ItemTouchHelper.Callback {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Function2<RecyclerView.ViewHolder, RecyclerView.ViewHolder, Boolean> f85314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Function1<Integer, Boolean> f85315e;

    @JvmOverloads
    public o(@NotNull Function1 function1, @NotNull Function2 function2) {
        this.f85314d = function2;
        this.f85315e = function1;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public final boolean canDropOver(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.ViewHolder viewHolder, @NotNull RecyclerView.ViewHolder viewHolder2) {
        return ((Boolean) this.f85315e.invoke(Integer.valueOf(viewHolder2.getBindingAdapterPosition()))).booleanValue();
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public final int getMovementFlags(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.ViewHolder viewHolder) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        return ItemTouchHelper.Callback.makeMovementFlags((!(layoutManager instanceof GridLayoutManager) || ((GridLayoutManager) layoutManager).getSpanCount() <= 1) ? 3 : 15, 0);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public final int interpolateOutOfBoundsScroll(@NotNull RecyclerView recyclerView, int i7, int i8, int i9, long j7) {
        return ((int) Math.signum(i8)) * 20;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public final boolean isLongPressDragEnabled() {
        return false;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public final boolean onMove(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.ViewHolder viewHolder, @NotNull RecyclerView.ViewHolder viewHolder2) {
        return ((Boolean) this.f85314d.invoke(viewHolder, viewHolder2)).booleanValue();
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public final void onSwiped(@NotNull RecyclerView.ViewHolder viewHolder, int i7) {
    }
}
