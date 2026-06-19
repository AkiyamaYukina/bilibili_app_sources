package com.bilibili.sistersplayer.p2p;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/FetchErrorType.class */
public final class FetchErrorType {
    private static final EnumEntries $ENTRIES;
    private static final FetchErrorType[] $VALUES;
    public static final FetchErrorType ERROR_TO_RELOAD = new FetchErrorType("ERROR_TO_RELOAD", 0);
    public static final FetchErrorType ERROR_NO_EFFECT = new FetchErrorType("ERROR_NO_EFFECT", 1);
    public static final FetchErrorType TYPE_COUNT = new FetchErrorType("TYPE_COUNT", 2);

    private static final /* synthetic */ FetchErrorType[] $values() {
        return new FetchErrorType[]{ERROR_TO_RELOAD, ERROR_NO_EFFECT, TYPE_COUNT};
    }

    static {
        FetchErrorType[] fetchErrorTypeArr$values = $values();
        $VALUES = fetchErrorTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(fetchErrorTypeArr$values);
    }

    private FetchErrorType(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<FetchErrorType> getEntries() {
        return $ENTRIES;
    }

    public static FetchErrorType valueOf(String str) {
        return (FetchErrorType) Enum.valueOf(FetchErrorType.class, str);
    }

    public static FetchErrorType[] values() {
        return (FetchErrorType[]) $VALUES.clone();
    }
}
