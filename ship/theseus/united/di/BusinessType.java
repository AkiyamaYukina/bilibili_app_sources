package com.bilibili.ship.theseus.united.di;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/di/BusinessType.class */
public final class BusinessType {
    private static final EnumEntries $ENTRIES;
    private static final BusinessType[] $VALUES;
    public static final BusinessType UGC = new BusinessType("UGC", 0);
    public static final BusinessType OGV = new BusinessType("OGV", 1);
    public static final BusinessType CHEESE = new BusinessType("CHEESE", 2);

    private static final /* synthetic */ BusinessType[] $values() {
        return new BusinessType[]{UGC, OGV, CHEESE};
    }

    static {
        BusinessType[] businessTypeArr$values = $values();
        $VALUES = businessTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(businessTypeArr$values);
    }

    private BusinessType(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<BusinessType> getEntries() {
        return $ENTRIES;
    }

    public static BusinessType valueOf(String str) {
        return (BusinessType) Enum.valueOf(BusinessType.class, str);
    }

    public static BusinessType[] values() {
        return (BusinessType[]) $VALUES.clone();
    }
}
