package com.bilibili.pegasus.holders.bannerv8;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/bannerv8/BannerPermission.class */
public final class BannerPermission {
    private static final EnumEntries $ENTRIES;
    private static final BannerPermission[] $VALUES;
    public static final BannerPermission LOOP = new BannerPermission("LOOP", 0);
    public static final BannerPermission INDICATOR = new BannerPermission("INDICATOR", 1);

    private static final /* synthetic */ BannerPermission[] $values() {
        return new BannerPermission[]{LOOP, INDICATOR};
    }

    static {
        BannerPermission[] bannerPermissionArr$values = $values();
        $VALUES = bannerPermissionArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(bannerPermissionArr$values);
    }

    private BannerPermission(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<BannerPermission> getEntries() {
        return $ENTRIES;
    }

    public static BannerPermission valueOf(String str) {
        return (BannerPermission) Enum.valueOf(BannerPermission.class, str);
    }

    public static BannerPermission[] values() {
        return (BannerPermission[]) $VALUES.clone();
    }
}
