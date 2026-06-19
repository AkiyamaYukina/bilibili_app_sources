package com.bilibili.topix.compose.create;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/compose/create/TopicType.class */
public final class TopicType {
    private static final EnumEntries $ENTRIES;
    private static final TopicType[] $VALUES;
    public static final TopicType NORMAL = new TopicType("NORMAL", 0, 0);
    public static final TopicType VIDEO = new TopicType("VIDEO", 1, 1);
    private final int apiInt;

    private static final /* synthetic */ TopicType[] $values() {
        return new TopicType[]{NORMAL, VIDEO};
    }

    static {
        TopicType[] topicTypeArr$values = $values();
        $VALUES = topicTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(topicTypeArr$values);
    }

    private TopicType(String str, int i7, int i8) {
        this.apiInt = i8;
    }

    @NotNull
    public static EnumEntries<TopicType> getEntries() {
        return $ENTRIES;
    }

    public static TopicType valueOf(String str) {
        return (TopicType) Enum.valueOf(TopicType.class, str);
    }

    public static TopicType[] values() {
        return (TopicType[]) $VALUES.clone();
    }

    public final int getApiInt() {
        return this.apiInt;
    }
}
