package com.bilibili.pegasus.components.videomode;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/videomode/VideoModeGuideClickArea.class */
public final class VideoModeGuideClickArea {
    private static final EnumEntries $ENTRIES;
    private static final VideoModeGuideClickArea[] $VALUES;

    @NotNull
    private final String area;
    public static final VideoModeGuideClickArea OPEN_BUTTON = new VideoModeGuideClickArea("OPEN_BUTTON", 0, "1");
    public static final VideoModeGuideClickArea CLOSE_BUTTON = new VideoModeGuideClickArea("CLOSE_BUTTON", 1, "2");
    public static final VideoModeGuideClickArea PANEL = new VideoModeGuideClickArea("PANEL", 2, "3");

    private static final /* synthetic */ VideoModeGuideClickArea[] $values() {
        return new VideoModeGuideClickArea[]{OPEN_BUTTON, CLOSE_BUTTON, PANEL};
    }

    static {
        VideoModeGuideClickArea[] videoModeGuideClickAreaArr$values = $values();
        $VALUES = videoModeGuideClickAreaArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(videoModeGuideClickAreaArr$values);
    }

    private VideoModeGuideClickArea(String str, int i7, String str2) {
        this.area = str2;
    }

    @NotNull
    public static EnumEntries<VideoModeGuideClickArea> getEntries() {
        return $ENTRIES;
    }

    public static VideoModeGuideClickArea valueOf(String str) {
        return (VideoModeGuideClickArea) Enum.valueOf(VideoModeGuideClickArea.class, str);
    }

    public static VideoModeGuideClickArea[] values() {
        return (VideoModeGuideClickArea[]) $VALUES.clone();
    }

    @NotNull
    public final String getArea() {
        return this.area;
    }
}
