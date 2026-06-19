package com.bilibili.studio.videocompilestrategy;

import androidx.window.core.layout.WindowSizeClass;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videocompilestrategy/ResolutionLevel.class */
public final class ResolutionLevel {
    private static final EnumEntries $ENTRIES;
    private static final ResolutionLevel[] $VALUES;
    private final int level;
    public static final ResolutionLevel RES_480 = new ResolutionLevel("RES_480", 0, WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND);
    public static final ResolutionLevel RES_720 = new ResolutionLevel("RES_720", 1, 720);
    public static final ResolutionLevel RES_1080 = new ResolutionLevel("RES_1080", 2, 1080);
    public static final ResolutionLevel RES_2160 = new ResolutionLevel("RES_2160", 3, 2160);

    private static final /* synthetic */ ResolutionLevel[] $values() {
        return new ResolutionLevel[]{RES_480, RES_720, RES_1080, RES_2160};
    }

    static {
        ResolutionLevel[] resolutionLevelArr$values = $values();
        $VALUES = resolutionLevelArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(resolutionLevelArr$values);
    }

    private ResolutionLevel(String str, int i7, int i8) {
        this.level = i8;
    }

    @NotNull
    public static EnumEntries<ResolutionLevel> getEntries() {
        return $ENTRIES;
    }

    public static ResolutionLevel valueOf(String str) {
        return (ResolutionLevel) Enum.valueOf(ResolutionLevel.class, str);
    }

    public static ResolutionLevel[] values() {
        return (ResolutionLevel[]) $VALUES.clone();
    }

    public final int getLevel() {
        return this.level;
    }
}
