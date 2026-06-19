package com.bilibili.ship.theseus.united.page.intro.module.kingposition;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionType.class */
public final class KingPositionType {
    private static final EnumEntries $ENTRIES;
    private static final KingPositionType[] $VALUES;
    public static final KingPositionType SPLIT = new KingPositionType("SPLIT", 0);
    public static final KingPositionType KING_POS_UNSPECIFIED = new KingPositionType("KING_POS_UNSPECIFIED", 1);
    public static final KingPositionType LIKE = new KingPositionType("LIKE", 2);
    public static final KingPositionType DISLIKE = new KingPositionType("DISLIKE", 3);
    public static final KingPositionType COIN = new KingPositionType("COIN", 4);
    public static final KingPositionType FAVORITE = new KingPositionType("FAVORITE", 5);
    public static final KingPositionType SHARE = new KingPositionType("SHARE", 6);
    public static final KingPositionType CACHE = new KingPositionType("CACHE", 7);
    public static final KingPositionType DANMAKU = new KingPositionType("DANMAKU", 8);

    private static final /* synthetic */ KingPositionType[] $values() {
        return new KingPositionType[]{SPLIT, KING_POS_UNSPECIFIED, LIKE, DISLIKE, COIN, FAVORITE, SHARE, CACHE, DANMAKU};
    }

    static {
        KingPositionType[] kingPositionTypeArr$values = $values();
        $VALUES = kingPositionTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(kingPositionTypeArr$values);
    }

    private KingPositionType(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<KingPositionType> getEntries() {
        return $ENTRIES;
    }

    public static KingPositionType valueOf(String str) {
        return (KingPositionType) Enum.valueOf(KingPositionType.class, str);
    }

    public static KingPositionType[] values() {
        return (KingPositionType[]) $VALUES.clone();
    }
}
