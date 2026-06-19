package com.bilibili.playset.detail.widget;

import androidx.compose.foundation.lazy.grid.GridItemSpan;
import androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/widget/L.class */
public final class L implements Function2<LazyGridItemSpanScope, Integer, GridItemSpan> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H f84613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f84614b;

    public L(H h, List list) {
        this.f84613a = h;
        this.f84614b = list;
    }

    public final Object invoke(Object obj, Object obj2) {
        int iIntValue = ((Number) obj2).intValue();
        Object obj3 = this.f84614b.get(iIntValue);
        return GridItemSpan.m1425boximpl(((GridItemSpan) this.f84613a.invoke((LazyGridItemSpanScope) obj, Integer.valueOf(iIntValue), obj3)).m1432unboximpl());
    }
}
