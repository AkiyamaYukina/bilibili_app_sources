package com.bilibili.pegasus.interest.reporter;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/interest/reporter/InterestFrom.class */
public final class InterestFrom {
    private static final EnumEntries $ENTRIES;
    private static final InterestFrom[] $VALUES;

    @NotNull
    private final String from;
    public static final InterestFrom NEW = new InterestFrom("NEW", 0, "0");
    public static final InterestFrom LOW = new InterestFrom("LOW", 1, "1");

    private static final /* synthetic */ InterestFrom[] $values() {
        return new InterestFrom[]{NEW, LOW};
    }

    static {
        InterestFrom[] interestFromArr$values = $values();
        $VALUES = interestFromArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(interestFromArr$values);
    }

    private InterestFrom(String str, int i7, String str2) {
        this.from = str2;
    }

    @NotNull
    public static EnumEntries<InterestFrom> getEntries() {
        return $ENTRIES;
    }

    public static InterestFrom valueOf(String str) {
        return (InterestFrom) Enum.valueOf(InterestFrom.class, str);
    }

    public static InterestFrom[] values() {
        return (InterestFrom[]) $VALUES.clone();
    }

    @NotNull
    public final String getFrom() {
        return this.from;
    }
}
