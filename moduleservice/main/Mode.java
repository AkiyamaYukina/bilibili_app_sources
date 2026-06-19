package com.bilibili.moduleservice.main;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/moduleservice/main/Mode.class */
public final class Mode {
    private static final EnumEntries $ENTRIES;
    private static final Mode[] $VALUES;
    public static final Mode SINGLE_IMG = new Mode("SINGLE_IMG", 0);
    public static final Mode MULTI_IMG = new Mode("MULTI_IMG", 1);
    public static final Mode VIDEO = new Mode("VIDEO", 2);

    private static final /* synthetic */ Mode[] $values() {
        return new Mode[]{SINGLE_IMG, MULTI_IMG, VIDEO};
    }

    static {
        Mode[] modeArr$values = $values();
        $VALUES = modeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(modeArr$values);
    }

    private Mode(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<Mode> getEntries() {
        return $ENTRIES;
    }

    public static Mode valueOf(String str) {
        return (Mode) Enum.valueOf(Mode.class, str);
    }

    public static Mode[] values() {
        return (Mode[]) $VALUES.clone();
    }
}
