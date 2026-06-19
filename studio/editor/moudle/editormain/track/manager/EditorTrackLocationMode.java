package com.bilibili.studio.editor.moudle.editormain.track.manager;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/track/manager/EditorTrackLocationMode.class */
public final class EditorTrackLocationMode {
    private static final EnumEntries $ENTRIES;
    private static final EditorTrackLocationMode[] $VALUES;
    public static final EditorTrackLocationMode LOCATION_TOP = new EditorTrackLocationMode("LOCATION_TOP", 0);
    public static final EditorTrackLocationMode LOCATION_MID_1_HIGH = new EditorTrackLocationMode("LOCATION_MID_1_HIGH", 1);
    public static final EditorTrackLocationMode LOCATION_MID_2_HIGH = new EditorTrackLocationMode("LOCATION_MID_2_HIGH", 2);
    public static final EditorTrackLocationMode LOCATION_MIDDLE = new EditorTrackLocationMode("LOCATION_MIDDLE", 3);
    public static final EditorTrackLocationMode LOCATION_BOTTOM = new EditorTrackLocationMode("LOCATION_BOTTOM", 4);
    public static final EditorTrackLocationMode LOCATION_BOTTOM_2 = new EditorTrackLocationMode("LOCATION_BOTTOM_2", 5);

    private static final /* synthetic */ EditorTrackLocationMode[] $values() {
        return new EditorTrackLocationMode[]{LOCATION_TOP, LOCATION_MID_1_HIGH, LOCATION_MID_2_HIGH, LOCATION_MIDDLE, LOCATION_BOTTOM, LOCATION_BOTTOM_2};
    }

    static {
        EditorTrackLocationMode[] editorTrackLocationModeArr$values = $values();
        $VALUES = editorTrackLocationModeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(editorTrackLocationModeArr$values);
    }

    private EditorTrackLocationMode(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<EditorTrackLocationMode> getEntries() {
        return $ENTRIES;
    }

    public static EditorTrackLocationMode valueOf(String str) {
        return (EditorTrackLocationMode) Enum.valueOf(EditorTrackLocationMode.class, str);
    }

    public static EditorTrackLocationMode[] values() {
        return (EditorTrackLocationMode[]) $VALUES.clone();
    }
}
