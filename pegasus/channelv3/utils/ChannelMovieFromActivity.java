package com.bilibili.pegasus.channelv3.utils;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/utils/ChannelMovieFromActivity.class */
public final class ChannelMovieFromActivity {
    private static final EnumEntries $ENTRIES;
    private static final ChannelMovieFromActivity[] $VALUES;

    @NotNull
    public static final a Companion;

    @NotNull
    private final String activityName;
    public static final ChannelMovieFromActivity CHANNEL_NEW = new ChannelMovieFromActivity("CHANNEL_NEW", 0, "channel_new");
    public static final ChannelMovieFromActivity CHANNEL_MOVIE = new ChannelMovieFromActivity("CHANNEL_MOVIE", 1, "channel_movie");

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/utils/ChannelMovieFromActivity$a.class */
    public static final class a {
    }

    private static final /* synthetic */ ChannelMovieFromActivity[] $values() {
        return new ChannelMovieFromActivity[]{CHANNEL_NEW, CHANNEL_MOVIE};
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.bilibili.pegasus.channelv3.utils.ChannelMovieFromActivity$a, java.lang.Object] */
    static {
        ChannelMovieFromActivity[] channelMovieFromActivityArr$values = $values();
        $VALUES = channelMovieFromActivityArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(channelMovieFromActivityArr$values);
        Companion = new Object();
    }

    private ChannelMovieFromActivity(String str, int i7, String str2) {
        this.activityName = str2;
    }

    @NotNull
    public static EnumEntries<ChannelMovieFromActivity> getEntries() {
        return $ENTRIES;
    }

    public static ChannelMovieFromActivity valueOf(String str) {
        return (ChannelMovieFromActivity) Enum.valueOf(ChannelMovieFromActivity.class, str);
    }

    public static ChannelMovieFromActivity[] values() {
        return (ChannelMovieFromActivity[]) $VALUES.clone();
    }

    @NotNull
    public final String getActivityName() {
        return this.activityName;
    }
}
