package com.bilibili.sistersplayer.p2p.fragment;

import com.bilibili.biligame.api.cloudgame.bean.BCGToken;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/fragment/DataSettingStat.class */
public final class DataSettingStat {
    private static final EnumEntries $ENTRIES;
    private static final DataSettingStat[] $VALUES;
    public static final DataSettingStat SUCCESS = new DataSettingStat(BCGToken.SCHEDULE_STATUS_SUCCESS, 0);
    public static final DataSettingStat REPEAT_SETTINGS = new DataSettingStat("REPEAT_SETTINGS", 1);
    public static final DataSettingStat UNDEFINED = new DataSettingStat("UNDEFINED", 2);
    public static final DataSettingStat DATALENGTH_ERROR = new DataSettingStat("DATALENGTH_ERROR", 3);
    public static final DataSettingStat NULL = new DataSettingStat("NULL", 4);
    public static final DataSettingStat REVERTED_DUE_P2P = new DataSettingStat("REVERTED_DUE_P2P", 5);

    private static final /* synthetic */ DataSettingStat[] $values() {
        return new DataSettingStat[]{SUCCESS, REPEAT_SETTINGS, UNDEFINED, DATALENGTH_ERROR, NULL, REVERTED_DUE_P2P};
    }

    static {
        DataSettingStat[] dataSettingStatArr$values = $values();
        $VALUES = dataSettingStatArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(dataSettingStatArr$values);
    }

    private DataSettingStat(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<DataSettingStat> getEntries() {
        return $ENTRIES;
    }

    public static DataSettingStat valueOf(String str) {
        return (DataSettingStat) Enum.valueOf(DataSettingStat.class, str);
    }

    public static DataSettingStat[] values() {
        return (DataSettingStat[]) $VALUES.clone();
    }
}
