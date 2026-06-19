package com.bilibili.sistersplayer.p2p.fragment;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/fragment/DataRoleType.class */
public final class DataRoleType {
    private static final EnumEntries $ENTRIES;
    private static final DataRoleType[] $VALUES;
    public static final DataRoleType SEED = new DataRoleType("SEED", 0, 0);
    public static final DataRoleType EXCHANGE = new DataRoleType("EXCHANGE", 1, 1);
    public static final DataRoleType LACKED = new DataRoleType("LACKED", 2, 2);

    private static final /* synthetic */ DataRoleType[] $values() {
        return new DataRoleType[]{SEED, EXCHANGE, LACKED};
    }

    static {
        DataRoleType[] dataRoleTypeArr$values = $values();
        $VALUES = dataRoleTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(dataRoleTypeArr$values);
    }

    private DataRoleType(String str, int i7, int i8) {
    }

    @NotNull
    public static EnumEntries<DataRoleType> getEntries() {
        return $ENTRIES;
    }

    public static DataRoleType valueOf(String str) {
        return (DataRoleType) Enum.valueOf(DataRoleType.class, str);
    }

    public static DataRoleType[] values() {
        return (DataRoleType[]) $VALUES.clone();
    }
}
