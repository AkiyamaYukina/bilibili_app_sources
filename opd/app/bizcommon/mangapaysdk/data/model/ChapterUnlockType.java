package com.bilibili.opd.app.bizcommon.mangapaysdk.data.model;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mangapaysdk/data/model/ChapterUnlockType.class */
public final class ChapterUnlockType {
    private static final EnumEntries $ENTRIES;
    private static final ChapterUnlockType[] $VALUES;
    private final int type;
    public static final ChapterUnlockType Unknown = new ChapterUnlockType("Unknown", 0, -1);
    public static final ChapterUnlockType PurchaseUnlocked = new ChapterUnlockType("PurchaseUnlocked", 1, 1);
    public static final ChapterUnlockType FreeOfChargeForEntireVolume = new ChapterUnlockType("FreeOfChargeForEntireVolume", 2, 2);
    public static final ChapterUnlockType OrdinaryRollsExempted = new ChapterUnlockType("OrdinaryRollsExempted", 3, 3);
    public static final ChapterUnlockType FreeReadingCards = new ChapterUnlockType("FreeReadingCards", 4, 4);
    public static final ChapterUnlockType EntireVolumeOfAllAidCardFree = new ChapterUnlockType("EntireVolumeOfAllAidCardFree", 5, 5);

    private static final /* synthetic */ ChapterUnlockType[] $values() {
        return new ChapterUnlockType[]{Unknown, PurchaseUnlocked, FreeOfChargeForEntireVolume, OrdinaryRollsExempted, FreeReadingCards, EntireVolumeOfAllAidCardFree};
    }

    static {
        ChapterUnlockType[] chapterUnlockTypeArr$values = $values();
        $VALUES = chapterUnlockTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(chapterUnlockTypeArr$values);
    }

    private ChapterUnlockType(String str, int i7, int i8) {
        this.type = i8;
    }

    @NotNull
    public static EnumEntries<ChapterUnlockType> getEntries() {
        return $ENTRIES;
    }

    public static ChapterUnlockType valueOf(String str) {
        return (ChapterUnlockType) Enum.valueOf(ChapterUnlockType.class, str);
    }

    public static ChapterUnlockType[] values() {
        return (ChapterUnlockType[]) $VALUES.clone();
    }

    public final int getType() {
        return this.type;
    }
}
