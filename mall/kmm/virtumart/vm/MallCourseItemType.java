package com.bilibili.mall.kmm.virtumart.vm;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mall/kmm/virtumart/vm/MallCourseItemType.class */
public final class MallCourseItemType {
    private static final EnumEntries $ENTRIES;
    private static final MallCourseItemType[] $VALUES;
    public static final MallCourseItemType SECTION = new MallCourseItemType("SECTION", 0);
    public static final MallCourseItemType COURSE = new MallCourseItemType("COURSE", 1);
    public static final MallCourseItemType SECTION_SELECT = new MallCourseItemType("SECTION_SELECT", 2);

    private static final /* synthetic */ MallCourseItemType[] $values() {
        return new MallCourseItemType[]{SECTION, COURSE, SECTION_SELECT};
    }

    static {
        MallCourseItemType[] mallCourseItemTypeArr$values = $values();
        $VALUES = mallCourseItemTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(mallCourseItemTypeArr$values);
    }

    private MallCourseItemType(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<MallCourseItemType> getEntries() {
        return $ENTRIES;
    }

    public static MallCourseItemType valueOf(String str) {
        return (MallCourseItemType) Enum.valueOf(MallCourseItemType.class, str);
    }

    public static MallCourseItemType[] values() {
        return (MallCourseItemType[]) $VALUES.clone();
    }
}
