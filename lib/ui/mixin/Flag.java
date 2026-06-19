package com.bilibili.lib.ui.mixin;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/mixin/Flag.class */
public final class Flag {
    private static final EnumEntries $ENTRIES;
    private static final Flag[] $VALUES;
    public static final Flag FLAG_PARENT = new Flag("FLAG_PARENT", 0);
    public static final Flag FLAG_PAGER = new Flag("FLAG_PAGER", 1);
    public static final Flag FLAG_LIFECYCLE = new Flag("FLAG_LIFECYCLE", 2);
    public static final Flag FLAG_HIDDEN = new Flag("FLAG_HIDDEN", 3);

    private static final /* synthetic */ Flag[] $values() {
        return new Flag[]{FLAG_PARENT, FLAG_PAGER, FLAG_LIFECYCLE, FLAG_HIDDEN};
    }

    static {
        Flag[] flagArr$values = $values();
        $VALUES = flagArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(flagArr$values);
    }

    private Flag(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<Flag> getEntries() {
        return $ENTRIES;
    }

    public static Flag valueOf(String str) {
        return (Flag) Enum.valueOf(Flag.class, str);
    }

    public static Flag[] values() {
        return (Flag[]) $VALUES.clone();
    }
}
