package com.bilibili.studio.editor.moudle.editormain.track.enums;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/track/enums/BiliEditorMaterialType.class */
public final class BiliEditorMaterialType {
    private static final EnumEntries $ENTRIES;
    private static final BiliEditorMaterialType[] $VALUES;
    public static final BiliEditorMaterialType TYPE_CAPTION = new BiliEditorMaterialType("TYPE_CAPTION", 0);
    public static final BiliEditorMaterialType TYPE_MUSIC = new BiliEditorMaterialType("TYPE_MUSIC", 1);
    public static final BiliEditorMaterialType TYPE_STICKER = new BiliEditorMaterialType("TYPE_STICKER", 2);
    public static final BiliEditorMaterialType TYPE_RECORD = new BiliEditorMaterialType("TYPE_RECORD", 3);

    private static final /* synthetic */ BiliEditorMaterialType[] $values() {
        return new BiliEditorMaterialType[]{TYPE_CAPTION, TYPE_MUSIC, TYPE_STICKER, TYPE_RECORD};
    }

    static {
        BiliEditorMaterialType[] biliEditorMaterialTypeArr$values = $values();
        $VALUES = biliEditorMaterialTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(biliEditorMaterialTypeArr$values);
    }

    private BiliEditorMaterialType(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<BiliEditorMaterialType> getEntries() {
        return $ENTRIES;
    }

    public static BiliEditorMaterialType valueOf(String str) {
        return (BiliEditorMaterialType) Enum.valueOf(BiliEditorMaterialType.class, str);
    }

    public static BiliEditorMaterialType[] values() {
        return (BiliEditorMaterialType[]) $VALUES.clone();
    }
}
