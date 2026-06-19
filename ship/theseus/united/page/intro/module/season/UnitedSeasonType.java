package com.bilibili.ship.theseus.united.page.intro.module.season;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/UnitedSeasonType.class */
public final class UnitedSeasonType {
    private static final EnumEntries $ENTRIES;
    private static final UnitedSeasonType[] $VALUES;
    public static final UnitedSeasonType SIMPLE = new UnitedSeasonType("SIMPLE", 0);
    public static final UnitedSeasonType FINE = new UnitedSeasonType("FINE", 1);
    public static final UnitedSeasonType UNKNOWN = new UnitedSeasonType("UNKNOWN", 2);

    private static final /* synthetic */ UnitedSeasonType[] $values() {
        return new UnitedSeasonType[]{SIMPLE, FINE, UNKNOWN};
    }

    static {
        UnitedSeasonType[] unitedSeasonTypeArr$values = $values();
        $VALUES = unitedSeasonTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(unitedSeasonTypeArr$values);
    }

    private UnitedSeasonType(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<UnitedSeasonType> getEntries() {
        return $ENTRIES;
    }

    public static UnitedSeasonType valueOf(String str) {
        return (UnitedSeasonType) Enum.valueOf(UnitedSeasonType.class, str);
    }

    public static UnitedSeasonType[] values() {
        return (UnitedSeasonType[]) $VALUES.clone();
    }
}
