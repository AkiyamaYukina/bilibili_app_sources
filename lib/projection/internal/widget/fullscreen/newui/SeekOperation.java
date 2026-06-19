package com.bilibili.lib.projection.internal.widget.fullscreen.newui;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/fullscreen/newui/SeekOperation.class */
public final class SeekOperation {
    private static final EnumEntries $ENTRIES;
    private static final SeekOperation[] $VALUES;
    public static final SeekOperation FAST = new SeekOperation("FAST", 0);
    public static final SeekOperation BACK = new SeekOperation("BACK", 1);
    public static final SeekOperation UNKNOWN = new SeekOperation("UNKNOWN", 2);

    private static final /* synthetic */ SeekOperation[] $values() {
        return new SeekOperation[]{FAST, BACK, UNKNOWN};
    }

    static {
        SeekOperation[] seekOperationArr$values = $values();
        $VALUES = seekOperationArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(seekOperationArr$values);
    }

    private SeekOperation(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<SeekOperation> getEntries() {
        return $ENTRIES;
    }

    public static SeekOperation valueOf(String str) {
        return (SeekOperation) Enum.valueOf(SeekOperation.class, str);
    }

    public static SeekOperation[] values() {
        return (SeekOperation[]) $VALUES.clone();
    }
}
