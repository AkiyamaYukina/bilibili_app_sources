package com.bilibili.topix.create;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/create/TitleStatus.class */
public final class TitleStatus {
    private static final EnumEntries $ENTRIES;
    private static final TitleStatus[] $VALUES;
    public static final TitleStatus Init = new TitleStatus("Init", 0);
    public static final TitleStatus Short = new TitleStatus("Short", 1);
    public static final TitleStatus Loading = new TitleStatus("Loading", 2);
    public static final TitleStatus Valid = new TitleStatus("Valid", 3);
    public static final TitleStatus Invalid = new TitleStatus("Invalid", 4);
    public static final TitleStatus Failed = new TitleStatus("Failed", 5);

    private static final /* synthetic */ TitleStatus[] $values() {
        return new TitleStatus[]{Init, Short, Loading, Valid, Invalid, Failed};
    }

    static {
        TitleStatus[] titleStatusArr$values = $values();
        $VALUES = titleStatusArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(titleStatusArr$values);
    }

    private TitleStatus(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<TitleStatus> getEntries() {
        return $ENTRIES;
    }

    public static TitleStatus valueOf(String str) {
        return (TitleStatus) Enum.valueOf(TitleStatus.class, str);
    }

    public static TitleStatus[] values() {
        return (TitleStatus[]) $VALUES.clone();
    }
}
