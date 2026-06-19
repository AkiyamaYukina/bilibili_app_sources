package com.bilibili.ogv.review.detailpage;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/detailpage/ReviewSourceType.class */
public final class ReviewSourceType implements com.bilibili.bson.adapter.a<Integer> {
    private static final EnumEntries $ENTRIES;
    private static final ReviewSourceType[] $VALUES;

    @NotNull
    public static final a Companion;
    private final int value;
    public static final ReviewSourceType PLAYER_DETAIL = new ReviewSourceType("PLAYER_DETAIL", 0, 1);
    public static final ReviewSourceType PLAYER_TAB3 = new ReviewSourceType("PLAYER_TAB3", 1, 2);
    public static final ReviewSourceType COMMUNITY_SINGLE_PAGE = new ReviewSourceType("COMMUNITY_SINGLE_PAGE", 2, 3);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/detailpage/ReviewSourceType$a.class */
    public static final class a {
    }

    private static final /* synthetic */ ReviewSourceType[] $values() {
        return new ReviewSourceType[]{PLAYER_DETAIL, PLAYER_TAB3, COMMUNITY_SINGLE_PAGE};
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [com.bilibili.ogv.review.detailpage.ReviewSourceType$a, java.lang.Object] */
    static {
        ReviewSourceType[] reviewSourceTypeArr$values = $values();
        $VALUES = reviewSourceTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(reviewSourceTypeArr$values);
        Companion = new Object();
    }

    private ReviewSourceType(String str, int i7, int i8) {
        this.value = i8;
    }

    @NotNull
    public static EnumEntries<ReviewSourceType> getEntries() {
        return $ENTRIES;
    }

    public static ReviewSourceType valueOf(String str) {
        return (ReviewSourceType) Enum.valueOf(ReviewSourceType.class, str);
    }

    public static ReviewSourceType[] values() {
        return (ReviewSourceType[]) $VALUES.clone();
    }

    @NotNull
    /* JADX INFO: renamed from: getValue, reason: merged with bridge method [inline-methods] */
    public Integer m7677getValue() {
        return Integer.valueOf(this.value);
    }
}
