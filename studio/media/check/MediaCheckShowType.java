package com.bilibili.studio.media.check;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/media/check/MediaCheckShowType.class */
public final class MediaCheckShowType {
    private static final EnumEntries $ENTRIES;
    private static final MediaCheckShowType[] $VALUES;
    public static final MediaCheckShowType NONE = new MediaCheckShowType("NONE", 0);
    public static final MediaCheckShowType TOAST = new MediaCheckShowType("TOAST", 1);
    public static final MediaCheckShowType DIALOG = new MediaCheckShowType("DIALOG", 2);

    private static final /* synthetic */ MediaCheckShowType[] $values() {
        return new MediaCheckShowType[]{NONE, TOAST, DIALOG};
    }

    static {
        MediaCheckShowType[] mediaCheckShowTypeArr$values = $values();
        $VALUES = mediaCheckShowTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(mediaCheckShowTypeArr$values);
    }

    private MediaCheckShowType(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<MediaCheckShowType> getEntries() {
        return $ENTRIES;
    }

    public static MediaCheckShowType valueOf(String str) {
        return (MediaCheckShowType) Enum.valueOf(MediaCheckShowType.class, str);
    }

    public static MediaCheckShowType[] values() {
        return (MediaCheckShowType[]) $VALUES.clone();
    }
}
