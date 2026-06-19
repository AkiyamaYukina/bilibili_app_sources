package com.bilibili.ogv.bdesign.tab;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/bdesign/tab/TabSlots.class */
final class TabSlots {
    private static final EnumEntries $ENTRIES;
    private static final TabSlots[] $VALUES;
    public static final TabSlots Tabs = new TabSlots("Tabs", 0);
    public static final TabSlots Divider = new TabSlots("Divider", 1);
    public static final TabSlots Indicator = new TabSlots("Indicator", 2);

    private static final /* synthetic */ TabSlots[] $values() {
        return new TabSlots[]{Tabs, Divider, Indicator};
    }

    static {
        TabSlots[] tabSlotsArr$values = $values();
        $VALUES = tabSlotsArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(tabSlotsArr$values);
    }

    private TabSlots(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<TabSlots> getEntries() {
        return $ENTRIES;
    }

    public static TabSlots valueOf(String str) {
        return (TabSlots) Enum.valueOf(TabSlots.class, str);
    }

    public static TabSlots[] values() {
        return (TabSlots[]) $VALUES.clone();
    }
}
