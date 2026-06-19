package com.bilibili.lib.projection.base;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/base/ConnectDeviceType.class */
public final class ConnectDeviceType {
    private static final EnumEntries $ENTRIES;
    private static final ConnectDeviceType[] $VALUES;
    private final int type;
    public static final ConnectDeviceType Unknown = new ConnectDeviceType("Unknown", 0, 0);
    public static final ConnectDeviceType OTTBlink = new ConnectDeviceType("OTTBlink", 1, 1);
    public static final ConnectDeviceType Cloud = new ConnectDeviceType("Cloud", 2, 2);
    public static final ConnectDeviceType DLNA = new ConnectDeviceType("DLNA", 3, 3);

    private static final /* synthetic */ ConnectDeviceType[] $values() {
        return new ConnectDeviceType[]{Unknown, OTTBlink, Cloud, DLNA};
    }

    static {
        ConnectDeviceType[] connectDeviceTypeArr$values = $values();
        $VALUES = connectDeviceTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(connectDeviceTypeArr$values);
    }

    private ConnectDeviceType(String str, int i7, int i8) {
        this.type = i8;
    }

    @NotNull
    public static EnumEntries<ConnectDeviceType> getEntries() {
        return $ENTRIES;
    }

    public static ConnectDeviceType valueOf(String str) {
        return (ConnectDeviceType) Enum.valueOf(ConnectDeviceType.class, str);
    }

    public static ConnectDeviceType[] values() {
        return (ConnectDeviceType[]) $VALUES.clone();
    }

    public final int getType() {
        return this.type;
    }
}
