package com.bilibili.studio.videoeditor.mediav3.data;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/mediav3/data/ContentMode.class */
public final class ContentMode {
    private static final EnumEntries $ENTRIES;
    private static final ContentMode[] $VALUES;
    public static final ContentMode ASPECT_FILL = new ContentMode("ASPECT_FILL", 0);
    public static final ContentMode ASPECT_FIT = new ContentMode("ASPECT_FIT", 1);
    public static final ContentMode ASPECT_FIT_XY = new ContentMode("ASPECT_FIT_XY", 2);
    public static final ContentMode ASPECT_AUTO = new ContentMode("ASPECT_AUTO", 3);

    private static final /* synthetic */ ContentMode[] $values() {
        return new ContentMode[]{ASPECT_FILL, ASPECT_FIT, ASPECT_FIT_XY, ASPECT_AUTO};
    }

    static {
        ContentMode[] contentModeArr$values = $values();
        $VALUES = contentModeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(contentModeArr$values);
    }

    private ContentMode(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<ContentMode> getEntries() {
        return $ENTRIES;
    }

    public static ContentMode valueOf(String str) {
        return (ContentMode) Enum.valueOf(ContentMode.class, str);
    }

    public static ContentMode[] values() {
        return (ContentMode[]) $VALUES.clone();
    }
}
