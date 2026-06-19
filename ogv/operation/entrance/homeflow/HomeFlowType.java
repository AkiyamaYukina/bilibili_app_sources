package com.bilibili.ogv.operation.entrance.homeflow;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/entrance/homeflow/HomeFlowType.class */
public final class HomeFlowType {
    private static final EnumEntries $ENTRIES;
    private static final HomeFlowType[] $VALUES;
    public static final HomeFlowType BANGUMI = new HomeFlowType("BANGUMI", 0, 1);
    public static final HomeFlowType CINEMA = new HomeFlowType("CINEMA", 1, 2);
    private final int type;

    private static final /* synthetic */ HomeFlowType[] $values() {
        return new HomeFlowType[]{BANGUMI, CINEMA};
    }

    static {
        HomeFlowType[] homeFlowTypeArr$values = $values();
        $VALUES = homeFlowTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(homeFlowTypeArr$values);
    }

    private HomeFlowType(String str, int i7, int i8) {
        this.type = i8;
    }

    @NotNull
    public static EnumEntries<HomeFlowType> getEntries() {
        return $ENTRIES;
    }

    public static HomeFlowType valueOf(String str) {
        return (HomeFlowType) Enum.valueOf(HomeFlowType.class, str);
    }

    public static HomeFlowType[] values() {
        return (HomeFlowType[]) $VALUES.clone();
    }

    public final int getType() {
        return this.type;
    }
}
