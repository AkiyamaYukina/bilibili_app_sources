package com.bilibili.playerbizcommonv2.widget.speed;

import com.bilibili.live.streaming.source.TextSource;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/speed/LongPressMode.class */
public final class LongPressMode {
    private static final EnumEntries $ENTRIES;
    private static final LongPressMode[] $VALUES;
    public static final LongPressMode None = new LongPressMode(TextSource.STR_SCROLL_NONE, 0);
    public static final LongPressMode Init = new LongPressMode("Init", 1);
    public static final LongPressMode Speed = new LongPressMode("Speed", 2);
    public static final LongPressMode SpeedLocked = new LongPressMode("SpeedLocked", 3);
    public static final LongPressMode Seek = new LongPressMode("Seek", 4);
    public static final LongPressMode SpeedLockedSeek = new LongPressMode("SpeedLockedSeek", 5);

    private static final /* synthetic */ LongPressMode[] $values() {
        return new LongPressMode[]{None, Init, Speed, SpeedLocked, Seek, SpeedLockedSeek};
    }

    static {
        LongPressMode[] longPressModeArr$values = $values();
        $VALUES = longPressModeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(longPressModeArr$values);
    }

    private LongPressMode(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<LongPressMode> getEntries() {
        return $ENTRIES;
    }

    public static LongPressMode valueOf(String str) {
        return (LongPressMode) Enum.valueOf(LongPressMode.class, str);
    }

    public static LongPressMode[] values() {
        return (LongPressMode[]) $VALUES.clone();
    }
}
