package com.bilibili.studio.videoeditor.editor.editdata;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/editor/editdata/EditConvertError.class */
public final class EditConvertError {
    private static final EnumEntries $ENTRIES;
    private static final EditConvertError[] $VALUES;
    public static final EditConvertError NO_ERROR = new EditConvertError("NO_ERROR", 0);
    public static final EditConvertError ERROR_4K = new EditConvertError("ERROR_4K", 1);
    public static final EditConvertError ERROR_DURATION_0 = new EditConvertError("ERROR_DURATION_0", 2);
    public static final EditConvertError ERROR_LIST_EMPTY = new EditConvertError("ERROR_LIST_EMPTY", 3);
    public static final EditConvertError ERROR_AV_FILE_NULL = new EditConvertError("ERROR_AV_FILE_NULL", 4);

    private static final /* synthetic */ EditConvertError[] $values() {
        return new EditConvertError[]{NO_ERROR, ERROR_4K, ERROR_DURATION_0, ERROR_LIST_EMPTY, ERROR_AV_FILE_NULL};
    }

    static {
        EditConvertError[] editConvertErrorArr$values = $values();
        $VALUES = editConvertErrorArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(editConvertErrorArr$values);
    }

    private EditConvertError(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<EditConvertError> getEntries() {
        return $ENTRIES;
    }

    public static EditConvertError valueOf(String str) {
        return (EditConvertError) Enum.valueOf(EditConvertError.class, str);
    }

    public static EditConvertError[] values() {
        return (EditConvertError[]) $VALUES.clone();
    }
}
