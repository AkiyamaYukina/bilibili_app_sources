package com.bilibili.pegasus.components;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/TriggerType.class */
public final class TriggerType {
    private static final EnumEntries $ENTRIES;
    private static final TriggerType[] $VALUES;
    private final int value;
    public static final TriggerType NONE = new TriggerType("NONE", 0, 1);
    public static final TriggerType DIALOG_MANAGER = new TriggerType("DIALOG_MANAGER", 1, 2);
    public static final TriggerType PAGE_VISIBLE = new TriggerType("PAGE_VISIBLE", 2, 3);

    private static final /* synthetic */ TriggerType[] $values() {
        return new TriggerType[]{NONE, DIALOG_MANAGER, PAGE_VISIBLE};
    }

    static {
        TriggerType[] triggerTypeArr$values = $values();
        $VALUES = triggerTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(triggerTypeArr$values);
    }

    private TriggerType(String str, int i7, int i8) {
        this.value = i8;
    }

    @NotNull
    public static EnumEntries<TriggerType> getEntries() {
        return $ENTRIES;
    }

    public static TriggerType valueOf(String str) {
        return (TriggerType) Enum.valueOf(TriggerType.class, str);
    }

    public static TriggerType[] values() {
        return (TriggerType[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
