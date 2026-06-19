package com.bilibili.studio.editor.moudle.editormain.uistate.topbtn;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/uistate/topbtn/TopBtnNextType.class */
public final class TopBtnNextType {
    private static final EnumEntries $ENTRIES;
    private static final TopBtnNextType[] $VALUES;
    public static final TopBtnNextType TYPE_RETURN_DATA = new TopBtnNextType("TYPE_RETURN_DATA", 0);
    public static final TopBtnNextType TYPE_CUSTOM_ROUTE = new TopBtnNextType("TYPE_CUSTOM_ROUTE", 1);

    private static final /* synthetic */ TopBtnNextType[] $values() {
        return new TopBtnNextType[]{TYPE_RETURN_DATA, TYPE_CUSTOM_ROUTE};
    }

    static {
        TopBtnNextType[] topBtnNextTypeArr$values = $values();
        $VALUES = topBtnNextTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(topBtnNextTypeArr$values);
    }

    private TopBtnNextType(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<TopBtnNextType> getEntries() {
        return $ENTRIES;
    }

    public static TopBtnNextType valueOf(String str) {
        return (TopBtnNextType) Enum.valueOf(TopBtnNextType.class, str);
    }

    public static TopBtnNextType[] values() {
        return (TopBtnNextType[]) $VALUES.clone();
    }
}
