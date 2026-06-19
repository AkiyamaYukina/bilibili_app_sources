package com.bilibili.playerbizcommonv2.widget.quality;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/quality/HDRType.class */
public final class HDRType {
    private static final EnumEntries $ENTRIES;
    private static final HDRType[] $VALUES;
    public static final HDRType UNKNOW = new HDRType("UNKNOW", 0);
    public static final HDRType HDR = new HDRType("HDR", 1);
    public static final HDRType HDRVIVID = new HDRType("HDRVIVID", 2);

    private static final /* synthetic */ HDRType[] $values() {
        return new HDRType[]{UNKNOW, HDR, HDRVIVID};
    }

    static {
        HDRType[] hDRTypeArr$values = $values();
        $VALUES = hDRTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(hDRTypeArr$values);
    }

    private HDRType(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<HDRType> getEntries() {
        return $ENTRIES;
    }

    public static HDRType valueOf(String str) {
        return (HDRType) Enum.valueOf(HDRType.class, str);
    }

    public static HDRType[] values() {
        return (HDRType[]) $VALUES.clone();
    }
}
