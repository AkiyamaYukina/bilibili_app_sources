package com.bilibili.search2.component;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/component/SearchWindowSize.class */
public final class SearchWindowSize {
    private static final EnumEntries $ENTRIES;
    private static final SearchWindowSize[] $VALUES;
    public static final SearchWindowSize COMPACT = new SearchWindowSize("COMPACT", 0);
    public static final SearchWindowSize MEDIUM = new SearchWindowSize("MEDIUM", 1);
    public static final SearchWindowSize EXPANDED = new SearchWindowSize("EXPANDED", 2);

    private static final /* synthetic */ SearchWindowSize[] $values() {
        return new SearchWindowSize[]{COMPACT, MEDIUM, EXPANDED};
    }

    static {
        SearchWindowSize[] searchWindowSizeArr$values = $values();
        $VALUES = searchWindowSizeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(searchWindowSizeArr$values);
    }

    private SearchWindowSize(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<SearchWindowSize> getEntries() {
        return $ENTRIES;
    }

    public static SearchWindowSize valueOf(String str) {
        return (SearchWindowSize) Enum.valueOf(SearchWindowSize.class, str);
    }

    public static SearchWindowSize[] values() {
        return (SearchWindowSize[]) $VALUES.clone();
    }
}
