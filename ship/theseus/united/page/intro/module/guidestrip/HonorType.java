package com.bilibili.ship.theseus.united.page.intro.module.guidestrip;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/guidestrip/HonorType.class */
public final class HonorType implements com.bilibili.bson.adapter.a<Integer> {
    private static final EnumEntries $ENTRIES;
    private static final HonorType[] $VALUES;
    private final int value;
    public static final HonorType TYPE_50_HEIGHT = new HonorType("TYPE_50_HEIGHT", 0, -1);
    public static final HonorType TYPE_NONE = new HonorType("TYPE_NONE", 1, 0);
    public static final HonorType TYPE_ARGUE = new HonorType("TYPE_ARGUE", 2, 2);
    public static final HonorType TYPE_HONOR_PROFESSION = new HonorType("TYPE_HONOR_PROFESSION", 3, 11);

    private static final /* synthetic */ HonorType[] $values() {
        return new HonorType[]{TYPE_50_HEIGHT, TYPE_NONE, TYPE_ARGUE, TYPE_HONOR_PROFESSION};
    }

    static {
        HonorType[] honorTypeArr$values = $values();
        $VALUES = honorTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(honorTypeArr$values);
    }

    private HonorType(String str, int i7, int i8) {
        this.value = i8;
    }

    @NotNull
    public static EnumEntries<HonorType> getEntries() {
        return $ENTRIES;
    }

    public static HonorType valueOf(String str) {
        return (HonorType) Enum.valueOf(HonorType.class, str);
    }

    public static HonorType[] values() {
        return (HonorType[]) $VALUES.clone();
    }

    @NotNull
    /* JADX INFO: renamed from: getValue, reason: merged with bridge method [inline-methods] */
    public Integer m9464getValue() {
        return Integer.valueOf(this.value);
    }
}
