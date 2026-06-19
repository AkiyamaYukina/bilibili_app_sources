package com.bilibili.ship.theseus.ogv.intro.section.bean;

import com.bilibili.bson.adapter.a;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/bean/SectionType.class */
public final class SectionType implements a<Integer> {
    private static final EnumEntries $ENTRIES;
    private static final SectionType[] $VALUES;
    private final int value;
    public static final SectionType FEATURE = new SectionType("FEATURE", 0, 0);
    public static final SectionType PREVIEW = new SectionType("PREVIEW", 1, 1);
    public static final SectionType OTHER = new SectionType("OTHER", 2, 2);
    public static final SectionType RELATED = new SectionType("RELATED", 3, 3);
    public static final SectionType PUGV = new SectionType("PUGV", 4, 5);
    public static final SectionType CUTTING = new SectionType("CUTTING", 5, 8);

    private static final /* synthetic */ SectionType[] $values() {
        return new SectionType[]{FEATURE, PREVIEW, OTHER, RELATED, PUGV, CUTTING};
    }

    static {
        SectionType[] sectionTypeArr$values = $values();
        $VALUES = sectionTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(sectionTypeArr$values);
    }

    private SectionType(String str, int i7, int i8) {
        this.value = i8;
    }

    @NotNull
    public static EnumEntries<SectionType> getEntries() {
        return $ENTRIES;
    }

    public static SectionType valueOf(String str) {
        return (SectionType) Enum.valueOf(SectionType.class, str);
    }

    public static SectionType[] values() {
        return (SectionType[]) $VALUES.clone();
    }

    @NotNull
    /* JADX INFO: renamed from: getValue, reason: merged with bridge method [inline-methods] */
    public Integer m9066getValue() {
        return Integer.valueOf(this.value);
    }
}
