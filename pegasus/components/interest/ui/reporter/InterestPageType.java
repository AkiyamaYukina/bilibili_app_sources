package com.bilibili.pegasus.components.interest.ui.reporter;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/reporter/InterestPageType.class */
public final class InterestPageType {
    private static final EnumEntries $ENTRIES;
    private static final InterestPageType[] $VALUES;
    public static final InterestPageType INFO = new InterestPageType("INFO", 0, "info");
    public static final InterestPageType INTEREST_1ST = new InterestPageType("INTEREST_1ST", 1, "interest_1st");
    public static final InterestPageType INTEREST_2ND = new InterestPageType("INTEREST_2ND", 2, "interest_2nd");

    @NotNull
    private final String type;

    private static final /* synthetic */ InterestPageType[] $values() {
        return new InterestPageType[]{INFO, INTEREST_1ST, INTEREST_2ND};
    }

    static {
        InterestPageType[] interestPageTypeArr$values = $values();
        $VALUES = interestPageTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(interestPageTypeArr$values);
    }

    private InterestPageType(String str, int i7, String str2) {
        this.type = str2;
    }

    @NotNull
    public static EnumEntries<InterestPageType> getEntries() {
        return $ENTRIES;
    }

    public static InterestPageType valueOf(String str) {
        return (InterestPageType) Enum.valueOf(InterestPageType.class, str);
    }

    public static InterestPageType[] values() {
        return (InterestPageType[]) $VALUES.clone();
    }

    @NotNull
    public final String getType() {
        return this.type;
    }
}
