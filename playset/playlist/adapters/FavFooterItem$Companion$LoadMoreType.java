package com.bilibili.playset.playlist.adapters;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/adapters/FavFooterItem$Companion$LoadMoreType.class */
public final class FavFooterItem$Companion$LoadMoreType {
    private static final EnumEntries $ENTRIES;
    private static final FavFooterItem$Companion$LoadMoreType[] $VALUES;
    public static final FavFooterItem$Companion$LoadMoreType LOAD_MORE_STATUS_LOADING = new FavFooterItem$Companion$LoadMoreType("LOAD_MORE_STATUS_LOADING", 0);
    public static final FavFooterItem$Companion$LoadMoreType LOAD_MORE_STATUS_NO_MORE = new FavFooterItem$Companion$LoadMoreType("LOAD_MORE_STATUS_NO_MORE", 1);
    public static final FavFooterItem$Companion$LoadMoreType LOAD_MORE_STATUS_GONE = new FavFooterItem$Companion$LoadMoreType("LOAD_MORE_STATUS_GONE", 2);
    public static final FavFooterItem$Companion$LoadMoreType LOAD_MORE_CLEAN_INVALID = new FavFooterItem$Companion$LoadMoreType("LOAD_MORE_CLEAN_INVALID", 3);

    private static final /* synthetic */ FavFooterItem$Companion$LoadMoreType[] $values() {
        return new FavFooterItem$Companion$LoadMoreType[]{LOAD_MORE_STATUS_LOADING, LOAD_MORE_STATUS_NO_MORE, LOAD_MORE_STATUS_GONE, LOAD_MORE_CLEAN_INVALID};
    }

    static {
        FavFooterItem$Companion$LoadMoreType[] favFooterItem$Companion$LoadMoreTypeArr$values = $values();
        $VALUES = favFooterItem$Companion$LoadMoreTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(favFooterItem$Companion$LoadMoreTypeArr$values);
    }

    private FavFooterItem$Companion$LoadMoreType(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<FavFooterItem$Companion$LoadMoreType> getEntries() {
        return $ENTRIES;
    }

    public static FavFooterItem$Companion$LoadMoreType valueOf(String str) {
        return (FavFooterItem$Companion$LoadMoreType) Enum.valueOf(FavFooterItem$Companion$LoadMoreType.class, str);
    }

    public static FavFooterItem$Companion$LoadMoreType[] values() {
        return (FavFooterItem$Companion$LoadMoreType[]) $VALUES.clone();
    }
}
