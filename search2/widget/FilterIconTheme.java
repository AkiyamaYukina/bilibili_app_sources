package com.bilibili.search2.widget;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/widget/FilterIconTheme.class */
public final class FilterIconTheme {
    private static final EnumEntries $ENTRIES;
    private static final FilterIconTheme[] $VALUES;
    public static final FilterIconTheme OGV = new FilterIconTheme("OGV", 0);
    public static final FilterIconTheme NORMAL = new FilterIconTheme("NORMAL", 1);

    private static final /* synthetic */ FilterIconTheme[] $values() {
        return new FilterIconTheme[]{OGV, NORMAL};
    }

    static {
        FilterIconTheme[] filterIconThemeArr$values = $values();
        $VALUES = filterIconThemeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(filterIconThemeArr$values);
    }

    private FilterIconTheme(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<FilterIconTheme> getEntries() {
        return $ENTRIES;
    }

    public static FilterIconTheme valueOf(String str) {
        return (FilterIconTheme) Enum.valueOf(FilterIconTheme.class, str);
    }

    public static FilterIconTheme[] values() {
        return (FilterIconTheme[]) $VALUES.clone();
    }
}
