package com.bilibili.pegasus.threepoint;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/threepoint/ThreePointPanelType.class */
public final class ThreePointPanelType {
    private static final EnumEntries $ENTRIES;
    private static final ThreePointPanelType[] $VALUES;

    @NotNull
    private final String type;

    /* JADX INFO: renamed from: V2, reason: collision with root package name */
    public static final ThreePointPanelType f78842V2 = new ThreePointPanelType("V2", 0, "0");
    public static final ThreePointPanelType SHARE = new ThreePointPanelType("SHARE", 1, "1");

    /* JADX INFO: renamed from: V5, reason: collision with root package name */
    public static final ThreePointPanelType f78843V5 = new ThreePointPanelType("V5", 2, "2");

    private static final /* synthetic */ ThreePointPanelType[] $values() {
        return new ThreePointPanelType[]{f78842V2, SHARE, f78843V5};
    }

    static {
        ThreePointPanelType[] threePointPanelTypeArr$values = $values();
        $VALUES = threePointPanelTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(threePointPanelTypeArr$values);
    }

    private ThreePointPanelType(String str, int i7, String str2) {
        this.type = str2;
    }

    @NotNull
    public static EnumEntries<ThreePointPanelType> getEntries() {
        return $ENTRIES;
    }

    public static ThreePointPanelType valueOf(String str) {
        return (ThreePointPanelType) Enum.valueOf(ThreePointPanelType.class, str);
    }

    public static ThreePointPanelType[] values() {
        return (ThreePointPanelType[]) $VALUES.clone();
    }

    @NotNull
    public final String getType() {
        return this.type;
    }
}
