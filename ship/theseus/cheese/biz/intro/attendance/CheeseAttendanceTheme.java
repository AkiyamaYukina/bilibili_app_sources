package com.bilibili.ship.theseus.cheese.biz.intro.attendance;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/attendance/CheeseAttendanceTheme.class */
public final class CheeseAttendanceTheme {
    private static final EnumEntries $ENTRIES;
    private static final CheeseAttendanceTheme[] $VALUES;

    @NotNull
    public static final a Companion;
    public static final CheeseAttendanceTheme DARK = new CheeseAttendanceTheme("DARK", 0, 1);
    public static final CheeseAttendanceTheme LIGHT = new CheeseAttendanceTheme("LIGHT", 1, 2);
    private final int value;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/attendance/CheeseAttendanceTheme$a.class */
    public static final class a {
    }

    private static final /* synthetic */ CheeseAttendanceTheme[] $values() {
        return new CheeseAttendanceTheme[]{DARK, LIGHT};
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.bilibili.ship.theseus.cheese.biz.intro.attendance.CheeseAttendanceTheme$a, java.lang.Object] */
    static {
        CheeseAttendanceTheme[] cheeseAttendanceThemeArr$values = $values();
        $VALUES = cheeseAttendanceThemeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(cheeseAttendanceThemeArr$values);
        Companion = new Object();
    }

    private CheeseAttendanceTheme(String str, int i7, int i8) {
        this.value = i8;
    }

    @NotNull
    public static EnumEntries<CheeseAttendanceTheme> getEntries() {
        return $ENTRIES;
    }

    public static CheeseAttendanceTheme valueOf(String str) {
        return (CheeseAttendanceTheme) Enum.valueOf(CheeseAttendanceTheme.class, str);
    }

    public static CheeseAttendanceTheme[] values() {
        return (CheeseAttendanceTheme[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
