package com.bilibili.pegasus.components.interest.ui.udf.model;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/udf/model/ReportableType.class */
public final class ReportableType {
    private static final EnumEntries $ENTRIES;
    private static final ReportableType[] $VALUES;
    public static final ReportableType P0Gender = new ReportableType("P0Gender", 0);
    public static final ReportableType P0Age = new ReportableType("P0Age", 1);
    public static final ReportableType P1Item = new ReportableType("P1Item", 2);
    public static final ReportableType P1Mix = new ReportableType("P1Mix", 3);
    public static final ReportableType P1MixSub = new ReportableType("P1MixSub", 4);
    public static final ReportableType P2Sub = new ReportableType("P2Sub", 5);

    private static final /* synthetic */ ReportableType[] $values() {
        return new ReportableType[]{P0Gender, P0Age, P1Item, P1Mix, P1MixSub, P2Sub};
    }

    static {
        ReportableType[] reportableTypeArr$values = $values();
        $VALUES = reportableTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(reportableTypeArr$values);
    }

    private ReportableType(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<ReportableType> getEntries() {
        return $ENTRIES;
    }

    public static ReportableType valueOf(String str) {
        return (ReportableType) Enum.valueOf(ReportableType.class, str);
    }

    public static ReportableType[] values() {
        return (ReportableType[]) $VALUES.clone();
    }
}
