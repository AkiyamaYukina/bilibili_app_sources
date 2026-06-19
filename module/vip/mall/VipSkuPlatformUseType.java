package com.bilibili.module.vip.mall;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/mall/VipSkuPlatformUseType.class */
public final class VipSkuPlatformUseType {
    private static final EnumEntries $ENTRIES;
    private static final VipSkuPlatformUseType[] $VALUES;

    @NotNull
    private final String value;
    public static final VipSkuPlatformUseType VIP = new VipSkuPlatformUseType("VIP", 0, "vip");
    public static final VipSkuPlatformUseType SUPER_VIP = new VipSkuPlatformUseType("SUPER_VIP", 1, "tv");

    private static final /* synthetic */ VipSkuPlatformUseType[] $values() {
        return new VipSkuPlatformUseType[]{VIP, SUPER_VIP};
    }

    static {
        VipSkuPlatformUseType[] vipSkuPlatformUseTypeArr$values = $values();
        $VALUES = vipSkuPlatformUseTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(vipSkuPlatformUseTypeArr$values);
    }

    private VipSkuPlatformUseType(String str, int i7, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<VipSkuPlatformUseType> getEntries() {
        return $ENTRIES;
    }

    public static VipSkuPlatformUseType valueOf(String str) {
        return (VipSkuPlatformUseType) Enum.valueOf(VipSkuPlatformUseType.class, str);
    }

    public static VipSkuPlatformUseType[] values() {
        return (VipSkuPlatformUseType[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
