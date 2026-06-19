package com.bilibili.ship.theseus.ogv.intro.section.bean;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/bean/EpisodeStyle.class */
public final class EpisodeStyle {
    private static final EnumEntries $ENTRIES;
    private static final EpisodeStyle[] $VALUES;
    public static final EpisodeStyle LONG_AND_SHORT_TITLE = new EpisodeStyle("LONG_AND_SHORT_TITLE", 0);
    public static final EpisodeStyle SHORT_TITLE = new EpisodeStyle("SHORT_TITLE", 1);
    public static final EpisodeStyle COVER = new EpisodeStyle("COVER", 2);
    public static final EpisodeStyle LONG_TITLE = new EpisodeStyle("LONG_TITLE", 3);

    private static final /* synthetic */ EpisodeStyle[] $values() {
        return new EpisodeStyle[]{LONG_AND_SHORT_TITLE, SHORT_TITLE, COVER, LONG_TITLE};
    }

    static {
        EpisodeStyle[] episodeStyleArr$values = $values();
        $VALUES = episodeStyleArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(episodeStyleArr$values);
    }

    private EpisodeStyle(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<EpisodeStyle> getEntries() {
        return $ENTRIES;
    }

    public static EpisodeStyle valueOf(String str) {
        return (EpisodeStyle) Enum.valueOf(EpisodeStyle.class, str);
    }

    public static EpisodeStyle[] values() {
        return (EpisodeStyle[]) $VALUES.clone();
    }
}
