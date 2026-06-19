package com.bilibili.pegasus.report;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/report/CategoryType.class */
public final class CategoryType {
    private static final EnumEntries $ENTRIES;
    private static final CategoryType[] $VALUES;
    private final int value;
    public static final CategoryType OLD = new CategoryType("OLD", 0, 1);
    public static final CategoryType NEW = new CategoryType("NEW", 1, 2);

    private static final /* synthetic */ CategoryType[] $values() {
        return new CategoryType[]{OLD, NEW};
    }

    static {
        CategoryType[] categoryTypeArr$values = $values();
        $VALUES = categoryTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(categoryTypeArr$values);
    }

    private CategoryType(String str, int i7, int i8) {
        this.value = i8;
    }

    @NotNull
    public static EnumEntries<CategoryType> getEntries() {
        return $ENTRIES;
    }

    public static CategoryType valueOf(String str) {
        return (CategoryType) Enum.valueOf(CategoryType.class, str);
    }

    public static CategoryType[] values() {
        return (CategoryType[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
