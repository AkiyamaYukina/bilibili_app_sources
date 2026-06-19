package com.bilibili.sistersplayer.p2p;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/WastedDataType.class */
public final class WastedDataType {
    private static final EnumEntries $ENTRIES;
    private static final WastedDataType[] $VALUES;
    public static final WastedDataType P2P_LATE = new WastedDataType("P2P_LATE", 0);
    public static final WastedDataType ERROR_DATA = new WastedDataType("ERROR_DATA", 1);
    public static final WastedDataType CDN_REPEAT = new WastedDataType("CDN_REPEAT", 2);
    public static final WastedDataType TYPE_COUNT = new WastedDataType("TYPE_COUNT", 3);

    private static final /* synthetic */ WastedDataType[] $values() {
        return new WastedDataType[]{P2P_LATE, ERROR_DATA, CDN_REPEAT, TYPE_COUNT};
    }

    static {
        WastedDataType[] wastedDataTypeArr$values = $values();
        $VALUES = wastedDataTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(wastedDataTypeArr$values);
    }

    private WastedDataType(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<WastedDataType> getEntries() {
        return $ENTRIES;
    }

    public static WastedDataType valueOf(String str) {
        return (WastedDataType) Enum.valueOf(WastedDataType.class, str);
    }

    public static WastedDataType[] values() {
        return (WastedDataType[]) $VALUES.clone();
    }
}
