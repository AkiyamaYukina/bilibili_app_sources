package com.bilibili.sistersplayer.p2p;

import com.bilibili.upper.module.tempalte.bean.TagTemplate;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/MediaType.class */
public final class MediaType {
    private static final EnumEntries $ENTRIES;
    private static final MediaType[] $VALUES;
    public static final MediaType Default = new MediaType(TagTemplate.DEFAULT_TAG, 0, 0);
    public static final MediaType Fmp4Audio = new MediaType("Fmp4Audio", 1, 2);
    private final int value;

    private static final /* synthetic */ MediaType[] $values() {
        return new MediaType[]{Default, Fmp4Audio};
    }

    static {
        MediaType[] mediaTypeArr$values = $values();
        $VALUES = mediaTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(mediaTypeArr$values);
    }

    private MediaType(String str, int i7, int i8) {
        this.value = i8;
    }

    @NotNull
    public static EnumEntries<MediaType> getEntries() {
        return $ENTRIES;
    }

    public static MediaType valueOf(String str) {
        return (MediaType) Enum.valueOf(MediaType.class, str);
    }

    public static MediaType[] values() {
        return (MediaType[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
