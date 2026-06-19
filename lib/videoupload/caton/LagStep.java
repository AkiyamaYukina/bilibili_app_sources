package com.bilibili.lib.videoupload.caton;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/videoupload/caton/LagStep.class */
public final class LagStep {
    private static final EnumEntries $ENTRIES;
    private static final LagStep[] $VALUES;

    @NotNull
    private final String value;
    public static final LagStep LAG_PRE_UPLOAD = new LagStep("LAG_PRE_UPLOAD", 0, "lag_pre");
    public static final LagStep LAG_INIT = new LagStep("LAG_INIT", 1, "lag_init");
    public static final LagStep LAG_UPLOAD_CHUNK = new LagStep("LAG_UPLOAD_CHUNK", 2, "lag_upload_chunk");
    public static final LagStep LAG_MERGE = new LagStep("LAG_MERGE", 3, "lag_merge");

    private static final /* synthetic */ LagStep[] $values() {
        return new LagStep[]{LAG_PRE_UPLOAD, LAG_INIT, LAG_UPLOAD_CHUNK, LAG_MERGE};
    }

    static {
        LagStep[] lagStepArr$values = $values();
        $VALUES = lagStepArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(lagStepArr$values);
    }

    private LagStep(String str, int i7, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<LagStep> getEntries() {
        return $ENTRIES;
    }

    public static LagStep valueOf(String str) {
        return (LagStep) Enum.valueOf(LagStep.class, str);
    }

    public static LagStep[] values() {
        return (LagStep[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
