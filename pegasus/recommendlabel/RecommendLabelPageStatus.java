package com.bilibili.pegasus.recommendlabel;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/recommendlabel/RecommendLabelPageStatus.class */
public final class RecommendLabelPageStatus {
    private static final EnumEntries $ENTRIES;
    private static final RecommendLabelPageStatus[] $VALUES;
    public static final RecommendLabelPageStatus IDLE = new RecommendLabelPageStatus("IDLE", 0);
    public static final RecommendLabelPageStatus LoadedWithData = new RecommendLabelPageStatus("LoadedWithData", 1);
    public static final RecommendLabelPageStatus Empty = new RecommendLabelPageStatus("Empty", 2);
    public static final RecommendLabelPageStatus FAILED = new RecommendLabelPageStatus("FAILED", 3);

    private static final /* synthetic */ RecommendLabelPageStatus[] $values() {
        return new RecommendLabelPageStatus[]{IDLE, LoadedWithData, Empty, FAILED};
    }

    static {
        RecommendLabelPageStatus[] recommendLabelPageStatusArr$values = $values();
        $VALUES = recommendLabelPageStatusArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(recommendLabelPageStatusArr$values);
    }

    private RecommendLabelPageStatus(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<RecommendLabelPageStatus> getEntries() {
        return $ENTRIES;
    }

    public static RecommendLabelPageStatus valueOf(String str) {
        return (RecommendLabelPageStatus) Enum.valueOf(RecommendLabelPageStatus.class, str);
    }

    public static RecommendLabelPageStatus[] values() {
        return (RecommendLabelPageStatus[]) $VALUES.clone();
    }
}
