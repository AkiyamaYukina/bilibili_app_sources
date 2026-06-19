package com.bilibili.playerbizcommonv2.widget.quality;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/quality/HdrCardSize.class */
public final class HdrCardSize {
    private static final EnumEntries $ENTRIES;
    private static final HdrCardSize[] $VALUES;
    public static final HdrCardSize LARGE = new HdrCardSize("LARGE", 0);
    public static final HdrCardSize MEDIUM = new HdrCardSize("MEDIUM", 1);
    public static final HdrCardSize SMALL = new HdrCardSize("SMALL", 2);

    private static final /* synthetic */ HdrCardSize[] $values() {
        return new HdrCardSize[]{LARGE, MEDIUM, SMALL};
    }

    static {
        HdrCardSize[] hdrCardSizeArr$values = $values();
        $VALUES = hdrCardSizeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(hdrCardSizeArr$values);
    }

    private HdrCardSize(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<HdrCardSize> getEntries() {
        return $ENTRIES;
    }

    public static HdrCardSize valueOf(String str) {
        return (HdrCardSize) Enum.valueOf(HdrCardSize.class, str);
    }

    public static HdrCardSize[] values() {
        return (HdrCardSize[]) $VALUES.clone();
    }
}
