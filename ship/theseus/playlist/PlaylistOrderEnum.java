package com.bilibili.ship.theseus.playlist;

import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistOrderEnum.class */
public final class PlaylistOrderEnum {
    private static final EnumEntries $ENTRIES;
    private static final PlaylistOrderEnum[] $VALUES;
    public static final PlaylistOrderEnum NORMAL = new PlaylistOrderEnum("NORMAL", 0);
    public static final PlaylistOrderEnum REVERSE = new PlaylistOrderEnum("REVERSE", 1);
    public static final PlaylistOrderEnum RANDOM = new PlaylistOrderEnum("RANDOM", 2);
    public static final PlaylistOrderEnum LATEST_PUBLISH = new PlaylistOrderEnum("LATEST_PUBLISH", 3);
    public static final PlaylistOrderEnum MOST_PLAY = new PlaylistOrderEnum("MOST_PLAY", 4);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistOrderEnum$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f95070a;

        static {
            int[] iArr = new int[PlaylistOrderEnum.values().length];
            try {
                iArr[PlaylistOrderEnum.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[PlaylistOrderEnum.REVERSE.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[PlaylistOrderEnum.RANDOM.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[PlaylistOrderEnum.LATEST_PUBLISH.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr[PlaylistOrderEnum.MOST_PLAY.ordinal()] = 5;
            } catch (NoSuchFieldError e11) {
            }
            f95070a = iArr;
        }
    }

    private static final /* synthetic */ PlaylistOrderEnum[] $values() {
        return new PlaylistOrderEnum[]{NORMAL, REVERSE, RANDOM, LATEST_PUBLISH, MOST_PLAY};
    }

    static {
        PlaylistOrderEnum[] playlistOrderEnumArr$values = $values();
        $VALUES = playlistOrderEnumArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(playlistOrderEnumArr$values);
    }

    private PlaylistOrderEnum(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<PlaylistOrderEnum> getEntries() {
        return $ENTRIES;
    }

    public static PlaylistOrderEnum valueOf(String str) {
        return (PlaylistOrderEnum) Enum.valueOf(PlaylistOrderEnum.class, str);
    }

    public static PlaylistOrderEnum[] values() {
        return (PlaylistOrderEnum[]) $VALUES.clone();
    }

    @NotNull
    public final PlaylistOrderEnum next() {
        PlaylistOrderEnum[] playlistOrderEnumArr = (PlaylistOrderEnum[]) getEntries().toArray(new PlaylistOrderEnum[0]);
        return playlistOrderEnumArr[(ArraysKt.indexOf(playlistOrderEnumArr, this) + 1) % playlistOrderEnumArr.length];
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @NotNull
    public final String reportValue() throws NoWhenBranchMatchedException {
        String str;
        int i7 = a.f95070a[ordinal()];
        if (i7 == 1) {
            str = "1";
        } else if (i7 == 2) {
            str = "2";
        } else if (i7 == 3) {
            str = "3";
        } else if (i7 == 4) {
            str = "4";
        } else {
            if (i7 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            str = "5";
        }
        return str;
    }
}
