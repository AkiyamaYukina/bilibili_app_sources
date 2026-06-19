package com.bilibili.search2.utils;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/utils/CoverAspectRatio.class */
public final class CoverAspectRatio {
    private static final EnumEntries $ENTRIES;
    private static final CoverAspectRatio[] $VALUES;
    private final float ratio;
    public static final CoverAspectRatio RATIO_4_3 = new CoverAspectRatio("RATIO_4_3", 0, 1.3333334f);
    public static final CoverAspectRatio RATIO_3_4 = new CoverAspectRatio("RATIO_3_4", 1, 0.75f);
    public static final CoverAspectRatio RATIO_16_9 = new CoverAspectRatio("RATIO_16_9", 2, 1.7777778f);
    public static final CoverAspectRatio RATIO_9_16 = new CoverAspectRatio("RATIO_9_16", 3, 0.5625f);
    public static final CoverAspectRatio RATIO_1_1 = new CoverAspectRatio("RATIO_1_1", 4, 1.0f);

    private static final /* synthetic */ CoverAspectRatio[] $values() {
        return new CoverAspectRatio[]{RATIO_4_3, RATIO_3_4, RATIO_16_9, RATIO_9_16, RATIO_1_1};
    }

    static {
        CoverAspectRatio[] coverAspectRatioArr$values = $values();
        $VALUES = coverAspectRatioArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(coverAspectRatioArr$values);
    }

    private CoverAspectRatio(String str, int i7, float f7) {
        this.ratio = f7;
    }

    @NotNull
    public static EnumEntries<CoverAspectRatio> getEntries() {
        return $ENTRIES;
    }

    public static CoverAspectRatio valueOf(String str) {
        return (CoverAspectRatio) Enum.valueOf(CoverAspectRatio.class, str);
    }

    public static CoverAspectRatio[] values() {
        return (CoverAspectRatio[]) $VALUES.clone();
    }

    public final int calculateHeight(int i7) {
        return (int) (i7 / this.ratio);
    }

    public final float getRatio() {
        return this.ratio;
    }
}
