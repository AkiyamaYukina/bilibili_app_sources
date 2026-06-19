package com.bilibili.studio.editor.moudle.editormain.ui.fragments.transition;

import com.bilibili.studio.videoeditor.ms.transition.TransitionData;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/transition/f.class */
public final class f<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t8) {
        return ComparisonsKt.compareValues(Integer.valueOf(((TransitionData.TransitionBean) t7).rank), Integer.valueOf(((TransitionData.TransitionBean) t8).rank));
    }
}
