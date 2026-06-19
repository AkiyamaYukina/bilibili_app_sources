package com.bilibili.lib.projection;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/ProjectionScreenType.class */
public final class ProjectionScreenType {
    private static final EnumEntries $ENTRIES;
    private static final ProjectionScreenType[] $VALUES;
    public static final ProjectionScreenType HALF_SCREEN = new ProjectionScreenType("HALF_SCREEN", 0);
    public static final ProjectionScreenType FULLSCREEN = new ProjectionScreenType("FULLSCREEN", 1);

    private static final /* synthetic */ ProjectionScreenType[] $values() {
        return new ProjectionScreenType[]{HALF_SCREEN, FULLSCREEN};
    }

    static {
        ProjectionScreenType[] projectionScreenTypeArr$values = $values();
        $VALUES = projectionScreenTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(projectionScreenTypeArr$values);
    }

    private ProjectionScreenType(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<ProjectionScreenType> getEntries() {
        return $ENTRIES;
    }

    public static ProjectionScreenType valueOf(String str) {
        return (ProjectionScreenType) Enum.valueOf(ProjectionScreenType.class, str);
    }

    public static ProjectionScreenType[] values() {
        return (ProjectionScreenType[]) $VALUES.clone();
    }
}
