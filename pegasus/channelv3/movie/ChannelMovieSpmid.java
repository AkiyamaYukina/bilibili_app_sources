package com.bilibili.pegasus.channelv3.movie;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/movie/ChannelMovieSpmid.class */
public final class ChannelMovieSpmid {
    private static final EnumEntries $ENTRIES;
    private static final ChannelMovieSpmid[] $VALUES;

    @NotNull
    private final String spmid;
    public static final ChannelMovieSpmid CHANNEL_MOVIE_DETAIL_SPMID = new ChannelMovieSpmid("CHANNEL_MOVIE_DETAIL_SPMID", 0, "traffic.movie-channel-detail-detail.0.0");
    public static final ChannelMovieSpmid CHANNEL_MOVIE_VIDEO_SPMID = new ChannelMovieSpmid("CHANNEL_MOVIE_VIDEO_SPMID", 1, "traffic.movie-channel-detail-video.0.0");
    public static final ChannelMovieSpmid CHANNEL_NEW_RELATION_SPMID = new ChannelMovieSpmid("CHANNEL_NEW_RELATION_SPMID", 2, "traffic.new-channel-detail-relate.0.0");
    public static final ChannelMovieSpmid CHANNEL_MOVIE_RELATION_SPMID = new ChannelMovieSpmid("CHANNEL_MOVIE_RELATION_SPMID", 3, "traffic.movie-channel-detail-relate.0.0");

    private static final /* synthetic */ ChannelMovieSpmid[] $values() {
        return new ChannelMovieSpmid[]{CHANNEL_MOVIE_DETAIL_SPMID, CHANNEL_MOVIE_VIDEO_SPMID, CHANNEL_NEW_RELATION_SPMID, CHANNEL_MOVIE_RELATION_SPMID};
    }

    static {
        ChannelMovieSpmid[] channelMovieSpmidArr$values = $values();
        $VALUES = channelMovieSpmidArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(channelMovieSpmidArr$values);
    }

    private ChannelMovieSpmid(String str, int i7, String str2) {
        this.spmid = str2;
    }

    @NotNull
    public static EnumEntries<ChannelMovieSpmid> getEntries() {
        return $ENTRIES;
    }

    public static ChannelMovieSpmid valueOf(String str) {
        return (ChannelMovieSpmid) Enum.valueOf(ChannelMovieSpmid.class, str);
    }

    public static ChannelMovieSpmid[] values() {
        return (ChannelMovieSpmid[]) $VALUES.clone();
    }

    @NotNull
    public final String getSpmid() {
        return this.spmid;
    }
}
