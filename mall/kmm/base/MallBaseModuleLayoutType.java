package com.bilibili.mall.kmm.base;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mall/kmm/base/MallBaseModuleLayoutType.class */
public final class MallBaseModuleLayoutType {
    private static final EnumEntries $ENTRIES;
    private static final MallBaseModuleLayoutType[] $VALUES;
    public static final MallBaseModuleLayoutType SELF_HEIGHT = new MallBaseModuleLayoutType("SELF_HEIGHT", 0);
    public static final MallBaseModuleLayoutType SELF_ADAPTION = new MallBaseModuleLayoutType("SELF_ADAPTION", 1);
    public static final MallBaseModuleLayoutType SELF_OLD = new MallBaseModuleLayoutType("SELF_OLD", 2);

    private static final /* synthetic */ MallBaseModuleLayoutType[] $values() {
        return new MallBaseModuleLayoutType[]{SELF_HEIGHT, SELF_ADAPTION, SELF_OLD};
    }

    static {
        MallBaseModuleLayoutType[] mallBaseModuleLayoutTypeArr$values = $values();
        $VALUES = mallBaseModuleLayoutTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(mallBaseModuleLayoutTypeArr$values);
    }

    private MallBaseModuleLayoutType(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<MallBaseModuleLayoutType> getEntries() {
        return $ENTRIES;
    }

    public static MallBaseModuleLayoutType valueOf(String str) {
        return (MallBaseModuleLayoutType) Enum.valueOf(MallBaseModuleLayoutType.class, str);
    }

    public static MallBaseModuleLayoutType[] values() {
        return (MallBaseModuleLayoutType[]) $VALUES.clone();
    }
}
