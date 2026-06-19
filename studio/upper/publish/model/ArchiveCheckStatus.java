package com.bilibili.studio.upper.publish.model;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/upper/publish/model/ArchiveCheckStatus.class */
public final class ArchiveCheckStatus {
    private static final EnumEntries $ENTRIES;
    private static final ArchiveCheckStatus[] $VALUES;
    private final int value;
    public static final ArchiveCheckStatus checkNone = new ArchiveCheckStatus("checkNone", 0, -1);
    public static final ArchiveCheckStatus textUnCheck = new ArchiveCheckStatus("textUnCheck", 1, 0);
    public static final ArchiveCheckStatus uploading = new ArchiveCheckStatus("uploading", 2, 1);
    public static final ArchiveCheckStatus uploadPaused = new ArchiveCheckStatus("uploadPaused", 3, 2);
    public static final ArchiveCheckStatus uploadError = new ArchiveCheckStatus("uploadError", 4, 3);
    public static final ArchiveCheckStatus uploadFinished = new ArchiveCheckStatus("uploadFinished", 5, 4);
    public static final ArchiveCheckStatus uploadSpeedSlowly = new ArchiveCheckStatus("uploadSpeedSlowly", 6, 5);
    public static final ArchiveCheckStatus uploadWaitingNetConnect = new ArchiveCheckStatus("uploadWaitingNetConnect", 7, 6);
    public static final ArchiveCheckStatus publishError = new ArchiveCheckStatus("publishError", 8, 51);
    public static final ArchiveCheckStatus textPass = new ArchiveCheckStatus("textPass", 9, 100);
    public static final ArchiveCheckStatus textFailed = new ArchiveCheckStatus("textFailed", 10, 102);
    public static final ArchiveCheckStatus coverPass = new ArchiveCheckStatus("coverPass", 11, 200);
    public static final ArchiveCheckStatus coverFailed = new ArchiveCheckStatus("coverFailed", 12, 201);

    private static final /* synthetic */ ArchiveCheckStatus[] $values() {
        return new ArchiveCheckStatus[]{checkNone, textUnCheck, uploading, uploadPaused, uploadError, uploadFinished, uploadSpeedSlowly, uploadWaitingNetConnect, publishError, textPass, textFailed, coverPass, coverFailed};
    }

    static {
        ArchiveCheckStatus[] archiveCheckStatusArr$values = $values();
        $VALUES = archiveCheckStatusArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(archiveCheckStatusArr$values);
    }

    private ArchiveCheckStatus(String str, int i7, int i8) {
        this.value = i8;
    }

    @NotNull
    public static EnumEntries<ArchiveCheckStatus> getEntries() {
        return $ENTRIES;
    }

    public static ArchiveCheckStatus valueOf(String str) {
        return (ArchiveCheckStatus) Enum.valueOf(ArchiveCheckStatus.class, str);
    }

    public static ArchiveCheckStatus[] values() {
        return (ArchiveCheckStatus[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
