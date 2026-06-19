package com.bilibili.lib.projection.internal.utils;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/utils/PanelState.class */
public final class PanelState {
    private static final EnumEntries $ENTRIES;
    private static final PanelState[] $VALUES;
    public static final PanelState NORMAL = new PanelState("NORMAL", 0);
    public static final PanelState LOADING = new PanelState("LOADING", 1);
    public static final PanelState DISCONNECT = new PanelState("DISCONNECT", 2);

    private static final /* synthetic */ PanelState[] $values() {
        return new PanelState[]{NORMAL, LOADING, DISCONNECT};
    }

    static {
        PanelState[] panelStateArr$values = $values();
        $VALUES = panelStateArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(panelStateArr$values);
    }

    private PanelState(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<PanelState> getEntries() {
        return $ENTRIES;
    }

    public static PanelState valueOf(String str) {
        return (PanelState) Enum.valueOf(PanelState.class, str);
    }

    public static PanelState[] values() {
        return (PanelState[]) $VALUES.clone();
    }
}
