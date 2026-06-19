package com.bilibili.studio.editor.moudle.editormain.track.material.multitrack.data;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/track/material/multitrack/data/PanelTrackMode.class */
public final class PanelTrackMode {
    private static final EnumEntries $ENTRIES;
    private static final PanelTrackMode[] $VALUES;
    public static final PanelTrackMode MODE_NORMAL = new PanelTrackMode("MODE_NORMAL", 0);
    public static final PanelTrackMode MODE_SHOW = new PanelTrackMode("MODE_SHOW", 1);

    private static final /* synthetic */ PanelTrackMode[] $values() {
        return new PanelTrackMode[]{MODE_NORMAL, MODE_SHOW};
    }

    static {
        PanelTrackMode[] panelTrackModeArr$values = $values();
        $VALUES = panelTrackModeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(panelTrackModeArr$values);
    }

    private PanelTrackMode(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<PanelTrackMode> getEntries() {
        return $ENTRIES;
    }

    public static PanelTrackMode valueOf(String str) {
        return (PanelTrackMode) Enum.valueOf(PanelTrackMode.class, str);
    }

    public static PanelTrackMode[] values() {
        return (PanelTrackMode[]) $VALUES.clone();
    }
}
