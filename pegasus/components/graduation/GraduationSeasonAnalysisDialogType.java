package com.bilibili.pegasus.components.graduation;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/graduation/GraduationSeasonAnalysisDialogType.class */
public final class GraduationSeasonAnalysisDialogType {
    private static final EnumEntries $ENTRIES;
    private static final GraduationSeasonAnalysisDialogType[] $VALUES;
    public static final GraduationSeasonAnalysisDialogType ANALYSIS = new GraduationSeasonAnalysisDialogType("ANALYSIS", 0);
    public static final GraduationSeasonAnalysisDialogType THIS_YEAR = new GraduationSeasonAnalysisDialogType("THIS_YEAR", 1);
    public static final GraduationSeasonAnalysisDialogType YEAR_HOT = new GraduationSeasonAnalysisDialogType("YEAR_HOT", 2);
    public static final GraduationSeasonAnalysisDialogType DEFAULT = new GraduationSeasonAnalysisDialogType("DEFAULT", 3);

    private static final /* synthetic */ GraduationSeasonAnalysisDialogType[] $values() {
        return new GraduationSeasonAnalysisDialogType[]{ANALYSIS, THIS_YEAR, YEAR_HOT, DEFAULT};
    }

    static {
        GraduationSeasonAnalysisDialogType[] graduationSeasonAnalysisDialogTypeArr$values = $values();
        $VALUES = graduationSeasonAnalysisDialogTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(graduationSeasonAnalysisDialogTypeArr$values);
    }

    private GraduationSeasonAnalysisDialogType(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<GraduationSeasonAnalysisDialogType> getEntries() {
        return $ENTRIES;
    }

    public static GraduationSeasonAnalysisDialogType valueOf(String str) {
        return (GraduationSeasonAnalysisDialogType) Enum.valueOf(GraduationSeasonAnalysisDialogType.class, str);
    }

    public static GraduationSeasonAnalysisDialogType[] values() {
        return (GraduationSeasonAnalysisDialogType[]) $VALUES.clone();
    }
}
