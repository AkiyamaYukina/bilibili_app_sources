package com.bilibili.lib.projection.internal.search;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/search/PageState.class */
public final class PageState {
    private static final EnumEntries $ENTRIES;
    private static final PageState[] $VALUES;
    public static final PageState DEFAULT = new PageState("DEFAULT", 0);
    public static final PageState SHOW = new PageState("SHOW", 1);
    public static final PageState DISMISS = new PageState("DISMISS", 2);
    public static final PageState LINK_GUIDE = new PageState("LINK_GUIDE", 3);
    public static final PageState INSTALL_TIP = new PageState("INSTALL_TIP", 4);
    public static final PageState SEARCHING = new PageState("SEARCHING", 5);
    public static final PageState FOUND = new PageState("FOUND", 6);
    public static final PageState CONNECTED = new PageState("CONNECTED", 7);

    private static final /* synthetic */ PageState[] $values() {
        return new PageState[]{DEFAULT, SHOW, DISMISS, LINK_GUIDE, INSTALL_TIP, SEARCHING, FOUND, CONNECTED};
    }

    static {
        PageState[] pageStateArr$values = $values();
        $VALUES = pageStateArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(pageStateArr$values);
    }

    private PageState(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<PageState> getEntries() {
        return $ENTRIES;
    }

    public static PageState valueOf(String str) {
        return (PageState) Enum.valueOf(PageState.class, str);
    }

    public static PageState[] values() {
        return (PageState[]) $VALUES.clone();
    }
}
