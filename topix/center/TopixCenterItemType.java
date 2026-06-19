package com.bilibili.topix.center;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/center/TopixCenterItemType.class */
public final class TopixCenterItemType {
    private static final EnumEntries $ENTRIES;
    private static final TopixCenterItemType[] $VALUES;

    @NotNull
    private final String label;
    public static final TopixCenterItemType TOPIC_SECTION = new TopixCenterItemType("TOPIC_SECTION", 0, "section");
    public static final TopixCenterItemType TOPIC_COLLECTED_LIST = new TopixCenterItemType("TOPIC_COLLECTED_LIST", 1, "collect");
    public static final TopixCenterItemType TOPIC_HOT = new TopixCenterItemType("TOPIC_HOT", 2, "hot");
    public static final TopixCenterItemType TOPIC_COMMON = new TopixCenterItemType("TOPIC_COMMON", 3, "all");
    public static final TopixCenterItemType TOPIC_IP = new TopixCenterItemType("TOPIC_IP", 4, "recent");

    private static final /* synthetic */ TopixCenterItemType[] $values() {
        return new TopixCenterItemType[]{TOPIC_SECTION, TOPIC_COLLECTED_LIST, TOPIC_HOT, TOPIC_COMMON, TOPIC_IP};
    }

    static {
        TopixCenterItemType[] topixCenterItemTypeArr$values = $values();
        $VALUES = topixCenterItemTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(topixCenterItemTypeArr$values);
    }

    private TopixCenterItemType(String str, int i7, String str2) {
        this.label = str2;
    }

    @NotNull
    public static EnumEntries<TopixCenterItemType> getEntries() {
        return $ENTRIES;
    }

    public static TopixCenterItemType valueOf(String str) {
        return (TopixCenterItemType) Enum.valueOf(TopixCenterItemType.class, str);
    }

    public static TopixCenterItemType[] values() {
        return (TopixCenterItemType[]) $VALUES.clone();
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }
}
