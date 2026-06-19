package com.bilibili.lib.tribe.core.internal.bundle;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tribe/core/internal/bundle/BundleProcessor$UninstallReason.class */
public final class BundleProcessor$UninstallReason {
    private static final EnumEntries $ENTRIES;
    private static final BundleProcessor$UninstallReason[] $VALUES;
    public static final BundleProcessor$UninstallReason ILLEGAL = new BundleProcessor$UninstallReason("ILLEGAL", 0);
    public static final BundleProcessor$UninstallReason INCOMPATIBLE = new BundleProcessor$UninstallReason("INCOMPATIBLE", 1);
    public static final BundleProcessor$UninstallReason FORCE_HOST = new BundleProcessor$UninstallReason("FORCE_HOST", 2);
    public static final BundleProcessor$UninstallReason OVERRIDE = new BundleProcessor$UninstallReason("OVERRIDE", 3);
    public static final BundleProcessor$UninstallReason FOUND_NEW = new BundleProcessor$UninstallReason("FOUND_NEW", 4);
    public static final BundleProcessor$UninstallReason AUTO_CLEAR = new BundleProcessor$UninstallReason("AUTO_CLEAR", 5);

    private static final /* synthetic */ BundleProcessor$UninstallReason[] $values() {
        return new BundleProcessor$UninstallReason[]{ILLEGAL, INCOMPATIBLE, FORCE_HOST, OVERRIDE, FOUND_NEW, AUTO_CLEAR};
    }

    static {
        BundleProcessor$UninstallReason[] bundleProcessor$UninstallReasonArr$values = $values();
        $VALUES = bundleProcessor$UninstallReasonArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(bundleProcessor$UninstallReasonArr$values);
    }

    private BundleProcessor$UninstallReason(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<BundleProcessor$UninstallReason> getEntries() {
        return $ENTRIES;
    }

    public static BundleProcessor$UninstallReason valueOf(String str) {
        return (BundleProcessor$UninstallReason) Enum.valueOf(BundleProcessor$UninstallReason.class, str);
    }

    public static BundleProcessor$UninstallReason[] values() {
        return (BundleProcessor$UninstallReason[]) $VALUES.clone();
    }
}
