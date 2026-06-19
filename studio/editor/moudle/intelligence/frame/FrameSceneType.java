package com.bilibili.studio.editor.moudle.intelligence.frame;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/frame/FrameSceneType.class */
public final class FrameSceneType {
    private static final EnumEntries $ENTRIES;
    private static final FrameSceneType[] $VALUES;

    @NotNull
    private final String value;
    public static final FrameSceneType DEFAULT = new FrameSceneType("DEFAULT", 0, "default");
    public static final FrameSceneType INTELLIGENCE = new FrameSceneType("INTELLIGENCE", 1, "intelligence");
    public static final FrameSceneType SILENCE = new FrameSceneType("SILENCE", 2, "silence");
    public static final FrameSceneType FAST_DEFAULT = new FrameSceneType("FAST_DEFAULT", 3, "fast_default");
    public static final FrameSceneType FAST_PUBLISH = new FrameSceneType("FAST_PUBLISH", 4, "fast_publish");
    public static final FrameSceneType FAST_ALBUM = new FrameSceneType("FAST_ALBUM", 5, "fast_album_before");
    public static final FrameSceneType ALBUM_RECOMMEND = new FrameSceneType("ALBUM_RECOMMEND", 6, "album_recommend");
    public static final FrameSceneType EDIT_RECOMMEND = new FrameSceneType("EDIT_RECOMMEND", 7, "album_recommend");

    private static final /* synthetic */ FrameSceneType[] $values() {
        return new FrameSceneType[]{DEFAULT, INTELLIGENCE, SILENCE, FAST_DEFAULT, FAST_PUBLISH, FAST_ALBUM, ALBUM_RECOMMEND, EDIT_RECOMMEND};
    }

    static {
        FrameSceneType[] frameSceneTypeArr$values = $values();
        $VALUES = frameSceneTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(frameSceneTypeArr$values);
    }

    private FrameSceneType(String str, int i7, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<FrameSceneType> getEntries() {
        return $ENTRIES;
    }

    public static FrameSceneType valueOf(String str) {
        return (FrameSceneType) Enum.valueOf(FrameSceneType.class, str);
    }

    public static FrameSceneType[] values() {
        return (FrameSceneType[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
