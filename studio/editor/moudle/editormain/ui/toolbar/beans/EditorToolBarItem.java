package com.bilibili.studio.editor.moudle.editormain.ui.toolbar.beans;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/toolbar/beans/EditorToolBarItem.class */
@Keep
public class EditorToolBarItem implements Comparable<EditorToolBarItem> {
    public boolean enable = true;

    @Nullable
    public String errorMsg;
    public int iconId;

    @Nullable
    public String lottieFile;
    public int mItemType;
    public int rank;

    @Nullable
    public String remoteIconUrl;

    @Nullable
    public String remoteResString;
    public int resId;

    public EditorToolBarItem() {
    }

    public EditorToolBarItem(int i7, int i8, int i9) {
        this.mItemType = i7;
        this.resId = i8;
        this.iconId = i9;
        this.rank = i7;
    }

    @Override // java.lang.Comparable
    public int compareTo(EditorToolBarItem editorToolBarItem) {
        return Integer.compare(this.rank, editorToolBarItem.rank);
    }
}
