package com.bilibili.ship.theseus.cheese.biz.intro.recommend;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/recommend/RecommendUIStyle.class */
public final class RecommendUIStyle {
    private static final EnumEntries $ENTRIES;
    private static final RecommendUIStyle[] $VALUES;

    @NotNull
    public static final a Companion;
    private final int value;
    public static final RecommendUIStyle PUGV_SEASON_RECOMMEND_SHOW_STYLE_MORE = new RecommendUIStyle("PUGV_SEASON_RECOMMEND_SHOW_STYLE_MORE", 0, 1);
    public static final RecommendUIStyle PUGV_SEASON_RECOMMEND_SHOW_STYLE_FEED = new RecommendUIStyle("PUGV_SEASON_RECOMMEND_SHOW_STYLE_FEED", 1, 2);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/recommend/RecommendUIStyle$a.class */
    public static final class a {
    }

    private static final /* synthetic */ RecommendUIStyle[] $values() {
        return new RecommendUIStyle[]{PUGV_SEASON_RECOMMEND_SHOW_STYLE_MORE, PUGV_SEASON_RECOMMEND_SHOW_STYLE_FEED};
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.bilibili.ship.theseus.cheese.biz.intro.recommend.RecommendUIStyle$a, java.lang.Object] */
    static {
        RecommendUIStyle[] recommendUIStyleArr$values = $values();
        $VALUES = recommendUIStyleArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(recommendUIStyleArr$values);
        Companion = new Object();
    }

    private RecommendUIStyle(String str, int i7, int i8) {
        this.value = i8;
    }

    @NotNull
    public static EnumEntries<RecommendUIStyle> getEntries() {
        return $ENTRIES;
    }

    public static RecommendUIStyle valueOf(String str) {
        return (RecommendUIStyle) Enum.valueOf(RecommendUIStyle.class, str);
    }

    public static RecommendUIStyle[] values() {
        return (RecommendUIStyle[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
