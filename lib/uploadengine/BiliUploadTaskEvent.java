package com.bilibili.lib.uploadengine;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/uploadengine/BiliUploadTaskEvent.class */
public final class BiliUploadTaskEvent {
    private static final EnumEntries $ENTRIES;
    private static final BiliUploadTaskEvent[] $VALUES;
    public static final BiliUploadTaskEvent NET_WAITING = new BiliUploadTaskEvent("NET_WAITING", 0);
    public static final BiliUploadTaskEvent NET_RESUME = new BiliUploadTaskEvent("NET_RESUME", 1);
    public static final BiliUploadTaskEvent SPEED_LOW = new BiliUploadTaskEvent("SPEED_LOW", 2);
    public static final BiliUploadTaskEvent SPEED_NORMAL = new BiliUploadTaskEvent("SPEED_NORMAL", 3);

    private static final /* synthetic */ BiliUploadTaskEvent[] $values() {
        return new BiliUploadTaskEvent[]{NET_WAITING, NET_RESUME, SPEED_LOW, SPEED_NORMAL};
    }

    static {
        BiliUploadTaskEvent[] biliUploadTaskEventArr$values = $values();
        $VALUES = biliUploadTaskEventArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(biliUploadTaskEventArr$values);
    }

    private BiliUploadTaskEvent(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<BiliUploadTaskEvent> getEntries() {
        return $ENTRIES;
    }

    public static BiliUploadTaskEvent valueOf(String str) {
        return (BiliUploadTaskEvent) Enum.valueOf(BiliUploadTaskEvent.class, str);
    }

    public static BiliUploadTaskEvent[] values() {
        return (BiliUploadTaskEvent[]) $VALUES.clone();
    }
}
