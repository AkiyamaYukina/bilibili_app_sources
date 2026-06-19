package com.bilibili.studio.editor.moudle.intelligence.frame.task;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/frame/task/RunTaskType.class */
public final class RunTaskType {
    private static final EnumEntries $ENTRIES;
    private static final RunTaskType[] $VALUES;
    public static final RunTaskType DEFAULT = new RunTaskType("DEFAULT", 0);
    public static final RunTaskType NET = new RunTaskType("NET", 1);
    public static final RunTaskType COVER = new RunTaskType("COVER", 2);
    public static final RunTaskType SILENCE = new RunTaskType("SILENCE", 3);

    private static final /* synthetic */ RunTaskType[] $values() {
        return new RunTaskType[]{DEFAULT, NET, COVER, SILENCE};
    }

    static {
        RunTaskType[] runTaskTypeArr$values = $values();
        $VALUES = runTaskTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(runTaskTypeArr$values);
    }

    private RunTaskType(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<RunTaskType> getEntries() {
        return $ENTRIES;
    }

    public static RunTaskType valueOf(String str) {
        return (RunTaskType) Enum.valueOf(RunTaskType.class, str);
    }

    public static RunTaskType[] values() {
        return (RunTaskType[]) $VALUES.clone();
    }
}
