package com.bilibili.opd.app.bizcommon.mangapaysdk.data.model;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mangapaysdk/data/model/ChapterFinishStatus.class */
public final class ChapterFinishStatus {
    private static final EnumEntries $ENTRIES;
    private static final ChapterFinishStatus[] $VALUES;
    private final int status;
    public static final ChapterFinishStatus Unknown = new ChapterFinishStatus("Unknown", 0, -1);
    public static final ChapterFinishStatus Unopened = new ChapterFinishStatus("Unopened", 1, 0);
    public static final ChapterFinishStatus Serialization = new ChapterFinishStatus("Serialization", 2, 1);
    public static final ChapterFinishStatus Finish = new ChapterFinishStatus("Finish", 3, 2);

    private static final /* synthetic */ ChapterFinishStatus[] $values() {
        return new ChapterFinishStatus[]{Unknown, Unopened, Serialization, Finish};
    }

    static {
        ChapterFinishStatus[] chapterFinishStatusArr$values = $values();
        $VALUES = chapterFinishStatusArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(chapterFinishStatusArr$values);
    }

    private ChapterFinishStatus(String str, int i7, int i8) {
        this.status = i8;
    }

    @NotNull
    public static EnumEntries<ChapterFinishStatus> getEntries() {
        return $ENTRIES;
    }

    public static ChapterFinishStatus valueOf(String str) {
        return (ChapterFinishStatus) Enum.valueOf(ChapterFinishStatus.class, str);
    }

    public static ChapterFinishStatus[] values() {
        return (ChapterFinishStatus[]) $VALUES.clone();
    }

    public final int getStatus() {
        return this.status;
    }
}
