package com.bilibili.studio.editor.moudle.editormain.ui.fragments.record;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/record/RecordState.class */
public final class RecordState {
    private static final EnumEntries $ENTRIES;
    private static final RecordState[] $VALUES;
    public static final RecordState IDLE = new RecordState("IDLE", 0);
    public static final RecordState COUNT_DOWN = new RecordState("COUNT_DOWN", 1);
    public static final RecordState RECORDING = new RecordState("RECORDING", 2);

    private static final /* synthetic */ RecordState[] $values() {
        return new RecordState[]{IDLE, COUNT_DOWN, RECORDING};
    }

    static {
        RecordState[] recordStateArr$values = $values();
        $VALUES = recordStateArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(recordStateArr$values);
    }

    private RecordState(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<RecordState> getEntries() {
        return $ENTRIES;
    }

    public static RecordState valueOf(String str) {
        return (RecordState) Enum.valueOf(RecordState.class, str);
    }

    public static RecordState[] values() {
        return (RecordState[]) $VALUES.clone();
    }
}
