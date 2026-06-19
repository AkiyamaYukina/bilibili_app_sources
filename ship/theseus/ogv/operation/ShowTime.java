package com.bilibili.ship.theseus.ogv.operation;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/operation/ShowTime.class */
public final class ShowTime implements com.bilibili.bson.adapter.a<String> {
    private static final EnumEntries $ENTRIES;
    private static final ShowTime[] $VALUES;

    @NotNull
    private final String value;
    public static final ShowTime INTO_VIEW_PAGE = new ShowTime("INTO_VIEW_PAGE", 0, "INTO_VIEW_PAGE");
    public static final ShowTime PAY_REMINDER = new ShowTime("PAY_REMINDER", 1, "PAY_REMINDER");
    public static final ShowTime BACK_VIEW_PAGE = new ShowTime("BACK_VIEW_PAGE", 2, "BACK_VIEW_PAGE");

    private static final /* synthetic */ ShowTime[] $values() {
        return new ShowTime[]{INTO_VIEW_PAGE, PAY_REMINDER, BACK_VIEW_PAGE};
    }

    static {
        ShowTime[] showTimeArr$values = $values();
        $VALUES = showTimeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(showTimeArr$values);
    }

    private ShowTime(String str, int i7, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<ShowTime> getEntries() {
        return $ENTRIES;
    }

    public static ShowTime valueOf(String str) {
        return (ShowTime) Enum.valueOf(ShowTime.class, str);
    }

    public static ShowTime[] values() {
        return (ShowTime[]) $VALUES.clone();
    }

    @NotNull
    public String getValue() {
        return this.value;
    }
}
