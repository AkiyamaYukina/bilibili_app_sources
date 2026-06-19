package com.bilibili.mall;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mall/MallCommentLinkSourceType.class */
public final class MallCommentLinkSourceType {
    private static final EnumEntries $ENTRIES;
    private static final MallCommentLinkSourceType[] $VALUES;
    public static final MallCommentLinkSourceType UNKNOWN = new MallCommentLinkSourceType("UNKNOWN", 0);
    public static final MallCommentLinkSourceType UNIT_DETAIL = new MallCommentLinkSourceType("UNIT_DETAIL", 1);
    public static final MallCommentLinkSourceType STORY_VERTICAL = new MallCommentLinkSourceType("STORY_VERTICAL", 2);
    public static final MallCommentLinkSourceType STORY_LANDSCAPE = new MallCommentLinkSourceType("STORY_LANDSCAPE", 3);
    public static final MallCommentLinkSourceType STORY_IMAGE = new MallCommentLinkSourceType("STORY_IMAGE", 4);
    public static final MallCommentLinkSourceType FOLLOWING = new MallCommentLinkSourceType("FOLLOWING", 5);
    public static final MallCommentLinkSourceType MALL_IMAGE_TEXT_DETAIL = new MallCommentLinkSourceType("MALL_IMAGE_TEXT_DETAIL", 6);
    public static final MallCommentLinkSourceType MALL_UNIT_DETAIL = new MallCommentLinkSourceType("MALL_UNIT_DETAIL", 7);
    public static final MallCommentLinkSourceType MALL_RELATED_RECOMMEND = new MallCommentLinkSourceType("MALL_RELATED_RECOMMEND", 8);

    private static final /* synthetic */ MallCommentLinkSourceType[] $values() {
        return new MallCommentLinkSourceType[]{UNKNOWN, UNIT_DETAIL, STORY_VERTICAL, STORY_LANDSCAPE, STORY_IMAGE, FOLLOWING, MALL_IMAGE_TEXT_DETAIL, MALL_UNIT_DETAIL, MALL_RELATED_RECOMMEND};
    }

    static {
        MallCommentLinkSourceType[] mallCommentLinkSourceTypeArr$values = $values();
        $VALUES = mallCommentLinkSourceTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(mallCommentLinkSourceTypeArr$values);
    }

    private MallCommentLinkSourceType(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<MallCommentLinkSourceType> getEntries() {
        return $ENTRIES;
    }

    public static MallCommentLinkSourceType valueOf(String str) {
        return (MallCommentLinkSourceType) Enum.valueOf(MallCommentLinkSourceType.class, str);
    }

    public static MallCommentLinkSourceType[] values() {
        return (MallCommentLinkSourceType[]) $VALUES.clone();
    }
}
