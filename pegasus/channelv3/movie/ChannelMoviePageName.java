package com.bilibili.pegasus.channelv3.movie;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/movie/ChannelMoviePageName.class */
public final class ChannelMoviePageName {
    private static final EnumEntries $ENTRIES;
    private static final ChannelMoviePageName[] $VALUES;
    public static final ChannelMoviePageName CHANNEL_MOVIE_REVIEW = new ChannelMoviePageName("CHANNEL_MOVIE_REVIEW", 0, "traffic.movie-channel-detail-text");

    @NotNull
    private final String pageName;

    private static final /* synthetic */ ChannelMoviePageName[] $values() {
        return new ChannelMoviePageName[]{CHANNEL_MOVIE_REVIEW};
    }

    static {
        ChannelMoviePageName[] channelMoviePageNameArr$values = $values();
        $VALUES = channelMoviePageNameArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(channelMoviePageNameArr$values);
    }

    private ChannelMoviePageName(String str, int i7, String str2) {
        this.pageName = str2;
    }

    @NotNull
    public static EnumEntries<ChannelMoviePageName> getEntries() {
        return $ENTRIES;
    }

    public static ChannelMoviePageName valueOf(String str) {
        return (ChannelMoviePageName) Enum.valueOf(ChannelMoviePageName.class, str);
    }

    public static ChannelMoviePageName[] values() {
        return (ChannelMoviePageName[]) $VALUES.clone();
    }

    @NotNull
    public final String getPageName() {
        return this.pageName;
    }
}
