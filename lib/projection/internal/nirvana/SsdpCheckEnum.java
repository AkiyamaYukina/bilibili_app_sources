package com.bilibili.lib.projection.internal.nirvana;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/nirvana/SsdpCheckEnum.class */
public final class SsdpCheckEnum {
    private static final EnumEntries $ENTRIES;
    private static final SsdpCheckEnum[] $VALUES;

    @NotNull
    private final String rawValue;
    public static final SsdpCheckEnum DLNA = new SsdpCheckEnum("DLNA", 0, "dlna");
    public static final SsdpCheckEnum Multicast = new SsdpCheckEnum("Multicast", 1, "multicast");
    public static final SsdpCheckEnum APIsolation = new SsdpCheckEnum("APIsolation", 2, "APIsolation");

    private static final /* synthetic */ SsdpCheckEnum[] $values() {
        return new SsdpCheckEnum[]{DLNA, Multicast, APIsolation};
    }

    static {
        SsdpCheckEnum[] ssdpCheckEnumArr$values = $values();
        $VALUES = ssdpCheckEnumArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(ssdpCheckEnumArr$values);
    }

    private SsdpCheckEnum(String str, int i7, String str2) {
        this.rawValue = str2;
    }

    @NotNull
    public static EnumEntries<SsdpCheckEnum> getEntries() {
        return $ENTRIES;
    }

    public static SsdpCheckEnum valueOf(String str) {
        return (SsdpCheckEnum) Enum.valueOf(SsdpCheckEnum.class, str);
    }

    public static SsdpCheckEnum[] values() {
        return (SsdpCheckEnum[]) $VALUES.clone();
    }

    @NotNull
    public final String getRawValue() {
        return this.rawValue;
    }
}
