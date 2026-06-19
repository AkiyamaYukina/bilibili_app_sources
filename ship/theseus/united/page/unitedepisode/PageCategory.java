package com.bilibili.ship.theseus.united.page.unitedepisode;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/unitedepisode/PageCategory.class */
public final class PageCategory {
    private static final EnumEntries $ENTRIES;
    private static final PageCategory[] $VALUES;
    public static final PageCategory UNKNOWN = new PageCategory("UNKNOWN", 0);
    public static final PageCategory COMMON_PAGE = new PageCategory("COMMON_PAGE", 1);
    public static final PageCategory ACTIVITY_PAGE = new PageCategory("ACTIVITY_PAGE", 2);

    private static final /* synthetic */ PageCategory[] $values() {
        return new PageCategory[]{UNKNOWN, COMMON_PAGE, ACTIVITY_PAGE};
    }

    static {
        PageCategory[] pageCategoryArr$values = $values();
        $VALUES = pageCategoryArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(pageCategoryArr$values);
    }

    private PageCategory(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<PageCategory> getEntries() {
        return $ENTRIES;
    }

    public static PageCategory valueOf(String str) {
        return (PageCategory) Enum.valueOf(PageCategory.class, str);
    }

    public static PageCategory[] values() {
        return (PageCategory[]) $VALUES.clone();
    }
}
