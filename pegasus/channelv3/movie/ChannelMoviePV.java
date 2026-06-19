package com.bilibili.pegasus.channelv3.movie;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/movie/ChannelMoviePV.class */
public final class ChannelMoviePV {
    private static final EnumEntries $ENTRIES;
    private static final ChannelMoviePV[] $VALUES;

    @NotNull
    private final String pv;
    public static final ChannelMoviePV CHANNEL_MOVIE_DETAIL_PV = new ChannelMoviePV("CHANNEL_MOVIE_DETAIL_PV", 0, "traffic.movie-channel-detail-detail.0.0.pv");
    public static final ChannelMoviePV CHANNEL_MOVIE_VIDEO_PV = new ChannelMoviePV("CHANNEL_MOVIE_VIDEO_PV", 1, "traffic.movie-channel-detail-video.0.0.pv");
    public static final ChannelMoviePV CHANNEL_NEW_RELATION_PV = new ChannelMoviePV("CHANNEL_NEW_RELATION_PV", 2, "traffic.new-channel-detail-relate.0.0.pv");
    public static final ChannelMoviePV CHANNEL_MOVIE_RELATION_PV = new ChannelMoviePV("CHANNEL_MOVIE_RELATION_PV", 3, "traffic.movie-channel-detail-relate.0.0.pv");

    private static final /* synthetic */ ChannelMoviePV[] $values() {
        return new ChannelMoviePV[]{CHANNEL_MOVIE_DETAIL_PV, CHANNEL_MOVIE_VIDEO_PV, CHANNEL_NEW_RELATION_PV, CHANNEL_MOVIE_RELATION_PV};
    }

    static {
        ChannelMoviePV[] channelMoviePVArr$values = $values();
        $VALUES = channelMoviePVArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(channelMoviePVArr$values);
    }

    private ChannelMoviePV(String str, int i7, String str2) {
        this.pv = str2;
    }

    @NotNull
    public static EnumEntries<ChannelMoviePV> getEntries() {
        return $ENTRIES;
    }

    public static ChannelMoviePV valueOf(String str) {
        return (ChannelMoviePV) Enum.valueOf(ChannelMoviePV.class, str);
    }

    public static ChannelMoviePV[] values() {
        return (ChannelMoviePV[]) $VALUES.clone();
    }

    @NotNull
    public final String getPv() {
        return this.pv;
    }
}
