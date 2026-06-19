package com.bilibili.studio.editor.moudle.editormain.uistate.dialog;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/uistate/dialog/NotSupportErrorType.class */
public final class NotSupportErrorType {
    private static final EnumEntries $ENTRIES;
    private static final NotSupportErrorType[] $VALUES;
    public static final NotSupportErrorType NO_ERROR = new NotSupportErrorType("NO_ERROR", 0);
    public static final NotSupportErrorType SOME_VIDEO_ERROR = new NotSupportErrorType("SOME_VIDEO_ERROR", 1);
    public static final NotSupportErrorType SINGLE_ERROR = new NotSupportErrorType("SINGLE_ERROR", 2);

    private static final /* synthetic */ NotSupportErrorType[] $values() {
        return new NotSupportErrorType[]{NO_ERROR, SOME_VIDEO_ERROR, SINGLE_ERROR};
    }

    static {
        NotSupportErrorType[] notSupportErrorTypeArr$values = $values();
        $VALUES = notSupportErrorTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(notSupportErrorTypeArr$values);
    }

    private NotSupportErrorType(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<NotSupportErrorType> getEntries() {
        return $ENTRIES;
    }

    public static NotSupportErrorType valueOf(String str) {
        return (NotSupportErrorType) Enum.valueOf(NotSupportErrorType.class, str);
    }

    public static NotSupportErrorType[] values() {
        return (NotSupportErrorType[]) $VALUES.clone();
    }
}
