package com.bilibili.studio.editor.moudle.intelligence.media.strategy.v2;

import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/media/strategy/v2/f.class */
public final class f<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t8) {
        return ComparisonsKt.compareValues(Integer.valueOf(((com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.a) t7).f107393e), Integer.valueOf(((com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.a) t8).f107393e));
    }
}
