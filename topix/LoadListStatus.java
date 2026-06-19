package com.bilibili.topix;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/LoadListStatus.class */
public final class LoadListStatus {
    private static final EnumEntries $ENTRIES;
    private static final LoadListStatus[] $VALUES;
    public static final LoadListStatus LOADING = new LoadListStatus("LOADING", 0);
    public static final LoadListStatus HIDE = new LoadListStatus("HIDE", 1);
    public static final LoadListStatus ERROR = new LoadListStatus("ERROR", 2);
    public static final LoadListStatus NO_MORE = new LoadListStatus("NO_MORE", 3);

    private static final /* synthetic */ LoadListStatus[] $values() {
        return new LoadListStatus[]{LOADING, HIDE, ERROR, NO_MORE};
    }

    static {
        LoadListStatus[] loadListStatusArr$values = $values();
        $VALUES = loadListStatusArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(loadListStatusArr$values);
    }

    private LoadListStatus(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<LoadListStatus> getEntries() {
        return $ENTRIES;
    }

    public static LoadListStatus valueOf(String str) {
        return (LoadListStatus) Enum.valueOf(LoadListStatus.class, str);
    }

    public static LoadListStatus[] values() {
        return (LoadListStatus[]) $VALUES.clone();
    }
}
