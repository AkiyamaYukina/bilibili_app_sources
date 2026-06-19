package com.bilibili.pegasus.components.interest.ui.reporter;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/reporter/InterestTipsCloseType.class */
public final class InterestTipsCloseType {
    private static final EnumEntries $ENTRIES;
    private static final InterestTipsCloseType[] $VALUES;

    @NotNull
    private final String type;
    public static final InterestTipsCloseType BUTTON = new InterestTipsCloseType("BUTTON", 0, "button");
    public static final InterestTipsCloseType CANCEL = new InterestTipsCloseType("CANCEL", 1, "cancel");
    public static final InterestTipsCloseType AUTO = new InterestTipsCloseType("AUTO", 2, "auto");
    public static final InterestTipsCloseType SWITCH = new InterestTipsCloseType("SWITCH", 3, "switch");

    private static final /* synthetic */ InterestTipsCloseType[] $values() {
        return new InterestTipsCloseType[]{BUTTON, CANCEL, AUTO, SWITCH};
    }

    static {
        InterestTipsCloseType[] interestTipsCloseTypeArr$values = $values();
        $VALUES = interestTipsCloseTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(interestTipsCloseTypeArr$values);
    }

    private InterestTipsCloseType(String str, int i7, String str2) {
        this.type = str2;
    }

    @NotNull
    public static EnumEntries<InterestTipsCloseType> getEntries() {
        return $ENTRIES;
    }

    public static InterestTipsCloseType valueOf(String str) {
        return (InterestTipsCloseType) Enum.valueOf(InterestTipsCloseType.class, str);
    }

    public static InterestTipsCloseType[] values() {
        return (InterestTipsCloseType[]) $VALUES.clone();
    }

    @NotNull
    public final String getType() {
        return this.type;
    }
}
