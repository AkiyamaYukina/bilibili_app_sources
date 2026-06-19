package com.bilibili.ship.theseus.united.page.danmaku;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/DanmakuInputMode.class */
public final class DanmakuInputMode {
    private static final EnumEntries $ENTRIES;
    private static final DanmakuInputMode[] $VALUES;
    public static final DanmakuInputMode FORBIDDEN = new DanmakuInputMode("FORBIDDEN", 0);
    public static final DanmakuInputMode EXPANDED = new DanmakuInputMode("EXPANDED", 1);
    public static final DanmakuInputMode COLLAPSED = new DanmakuInputMode("COLLAPSED", 2);

    private static final /* synthetic */ DanmakuInputMode[] $values() {
        return new DanmakuInputMode[]{FORBIDDEN, EXPANDED, COLLAPSED};
    }

    static {
        DanmakuInputMode[] danmakuInputModeArr$values = $values();
        $VALUES = danmakuInputModeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(danmakuInputModeArr$values);
    }

    private DanmakuInputMode(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<DanmakuInputMode> getEntries() {
        return $ENTRIES;
    }

    public static DanmakuInputMode valueOf(String str) {
        return (DanmakuInputMode) Enum.valueOf(DanmakuInputMode.class, str);
    }

    public static DanmakuInputMode[] values() {
        return (DanmakuInputMode[]) $VALUES.clone();
    }
}
