package com.bilibili.lib.resmanager.core;

import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/resmanager/core/o.class */
public final class o<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t8) {
        return ComparisonsKt.compareValues(Long.valueOf(((CacheEntry) t7).getAccessTime()), Long.valueOf(((CacheEntry) t8).getAccessTime()));
    }
}
