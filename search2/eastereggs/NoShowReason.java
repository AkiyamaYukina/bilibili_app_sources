package com.bilibili.search2.eastereggs;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/eastereggs/NoShowReason.class */
public final class NoShowReason {
    private static final EnumEntries $ENTRIES;
    private static final NoShowReason[] $VALUES;
    private final int type;
    public static final NoShowReason SHOW_COUNT_END = new NoShowReason("SHOW_COUNT_END", 0, 1);
    public static final NoShowReason CLOSE_COUNT_END = new NoShowReason("CLOSE_COUNT_END", 1, 2);
    public static final NoShowReason NO_FILE = new NoShowReason("NO_FILE", 2, 3);

    private static final /* synthetic */ NoShowReason[] $values() {
        return new NoShowReason[]{SHOW_COUNT_END, CLOSE_COUNT_END, NO_FILE};
    }

    static {
        NoShowReason[] noShowReasonArr$values = $values();
        $VALUES = noShowReasonArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(noShowReasonArr$values);
    }

    private NoShowReason(String str, int i7, int i8) {
        this.type = i8;
    }

    @NotNull
    public static EnumEntries<NoShowReason> getEntries() {
        return $ENTRIES;
    }

    public static NoShowReason valueOf(String str) {
        return (NoShowReason) Enum.valueOf(NoShowReason.class, str);
    }

    public static NoShowReason[] values() {
        return (NoShowReason[]) $VALUES.clone();
    }

    public final int getType() {
        return this.type;
    }
}
