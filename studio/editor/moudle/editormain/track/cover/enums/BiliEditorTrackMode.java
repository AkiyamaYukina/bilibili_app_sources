package com.bilibili.studio.editor.moudle.editormain.track.cover.enums;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/track/cover/enums/BiliEditorTrackMode.class */
public final class BiliEditorTrackMode {
    private static final EnumEntries $ENTRIES;
    private static final BiliEditorTrackMode[] $VALUES;
    private final int value;
    public static final BiliEditorTrackMode TRACK_MODE_EDIT = new BiliEditorTrackMode("TRACK_MODE_EDIT", 0, 1);
    public static final BiliEditorTrackMode TRACK_MODE_EDIT_WEAK = new BiliEditorTrackMode("TRACK_MODE_EDIT_WEAK", 1, 2);
    public static final BiliEditorTrackMode TRACK_MODE_TRANSITION_EDIT = new BiliEditorTrackMode("TRACK_MODE_TRANSITION_EDIT", 2, 3);
    public static final BiliEditorTrackMode TRACK_MODE_ONLY_VIDEO = new BiliEditorTrackMode("TRACK_MODE_ONLY_VIDEO", 3, 4);
    public static final BiliEditorTrackMode TRACK_MODE_EASY_EDIT = new BiliEditorTrackMode("TRACK_MODE_EASY_EDIT", 4, 5);
    public static final BiliEditorTrackMode TRACK_MODE_FOLD_EDIT = new BiliEditorTrackMode("TRACK_MODE_FOLD_EDIT", 5, 6);
    public static final BiliEditorTrackMode TRACK_MODE_EDIT_MODAL_WEAK = new BiliEditorTrackMode("TRACK_MODE_EDIT_MODAL_WEAK", 6, 7);
    public static final BiliEditorTrackMode TRACK_MODE_EDIT_DRAG_SORT = new BiliEditorTrackMode("TRACK_MODE_EDIT_DRAG_SORT", 7, 8);
    public static final BiliEditorTrackMode TRACK_MODE_SECTION_NULL = new BiliEditorTrackMode("TRACK_MODE_SECTION_NULL", 8, 9);
    public static final BiliEditorTrackMode TRACK_MODE_SECTION = new BiliEditorTrackMode("TRACK_MODE_SECTION", 9, 10);

    private static final /* synthetic */ BiliEditorTrackMode[] $values() {
        return new BiliEditorTrackMode[]{TRACK_MODE_EDIT, TRACK_MODE_EDIT_WEAK, TRACK_MODE_TRANSITION_EDIT, TRACK_MODE_ONLY_VIDEO, TRACK_MODE_EASY_EDIT, TRACK_MODE_FOLD_EDIT, TRACK_MODE_EDIT_MODAL_WEAK, TRACK_MODE_EDIT_DRAG_SORT, TRACK_MODE_SECTION_NULL, TRACK_MODE_SECTION};
    }

    static {
        BiliEditorTrackMode[] biliEditorTrackModeArr$values = $values();
        $VALUES = biliEditorTrackModeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(biliEditorTrackModeArr$values);
    }

    private BiliEditorTrackMode(String str, int i7, int i8) {
        this.value = i8;
    }

    @NotNull
    public static EnumEntries<BiliEditorTrackMode> getEntries() {
        return $ENTRIES;
    }

    public static BiliEditorTrackMode valueOf(String str) {
        return (BiliEditorTrackMode) Enum.valueOf(BiliEditorTrackMode.class, str);
    }

    public static BiliEditorTrackMode[] values() {
        return (BiliEditorTrackMode[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
