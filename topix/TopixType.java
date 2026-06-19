package com.bilibili.topix;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/TopixType.class */
public final class TopixType {
    private static final EnumEntries $ENTRIES;
    private static final TopixType[] $VALUES;
    private final int category;
    public static final TopixType STORY = new TopixType("STORY", 0, -1);
    public static final TopixType NORMAL = new TopixType("NORMAL", 1, 0);
    public static final TopixType QUESTION = new TopixType("QUESTION", 2, 1);
    public static final TopixType IP = new TopixType("IP", 3, 2);
    public static final TopixType COMMERCE = new TopixType("COMMERCE", 4, 3);

    private static final /* synthetic */ TopixType[] $values() {
        return new TopixType[]{STORY, NORMAL, QUESTION, IP, COMMERCE};
    }

    static {
        TopixType[] topixTypeArr$values = $values();
        $VALUES = topixTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(topixTypeArr$values);
    }

    private TopixType(String str, int i7, int i8) {
        this.category = i8;
    }

    @NotNull
    public static EnumEntries<TopixType> getEntries() {
        return $ENTRIES;
    }

    public static TopixType valueOf(String str) {
        return (TopixType) Enum.valueOf(TopixType.class, str);
    }

    public static TopixType[] values() {
        return (TopixType[]) $VALUES.clone();
    }

    public final int getCategory() {
        return this.category;
    }
}
