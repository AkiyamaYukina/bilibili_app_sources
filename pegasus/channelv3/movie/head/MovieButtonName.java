package com.bilibili.pegasus.channelv3.movie.head;

import com.bilibili.playerbizcommon.IVideoLikeRouteService;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/movie/head/MovieButtonName.class */
public final class MovieButtonName {
    private static final EnumEntries $ENTRIES;
    private static final MovieButtonName[] $VALUES;
    public static final MovieButtonName COLLECT = new MovieButtonName("COLLECT", 0, "collect");
    public static final MovieButtonName LIKE = new MovieButtonName("LIKE", 1, IVideoLikeRouteService.ACTION_LIKE);
    public static final MovieButtonName WATCH = new MovieButtonName("WATCH", 2, "watch");

    @NotNull
    private final String btName;

    private static final /* synthetic */ MovieButtonName[] $values() {
        return new MovieButtonName[]{COLLECT, LIKE, WATCH};
    }

    static {
        MovieButtonName[] movieButtonNameArr$values = $values();
        $VALUES = movieButtonNameArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(movieButtonNameArr$values);
    }

    private MovieButtonName(String str, int i7, String str2) {
        this.btName = str2;
    }

    @NotNull
    public static EnumEntries<MovieButtonName> getEntries() {
        return $ENTRIES;
    }

    public static MovieButtonName valueOf(String str) {
        return (MovieButtonName) Enum.valueOf(MovieButtonName.class, str);
    }

    public static MovieButtonName[] values() {
        return (MovieButtonName[]) $VALUES.clone();
    }

    @NotNull
    public final String getBtName() {
        return this.btName;
    }
}
