package com.bilibili.lib.tribe.core.internal.bundle;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tribe/core/internal/bundle/BundleProcessor$ActivateStage.class */
public final class BundleProcessor$ActivateStage {
    private static final EnumEntries $ENTRIES;
    private static final BundleProcessor$ActivateStage[] $VALUES;
    public static final BundleProcessor$ActivateStage BOOTSTRAP = new BundleProcessor$ActivateStage("BOOTSTRAP", 0);
    public static final BundleProcessor$ActivateStage ON_INSTALL = new BundleProcessor$ActivateStage("ON_INSTALL", 1);
    public static final BundleProcessor$ActivateStage WARM_UP = new BundleProcessor$ActivateStage("WARM_UP", 2);

    private static final /* synthetic */ BundleProcessor$ActivateStage[] $values() {
        return new BundleProcessor$ActivateStage[]{BOOTSTRAP, ON_INSTALL, WARM_UP};
    }

    static {
        BundleProcessor$ActivateStage[] bundleProcessor$ActivateStageArr$values = $values();
        $VALUES = bundleProcessor$ActivateStageArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(bundleProcessor$ActivateStageArr$values);
    }

    private BundleProcessor$ActivateStage(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<BundleProcessor$ActivateStage> getEntries() {
        return $ENTRIES;
    }

    public static BundleProcessor$ActivateStage valueOf(String str) {
        return (BundleProcessor$ActivateStage) Enum.valueOf(BundleProcessor$ActivateStage.class, str);
    }

    public static BundleProcessor$ActivateStage[] values() {
        return (BundleProcessor$ActivateStage[]) $VALUES.clone();
    }
}
