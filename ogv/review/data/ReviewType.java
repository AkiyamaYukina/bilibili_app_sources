package com.bilibili.ogv.review.data;

import com.bilibili.bson.adapter.a;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/data/ReviewType.class */
public final class ReviewType implements a<Integer> {
    private static final EnumEntries $ENTRIES;
    private static final ReviewType[] $VALUES;
    private final int value;
    public static final ReviewType ALL = new ReviewType("ALL", 0, 0);
    public static final ReviewType SHORT_REVIEW = new ReviewType("SHORT_REVIEW", 1, 1);
    public static final ReviewType LONG_REVIEW = new ReviewType("LONG_REVIEW", 2, 2);

    private static final /* synthetic */ ReviewType[] $values() {
        return new ReviewType[]{ALL, SHORT_REVIEW, LONG_REVIEW};
    }

    static {
        ReviewType[] reviewTypeArr$values = $values();
        $VALUES = reviewTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(reviewTypeArr$values);
    }

    private ReviewType(String str, int i7, int i8) {
        this.value = i8;
    }

    @NotNull
    public static EnumEntries<ReviewType> getEntries() {
        return $ENTRIES;
    }

    public static ReviewType valueOf(String str) {
        return (ReviewType) Enum.valueOf(ReviewType.class, str);
    }

    public static ReviewType[] values() {
        return (ReviewType[]) $VALUES.clone();
    }

    @NotNull
    /* JADX INFO: renamed from: getValue, reason: merged with bridge method [inline-methods] */
    public Integer m7667getValue() {
        return Integer.valueOf(this.value);
    }
}
