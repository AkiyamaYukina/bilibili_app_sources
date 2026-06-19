package com.bilibili.search2.main.data;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/data/SearchContainerType.class */
public final class SearchContainerType {
    private static final EnumEntries $ENTRIES;
    private static final SearchContainerType[] $VALUES;
    public static final SearchContainerType FULLSCREEN_ACTIVITY = new SearchContainerType("FULLSCREEN_ACTIVITY", 0);
    public static final SearchContainerType HALF_SCREEN = new SearchContainerType("HALF_SCREEN", 1);
    public static final SearchContainerType FULLSCREEN_FLOAT = new SearchContainerType("FULLSCREEN_FLOAT", 2);

    private static final /* synthetic */ SearchContainerType[] $values() {
        return new SearchContainerType[]{FULLSCREEN_ACTIVITY, HALF_SCREEN, FULLSCREEN_FLOAT};
    }

    static {
        SearchContainerType[] searchContainerTypeArr$values = $values();
        $VALUES = searchContainerTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(searchContainerTypeArr$values);
    }

    private SearchContainerType(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<SearchContainerType> getEntries() {
        return $ENTRIES;
    }

    public static SearchContainerType valueOf(String str) {
        return (SearchContainerType) Enum.valueOf(SearchContainerType.class, str);
    }

    public static SearchContainerType[] values() {
        return (SearchContainerType[]) $VALUES.clone();
    }
}
