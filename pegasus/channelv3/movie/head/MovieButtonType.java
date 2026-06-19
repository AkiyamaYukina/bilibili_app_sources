package com.bilibili.pegasus.channelv3.movie.head;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/movie/head/MovieButtonType.class */
public final class MovieButtonType {
    private static final EnumEntries $ENTRIES;
    private static final MovieButtonType[] $VALUES;

    @NotNull
    private final String type;
    public static final MovieButtonType LIKE_UNFOLLOW = new MovieButtonType("LIKE_UNFOLLOW", 0, "0");
    public static final MovieButtonType LIKE_FOLLOWED = new MovieButtonType("LIKE_FOLLOWED", 1, "1");
    public static final MovieButtonType REDIRECT = new MovieButtonType("REDIRECT", 2, "2");

    private static final /* synthetic */ MovieButtonType[] $values() {
        return new MovieButtonType[]{LIKE_UNFOLLOW, LIKE_FOLLOWED, REDIRECT};
    }

    static {
        MovieButtonType[] movieButtonTypeArr$values = $values();
        $VALUES = movieButtonTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(movieButtonTypeArr$values);
    }

    private MovieButtonType(String str, int i7, String str2) {
        this.type = str2;
    }

    @NotNull
    public static EnumEntries<MovieButtonType> getEntries() {
        return $ENTRIES;
    }

    public static MovieButtonType valueOf(String str) {
        return (MovieButtonType) Enum.valueOf(MovieButtonType.class, str);
    }

    public static MovieButtonType[] values() {
        return (MovieButtonType[]) $VALUES.clone();
    }

    @NotNull
    public final String getType() {
        return this.type;
    }
}
