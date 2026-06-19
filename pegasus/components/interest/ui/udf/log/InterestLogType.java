package com.bilibili.pegasus.components.interest.ui.udf.log;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/udf/log/InterestLogType.class */
public final class InterestLogType {
    private static final EnumEntries $ENTRIES;
    private static final InterestLogType[] $VALUES;
    public static final InterestLogType ACTION = new InterestLogType("ACTION", 0);
    public static final InterestLogType STATE = new InterestLogType("STATE", 1);
    public static final InterestLogType EVENT = new InterestLogType("EVENT", 2);
    public static final InterestLogType HANDLER = new InterestLogType("HANDLER", 3);
    public static final InterestLogType ERROR = new InterestLogType("ERROR", 4);

    private static final /* synthetic */ InterestLogType[] $values() {
        return new InterestLogType[]{ACTION, STATE, EVENT, HANDLER, ERROR};
    }

    static {
        InterestLogType[] interestLogTypeArr$values = $values();
        $VALUES = interestLogTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(interestLogTypeArr$values);
    }

    private InterestLogType(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<InterestLogType> getEntries() {
        return $ENTRIES;
    }

    public static InterestLogType valueOf(String str) {
        return (InterestLogType) Enum.valueOf(InterestLogType.class, str);
    }

    public static InterestLogType[] values() {
        return (InterestLogType[]) $VALUES.clone();
    }
}
