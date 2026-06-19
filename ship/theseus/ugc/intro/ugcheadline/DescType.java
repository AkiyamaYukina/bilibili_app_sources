package com.bilibili.ship.theseus.ugc.intro.ugcheadline;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcheadline/DescType.class */
public final class DescType {
    private static final EnumEntries $ENTRIES;
    private static final DescType[] $VALUES;
    public static final DescType DescTypeUnknown = new DescType("DescTypeUnknown", 0);
    public static final DescType DescTypeText = new DescType("DescTypeText", 1);
    public static final DescType DescTypeAt = new DescType("DescTypeAt", 2);

    private static final /* synthetic */ DescType[] $values() {
        return new DescType[]{DescTypeUnknown, DescTypeText, DescTypeAt};
    }

    static {
        DescType[] descTypeArr$values = $values();
        $VALUES = descTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(descTypeArr$values);
    }

    private DescType(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<DescType> getEntries() {
        return $ENTRIES;
    }

    public static DescType valueOf(String str) {
        return (DescType) Enum.valueOf(DescType.class, str);
    }

    public static DescType[] values() {
        return (DescType[]) $VALUES.clone();
    }
}
