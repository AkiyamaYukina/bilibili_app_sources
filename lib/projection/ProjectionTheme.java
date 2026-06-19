package com.bilibili.lib.projection;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/ProjectionTheme.class */
public final class ProjectionTheme {
    private static final EnumEntries $ENTRIES;
    private static final ProjectionTheme[] $VALUES;
    public static final ProjectionTheme GREEN = new ProjectionTheme("GREEN", 0);
    public static final ProjectionTheme PINK = new ProjectionTheme("PINK", 1);

    private static final /* synthetic */ ProjectionTheme[] $values() {
        return new ProjectionTheme[]{GREEN, PINK};
    }

    static {
        ProjectionTheme[] projectionThemeArr$values = $values();
        $VALUES = projectionThemeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(projectionThemeArr$values);
    }

    private ProjectionTheme(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<ProjectionTheme> getEntries() {
        return $ENTRIES;
    }

    public static ProjectionTheme valueOf(String str) {
        return (ProjectionTheme) Enum.valueOf(ProjectionTheme.class, str);
    }

    public static ProjectionTheme[] values() {
        return (ProjectionTheme[]) $VALUES.clone();
    }
}
