package com.bilibili.pegasus.vm;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.DiffUtil;
import com.bilibili.pegasus.PegasusHolderData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/vm/x.class */
@StabilityInferred(parameters = 0)
public final class x extends DiffUtil.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<PegasusHolderData> f79094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<PegasusHolderData> f79095b;

    public x(@NotNull List<? extends PegasusHolderData> list, @NotNull List<? extends PegasusHolderData> list2) {
        this.f79094a = list;
        this.f79095b = list2;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areContentsTheSame(int i7, int i8) {
        return Intrinsics.areEqual(this.f79094a.get(i7), this.f79095b.get(i8));
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areItemsTheSame(int i7, int i8) {
        return this.f79094a.get(i7).getHolderItemId() == this.f79095b.get(i8).getHolderItemId();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getNewListSize() {
        return this.f79095b.size();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getOldListSize() {
        return this.f79094a.size();
    }
}
