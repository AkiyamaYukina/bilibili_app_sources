package com.bilibili.studio.editor.moudle.editormain.ui.toolbar.beans;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/toolbar/beans/EditorToolBarType.class */
public final class EditorToolBarType {
    private static final EnumEntries $ENTRIES;
    private static final EditorToolBarType[] $VALUES;
    public static final EditorToolBarType MAIN_TOOL_BAR = new EditorToolBarType("MAIN_TOOL_BAR", 0);
    public static final EditorToolBarType CAPTION_TOOL_BAR = new EditorToolBarType("CAPTION_TOOL_BAR", 1);
    public static final EditorToolBarType AUDIO_TOOL_BAR = new EditorToolBarType("AUDIO_TOOL_BAR", 2);
    public static final EditorToolBarType CLIP_EDIT_TOOL_BAR = new EditorToolBarType("CLIP_EDIT_TOOL_BAR", 3);
    public static final EditorToolBarType CAPTION_EDIT_TOOL_BAR = new EditorToolBarType("CAPTION_EDIT_TOOL_BAR", 4);
    public static final EditorToolBarType STICKER_EDIT_TOOL_BAR = new EditorToolBarType("STICKER_EDIT_TOOL_BAR", 5);
    public static final EditorToolBarType MUSIC_EDIT_TOOL_BAR = new EditorToolBarType("MUSIC_EDIT_TOOL_BAR", 6);
    public static final EditorToolBarType RECORD_EDIT_TOOL_BAR = new EditorToolBarType("RECORD_EDIT_TOOL_BAR", 7);

    private static final /* synthetic */ EditorToolBarType[] $values() {
        return new EditorToolBarType[]{MAIN_TOOL_BAR, CAPTION_TOOL_BAR, AUDIO_TOOL_BAR, CLIP_EDIT_TOOL_BAR, CAPTION_EDIT_TOOL_BAR, STICKER_EDIT_TOOL_BAR, MUSIC_EDIT_TOOL_BAR, RECORD_EDIT_TOOL_BAR};
    }

    static {
        EditorToolBarType[] editorToolBarTypeArr$values = $values();
        $VALUES = editorToolBarTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(editorToolBarTypeArr$values);
    }

    private EditorToolBarType(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<EditorToolBarType> getEntries() {
        return $ENTRIES;
    }

    public static EditorToolBarType valueOf(String str) {
        return (EditorToolBarType) Enum.valueOf(EditorToolBarType.class, str);
    }

    public static EditorToolBarType[] values() {
        return (EditorToolBarType[]) $VALUES.clone();
    }
}
