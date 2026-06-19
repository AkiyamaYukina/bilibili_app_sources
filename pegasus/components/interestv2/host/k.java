package com.bilibili.pegasus.components.interestv2.host;

import fd1.m;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interestv2/host/k.class */
public final class k<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(T t7, T t8) {
        return ComparisonsKt.compareValues(Boolean.valueOf(((m.a) t8).a.i), Boolean.valueOf(((m.a) t7).a.i));
    }
}
