package com.bilibili.live.streaming.encoder;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/encoder/VideoEncodeState.class */
public final class VideoEncodeState {
    private static final EnumEntries $ENTRIES;
    private static final VideoEncodeState[] $VALUES;
    public static final VideoEncodeState TARGET_BITRATE_OVERSHOOT = new VideoEncodeState("TARGET_BITRATE_OVERSHOOT", 0);
    public static final VideoEncodeState REQUEST_SLI = new VideoEncodeState("REQUEST_SLI", 1);
    public static final VideoEncodeState NO_OUTPUT = new VideoEncodeState("NO_OUTPUT", 2);
    public static final VideoEncodeState OK = new VideoEncodeState("OK", 3);
    public static final VideoEncodeState START_ERROR = new VideoEncodeState("START_ERROR", 4);
    public static final VideoEncodeState RUNNING_ERROR = new VideoEncodeState("RUNNING_ERROR", 5);
    public static final VideoEncodeState ERROR = new VideoEncodeState("ERROR", 6);
    public static final VideoEncodeState LEVEL_EXCEEDED = new VideoEncodeState("LEVEL_EXCEEDED", 7);
    public static final VideoEncodeState MEMORY = new VideoEncodeState("MEMORY", 8);
    public static final VideoEncodeState ERR_PARAMETER = new VideoEncodeState("ERR_PARAMETER", 9);
    public static final VideoEncodeState ERR_SIZE = new VideoEncodeState("ERR_SIZE", 10);
    public static final VideoEncodeState TIMEOUT = new VideoEncodeState("TIMEOUT", 11);
    public static final VideoEncodeState UNINITIALIZED = new VideoEncodeState("UNINITIALIZED", 12);
    public static final VideoEncodeState ERR_REQUEST_SLI = new VideoEncodeState("ERR_REQUEST_SLI", 13);

    private static final /* synthetic */ VideoEncodeState[] $values() {
        return new VideoEncodeState[]{TARGET_BITRATE_OVERSHOOT, REQUEST_SLI, NO_OUTPUT, OK, START_ERROR, RUNNING_ERROR, ERROR, LEVEL_EXCEEDED, MEMORY, ERR_PARAMETER, ERR_SIZE, TIMEOUT, UNINITIALIZED, ERR_REQUEST_SLI};
    }

    static {
        VideoEncodeState[] videoEncodeStateArr$values = $values();
        $VALUES = videoEncodeStateArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(videoEncodeStateArr$values);
    }

    private VideoEncodeState(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<VideoEncodeState> getEntries() {
        return $ENTRIES;
    }

    public static VideoEncodeState valueOf(String str) {
        return (VideoEncodeState) Enum.valueOf(VideoEncodeState.class, str);
    }

    public static VideoEncodeState[] values() {
        return (VideoEncodeState[]) $VALUES.clone();
    }
}
