package com.bilibili.ship.theseus.ogv.intro.download.ui;

import androidx.compose.foundation.lazy.grid.GridItemSpan;
import androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/ui/J.class */
public final class J implements Function2<LazyGridItemSpanScope, Integer, GridItemSpan> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D f92473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f92474b;

    public J(D d7, List list) {
        this.f92473a = d7;
        this.f92474b = list;
    }

    public final Object invoke(Object obj, Object obj2) {
        Object obj3 = this.f92474b.get(((Number) obj2).intValue());
        return GridItemSpan.m1425boximpl(((GridItemSpan) this.f92473a.invoke((LazyGridItemSpanScope) obj, obj3)).m1432unboximpl());
    }
}
