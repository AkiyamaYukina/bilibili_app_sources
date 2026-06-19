package com.bilibili.search2.api;

import com.bilibili.live.streaming.source.TextSource;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/EpisodeSelectStyle.class */
public final class EpisodeSelectStyle {
    private static final EnumEntries $ENTRIES;
    private static final EpisodeSelectStyle[] $VALUES;
    public static final EpisodeSelectStyle Grid = new EpisodeSelectStyle("Grid", 0, "grid");
    public static final EpisodeSelectStyle Horizontal = new EpisodeSelectStyle(TextSource.STR_SCROLL_HORIZONTAL, 1, "horizontal");
    public static final EpisodeSelectStyle HorizontalLarge = new EpisodeSelectStyle("HorizontalLarge", 2, "horizontal_large");

    @NotNull
    private String value;

    private static final /* synthetic */ EpisodeSelectStyle[] $values() {
        return new EpisodeSelectStyle[]{Grid, Horizontal, HorizontalLarge};
    }

    static {
        EpisodeSelectStyle[] episodeSelectStyleArr$values = $values();
        $VALUES = episodeSelectStyleArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(episodeSelectStyleArr$values);
    }

    private EpisodeSelectStyle(String str, int i7, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<EpisodeSelectStyle> getEntries() {
        return $ENTRIES;
    }

    public static EpisodeSelectStyle valueOf(String str) {
        return (EpisodeSelectStyle) Enum.valueOf(EpisodeSelectStyle.class, str);
    }

    public static EpisodeSelectStyle[] values() {
        return (EpisodeSelectStyle[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public final void setValue(@NotNull String str) {
        this.value = str;
    }
}
