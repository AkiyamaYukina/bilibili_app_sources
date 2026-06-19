package com.bilibili.studio.centerplus.widgets;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/widgets/TabEvent.class */
public final class TabEvent {
    private static final EnumEntries $ENTRIES;
    private static final TabEvent[] $VALUES;
    public static final TabEvent CLICK = new TabEvent("CLICK", 0);
    public static final TabEvent SHOW = new TabEvent("SHOW", 1);

    private static final /* synthetic */ TabEvent[] $values() {
        return new TabEvent[]{CLICK, SHOW};
    }

    static {
        TabEvent[] tabEventArr$values = $values();
        $VALUES = tabEventArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(tabEventArr$values);
    }

    private TabEvent(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<TabEvent> getEntries() {
        return $ENTRIES;
    }

    public static TabEvent valueOf(String str) {
        return (TabEvent) Enum.valueOf(TabEvent.class, str);
    }

    public static TabEvent[] values() {
        return (TabEvent[]) $VALUES.clone();
    }
}
