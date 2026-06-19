package com.bilibili.lib.projection.commonburid;

import androidx.core.os.EnvironmentCompat;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/commonburid/CastNetworkType.class */
public final class CastNetworkType {
    private static final EnumEntries $ENTRIES;
    private static final CastNetworkType[] $VALUES;

    @NotNull
    private final String rawValue;
    public static final CastNetworkType CastNetworkTypeUNKNOWN = new CastNetworkType("CastNetworkTypeUNKNOWN", 0, EnvironmentCompat.MEDIA_UNKNOWN);
    public static final CastNetworkType CastNetworkTypeWIFI = new CastNetworkType("CastNetworkTypeWIFI", 1, "wifi");
    public static final CastNetworkType CastNetworkTypeWIRED = new CastNetworkType("CastNetworkTypeWIRED", 2, "wired");
    public static final CastNetworkType CastNetworkTypeCELLULAR = new CastNetworkType("CastNetworkTypeCELLULAR", 3, "cellular");

    private static final /* synthetic */ CastNetworkType[] $values() {
        return new CastNetworkType[]{CastNetworkTypeUNKNOWN, CastNetworkTypeWIFI, CastNetworkTypeWIRED, CastNetworkTypeCELLULAR};
    }

    static {
        CastNetworkType[] castNetworkTypeArr$values = $values();
        $VALUES = castNetworkTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(castNetworkTypeArr$values);
    }

    private CastNetworkType(String str, int i7, String str2) {
        this.rawValue = str2;
    }

    @NotNull
    public static EnumEntries<CastNetworkType> getEntries() {
        return $ENTRIES;
    }

    public static CastNetworkType valueOf(String str) {
        return (CastNetworkType) Enum.valueOf(CastNetworkType.class, str);
    }

    public static CastNetworkType[] values() {
        return (CastNetworkType[]) $VALUES.clone();
    }

    @NotNull
    public final String getRawValue() {
        return this.rawValue;
    }
}
