package com.bilibili.ship.theseus.united.page.performance;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/performance/MediaItemType.class */
public final class MediaItemType {
    private static final EnumEntries $ENTRIES;
    private static final MediaItemType[] $VALUES;
    private final int value;
    public static final MediaItemType NORMAL = new MediaItemType("NORMAL", 0, 0);
    public static final MediaItemType SHARE = new MediaItemType("SHARE", 1, 1);
    public static final MediaItemType PRELOAD = new MediaItemType("PRELOAD", 2, 2);

    private static final /* synthetic */ MediaItemType[] $values() {
        return new MediaItemType[]{NORMAL, SHARE, PRELOAD};
    }

    static {
        MediaItemType[] mediaItemTypeArr$values = $values();
        $VALUES = mediaItemTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(mediaItemTypeArr$values);
    }

    private MediaItemType(String str, int i7, int i8) {
        this.value = i8;
    }

    @NotNull
    public static EnumEntries<MediaItemType> getEntries() {
        return $ENTRIES;
    }

    public static MediaItemType valueOf(String str) {
        return (MediaItemType) Enum.valueOf(MediaItemType.class, str);
    }

    public static MediaItemType[] values() {
        return (MediaItemType[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
