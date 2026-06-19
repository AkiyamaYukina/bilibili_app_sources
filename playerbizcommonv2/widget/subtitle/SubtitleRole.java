package com.bilibili.playerbizcommonv2.widget.subtitle;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/subtitle/SubtitleRole.class */
public final class SubtitleRole {
    private static final EnumEntries $ENTRIES;
    private static final SubtitleRole[] $VALUES;
    public static final SubtitleRole MAIN = new SubtitleRole("MAIN", 0);
    public static final SubtitleRole VICE = new SubtitleRole("VICE", 1);

    private static final /* synthetic */ SubtitleRole[] $values() {
        return new SubtitleRole[]{MAIN, VICE};
    }

    static {
        SubtitleRole[] subtitleRoleArr$values = $values();
        $VALUES = subtitleRoleArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(subtitleRoleArr$values);
    }

    private SubtitleRole(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<SubtitleRole> getEntries() {
        return $ENTRIES;
    }

    public static SubtitleRole valueOf(String str) {
        return (SubtitleRole) Enum.valueOf(SubtitleRole.class, str);
    }

    public static SubtitleRole[] values() {
        return (SubtitleRole[]) $VALUES.clone();
    }
}
