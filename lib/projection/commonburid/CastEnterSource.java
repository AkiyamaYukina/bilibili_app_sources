package com.bilibili.lib.projection.commonburid;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/commonburid/CastEnterSource.class */
public final class CastEnterSource {
    private static final EnumEntries $ENTRIES;
    private static final CastEnterSource[] $VALUES;

    @NotNull
    private final String rawValue;
    public static final CastEnterSource CastEnterSourceUnknown = new CastEnterSource("CastEnterSourceUnknown", 0, "0");
    public static final CastEnterSource CastEnterSourceDetailProjectionIcon = new CastEnterSource("CastEnterSourceDetailProjectionIcon", 1, "1");
    public static final CastEnterSource CastEnterSourceLiveProjectionIcon = new CastEnterSource("CastEnterSourceLiveProjectionIcon", 2, "2");
    public static final CastEnterSource CastEnterSourceStoryProjectionIcon = new CastEnterSource("CastEnterSourceStoryProjectionIcon", 3, "3");
    public static final CastEnterSource CastEnterSourceHorizontalPlayerProjectionIcon = new CastEnterSource("CastEnterSourceHorizontalPlayerProjectionIcon", 4, "4");
    public static final CastEnterSource CastEnterSourceDetailDialogProjectionIcon = new CastEnterSource("CastEnterSourceDetailDialogProjectionIcon", 5, "5");

    private static final /* synthetic */ CastEnterSource[] $values() {
        return new CastEnterSource[]{CastEnterSourceUnknown, CastEnterSourceDetailProjectionIcon, CastEnterSourceLiveProjectionIcon, CastEnterSourceStoryProjectionIcon, CastEnterSourceHorizontalPlayerProjectionIcon, CastEnterSourceDetailDialogProjectionIcon};
    }

    static {
        CastEnterSource[] castEnterSourceArr$values = $values();
        $VALUES = castEnterSourceArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(castEnterSourceArr$values);
    }

    private CastEnterSource(String str, int i7, String str2) {
        this.rawValue = str2;
    }

    @NotNull
    public static EnumEntries<CastEnterSource> getEntries() {
        return $ENTRIES;
    }

    public static CastEnterSource valueOf(String str) {
        return (CastEnterSource) Enum.valueOf(CastEnterSource.class, str);
    }

    public static CastEnterSource[] values() {
        return (CastEnterSource[]) $VALUES.clone();
    }

    @NotNull
    public final String getRawValue() {
        return this.rawValue;
    }
}
