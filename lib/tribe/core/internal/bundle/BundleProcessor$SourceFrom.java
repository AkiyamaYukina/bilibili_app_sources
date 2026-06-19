package com.bilibili.lib.tribe.core.internal.bundle;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tribe/core/internal/bundle/BundleProcessor$SourceFrom.class */
public final class BundleProcessor$SourceFrom {
    private static final EnumEntries $ENTRIES;
    private static final BundleProcessor$SourceFrom[] $VALUES;
    public static final BundleProcessor$SourceFrom STASH_DIR = new BundleProcessor$SourceFrom("STASH_DIR", 0);
    public static final BundleProcessor$SourceFrom RUNTIME_API = new BundleProcessor$SourceFrom("RUNTIME_API", 1);

    private static final /* synthetic */ BundleProcessor$SourceFrom[] $values() {
        return new BundleProcessor$SourceFrom[]{STASH_DIR, RUNTIME_API};
    }

    static {
        BundleProcessor$SourceFrom[] bundleProcessor$SourceFromArr$values = $values();
        $VALUES = bundleProcessor$SourceFromArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(bundleProcessor$SourceFromArr$values);
    }

    private BundleProcessor$SourceFrom(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<BundleProcessor$SourceFrom> getEntries() {
        return $ENTRIES;
    }

    public static BundleProcessor$SourceFrom valueOf(String str) {
        return (BundleProcessor$SourceFrom) Enum.valueOf(BundleProcessor$SourceFrom.class, str);
    }

    public static BundleProcessor$SourceFrom[] values() {
        return (BundleProcessor$SourceFrom[]) $VALUES.clone();
    }
}
