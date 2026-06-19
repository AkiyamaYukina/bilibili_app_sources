package com.bilibili.playset.playlist.search2;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/search2/PageStatus.class */
public final class PageStatus {
    private static final EnumEntries $ENTRIES;
    private static final PageStatus[] $VALUES;
    public static final PageStatus INIT = new PageStatus("INIT", 0);
    public static final PageStatus SUCCESS_AND_HAS_MORE = new PageStatus("SUCCESS_AND_HAS_MORE", 1);
    public static final PageStatus SUCCESS_OVER = new PageStatus("SUCCESS_OVER", 2);
    public static final PageStatus NET_ERROR = new PageStatus("NET_ERROR", 3);
    public static final PageStatus NO_DATA_THIS_PAGE = new PageStatus("NO_DATA_THIS_PAGE", 4);
    public static final PageStatus NO_DATA_AT_ALL = new PageStatus("NO_DATA_AT_ALL", 5);
    public static final PageStatus HAS_MORE_AND_FOOT_GONE = new PageStatus("HAS_MORE_AND_FOOT_GONE", 6);

    private static final /* synthetic */ PageStatus[] $values() {
        return new PageStatus[]{INIT, SUCCESS_AND_HAS_MORE, SUCCESS_OVER, NET_ERROR, NO_DATA_THIS_PAGE, NO_DATA_AT_ALL, HAS_MORE_AND_FOOT_GONE};
    }

    static {
        PageStatus[] pageStatusArr$values = $values();
        $VALUES = pageStatusArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(pageStatusArr$values);
    }

    private PageStatus(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<PageStatus> getEntries() {
        return $ENTRIES;
    }

    public static PageStatus valueOf(String str) {
        return (PageStatus) Enum.valueOf(PageStatus.class, str);
    }

    public static PageStatus[] values() {
        return (PageStatus[]) $VALUES.clone();
    }
}
