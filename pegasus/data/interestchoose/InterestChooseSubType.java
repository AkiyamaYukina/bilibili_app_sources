package com.bilibili.pegasus.data.interestchoose;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/data/interestchoose/InterestChooseSubType.class */
public final class InterestChooseSubType {
    private static final EnumEntries $ENTRIES;
    private static final InterestChooseSubType[] $VALUES;
    private final int value;
    public static final InterestChooseSubType NONE = new InterestChooseSubType("NONE", 0, 0);
    public static final InterestChooseSubType BUBBLE = new InterestChooseSubType("BUBBLE", 1, 1);
    public static final InterestChooseSubType OPTION = new InterestChooseSubType("OPTION", 2, 2);
    public static final InterestChooseSubType RANDOM = new InterestChooseSubType("RANDOM", 3, 3);

    private static final /* synthetic */ InterestChooseSubType[] $values() {
        return new InterestChooseSubType[]{NONE, BUBBLE, OPTION, RANDOM};
    }

    static {
        InterestChooseSubType[] interestChooseSubTypeArr$values = $values();
        $VALUES = interestChooseSubTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(interestChooseSubTypeArr$values);
    }

    private InterestChooseSubType(String str, int i7, int i8) {
        this.value = i8;
    }

    @NotNull
    public static EnumEntries<InterestChooseSubType> getEntries() {
        return $ENTRIES;
    }

    public static InterestChooseSubType valueOf(String str) {
        return (InterestChooseSubType) Enum.valueOf(InterestChooseSubType.class, str);
    }

    public static InterestChooseSubType[] values() {
        return (InterestChooseSubType[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
