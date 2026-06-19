package com.bilibili.pegasus.components.interest;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/InterestChainErrorCode.class */
public final class InterestChainErrorCode {
    private static final EnumEntries $ENTRIES;
    private static final InterestChainErrorCode[] $VALUES;
    private final int code;
    public static final InterestChainErrorCode NONE = new InterestChainErrorCode("NONE", 0, 0);
    public static final InterestChainErrorCode DATA_EMPTY = new InterestChainErrorCode("DATA_EMPTY", 1, 1);
    public static final InterestChainErrorCode DATA_VALIDATION_ERROR = new InterestChainErrorCode("DATA_VALIDATION_ERROR", 2, 2);
    public static final InterestChainErrorCode PAGE_INVISIBLE = new InterestChainErrorCode("PAGE_INVISIBLE", 3, 3);
    public static final InterestChainErrorCode NOT_FIRST_REQUEST = new InterestChainErrorCode("NOT_FIRST_REQUEST", 4, 4);
    public static final InterestChainErrorCode COLD_START_FREQ_LIMIT = new InterestChainErrorCode("COLD_START_FREQ_LIMIT", 5, 5);
    public static final InterestChainErrorCode NETWORK_ERROR = new InterestChainErrorCode("NETWORK_ERROR", 6, 6);
    public static final InterestChainErrorCode DIALOG_CRASH = new InterestChainErrorCode("DIALOG_CRASH", 7, 7);
    public static final InterestChainErrorCode TASK_CANCELLED = new InterestChainErrorCode("TASK_CANCELLED", 8, 8);
    public static final InterestChainErrorCode OTHER_EXCEPTION = new InterestChainErrorCode("OTHER_EXCEPTION", 9, 9);
    public static final InterestChainErrorCode OVERSEAS_USER = new InterestChainErrorCode("OVERSEAS_USER", 10, 10);

    private static final /* synthetic */ InterestChainErrorCode[] $values() {
        return new InterestChainErrorCode[]{NONE, DATA_EMPTY, DATA_VALIDATION_ERROR, PAGE_INVISIBLE, NOT_FIRST_REQUEST, COLD_START_FREQ_LIMIT, NETWORK_ERROR, DIALOG_CRASH, TASK_CANCELLED, OTHER_EXCEPTION, OVERSEAS_USER};
    }

    static {
        InterestChainErrorCode[] interestChainErrorCodeArr$values = $values();
        $VALUES = interestChainErrorCodeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(interestChainErrorCodeArr$values);
    }

    private InterestChainErrorCode(String str, int i7, int i8) {
        this.code = i8;
    }

    @NotNull
    public static EnumEntries<InterestChainErrorCode> getEntries() {
        return $ENTRIES;
    }

    public static InterestChainErrorCode valueOf(String str) {
        return (InterestChainErrorCode) Enum.valueOf(InterestChainErrorCode.class, str);
    }

    public static InterestChainErrorCode[] values() {
        return (InterestChainErrorCode[]) $VALUES.clone();
    }

    public final int getCode() {
        return this.code;
    }
}
