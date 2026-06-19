package com.bilibili.lib.videoupload.caton;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/videoupload/caton/LagType.class */
public final class LagType {
    private static final EnumEntries $ENTRIES;
    private static final LagType[] $VALUES;

    @NotNull
    private final String value;
    public static final LagType TYPE_NO_CHANGE = new LagType("TYPE_NO_CHANGE", 0, "type_no_change");
    public static final LagType TYPE_LESS_DATA = new LagType("TYPE_LESS_DATA", 1, "type_less_data");

    private static final /* synthetic */ LagType[] $values() {
        return new LagType[]{TYPE_NO_CHANGE, TYPE_LESS_DATA};
    }

    static {
        LagType[] lagTypeArr$values = $values();
        $VALUES = lagTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(lagTypeArr$values);
    }

    private LagType(String str, int i7, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<LagType> getEntries() {
        return $ENTRIES;
    }

    public static LagType valueOf(String str) {
        return (LagType) Enum.valueOf(LagType.class, str);
    }

    public static LagType[] values() {
        return (LagType[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
