package com.bilibili.studio.videoeditor.util;

import com.bilibili.studio.editor.moudle.caption.v1.CaptionInfo;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/util/C.class */
public final class C<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t8) {
        return ComparisonsKt.compareValues(Long.valueOf(((CaptionInfo) t7).inPoint), Long.valueOf(((CaptionInfo) t8).inPoint));
    }
}
