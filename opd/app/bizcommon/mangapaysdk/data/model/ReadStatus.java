package com.bilibili.opd.app.bizcommon.mangapaysdk.data.model;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mangapaysdk/data/model/ReadStatus.class */
public final class ReadStatus {
    private static final EnumEntries $ENTRIES;
    private static final ReadStatus[] $VALUES;
    private final int status;
    public static final ReadStatus Unknown = new ReadStatus("Unknown", 0, -1);
    public static final ReadStatus Unread = new ReadStatus("Unread", 1, 0);
    public static final ReadStatus Read = new ReadStatus("Read", 2, 1);

    private static final /* synthetic */ ReadStatus[] $values() {
        return new ReadStatus[]{Unknown, Unread, Read};
    }

    static {
        ReadStatus[] readStatusArr$values = $values();
        $VALUES = readStatusArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(readStatusArr$values);
    }

    private ReadStatus(String str, int i7, int i8) {
        this.status = i8;
    }

    @NotNull
    public static EnumEntries<ReadStatus> getEntries() {
        return $ENTRIES;
    }

    public static ReadStatus valueOf(String str) {
        return (ReadStatus) Enum.valueOf(ReadStatus.class, str);
    }

    public static ReadStatus[] values() {
        return (ReadStatus[]) $VALUES.clone();
    }

    public final int getStatus() {
        return this.status;
    }
}
