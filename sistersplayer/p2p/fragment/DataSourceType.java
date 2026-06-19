package com.bilibili.sistersplayer.p2p.fragment;

import com.bilibili.sistersplayer.p2p.P2P;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/fragment/DataSourceType.class */
public final class DataSourceType {
    private static final EnumEntries $ENTRIES;
    private static final DataSourceType[] $VALUES;
    public static final DataSourceType SERVER = new DataSourceType("SERVER", 0, 0);
    public static final DataSourceType P2P = new DataSourceType(P2P.TAG, 1, 1);

    private static final /* synthetic */ DataSourceType[] $values() {
        return new DataSourceType[]{SERVER, P2P};
    }

    static {
        DataSourceType[] dataSourceTypeArr$values = $values();
        $VALUES = dataSourceTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(dataSourceTypeArr$values);
    }

    private DataSourceType(String str, int i7, int i8) {
    }

    @NotNull
    public static EnumEntries<DataSourceType> getEntries() {
        return $ENTRIES;
    }

    public static DataSourceType valueOf(String str) {
        return (DataSourceType) Enum.valueOf(DataSourceType.class, str);
    }

    public static DataSourceType[] values() {
        return (DataSourceType[]) $VALUES.clone();
    }
}
