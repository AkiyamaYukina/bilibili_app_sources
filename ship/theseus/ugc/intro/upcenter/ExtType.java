package com.bilibili.ship.theseus.ugc.intro.upcenter;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upcenter/ExtType.class */
public final class ExtType {
    private static final EnumEntries $ENTRIES;
    private static final ExtType[] $VALUES;
    private final int value;
    public static final ExtType ExtNone = new ExtType("ExtNone", 0, 0);
    public static final ExtType ExtDataCenter = new ExtType("ExtDataCenter", 1, 1);
    public static final ExtType ExtDataEarnings = new ExtType("ExtDataEarnings", 2, 2);
    public static final ExtType UNRECOGNIZED = new ExtType("UNRECOGNIZED", 3, -1);

    private static final /* synthetic */ ExtType[] $values() {
        return new ExtType[]{ExtNone, ExtDataCenter, ExtDataEarnings, UNRECOGNIZED};
    }

    static {
        ExtType[] extTypeArr$values = $values();
        $VALUES = extTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(extTypeArr$values);
    }

    private ExtType(String str, int i7, int i8) {
        this.value = i8;
    }

    @NotNull
    public static EnumEntries<ExtType> getEntries() {
        return $ENTRIES;
    }

    public static ExtType valueOf(String str) {
        return (ExtType) Enum.valueOf(ExtType.class, str);
    }

    public static ExtType[] values() {
        return (ExtType[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
