package com.bilibili.ogvcommon.play.resolver;

import com.bilibili.lib.media.resource.PlayIndex;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/play/resolver/e.class */
public final class e<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(T t7, T t8) {
        return ComparisonsKt.compareValues(Integer.valueOf(((PlayIndex) t8).mQuality), Integer.valueOf(((PlayIndex) t7).mQuality));
    }
}
