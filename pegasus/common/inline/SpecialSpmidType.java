package com.bilibili.pegasus.common.inline;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/common/inline/SpecialSpmidType.class */
public final class SpecialSpmidType {
    private static final EnumEntries $ENTRIES;
    private static final SpecialSpmidType[] $VALUES;
    public static final SpecialSpmidType DEFAULT = new SpecialSpmidType("DEFAULT", 0, 0);
    public static final SpecialSpmidType TYPE_BANNER = new SpecialSpmidType("TYPE_BANNER", 1, 1);
    public static final SpecialSpmidType TYPE_NOTIFY = new SpecialSpmidType("TYPE_NOTIFY", 2, 2);
    private final int value;

    private static final /* synthetic */ SpecialSpmidType[] $values() {
        return new SpecialSpmidType[]{DEFAULT, TYPE_BANNER, TYPE_NOTIFY};
    }

    static {
        SpecialSpmidType[] specialSpmidTypeArr$values = $values();
        $VALUES = specialSpmidTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(specialSpmidTypeArr$values);
    }

    private SpecialSpmidType(String str, int i7, int i8) {
        this.value = i8;
    }

    @NotNull
    public static EnumEntries<SpecialSpmidType> getEntries() {
        return $ENTRIES;
    }

    public static SpecialSpmidType valueOf(String str) {
        return (SpecialSpmidType) Enum.valueOf(SpecialSpmidType.class, str);
    }

    public static SpecialSpmidType[] values() {
        return (SpecialSpmidType[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
