package com.bilibili.studio.videoeditor.util;

import com.bilibili.studio.videoeditor.editbase.filter.model.EditFxFilterClip;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/util/H.class */
public final class H<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t8) {
        return ComparisonsKt.compareValues(Long.valueOf(((EditFxFilterClip) t7).getInPoint()), Long.valueOf(((EditFxFilterClip) t8).getInPoint()));
    }
}
