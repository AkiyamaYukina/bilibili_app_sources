package com.bilibili.ship.theseus.cheese.biz.intro.primary;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/PugvBadgeType.class */
public final class PugvBadgeType {
    private static final EnumEntries $ENTRIES;
    private static final PugvBadgeType[] $VALUES;
    public static final PugvBadgeType PUGV_BADGE_TYPE_UNKNOWN = new PugvBadgeType("PUGV_BADGE_TYPE_UNKNOWN", 0, 0);
    public static final PugvBadgeType PUGV_BADGE_TYPE_PRODUCTION = new PugvBadgeType("PUGV_BADGE_TYPE_PRODUCTION", 1, 1);
    public static final PugvBadgeType PUGV_BADGE_TYPE_EXCLUSIVE = new PugvBadgeType("PUGV_BADGE_TYPE_EXCLUSIVE", 2, 2);
    public static final PugvBadgeType PUGV_BADGE_TYPE_FIRST = new PugvBadgeType("PUGV_BADGE_TYPE_FIRST", 3, 3);
    public static final PugvBadgeType PUGV_BADGE_TYPE_SELECTED = new PugvBadgeType("PUGV_BADGE_TYPE_SELECTED", 4, 4);
    public static final PugvBadgeType PUGV_BADGE_TYPE_AI = new PugvBadgeType("PUGV_BADGE_TYPE_AI", 5, 5);

    private static final /* synthetic */ PugvBadgeType[] $values() {
        return new PugvBadgeType[]{PUGV_BADGE_TYPE_UNKNOWN, PUGV_BADGE_TYPE_PRODUCTION, PUGV_BADGE_TYPE_EXCLUSIVE, PUGV_BADGE_TYPE_FIRST, PUGV_BADGE_TYPE_SELECTED, PUGV_BADGE_TYPE_AI};
    }

    static {
        PugvBadgeType[] pugvBadgeTypeArr$values = $values();
        $VALUES = pugvBadgeTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(pugvBadgeTypeArr$values);
    }

    private PugvBadgeType(String str, int i7, int i8) {
    }

    @NotNull
    public static EnumEntries<PugvBadgeType> getEntries() {
        return $ENTRIES;
    }

    public static PugvBadgeType valueOf(String str) {
        return (PugvBadgeType) Enum.valueOf(PugvBadgeType.class, str);
    }

    public static PugvBadgeType[] values() {
        return (PugvBadgeType[]) $VALUES.clone();
    }
}
