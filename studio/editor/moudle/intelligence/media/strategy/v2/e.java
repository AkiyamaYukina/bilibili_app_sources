package com.bilibili.studio.editor.moudle.intelligence.media.strategy.v2;

import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;
import uz0.a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/media/strategy/v2/e.class */
public final class e<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(T t7, T t8) {
        return ComparisonsKt.compareValues(Integer.valueOf(((a.d) t7).a), Integer.valueOf(((a.d) t8).a));
    }
}
