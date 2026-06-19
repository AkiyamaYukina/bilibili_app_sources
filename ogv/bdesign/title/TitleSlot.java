package com.bilibili.ogv.bdesign.title;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/bdesign/title/TitleSlot.class */
final class TitleSlot {
    private static final EnumEntries $ENTRIES;
    private static final TitleSlot[] $VALUES;
    public static final TitleSlot TitleLeftContent = new TitleSlot("TitleLeftContent", 0);
    public static final TitleSlot FirstLineText = new TitleSlot("FirstLineText", 1);
    public static final TitleSlot SecondLineText = new TitleSlot("SecondLineText", 2);
    public static final TitleSlot TitleRightContent = new TitleSlot("TitleRightContent", 3);

    private static final /* synthetic */ TitleSlot[] $values() {
        return new TitleSlot[]{TitleLeftContent, FirstLineText, SecondLineText, TitleRightContent};
    }

    static {
        TitleSlot[] titleSlotArr$values = $values();
        $VALUES = titleSlotArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(titleSlotArr$values);
    }

    private TitleSlot(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<TitleSlot> getEntries() {
        return $ENTRIES;
    }

    public static TitleSlot valueOf(String str) {
        return (TitleSlot) Enum.valueOf(TitleSlot.class, str);
    }

    public static TitleSlot[] values() {
        return (TitleSlot[]) $VALUES.clone();
    }
}
