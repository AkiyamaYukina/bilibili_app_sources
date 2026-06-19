package com.bilibili.studio.material.internal;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/internal/EngineType.class */
public final class EngineType {
    private static final EnumEntries $ENTRIES;
    private static final EngineType[] $VALUES;
    public static final EngineType Montage = new EngineType("Montage", 0);
    public static final EngineType Meicam = new EngineType("Meicam", 1);

    private static final /* synthetic */ EngineType[] $values() {
        return new EngineType[]{Montage, Meicam};
    }

    static {
        EngineType[] engineTypeArr$values = $values();
        $VALUES = engineTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(engineTypeArr$values);
    }

    private EngineType(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<EngineType> getEntries() {
        return $ENTRIES;
    }

    public static EngineType valueOf(String str) {
        return (EngineType) Enum.valueOf(EngineType.class, str);
    }

    public static EngineType[] values() {
        return (EngineType[]) $VALUES.clone();
    }
}
