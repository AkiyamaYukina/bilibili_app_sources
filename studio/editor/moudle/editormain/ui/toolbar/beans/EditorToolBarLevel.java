package com.bilibili.studio.editor.moudle.editormain.ui.toolbar.beans;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/toolbar/beans/EditorToolBarLevel.class */
public final class EditorToolBarLevel {
    private static final EnumEntries $ENTRIES;
    private static final EditorToolBarLevel[] $VALUES;
    public static final EditorToolBarLevel MAIN_LEVEL = new EditorToolBarLevel("MAIN_LEVEL", 0, 0);
    public static final EditorToolBarLevel SECOND_LEVEL = new EditorToolBarLevel("SECOND_LEVEL", 1, 1);
    public static final EditorToolBarLevel THIRD_LEVEL = new EditorToolBarLevel("THIRD_LEVEL", 2, 2);
    private final int value;

    private static final /* synthetic */ EditorToolBarLevel[] $values() {
        return new EditorToolBarLevel[]{MAIN_LEVEL, SECOND_LEVEL, THIRD_LEVEL};
    }

    static {
        EditorToolBarLevel[] editorToolBarLevelArr$values = $values();
        $VALUES = editorToolBarLevelArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(editorToolBarLevelArr$values);
    }

    private EditorToolBarLevel(String str, int i7, int i8) {
        this.value = i8;
    }

    @NotNull
    public static EnumEntries<EditorToolBarLevel> getEntries() {
        return $ENTRIES;
    }

    public static EditorToolBarLevel valueOf(String str) {
        return (EditorToolBarLevel) Enum.valueOf(EditorToolBarLevel.class, str);
    }

    public static EditorToolBarLevel[] values() {
        return (EditorToolBarLevel[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
