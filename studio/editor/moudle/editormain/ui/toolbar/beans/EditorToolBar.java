package com.bilibili.studio.editor.moudle.editormain.ui.toolbar.beans;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/toolbar/beans/EditorToolBar.class */
@Keep
public class EditorToolBar {
    public static final String KEY_ATTACH_TTS_GUIDE = "key_tts_guide";
    public static final int TYPE_DIFF_CHILD_ITEM = 2;
    public static final int TYPE_DIFF_CONTENT = 1;
    public static final int TYPE_DIFF_DISABLE = 3;
    public static final int TYPE_DIFF_PARENT = 4;
    public static final int TYPE_SAME = 0;

    @Nullable
    private final EditorToolBar parentToolBar;
    private final EditorToolBarLevel toolBarLevel;
    private final EditorToolBarType toolBarType;
    private final List<EditorToolBarItem> childItems = new ArrayList();
    private final List<Integer> disableItems = new ArrayList();
    private final HashMap<String, Object> attachData = new HashMap<>();

    public EditorToolBar(@NonNull EditorToolBarType editorToolBarType, @NonNull EditorToolBarLevel editorToolBarLevel, EditorToolBar editorToolBar) {
        this.toolBarType = editorToolBarType;
        this.toolBarLevel = editorToolBarLevel;
        this.parentToolBar = editorToolBar;
    }

    private boolean isChildItemSame(EditorToolBar editorToolBar) {
        for (int i7 = 0; i7 < this.childItems.size(); i7++) {
            if (this.childItems.get(i7).mItemType != editorToolBar.childItems.get(i7).mItemType) {
                return false;
            }
        }
        return true;
    }

    private boolean isDisableItemSame(EditorToolBar editorToolBar) {
        if (this.disableItems.size() != editorToolBar.disableItems.size()) {
            return false;
        }
        for (int i7 = 0; i7 < this.disableItems.size(); i7++) {
            if (!Objects.equals(this.disableItems.get(i7), editorToolBar.disableItems.get(i7))) {
                return false;
            }
        }
        return true;
    }

    private boolean isParentSame(EditorToolBar editorToolBar) {
        EditorToolBar editorToolBar2;
        EditorToolBar editorToolBar3 = this.parentToolBar;
        boolean z6 = true;
        if (editorToolBar3 == null && editorToolBar.parentToolBar == null) {
            return true;
        }
        if (editorToolBar3 == null || (editorToolBar2 = editorToolBar.parentToolBar) == null) {
            return false;
        }
        if (editorToolBar3.isSameToolBar(editorToolBar2) != 0) {
            z6 = false;
        }
        return z6;
    }

    public void addChildItem(EditorToolBarItem editorToolBarItem) {
        this.childItems.add(editorToolBarItem);
    }

    public void addChildItems(List<EditorToolBarItem> list) {
        this.childItems.clear();
        this.childItems.addAll(list);
    }

    public void addDisableItem(Integer num) {
        this.disableItems.add(num);
    }

    public void clearDisableItems() {
        this.disableItems.clear();
    }

    @Nullable
    public Object getAttachData(String str) {
        return this.attachData.get(str);
    }

    public List<EditorToolBarItem> getChildItems() {
        return this.childItems;
    }

    public List<Integer> getDisableItems() {
        return this.disableItems;
    }

    @Nullable
    public EditorToolBar getParentToolBar() {
        return this.parentToolBar;
    }

    @NonNull
    public EditorToolBarLevel getToolBarLevel() {
        return this.toolBarLevel;
    }

    @NonNull
    public EditorToolBarType getToolBarType() {
        return this.toolBarType;
    }

    public int isSameToolBar(EditorToolBar editorToolBar) {
        if (editorToolBar == null || this.toolBarType != editorToolBar.toolBarType || this.toolBarLevel != editorToolBar.toolBarLevel || this.childItems.size() != editorToolBar.childItems.size()) {
            return 1;
        }
        if (!isChildItemSame(editorToolBar)) {
            return 2;
        }
        if (isDisableItemSame(editorToolBar)) {
            return !isParentSame(editorToolBar) ? 4 : 0;
        }
        return 3;
    }

    public void putAttachData(String str, Object obj) {
        this.attachData.put(str, obj);
    }
}
