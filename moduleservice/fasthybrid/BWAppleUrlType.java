package com.bilibili.moduleservice.fasthybrid;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/moduleservice/fasthybrid/BWAppleUrlType.class */
public final class BWAppleUrlType {
    private static final EnumEntries $ENTRIES;
    private static final BWAppleUrlType[] $VALUES;
    private final int value;
    public static final BWAppleUrlType MINIPROGRAM = new BWAppleUrlType("MINIPROGRAM", 0, 0);
    public static final BWAppleUrlType GAME = new BWAppleUrlType("GAME", 1, 1);
    public static final BWAppleUrlType ERROR = new BWAppleUrlType("ERROR", 2, 2);

    private static final /* synthetic */ BWAppleUrlType[] $values() {
        return new BWAppleUrlType[]{MINIPROGRAM, GAME, ERROR};
    }

    static {
        BWAppleUrlType[] bWAppleUrlTypeArr$values = $values();
        $VALUES = bWAppleUrlTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(bWAppleUrlTypeArr$values);
    }

    private BWAppleUrlType(String str, int i7, int i8) {
        this.value = i8;
    }

    @NotNull
    public static EnumEntries<BWAppleUrlType> getEntries() {
        return $ENTRIES;
    }

    public static BWAppleUrlType valueOf(String str) {
        return (BWAppleUrlType) Enum.valueOf(BWAppleUrlType.class, str);
    }

    public static BWAppleUrlType[] values() {
        return (BWAppleUrlType[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
