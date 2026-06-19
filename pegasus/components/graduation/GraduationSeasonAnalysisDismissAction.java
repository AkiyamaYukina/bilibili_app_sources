package com.bilibili.pegasus.components.graduation;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/graduation/GraduationSeasonAnalysisDismissAction.class */
public final class GraduationSeasonAnalysisDismissAction {
    private static final EnumEntries $ENTRIES;
    private static final GraduationSeasonAnalysisDismissAction[] $VALUES;
    public static final GraduationSeasonAnalysisDismissAction CLOSE = new GraduationSeasonAnalysisDismissAction("CLOSE", 0);
    public static final GraduationSeasonAnalysisDismissAction RESELECT = new GraduationSeasonAnalysisDismissAction("RESELECT", 1);
    public static final GraduationSeasonAnalysisDismissAction SHARE = new GraduationSeasonAnalysisDismissAction("SHARE", 2);

    private static final /* synthetic */ GraduationSeasonAnalysisDismissAction[] $values() {
        return new GraduationSeasonAnalysisDismissAction[]{CLOSE, RESELECT, SHARE};
    }

    static {
        GraduationSeasonAnalysisDismissAction[] graduationSeasonAnalysisDismissActionArr$values = $values();
        $VALUES = graduationSeasonAnalysisDismissActionArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(graduationSeasonAnalysisDismissActionArr$values);
    }

    private GraduationSeasonAnalysisDismissAction(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<GraduationSeasonAnalysisDismissAction> getEntries() {
        return $ENTRIES;
    }

    public static GraduationSeasonAnalysisDismissAction valueOf(String str) {
        return (GraduationSeasonAnalysisDismissAction) Enum.valueOf(GraduationSeasonAnalysisDismissAction.class, str);
    }

    public static GraduationSeasonAnalysisDismissAction[] values() {
        return (GraduationSeasonAnalysisDismissAction[]) $VALUES.clone();
    }
}
