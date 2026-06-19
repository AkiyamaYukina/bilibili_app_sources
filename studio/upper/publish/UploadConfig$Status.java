package com.bilibili.studio.upper.publish;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/upper/publish/UploadConfig$Status.class */
public final class UploadConfig$Status {
    private static final EnumEntries $ENTRIES;
    private static final UploadConfig$Status[] $VALUES;
    public static final UploadConfig$Status UPLOAD_PAUSE = new UploadConfig$Status("UPLOAD_PAUSE", 0);
    public static final UploadConfig$Status UPLOAD_CANCEL = new UploadConfig$Status("UPLOAD_CANCEL", 1);
    public static final UploadConfig$Status UPLOAD_PROGRESS = new UploadConfig$Status("UPLOAD_PROGRESS", 2);
    public static final UploadConfig$Status UPLOAD_SUCCESS = new UploadConfig$Status("UPLOAD_SUCCESS", 3);
    public static final UploadConfig$Status UPLOAD_FAILED = new UploadConfig$Status("UPLOAD_FAILED", 4);

    private static final /* synthetic */ UploadConfig$Status[] $values() {
        return new UploadConfig$Status[]{UPLOAD_PAUSE, UPLOAD_CANCEL, UPLOAD_PROGRESS, UPLOAD_SUCCESS, UPLOAD_FAILED};
    }

    static {
        UploadConfig$Status[] uploadConfig$StatusArr$values = $values();
        $VALUES = uploadConfig$StatusArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(uploadConfig$StatusArr$values);
    }

    private UploadConfig$Status(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<UploadConfig$Status> getEntries() {
        return $ENTRIES;
    }

    public static UploadConfig$Status valueOf(String str) {
        return (UploadConfig$Status) Enum.valueOf(UploadConfig$Status.class, str);
    }

    public static UploadConfig$Status[] values() {
        return (UploadConfig$Status[]) $VALUES.clone();
    }
}
