package com.bilibili.sistersplayer.p2p.fragment;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/fragment/FragmentFinishedStat.class */
public final class FragmentFinishedStat {
    private static final EnumEntries $ENTRIES;
    private static final FragmentFinishedStat[] $VALUES;
    public static final FragmentFinishedStat DONE = new FragmentFinishedStat("DONE", 0);
    public static final FragmentFinishedStat ERROR = new FragmentFinishedStat("ERROR", 1);
    public static final FragmentFinishedStat NOTFOUND = new FragmentFinishedStat("NOTFOUND", 2);

    private static final /* synthetic */ FragmentFinishedStat[] $values() {
        return new FragmentFinishedStat[]{DONE, ERROR, NOTFOUND};
    }

    static {
        FragmentFinishedStat[] fragmentFinishedStatArr$values = $values();
        $VALUES = fragmentFinishedStatArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(fragmentFinishedStatArr$values);
    }

    private FragmentFinishedStat(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<FragmentFinishedStat> getEntries() {
        return $ENTRIES;
    }

    public static FragmentFinishedStat valueOf(String str) {
        return (FragmentFinishedStat) Enum.valueOf(FragmentFinishedStat.class, str);
    }

    public static FragmentFinishedStat[] values() {
        return (FragmentFinishedStat[]) $VALUES.clone();
    }
}
