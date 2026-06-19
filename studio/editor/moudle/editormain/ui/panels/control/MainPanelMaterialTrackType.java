package com.bilibili.studio.editor.moudle.editormain.ui.panels.control;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/panels/control/MainPanelMaterialTrackType.class */
public final class MainPanelMaterialTrackType {
    private static final EnumEntries $ENTRIES;
    private static final MainPanelMaterialTrackType[] $VALUES;
    public static final MainPanelMaterialTrackType TRACK_CAPTION_FOLD = new MainPanelMaterialTrackType("TRACK_CAPTION_FOLD", 0);
    public static final MainPanelMaterialTrackType TRACK_CAPTION_EDITABLE_FOLD = new MainPanelMaterialTrackType("TRACK_CAPTION_EDITABLE_FOLD", 1);
    public static final MainPanelMaterialTrackType TRACK_CAPTION_ADD = new MainPanelMaterialTrackType("TRACK_CAPTION_ADD", 2);
    public static final MainPanelMaterialTrackType TRACK_CAPTION_MULTI = new MainPanelMaterialTrackType("TRACK_CAPTION_MULTI", 3);
    public static final MainPanelMaterialTrackType TRACK_AUDIO_ADD = new MainPanelMaterialTrackType("TRACK_AUDIO_ADD", 4);
    public static final MainPanelMaterialTrackType TRACK_RECORD_FOLD = new MainPanelMaterialTrackType("TRACK_RECORD_FOLD", 5);
    public static final MainPanelMaterialTrackType TRACK_MUSIC_FOLD = new MainPanelMaterialTrackType("TRACK_MUSIC_FOLD", 6);
    public static final MainPanelMaterialTrackType TRACK_AUDIO_MULTI = new MainPanelMaterialTrackType("TRACK_AUDIO_MULTI", 7);
    public static final MainPanelMaterialTrackType TRACK_AUDIO_FOLD = new MainPanelMaterialTrackType("TRACK_AUDIO_FOLD", 8);

    private static final /* synthetic */ MainPanelMaterialTrackType[] $values() {
        return new MainPanelMaterialTrackType[]{TRACK_CAPTION_FOLD, TRACK_CAPTION_EDITABLE_FOLD, TRACK_CAPTION_ADD, TRACK_CAPTION_MULTI, TRACK_AUDIO_ADD, TRACK_RECORD_FOLD, TRACK_MUSIC_FOLD, TRACK_AUDIO_MULTI, TRACK_AUDIO_FOLD};
    }

    static {
        MainPanelMaterialTrackType[] mainPanelMaterialTrackTypeArr$values = $values();
        $VALUES = mainPanelMaterialTrackTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(mainPanelMaterialTrackTypeArr$values);
    }

    private MainPanelMaterialTrackType(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<MainPanelMaterialTrackType> getEntries() {
        return $ENTRIES;
    }

    public static MainPanelMaterialTrackType valueOf(String str) {
        return (MainPanelMaterialTrackType) Enum.valueOf(MainPanelMaterialTrackType.class, str);
    }

    public static MainPanelMaterialTrackType[] values() {
        return (MainPanelMaterialTrackType[]) $VALUES.clone();
    }
}
