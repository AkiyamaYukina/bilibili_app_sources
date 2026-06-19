package com.bilibili.upper.module.cover.entity;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover/entity/CoverEngineType.class */
public final class CoverEngineType {
    private static final EnumEntries $ENTRIES;
    private static final CoverEngineType[] $VALUES;
    public static final CoverEngineType MAIN = new CoverEngineType("MAIN", 0);
    public static final CoverEngineType SUB = new CoverEngineType("SUB", 1);

    private static final /* synthetic */ CoverEngineType[] $values() {
        return new CoverEngineType[]{MAIN, SUB};
    }

    static {
        CoverEngineType[] coverEngineTypeArr$values = $values();
        $VALUES = coverEngineTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(coverEngineTypeArr$values);
    }

    private CoverEngineType(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<CoverEngineType> getEntries() {
        return $ENTRIES;
    }

    public static CoverEngineType valueOf(String str) {
        return (CoverEngineType) Enum.valueOf(CoverEngineType.class, str);
    }

    public static CoverEngineType[] values() {
        return (CoverEngineType[]) $VALUES.clone();
    }
}
