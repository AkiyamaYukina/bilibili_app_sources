package com.bilibili.lib.projection.internal.widget;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/PageState.class */
public final class PageState {
    private static final EnumEntries $ENTRIES;
    private static final PageState[] $VALUES;
    public static final PageState IDLE = new PageState("IDLE", 0);
    public static final PageState NORMAL = new PageState("NORMAL", 1);
    public static final PageState NO_WIFI = new PageState("NO_WIFI", 2);
    public static final PageState NO_DEVICE = new PageState("NO_DEVICE", 3);
    public static final PageState OTHER_SEARCH = new PageState("OTHER_SEARCH", 4);
    public static final PageState HOW_TO_PRJ = new PageState("HOW_TO_PRJ", 5);

    private static final /* synthetic */ PageState[] $values() {
        return new PageState[]{IDLE, NORMAL, NO_WIFI, NO_DEVICE, OTHER_SEARCH, HOW_TO_PRJ};
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
