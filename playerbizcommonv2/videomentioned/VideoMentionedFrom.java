package com.bilibili.playerbizcommonv2.videomentioned;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/videomentioned/VideoMentionedFrom.class */
public final class VideoMentionedFrom {
    private static final EnumEntries $ENTRIES;
    private static final VideoMentionedFrom[] $VALUES;
    public static final VideoMentionedFrom STORY = new VideoMentionedFrom("STORY", 0, "story");

    @NotNull
    private final String from;

    private static final /* synthetic */ VideoMentionedFrom[] $values() {
        return new VideoMentionedFrom[]{STORY};
    }

    static {
        VideoMentionedFrom[] videoMentionedFromArr$values = $values();
        $VALUES = videoMentionedFromArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(videoMentionedFromArr$values);
    }

    private VideoMentionedFrom(String str, int i7, String str2) {
        this.from = str2;
    }

    @NotNull
    public static EnumEntries<VideoMentionedFrom> getEntries() {
        return $ENTRIES;
    }

    public static VideoMentionedFrom valueOf(String str) {
        return (VideoMentionedFrom) Enum.valueOf(VideoMentionedFrom.class, str);
    }

    public static VideoMentionedFrom[] values() {
        return (VideoMentionedFrom[]) $VALUES.clone();
    }

    @NotNull
    public final String getFrom() {
        return this.from;
    }
}
