package com.bilibili.ship.theseus.ugc.intro.ugcpartyinfo;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcpartyinfo/ReserveBizType.class */
public final class ReserveBizType {
    private static final EnumEntries $ENTRIES;
    private static final ReserveBizType[] $VALUES;
    private final int value;
    public static final ReserveBizType BizTypeNone = new ReserveBizType("BizTypeNone", 0, 0);
    public static final ReserveBizType BizTypeReserveActivity = new ReserveBizType("BizTypeReserveActivity", 1, 2);
    public static final ReserveBizType BizTypeFavSeason = new ReserveBizType("BizTypeFavSeason", 2, 4);

    private static final /* synthetic */ ReserveBizType[] $values() {
        return new ReserveBizType[]{BizTypeNone, BizTypeReserveActivity, BizTypeFavSeason};
    }

    static {
        ReserveBizType[] reserveBizTypeArr$values = $values();
        $VALUES = reserveBizTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(reserveBizTypeArr$values);
    }

    private ReserveBizType(String str, int i7, int i8) {
        this.value = i8;
    }

    @NotNull
    public static EnumEntries<ReserveBizType> getEntries() {
        return $ENTRIES;
    }

    public static ReserveBizType valueOf(String str) {
        return (ReserveBizType) Enum.valueOf(ReserveBizType.class, str);
    }

    public static ReserveBizType[] values() {
        return (ReserveBizType[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
