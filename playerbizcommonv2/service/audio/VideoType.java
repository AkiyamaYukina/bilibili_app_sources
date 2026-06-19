package com.bilibili.playerbizcommonv2.service.audio;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/service/audio/VideoType.class */
public final class VideoType {
    private static final EnumEntries $ENTRIES;
    private static final VideoType[] $VALUES;
    private final int value;
    public static final VideoType UNKNOWN = new VideoType("UNKNOWN", 0, 0);
    public static final VideoType UGC = new VideoType("UGC", 1, 1);
    public static final VideoType PGC = new VideoType("PGC", 2, 2);
    public static final VideoType CHEESE = new VideoType("CHEESE", 3, 3);

    private static final /* synthetic */ VideoType[] $values() {
        return new VideoType[]{UNKNOWN, UGC, PGC, CHEESE};
    }

    static {
        VideoType[] videoTypeArr$values = $values();
        $VALUES = videoTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(videoTypeArr$values);
    }

    private VideoType(String str, int i7, int i8) {
        this.value = i8;
    }

    @NotNull
    public static EnumEntries<VideoType> getEntries() {
        return $ENTRIES;
    }

    public static VideoType valueOf(String str) {
        return (VideoType) Enum.valueOf(VideoType.class, str);
    }

    public static VideoType[] values() {
        return (VideoType[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
