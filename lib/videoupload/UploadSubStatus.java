package com.bilibili.lib.videoupload;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/videoupload/UploadSubStatus.class */
public final class UploadSubStatus {
    private static final EnumEntries $ENTRIES;
    private static final UploadSubStatus[] $VALUES;

    @NotNull
    private final String value;
    public static final UploadSubStatus STATUS_UPLOADING = new UploadSubStatus("STATUS_UPLOADING", 0, "notice_uploading");
    public static final UploadSubStatus STATUS_WAITING = new UploadSubStatus("STATUS_WAITING", 1, "notice_waiting");
    public static final UploadSubStatus STATUS_LOW_SPEED = new UploadSubStatus("STATUS_LOW_SPEED", 2, "notice_low_speed");

    private static final /* synthetic */ UploadSubStatus[] $values() {
        return new UploadSubStatus[]{STATUS_UPLOADING, STATUS_WAITING, STATUS_LOW_SPEED};
    }

    static {
        UploadSubStatus[] uploadSubStatusArr$values = $values();
        $VALUES = uploadSubStatusArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(uploadSubStatusArr$values);
    }

    private UploadSubStatus(String str, int i7, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<UploadSubStatus> getEntries() {
        return $ENTRIES;
    }

    public static UploadSubStatus valueOf(String str) {
        return (UploadSubStatus) Enum.valueOf(UploadSubStatus.class, str);
    }

    public static UploadSubStatus[] values() {
        return (UploadSubStatus[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
