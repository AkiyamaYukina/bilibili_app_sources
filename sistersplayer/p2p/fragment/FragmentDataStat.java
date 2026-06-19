package com.bilibili.sistersplayer.p2p.fragment;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/fragment/FragmentDataStat.class */
public final class FragmentDataStat {
    private static final EnumEntries $ENTRIES;
    private static final FragmentDataStat[] $VALUES;
    public static final FragmentDataStat END_SUCCESS = new FragmentDataStat("END_SUCCESS", 0);
    public static final FragmentDataStat END_ERROR = new FragmentDataStat("END_ERROR", 1);
    public static final FragmentDataStat NULL = new FragmentDataStat("NULL", 2);

    private static final /* synthetic */ FragmentDataStat[] $values() {
        return new FragmentDataStat[]{END_SUCCESS, END_ERROR, NULL};
    }

    static {
        FragmentDataStat[] fragmentDataStatArr$values = $values();
        $VALUES = fragmentDataStatArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(fragmentDataStatArr$values);
    }

    private FragmentDataStat(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<FragmentDataStat> getEntries() {
        return $ENTRIES;
    }

    public static FragmentDataStat valueOf(String str) {
        return (FragmentDataStat) Enum.valueOf(FragmentDataStat.class, str);
    }

    public static FragmentDataStat[] values() {
        return (FragmentDataStat[]) $VALUES.clone();
    }
}
