package com.bilibili.studio.editor.moudle.editormain.track.beans;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/track/beans/MaterialState.class */
public final class MaterialState {
    private static final EnumEntries $ENTRIES;
    private static final MaterialState[] $VALUES;
    public static final MaterialState FIXED = new MaterialState("FIXED", 0);
    public static final MaterialState LONG_PRESS = new MaterialState("LONG_PRESS", 1);
    public static final MaterialState TRIM_HANDLE = new MaterialState("TRIM_HANDLE", 2);

    private static final /* synthetic */ MaterialState[] $values() {
        return new MaterialState[]{FIXED, LONG_PRESS, TRIM_HANDLE};
    }

    static {
        MaterialState[] materialStateArr$values = $values();
        $VALUES = materialStateArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(materialStateArr$values);
    }

    private MaterialState(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<MaterialState> getEntries() {
        return $ENTRIES;
    }

    public static MaterialState valueOf(String str) {
        return (MaterialState) Enum.valueOf(MaterialState.class, str);
    }

    public static MaterialState[] values() {
        return (MaterialState[]) $VALUES.clone();
    }
}
