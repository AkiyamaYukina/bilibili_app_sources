package com.bilibili.ship.theseus.ogv.intro.download.service;

import androidx.collection.LongSparseArray;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/service/c.class */
@StabilityInferred(parameters = 0)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final HashMap<String, LongSparseArray<b>> f92403a;

    public c() {
        this(0);
    }

    public /* synthetic */ c(int i7) {
        this((HashMap<String, LongSparseArray<b>>) new HashMap());
    }

    public c(@NotNull HashMap<String, LongSparseArray<b>> map) {
        this.f92403a = map;
    }
}
