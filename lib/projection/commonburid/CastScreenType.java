package com.bilibili.lib.projection.commonburid;

import androidx.core.os.EnvironmentCompat;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/commonburid/CastScreenType.class */
public final class CastScreenType {
    private static final EnumEntries $ENTRIES;
    private static final CastScreenType[] $VALUES;

    @NotNull
    private final String rawValue;
    public static final CastScreenType CastScreenTypeUnknown = new CastScreenType("CastScreenTypeUnknown", 0, EnvironmentCompat.MEDIA_UNKNOWN);
    public static final CastScreenType CastScreenTypeDLNA = new CastScreenType("CastScreenTypeDLNA", 1, "dlna");
    public static final CastScreenType CastScreenTypeCloud = new CastScreenType("CastScreenTypeCloud", 2, "cloud");
    public static final CastScreenType CastScreenTypeQRCode = new CastScreenType("CastScreenTypeQRCode", 3, "qr_code");

    private static final /* synthetic */ CastScreenType[] $values() {
        return new CastScreenType[]{CastScreenTypeUnknown, CastScreenTypeDLNA, CastScreenTypeCloud, CastScreenTypeQRCode};
    }

    static {
        CastScreenType[] castScreenTypeArr$values = $values();
        $VALUES = castScreenTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(castScreenTypeArr$values);
    }

    private CastScreenType(String str, int i7, String str2) {
        this.rawValue = str2;
    }

    @NotNull
    public static EnumEntries<CastScreenType> getEntries() {
        return $ENTRIES;
    }

    public static CastScreenType valueOf(String str) {
        return (CastScreenType) Enum.valueOf(CastScreenType.class, str);
    }

    public static CastScreenType[] values() {
        return (CastScreenType[]) $VALUES.clone();
    }

    @NotNull
    public final String getRawValue() {
        return this.rawValue;
    }
}
