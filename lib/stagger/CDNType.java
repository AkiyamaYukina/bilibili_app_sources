package com.bilibili.lib.stagger;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/stagger/CDNType.class */
public final class CDNType {
    private static final EnumEntries $ENTRIES;
    private static final CDNType[] $VALUES;
    public static final CDNType CDN = new CDNType("CDN", 0);
    public static final CDNType PCDN = new CDNType("PCDN", 1);

    private static final /* synthetic */ CDNType[] $values() {
        return new CDNType[]{CDN, PCDN};
    }

    static {
        CDNType[] cDNTypeArr$values = $values();
        $VALUES = cDNTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(cDNTypeArr$values);
    }

    private CDNType(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<CDNType> getEntries() {
        return $ENTRIES;
    }

    public static CDNType valueOf(String str) {
        return (CDNType) Enum.valueOf(CDNType.class, str);
    }

    public static CDNType[] values() {
        return (CDNType[]) $VALUES.clone();
    }
}
