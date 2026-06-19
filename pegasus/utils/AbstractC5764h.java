package com.bilibili.pegasus.utils;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.DiffUtil;
import com.bilibili.pegasus.channelv2.api.model.search.ChannelSearchExtendItem;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import po0.C8336a;

/* JADX INFO: renamed from: com.bilibili.pegasus.utils.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/utils/h.class */
@StabilityInferred(parameters = 0)
public abstract class AbstractC5764h<T> extends DiffUtil.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<T> f78870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Map<Long, gg.b> f78871b;

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC5764h(@NotNull List<? extends T> list, @NotNull Map<Long, gg.b> map) {
        this.f78870a = list;
        this.f78871b = map;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areContentsTheSame(int i7, int i8) {
        if (i7 != i8) {
            return true;
        }
        T t7 = this.f78870a.get(i8);
        Map<Long, gg.b> map = this.f78871b;
        C8336a c8336a = (C8336a) t7;
        T t8 = c8336a.f125509a;
        gg.b bVar = map.get(Long.valueOf(t8 instanceof Yn0.c ? ((Yn0.c) t8).f28949a : t8 instanceof ChannelSearchExtendItem ? ((ChannelSearchExtendItem) t8).id : 0L));
        if (bVar == null) {
            return true;
        }
        T t9 = c8336a.f125509a;
        boolean z6 = t9 instanceof Yn0.c;
        boolean z7 = z6 ? ((Yn0.c) t9).f28957j : t9 instanceof ChannelSearchExtendItem ? ((ChannelSearchExtendItem) t9).isAtten : false;
        boolean z8 = bVar.b;
        if (z7 == z8) {
            return true;
        }
        if (z6) {
            ((Yn0.c) t9).f28957j = z8;
            return false;
        }
        if (!(t9 instanceof ChannelSearchExtendItem)) {
            return false;
        }
        ((ChannelSearchExtendItem) t9).isAtten = z8;
        return false;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areItemsTheSame(int i7, int i8) {
        return i7 == i8;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getNewListSize() {
        return this.f78870a.size();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getOldListSize() {
        return this.f78870a.size();
    }
}
