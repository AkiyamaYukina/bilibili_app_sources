package com.bilibili.ship.theseus.cheese.biz.catalog.panels;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/catalog/panels/Status.class */
public final class Status {
    private static final EnumEntries $ENTRIES;
    private static final Status[] $VALUES;
    public static final Status Loading = new Status("Loading", 0);
    public static final Status Finished = new Status("Finished", 1);
    public static final Status Error = new Status("Error", 2);

    private static final /* synthetic */ Status[] $values() {
        return new Status[]{Loading, Finished, Error};
    }

    static {
        Status[] statusArr$values = $values();
        $VALUES = statusArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(statusArr$values);
    }

    private Status(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<Status> getEntries() {
        return $ENTRIES;
    }

    public static Status valueOf(String str) {
        return (Status) Enum.valueOf(Status.class, str);
    }

    public static Status[] values() {
        return (Status[]) $VALUES.clone();
    }
}
