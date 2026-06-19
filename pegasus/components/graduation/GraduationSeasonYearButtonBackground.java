package com.bilibili.pegasus.components.graduation;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/graduation/GraduationSeasonYearButtonBackground.class */
public final class GraduationSeasonYearButtonBackground {
    private static final EnumEntries $ENTRIES;
    private static final GraduationSeasonYearButtonBackground[] $VALUES;
    public static final GraduationSeasonYearButtonBackground UNSELECTED = new GraduationSeasonYearButtonBackground("UNSELECTED", 0);
    public static final GraduationSeasonYearButtonBackground SELECTED = new GraduationSeasonYearButtonBackground("SELECTED", 1);
    public static final GraduationSeasonYearButtonBackground NOT_GRADUATED = new GraduationSeasonYearButtonBackground("NOT_GRADUATED", 2);

    private static final /* synthetic */ GraduationSeasonYearButtonBackground[] $values() {
        return new GraduationSeasonYearButtonBackground[]{UNSELECTED, SELECTED, NOT_GRADUATED};
    }

    static {
        GraduationSeasonYearButtonBackground[] graduationSeasonYearButtonBackgroundArr$values = $values();
        $VALUES = graduationSeasonYearButtonBackgroundArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(graduationSeasonYearButtonBackgroundArr$values);
    }

    private GraduationSeasonYearButtonBackground(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<GraduationSeasonYearButtonBackground> getEntries() {
        return $ENTRIES;
    }

    public static GraduationSeasonYearButtonBackground valueOf(String str) {
        return (GraduationSeasonYearButtonBackground) Enum.valueOf(GraduationSeasonYearButtonBackground.class, str);
    }

    public static GraduationSeasonYearButtonBackground[] values() {
        return (GraduationSeasonYearButtonBackground[]) $VALUES.clone();
    }
}
