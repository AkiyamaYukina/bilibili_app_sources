package com.bilibili.story;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/story/ScreenMode.class */
public final class ScreenMode {
    private static final EnumEntries $ENTRIES;
    private static final ScreenMode[] $VALUES;
    public static final ScreenMode VERTICAL_FULLSCREEN = new ScreenMode("VERTICAL_FULLSCREEN", 0);
    public static final ScreenMode LANDSCAPE_FULLSCREEN = new ScreenMode("LANDSCAPE_FULLSCREEN", 1);

    private static final /* synthetic */ ScreenMode[] $values() {
        return new ScreenMode[]{VERTICAL_FULLSCREEN, LANDSCAPE_FULLSCREEN};
    }

    static {
        ScreenMode[] screenModeArr$values = $values();
        $VALUES = screenModeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(screenModeArr$values);
    }

    private ScreenMode(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<ScreenMode> getEntries() {
        return $ENTRIES;
    }

    public static ScreenMode valueOf(String str) {
        return (ScreenMode) Enum.valueOf(ScreenMode.class, str);
    }

    public static ScreenMode[] values() {
        return (ScreenMode[]) $VALUES.clone();
    }
}
