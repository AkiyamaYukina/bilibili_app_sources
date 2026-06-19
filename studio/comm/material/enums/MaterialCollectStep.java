package com.bilibili.studio.comm.material.enums;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/comm/material/enums/MaterialCollectStep.class */
public final class MaterialCollectStep {
    private static final EnumEntries $ENTRIES;
    private static final MaterialCollectStep[] $VALUES;

    @NotNull
    private final String value;
    public static final MaterialCollectStep STEP_PRE_CHECK = new MaterialCollectStep("STEP_PRE_CHECK", 0, "pre_check");
    public static final MaterialCollectStep STEP_START_COLLECT = new MaterialCollectStep("STEP_START_COLLECT", 1, "start_collect");
    public static final MaterialCollectStep STEP_END_COLLECT = new MaterialCollectStep("STEP_END_COLLECT", 2, "after_collect");

    private static final /* synthetic */ MaterialCollectStep[] $values() {
        return new MaterialCollectStep[]{STEP_PRE_CHECK, STEP_START_COLLECT, STEP_END_COLLECT};
    }

    static {
        MaterialCollectStep[] materialCollectStepArr$values = $values();
        $VALUES = materialCollectStepArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(materialCollectStepArr$values);
    }

    private MaterialCollectStep(String str, int i7, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<MaterialCollectStep> getEntries() {
        return $ENTRIES;
    }

    public static MaterialCollectStep valueOf(String str) {
        return (MaterialCollectStep) Enum.valueOf(MaterialCollectStep.class, str);
    }

    public static MaterialCollectStep[] values() {
        return (MaterialCollectStep[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
