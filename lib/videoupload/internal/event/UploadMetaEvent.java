package com.bilibili.lib.videoupload.internal.event;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/videoupload/internal/event/UploadMetaEvent.class */
public final class UploadMetaEvent {
    private static final EnumEntries $ENTRIES;
    private static final UploadMetaEvent[] $VALUES;
    public static final UploadMetaEvent META_EVENT_SUCCESS = new UploadMetaEvent("META_EVENT_SUCCESS", 0);
    public static final UploadMetaEvent META_EVENT_FAIL = new UploadMetaEvent("META_EVENT_FAIL", 1);

    private static final /* synthetic */ UploadMetaEvent[] $values() {
        return new UploadMetaEvent[]{META_EVENT_SUCCESS, META_EVENT_FAIL};
    }

    static {
        UploadMetaEvent[] uploadMetaEventArr$values = $values();
        $VALUES = uploadMetaEventArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(uploadMetaEventArr$values);
    }

    private UploadMetaEvent(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<UploadMetaEvent> getEntries() {
        return $ENTRIES;
    }

    public static UploadMetaEvent valueOf(String str) {
        return (UploadMetaEvent) Enum.valueOf(UploadMetaEvent.class, str);
    }

    public static UploadMetaEvent[] values() {
        return (UploadMetaEvent[]) $VALUES.clone();
    }
}
