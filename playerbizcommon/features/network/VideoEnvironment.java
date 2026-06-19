package com.bilibili.playerbizcommon.features.network;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/network/VideoEnvironment.class */
public final class VideoEnvironment {
    private static final EnumEntries $ENTRIES;
    private static final VideoEnvironment[] $VALUES;
    public static final VideoEnvironment WIFI_FREE = new VideoEnvironment("WIFI_FREE", 0);
    public static final VideoEnvironment MOBILE_DATA = new VideoEnvironment("MOBILE_DATA", 1);
    public static final VideoEnvironment FREE_DATA_SUCCESS = new VideoEnvironment("FREE_DATA_SUCCESS", 2);
    public static final VideoEnvironment FREE_DATA_FAIL = new VideoEnvironment("FREE_DATA_FAIL", 3);
    public static final VideoEnvironment THIRD_VIDEO = new VideoEnvironment("THIRD_VIDEO", 4);
    public static final VideoEnvironment DRM_VIDEO = new VideoEnvironment("DRM_VIDEO", 5);

    private static final /* synthetic */ VideoEnvironment[] $values() {
        return new VideoEnvironment[]{WIFI_FREE, MOBILE_DATA, FREE_DATA_SUCCESS, FREE_DATA_FAIL, THIRD_VIDEO, DRM_VIDEO};
    }

    static {
        VideoEnvironment[] videoEnvironmentArr$values = $values();
        $VALUES = videoEnvironmentArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(videoEnvironmentArr$values);
    }

    private VideoEnvironment(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<VideoEnvironment> getEntries() {
        return $ENTRIES;
    }

    public static VideoEnvironment valueOf(String str) {
        return (VideoEnvironment) Enum.valueOf(VideoEnvironment.class, str);
    }

    public static VideoEnvironment[] values() {
        return (VideoEnvironment[]) $VALUES.clone();
    }
}
