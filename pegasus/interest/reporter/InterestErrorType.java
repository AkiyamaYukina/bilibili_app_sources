package com.bilibili.pegasus.interest.reporter;

import androidx.annotation.Keep;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/interest/reporter/InterestErrorType.class */
@Keep
public final class InterestErrorType {
    private static final EnumEntries $ENTRIES;
    private static final InterestErrorType[] $VALUES;
    private final int type;
    public static final InterestErrorType NONE = new InterestErrorType("NONE", 0, 0);
    public static final InterestErrorType RESPONSE_EMPTY = new InterestErrorType("RESPONSE_EMPTY", 1, 1);
    public static final InterestErrorType RESPONSE_INVALID = new InterestErrorType("RESPONSE_INVALID", 2, 2);
    public static final InterestErrorType EXCEPTION = new InterestErrorType("EXCEPTION", 3, 3);
    public static final InterestErrorType PAGE_INVISIBLE = new InterestErrorType("PAGE_INVISIBLE", 4, 4);
    public static final InterestErrorType NOT_FIRST_REQUEST = new InterestErrorType("NOT_FIRST_REQUEST", 5, 5);
    public static final InterestErrorType FREQ_LIMIT = new InterestErrorType("FREQ_LIMIT", 6, 6);
    public static final InterestErrorType NETWORK_ERROR = new InterestErrorType("NETWORK_ERROR", 7, 7);
    public static final InterestErrorType OLD_USER_NEW_DEVICE = new InterestErrorType("OLD_USER_NEW_DEVICE", 8, 8);
    public static final InterestErrorType OVERSEAS_TEEN_BLOCKED = new InterestErrorType("OVERSEAS_TEEN_BLOCKED", 9, 9);

    private static final /* synthetic */ InterestErrorType[] $values() {
        return new InterestErrorType[]{NONE, RESPONSE_EMPTY, RESPONSE_INVALID, EXCEPTION, PAGE_INVISIBLE, NOT_FIRST_REQUEST, FREQ_LIMIT, NETWORK_ERROR, OLD_USER_NEW_DEVICE, OVERSEAS_TEEN_BLOCKED};
    }

    static {
        InterestErrorType[] interestErrorTypeArr$values = $values();
        $VALUES = interestErrorTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(interestErrorTypeArr$values);
    }

    private InterestErrorType(String str, int i7, int i8) {
        this.type = i8;
    }

    @NotNull
    public static EnumEntries<InterestErrorType> getEntries() {
        return $ENTRIES;
    }

    public static InterestErrorType valueOf(String str) {
        return (InterestErrorType) Enum.valueOf(InterestErrorType.class, str);
    }

    public static InterestErrorType[] values() {
        return (InterestErrorType[]) $VALUES.clone();
    }

    public final int getType() {
        return this.type;
    }
}
