package com.bilibili.sistersplayer.p2p;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/EventReportType.class */
public final class EventReportType {
    private static final EnumEntries $ENTRIES;
    private static final EventReportType[] $VALUES;
    public static final EventReportType TRACKER_CONNECT_FAIL = new EventReportType("TRACKER_CONNECT_FAIL", 0);

    private static final /* synthetic */ EventReportType[] $values() {
        return new EventReportType[]{TRACKER_CONNECT_FAIL};
    }

    static {
        EventReportType[] eventReportTypeArr$values = $values();
        $VALUES = eventReportTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(eventReportTypeArr$values);
    }

    private EventReportType(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<EventReportType> getEntries() {
        return $ENTRIES;
    }

    public static EventReportType valueOf(String str) {
        return (EventReportType) Enum.valueOf(EventReportType.class, str);
    }

    public static EventReportType[] values() {
        return (EventReportType[]) $VALUES.clone();
    }
}
