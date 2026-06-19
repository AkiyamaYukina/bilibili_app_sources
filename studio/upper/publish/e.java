package com.bilibili.studio.upper.publish;

import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/upper/publish/e.class */
public final class e<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t8) {
        return ComparisonsKt.compareValues(Float.valueOf(((IA0.a) t8).f10088e), Float.valueOf(((IA0.a) t7).f10088e));
    }
}
