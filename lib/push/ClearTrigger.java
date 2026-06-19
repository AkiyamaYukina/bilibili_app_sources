package com.bilibili.lib.push;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/ClearTrigger.class */
public final class ClearTrigger {
    private static final EnumEntries $ENTRIES;
    private static final ClearTrigger[] $VALUES;
    public static final ClearTrigger INIT = new ClearTrigger("INIT", 0);
    public static final ClearTrigger FOREGROUND = new ClearTrigger("FOREGROUND", 1);
    public static final ClearTrigger CLICK = new ClearTrigger("CLICK", 2);

    private static final /* synthetic */ ClearTrigger[] $values() {
        return new ClearTrigger[]{INIT, FOREGROUND, CLICK};
    }

    static {
        ClearTrigger[] clearTriggerArr$values = $values();
        $VALUES = clearTriggerArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(clearTriggerArr$values);
    }

    private ClearTrigger(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<ClearTrigger> getEntries() {
        return $ENTRIES;
    }

    public static ClearTrigger valueOf(String str) {
        return (ClearTrigger) Enum.valueOf(ClearTrigger.class, str);
    }

    public static ClearTrigger[] values() {
        return (ClearTrigger[]) $VALUES.clone();
    }
}
