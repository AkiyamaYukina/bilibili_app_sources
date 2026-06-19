package com.bilibili.ship.theseus.ogv.intro.activityentrance;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/activityentrance/ActivityEntranceType.class */
public final class ActivityEntranceType implements com.bilibili.bson.adapter.a<Integer> {
    private static final EnumEntries $ENTRIES;
    private static final ActivityEntranceType[] $VALUES;
    public static final ActivityEntranceType NORMAL_ACTIVITY = new ActivityEntranceType("NORMAL_ACTIVITY", 0, 0);
    public static final ActivityEntranceType VIP_CASHIER = new ActivityEntranceType("VIP_CASHIER", 1, 3);
    private final int value;

    private static final /* synthetic */ ActivityEntranceType[] $values() {
        return new ActivityEntranceType[]{NORMAL_ACTIVITY, VIP_CASHIER};
    }

    static {
        ActivityEntranceType[] activityEntranceTypeArr$values = $values();
        $VALUES = activityEntranceTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(activityEntranceTypeArr$values);
    }

    private ActivityEntranceType(String str, int i7, int i8) {
        this.value = i8;
    }

    @NotNull
    public static EnumEntries<ActivityEntranceType> getEntries() {
        return $ENTRIES;
    }

    public static ActivityEntranceType valueOf(String str) {
        return (ActivityEntranceType) Enum.valueOf(ActivityEntranceType.class, str);
    }

    public static ActivityEntranceType[] values() {
        return (ActivityEntranceType[]) $VALUES.clone();
    }

    @NotNull
    /* JADX INFO: renamed from: getValue, reason: merged with bridge method [inline-methods] */
    public Integer m8985getValue() {
        return Integer.valueOf(this.value);
    }
}
