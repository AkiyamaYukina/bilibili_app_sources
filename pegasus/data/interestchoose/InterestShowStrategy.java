package com.bilibili.pegasus.data.interestchoose;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/data/interestchoose/InterestShowStrategy.class */
public final class InterestShowStrategy {
    private static final EnumEntries $ENTRIES;
    private static final InterestShowStrategy[] $VALUES;

    @NotNull
    private final String strategy;
    public static final InterestShowStrategy NEW_USER_FIRST_START = new InterestShowStrategy("NEW_USER_FIRST_START", 0, "1");
    public static final InterestShowStrategy NEW_USER_SECOND_START = new InterestShowStrategy("NEW_USER_SECOND_START", 1, "2");
    public static final InterestShowStrategy CNY = new InterestShowStrategy("CNY", 2, "3");
    public static final InterestShowStrategy LOW_ACTIVE = new InterestShowStrategy("LOW_ACTIVE", 3, "4");
    public static final InterestShowStrategy LOW_ACTIVE_SECOND = new InterestShowStrategy("LOW_ACTIVE_SECOND", 4, "5");

    private static final /* synthetic */ InterestShowStrategy[] $values() {
        return new InterestShowStrategy[]{NEW_USER_FIRST_START, NEW_USER_SECOND_START, CNY, LOW_ACTIVE, LOW_ACTIVE_SECOND};
    }

    static {
        InterestShowStrategy[] interestShowStrategyArr$values = $values();
        $VALUES = interestShowStrategyArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(interestShowStrategyArr$values);
    }

    private InterestShowStrategy(String str, int i7, String str2) {
        this.strategy = str2;
    }

    @NotNull
    public static EnumEntries<InterestShowStrategy> getEntries() {
        return $ENTRIES;
    }

    public static InterestShowStrategy valueOf(String str) {
        return (InterestShowStrategy) Enum.valueOf(InterestShowStrategy.class, str);
    }

    public static InterestShowStrategy[] values() {
        return (InterestShowStrategy[]) $VALUES.clone();
    }

    @NotNull
    public final String getStrategy() {
        return this.strategy;
    }
}
