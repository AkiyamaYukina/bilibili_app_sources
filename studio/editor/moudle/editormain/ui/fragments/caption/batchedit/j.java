package com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.batchedit;

import com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.batchedit.BiliEditorCaptionEditFragmentV3;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/caption/batchedit/j.class */
public final class j<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t8) {
        return ComparisonsKt.compareValues(Long.valueOf(((BiliEditorCaptionEditFragmentV3.b) t7).f106338a.inPoint), Long.valueOf(((BiliEditorCaptionEditFragmentV3.b) t8).f106338a.inPoint));
    }
}
