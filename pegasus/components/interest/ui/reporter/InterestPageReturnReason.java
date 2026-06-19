package com.bilibili.pegasus.components.interest.ui.reporter;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/reporter/InterestPageReturnReason.class */
public final class InterestPageReturnReason {
    private static final EnumEntries $ENTRIES;
    private static final InterestPageReturnReason[] $VALUES;

    @NotNull
    private final String reason;
    public static final InterestPageReturnReason LEFTUP_RETURN = new InterestPageReturnReason("LEFTUP_RETURN", 0, "leftup_return");
    public static final InterestPageReturnReason GESTURE = new InterestPageReturnReason("GESTURE", 1, "gesture");

    private static final /* synthetic */ InterestPageReturnReason[] $values() {
        return new InterestPageReturnReason[]{LEFTUP_RETURN, GESTURE};
    }

    static {
        InterestPageReturnReason[] interestPageReturnReasonArr$values = $values();
        $VALUES = interestPageReturnReasonArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(interestPageReturnReasonArr$values);
    }

    private InterestPageReturnReason(String str, int i7, String str2) {
        this.reason = str2;
    }

    @NotNull
    public static EnumEntries<InterestPageReturnReason> getEntries() {
        return $ENTRIES;
    }

    public static InterestPageReturnReason valueOf(String str) {
        return (InterestPageReturnReason) Enum.valueOf(InterestPageReturnReason.class, str);
    }

    public static InterestPageReturnReason[] values() {
        return (InterestPageReturnReason[]) $VALUES.clone();
    }

    @NotNull
    public final String getReason() {
        return this.reason;
    }
}
