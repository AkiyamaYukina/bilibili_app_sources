package com.bilibili.lib.riskcontrol;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/riskcontrol/ErrorType.class */
public final class ErrorType {
    private static final EnumEntries $ENTRIES;
    private static final ErrorType[] $VALUES;
    public static final ErrorType USER_CANCEL = new ErrorType("USER_CANCEL", 0);
    public static final ErrorType EXPIRED = new ErrorType("EXPIRED", 1);
    public static final ErrorType ERROR = new ErrorType("ERROR", 2);

    private static final /* synthetic */ ErrorType[] $values() {
        return new ErrorType[]{USER_CANCEL, EXPIRED, ERROR};
    }

    static {
        ErrorType[] errorTypeArr$values = $values();
        $VALUES = errorTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(errorTypeArr$values);
    }

    private ErrorType(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<ErrorType> getEntries() {
        return $ENTRIES;
    }

    public static ErrorType valueOf(String str) {
        return (ErrorType) Enum.valueOf(ErrorType.class, str);
    }

    public static ErrorType[] values() {
        return (ErrorType[]) $VALUES.clone();
    }
}
