package com.bilibili.search2.widget;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/widget/FilterIconStatus.class */
public final class FilterIconStatus {
    private static final EnumEntries $ENTRIES;
    private static final FilterIconStatus[] $VALUES;
    public static final FilterIconStatus NEVER_CLICKED = new FilterIconStatus("NEVER_CLICKED", 0);
    public static final FilterIconStatus NORMAL = new FilterIconStatus("NORMAL", 1);
    public static final FilterIconStatus CLICKED = new FilterIconStatus("CLICKED", 2);
    public static final FilterIconStatus SELECTED = new FilterIconStatus("SELECTED", 3);

    private static final /* synthetic */ FilterIconStatus[] $values() {
        return new FilterIconStatus[]{NEVER_CLICKED, NORMAL, CLICKED, SELECTED};
    }

    static {
        FilterIconStatus[] filterIconStatusArr$values = $values();
        $VALUES = filterIconStatusArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(filterIconStatusArr$values);
    }

    private FilterIconStatus(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<FilterIconStatus> getEntries() {
        return $ENTRIES;
    }

    public static FilterIconStatus valueOf(String str) {
        return (FilterIconStatus) Enum.valueOf(FilterIconStatus.class, str);
    }

    public static FilterIconStatus[] values() {
        return (FilterIconStatus[]) $VALUES.clone();
    }
}
