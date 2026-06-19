package com.bilibili.pegasus.data;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/data/FeedbackType.class */
public final class FeedbackType {
    private static final EnumEntries $ENTRIES;
    private static final FeedbackType[] $VALUES;
    private final int value;
    public static final FeedbackType NO_SELECTED = new FeedbackType("NO_SELECTED", 0, -1);
    public static final FeedbackType DISLIKE = new FeedbackType("DISLIKE", 1, 0);
    public static final FeedbackType FEEDBACK = new FeedbackType("FEEDBACK", 2, 1);

    private static final /* synthetic */ FeedbackType[] $values() {
        return new FeedbackType[]{NO_SELECTED, DISLIKE, FEEDBACK};
    }

    static {
        FeedbackType[] feedbackTypeArr$values = $values();
        $VALUES = feedbackTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(feedbackTypeArr$values);
    }

    private FeedbackType(String str, int i7, int i8) {
        this.value = i8;
    }

    @NotNull
    public static EnumEntries<FeedbackType> getEntries() {
        return $ENTRIES;
    }

    public static FeedbackType valueOf(String str) {
        return (FeedbackType) Enum.valueOf(FeedbackType.class, str);
    }

    public static FeedbackType[] values() {
        return (FeedbackType[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
