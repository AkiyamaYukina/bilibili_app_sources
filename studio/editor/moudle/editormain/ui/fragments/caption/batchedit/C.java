package com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.batchedit;

import com.bilibili.studio.editor.repository.data.BiliEditorStickerInfo;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/caption/batchedit/C.class */
public final class C<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t8) {
        return ComparisonsKt.compareValues(Long.valueOf(((BiliEditorStickerInfo) t7).inPoint), Long.valueOf(((BiliEditorStickerInfo) t8).inPoint));
    }
}
