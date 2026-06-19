package com.bilibili.opd.app.bizcommon.mangapaysdk.data.model;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mangapaysdk/data/model/ChapterOnlineStatus.class */
public final class ChapterOnlineStatus {
    private static final EnumEntries $ENTRIES;
    private static final ChapterOnlineStatus[] $VALUES;
    private final int status;
    public static final ChapterOnlineStatus Unknown = new ChapterOnlineStatus("Unknown", 0, -1);
    public static final ChapterOnlineStatus Offline = new ChapterOnlineStatus("Offline", 1, 0);
    public static final ChapterOnlineStatus Online = new ChapterOnlineStatus("Online", 2, 1);
    public static final ChapterOnlineStatus TimeOnline = new ChapterOnlineStatus("TimeOnline", 3, 2);

    private static final /* synthetic */ ChapterOnlineStatus[] $values() {
        return new ChapterOnlineStatus[]{Unknown, Offline, Online, TimeOnline};
    }

    static {
        ChapterOnlineStatus[] chapterOnlineStatusArr$values = $values();
        $VALUES = chapterOnlineStatusArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(chapterOnlineStatusArr$values);
    }

    private ChapterOnlineStatus(String str, int i7, int i8) {
        this.status = i8;
    }

    @NotNull
    public static EnumEntries<ChapterOnlineStatus> getEntries() {
        return $ENTRIES;
    }

    public static ChapterOnlineStatus valueOf(String str) {
        return (ChapterOnlineStatus) Enum.valueOf(ChapterOnlineStatus.class, str);
    }

    public static ChapterOnlineStatus[] values() {
        return (ChapterOnlineStatus[]) $VALUES.clone();
    }

    public final int getStatus() {
        return this.status;
    }
}
