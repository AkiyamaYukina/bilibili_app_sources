package com.bilibili.ship.theseus.united.page.danmaku;

import com.bilibili.lib.sharewrapper.SocializeMedia;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/ChronosReserveType.class */
public final class ChronosReserveType {
    private static final EnumEntries $ENTRIES;
    private static final ChronosReserveType[] $VALUES;

    @NotNull
    public static final a Companion;
    private final int type;
    public static final ChronosReserveType NONE = new ChronosReserveType("NONE", 0, 0);
    public static final ChronosReserveType ACTIVITY = new ChronosReserveType("ACTIVITY", 1, 2);
    public static final ChronosReserveType OGV = new ChronosReserveType("OGV", 2, 4);
    public static final ChronosReserveType GAME = new ChronosReserveType("GAME", 3, 5);
    public static final ChronosReserveType UGC = new ChronosReserveType("UGC", 4, 6);
    public static final ChronosReserveType LIVE = new ChronosReserveType(SocializeMedia.BILI_LIVE, 5, 7);
    public static final ChronosReserveType COOPERATION = new ChronosReserveType("COOPERATION", 6, 8);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/ChronosReserveType$a.class */
    public static final class a {
    }

    private static final /* synthetic */ ChronosReserveType[] $values() {
        return new ChronosReserveType[]{NONE, ACTIVITY, OGV, GAME, UGC, LIVE, COOPERATION};
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [com.bilibili.ship.theseus.united.page.danmaku.ChronosReserveType$a, java.lang.Object] */
    static {
        ChronosReserveType[] chronosReserveTypeArr$values = $values();
        $VALUES = chronosReserveTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(chronosReserveTypeArr$values);
        Companion = new Object();
    }

    private ChronosReserveType(String str, int i7, int i8) {
        this.type = i8;
    }

    @NotNull
    public static EnumEntries<ChronosReserveType> getEntries() {
        return $ENTRIES;
    }

    public static ChronosReserveType valueOf(String str) {
        return (ChronosReserveType) Enum.valueOf(ChronosReserveType.class, str);
    }

    public static ChronosReserveType[] values() {
        return (ChronosReserveType[]) $VALUES.clone();
    }

    public final int getType() {
        return this.type;
    }
}
