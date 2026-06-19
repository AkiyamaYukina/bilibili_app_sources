package com.bilibili.lib.projection.internal.engine;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/engine/EngineManagerRegisterEnum.class */
public final class EngineManagerRegisterEnum {
    private static final EnumEntries $ENTRIES;
    private static final EngineManagerRegisterEnum[] $VALUES;
    private final int rawValue;
    public static final EngineManagerRegisterEnum Init = new EngineManagerRegisterEnum("Init", 0, 0);
    public static final EngineManagerRegisterEnum Client = new EngineManagerRegisterEnum("Client", 1, 1);
    public static final EngineManagerRegisterEnum Search = new EngineManagerRegisterEnum("Search", 2, 2);

    private static final /* synthetic */ EngineManagerRegisterEnum[] $values() {
        return new EngineManagerRegisterEnum[]{Init, Client, Search};
    }

    static {
        EngineManagerRegisterEnum[] engineManagerRegisterEnumArr$values = $values();
        $VALUES = engineManagerRegisterEnumArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(engineManagerRegisterEnumArr$values);
    }

    private EngineManagerRegisterEnum(String str, int i7, int i8) {
        this.rawValue = i8;
    }

    @NotNull
    public static EnumEntries<EngineManagerRegisterEnum> getEntries() {
        return $ENTRIES;
    }

    public static EngineManagerRegisterEnum valueOf(String str) {
        return (EngineManagerRegisterEnum) Enum.valueOf(EngineManagerRegisterEnum.class, str);
    }

    public static EngineManagerRegisterEnum[] values() {
        return (EngineManagerRegisterEnum[]) $VALUES.clone();
    }

    public final int getRawValue() {
        return this.rawValue;
    }
}
