package com.bilibili.pegasus.components.interest.ui.reporter;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/reporter/InterestPageCloseReason.class */
public final class InterestPageCloseReason {
    private static final EnumEntries $ENTRIES;
    private static final InterestPageCloseReason[] $VALUES;

    @NotNull
    private final String reason;
    public static final InterestPageCloseReason LOGIN_POPUP = new InterestPageCloseReason("LOGIN_POPUP", 0, "login_popup");
    public static final InterestPageCloseReason BLANK_CLICK = new InterestPageCloseReason("BLANK_CLICK", 1, "blank_click");
    public static final InterestPageCloseReason THREE_POINT = new InterestPageCloseReason("THREE_POINT", 2, "three_point");
    public static final InterestPageCloseReason BAR_PULLDOWN = new InterestPageCloseReason("BAR_PULLDOWN", 3, "bar_pulldown");
    public static final InterestPageCloseReason LEFTUP_RETURN = new InterestPageCloseReason("LEFTUP_RETURN", 4, "leftup_return");
    public static final InterestPageCloseReason GESTURE = new InterestPageCloseReason("GESTURE", 5, "gesture");

    private static final /* synthetic */ InterestPageCloseReason[] $values() {
        return new InterestPageCloseReason[]{LOGIN_POPUP, BLANK_CLICK, THREE_POINT, BAR_PULLDOWN, LEFTUP_RETURN, GESTURE};
    }

    static {
        InterestPageCloseReason[] interestPageCloseReasonArr$values = $values();
        $VALUES = interestPageCloseReasonArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(interestPageCloseReasonArr$values);
    }

    private InterestPageCloseReason(String str, int i7, String str2) {
        this.reason = str2;
    }

    @NotNull
    public static EnumEntries<InterestPageCloseReason> getEntries() {
        return $ENTRIES;
    }

    public static InterestPageCloseReason valueOf(String str) {
        return (InterestPageCloseReason) Enum.valueOf(InterestPageCloseReason.class, str);
    }

    public static InterestPageCloseReason[] values() {
        return (InterestPageCloseReason[]) $VALUES.clone();
    }

    @NotNull
    public final String getReason() {
        return this.reason;
    }
}
