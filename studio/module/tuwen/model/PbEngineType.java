package com.bilibili.studio.module.tuwen.model;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/module/tuwen/model/PbEngineType.class */
public final class PbEngineType {
    private static final EnumEntries $ENTRIES;
    private static final PbEngineType[] $VALUES;
    public static final PbEngineType Montage = new PbEngineType("Montage", 0);
    public static final PbEngineType Meicam = new PbEngineType("Meicam", 1);

    private static final /* synthetic */ PbEngineType[] $values() {
        return new PbEngineType[]{Montage, Meicam};
    }

    static {
        PbEngineType[] pbEngineTypeArr$values = $values();
        $VALUES = pbEngineTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(pbEngineTypeArr$values);
    }

    private PbEngineType(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<PbEngineType> getEntries() {
        return $ENTRIES;
    }

    public static PbEngineType valueOf(String str) {
        return (PbEngineType) Enum.valueOf(PbEngineType.class, str);
    }

    public static PbEngineType[] values() {
        return (PbEngineType[]) $VALUES.clone();
    }
}
