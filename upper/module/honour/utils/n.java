package com.bilibili.upper.module.honour.utils;

import com.bilibili.upper.module.honour.bean.KingHonourDownloadBean;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/honour/utils/n.class */
public final class n<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t8) {
        return ComparisonsKt.compareValues(Integer.valueOf(((KingHonourDownloadBean) t7).getIndex()), Integer.valueOf(((KingHonourDownloadBean) t8).getIndex()));
    }
}
