package com.bilibili.recommendmode;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/recommendmode/OperatorType.class */
public final class OperatorType {
    private static final EnumEntries $ENTRIES;
    private static final OperatorType[] $VALUES;
    private final int type;
    public static final OperatorType SETTING = new OperatorType("SETTING", 0, 1);
    public static final OperatorType GUIDANCE = new OperatorType("GUIDANCE", 1, 2);

    private static final /* synthetic */ OperatorType[] $values() {
        return new OperatorType[]{SETTING, GUIDANCE};
    }

    static {
        OperatorType[] operatorTypeArr$values = $values();
        $VALUES = operatorTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(operatorTypeArr$values);
    }

    private OperatorType(String str, int i7, int i8) {
        this.type = i8;
    }

    @NotNull
    public static EnumEntries<OperatorType> getEntries() {
        return $ENTRIES;
    }

    public static OperatorType valueOf(String str) {
        return (OperatorType) Enum.valueOf(OperatorType.class, str);
    }

    public static OperatorType[] values() {
        return (OperatorType[]) $VALUES.clone();
    }

    public final int getType() {
        return this.type;
    }
}
