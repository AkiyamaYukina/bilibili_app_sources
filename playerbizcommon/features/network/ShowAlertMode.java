package com.bilibili.playerbizcommon.features.network;

import com.bilibili.live.streaming.source.TextSource;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/network/ShowAlertMode.class */
public final class ShowAlertMode {
    private static final EnumEntries $ENTRIES;
    private static final ShowAlertMode[] $VALUES;
    public static final ShowAlertMode AppOnce = new ShowAlertMode("AppOnce", 0);
    public static final ShowAlertMode PlayOnce = new ShowAlertMode("PlayOnce", 1);
    public static final ShowAlertMode EveryTime = new ShowAlertMode("EveryTime", 2);
    public static final ShowAlertMode None = new ShowAlertMode(TextSource.STR_SCROLL_NONE, 3);

    private static final /* synthetic */ ShowAlertMode[] $values() {
        return new ShowAlertMode[]{AppOnce, PlayOnce, EveryTime, None};
    }

    static {
        ShowAlertMode[] showAlertModeArr$values = $values();
        $VALUES = showAlertModeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(showAlertModeArr$values);
    }

    private ShowAlertMode(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<ShowAlertMode> getEntries() {
        return $ENTRIES;
    }

    public static ShowAlertMode valueOf(String str) {
        return (ShowAlertMode) Enum.valueOf(ShowAlertMode.class, str);
    }

    public static ShowAlertMode[] values() {
        return (ShowAlertMode[]) $VALUES.clone();
    }
}
