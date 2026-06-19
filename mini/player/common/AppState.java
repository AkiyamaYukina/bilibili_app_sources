package com.bilibili.mini.player.common;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mini/player/common/AppState.class */
public final class AppState {
    private static final EnumEntries $ENTRIES;
    private static final AppState[] $VALUES;
    public static final AppState Foreground = new AppState("Foreground", 0);
    public static final AppState Background = new AppState("Background", 1);

    private static final /* synthetic */ AppState[] $values() {
        return new AppState[]{Foreground, Background};
    }

    static {
        AppState[] appStateArr$values = $values();
        $VALUES = appStateArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(appStateArr$values);
    }

    private AppState(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<AppState> getEntries() {
        return $ENTRIES;
    }

    public static AppState valueOf(String str) {
        return (AppState) Enum.valueOf(AppState.class, str);
    }

    public static AppState[] values() {
        return (AppState[]) $VALUES.clone();
    }
}
