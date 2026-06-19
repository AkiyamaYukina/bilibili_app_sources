package com.bilibili.studio.editor.moudle.editormain.usecase.previewmodule;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/usecase/previewmodule/RectStateType.class */
public final class RectStateType {
    private static final EnumEntries $ENTRIES;
    private static final RectStateType[] $VALUES;
    public static final RectStateType TYPE_MULTI_EDIT = new RectStateType("TYPE_MULTI_EDIT", 0);
    public static final RectStateType TYPE_STICKER_LIST = new RectStateType("TYPE_STICKER_LIST", 1);

    private static final /* synthetic */ RectStateType[] $values() {
        return new RectStateType[]{TYPE_MULTI_EDIT, TYPE_STICKER_LIST};
    }

    static {
        RectStateType[] rectStateTypeArr$values = $values();
        $VALUES = rectStateTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(rectStateTypeArr$values);
    }

    private RectStateType(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<RectStateType> getEntries() {
        return $ENTRIES;
    }

    public static RectStateType valueOf(String str) {
        return (RectStateType) Enum.valueOf(RectStateType.class, str);
    }

    public static RectStateType[] values() {
        return (RectStateType[]) $VALUES.clone();
    }
}
