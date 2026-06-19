package com.bilibili.studio.editor.moudle.home.presenter.airec.task;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/home/presenter/airec/task/BiliEditorTaskStatus.class */
public final class BiliEditorTaskStatus {
    private static final EnumEntries $ENTRIES;
    private static final BiliEditorTaskStatus[] $VALUES;
    public static final BiliEditorTaskStatus RUNNING = new BiliEditorTaskStatus("RUNNING", 0);
    public static final BiliEditorTaskStatus RELEASED = new BiliEditorTaskStatus("RELEASED", 1);
    public static final BiliEditorTaskStatus CANCELED = new BiliEditorTaskStatus("CANCELED", 2);
    public static final BiliEditorTaskStatus FINISHED = new BiliEditorTaskStatus("FINISHED", 3);

    private static final /* synthetic */ BiliEditorTaskStatus[] $values() {
        return new BiliEditorTaskStatus[]{RUNNING, RELEASED, CANCELED, FINISHED};
    }

    static {
        BiliEditorTaskStatus[] biliEditorTaskStatusArr$values = $values();
        $VALUES = biliEditorTaskStatusArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(biliEditorTaskStatusArr$values);
    }

    private BiliEditorTaskStatus(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<BiliEditorTaskStatus> getEntries() {
        return $ENTRIES;
    }

    public static BiliEditorTaskStatus valueOf(String str) {
        return (BiliEditorTaskStatus) Enum.valueOf(BiliEditorTaskStatus.class, str);
    }

    public static BiliEditorTaskStatus[] values() {
        return (BiliEditorTaskStatus[]) $VALUES.clone();
    }
}
