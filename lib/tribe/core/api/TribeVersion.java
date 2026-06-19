package com.bilibili.lib.tribe.core.api;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tribe/core/api/TribeVersion.class */
public final class TribeVersion {
    private static final EnumEntries $ENTRIES;
    private static final TribeVersion[] $VALUES;
    public static final TribeVersion NONE = new TribeVersion("NONE", 0, -1);

    /* JADX INFO: renamed from: V2, reason: collision with root package name */
    public static final TribeVersion f64618V2 = new TribeVersion("V2", 1, 2);

    /* JADX INFO: renamed from: V3, reason: collision with root package name */
    public static final TribeVersion f64619V3 = new TribeVersion("V3", 2, 3);
    private final int versionCode;

    private static final /* synthetic */ TribeVersion[] $values() {
        return new TribeVersion[]{NONE, f64618V2, f64619V3};
    }

    static {
        TribeVersion[] tribeVersionArr$values = $values();
        $VALUES = tribeVersionArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(tribeVersionArr$values);
    }

    private TribeVersion(String str, int i7, int i8) {
        this.versionCode = i8;
    }

    @NotNull
    public static EnumEntries<TribeVersion> getEntries() {
        return $ENTRIES;
    }

    public static TribeVersion valueOf(String str) {
        return (TribeVersion) Enum.valueOf(TribeVersion.class, str);
    }

    public static TribeVersion[] values() {
        return (TribeVersion[]) $VALUES.clone();
    }

    public final int getVersionCode() {
        return this.versionCode;
    }
}
