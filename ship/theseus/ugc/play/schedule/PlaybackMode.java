package com.bilibili.ship.theseus.ugc.play.schedule;

import com.bilibili.ship.theseus.ugc.play.schedule.UGCEpisodeListRepository;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/schedule/PlaybackMode.class */
public final class PlaybackMode {
    private static final EnumEntries $ENTRIES;
    private static final PlaybackMode[] $VALUES;

    @NotNull
    public static final a Companion;
    private final int value;
    public static final PlaybackMode AUTO_CONTINUOUS = new PlaybackMode("AUTO_CONTINUOUS", 0, 0);
    public static final PlaybackMode PAUSE_WHEN_ENDED = new PlaybackMode("PAUSE_WHEN_ENDED", 1, 1);
    public static final PlaybackMode LIST_LOOP = new PlaybackMode("LIST_LOOP", 2, 4);
    public static final PlaybackMode SINGLE_EPISODE_LOOP = new PlaybackMode("SINGLE_EPISODE_LOOP", 3, 2);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/schedule/PlaybackMode$a.class */
    public static final class a {

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.play.schedule.PlaybackMode$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/schedule/PlaybackMode$a$a.class */
        public static final /* synthetic */ class C0909a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final int[] f98168a;

            static {
                int[] iArr = new int[PlaybackMode.values().length];
                try {
                    iArr[PlaybackMode.AUTO_CONTINUOUS.ordinal()] = 1;
                } catch (NoSuchFieldError e7) {
                }
                try {
                    iArr[PlaybackMode.PAUSE_WHEN_ENDED.ordinal()] = 2;
                } catch (NoSuchFieldError e8) {
                }
                try {
                    iArr[PlaybackMode.LIST_LOOP.ordinal()] = 3;
                } catch (NoSuchFieldError e9) {
                }
                try {
                    iArr[PlaybackMode.SINGLE_EPISODE_LOOP.ordinal()] = 4;
                } catch (NoSuchFieldError e10) {
                }
                f98168a = iArr;
            }
        }

        @NotNull
        public static PlaybackMode a(int i7) {
            return i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 4 ? PlaybackMode.AUTO_CONTINUOUS : PlaybackMode.LIST_LOOP : PlaybackMode.SINGLE_EPISODE_LOOP : PlaybackMode.PAUSE_WHEN_ENDED : PlaybackMode.AUTO_CONTINUOUS;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/schedule/PlaybackMode$b.class */
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f98169a;

        static {
            int[] iArr = new int[PlaybackMode.values().length];
            try {
                iArr[PlaybackMode.AUTO_CONTINUOUS.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[PlaybackMode.PAUSE_WHEN_ENDED.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[PlaybackMode.LIST_LOOP.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[PlaybackMode.SINGLE_EPISODE_LOOP.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            f98169a = iArr;
        }
    }

    private static final /* synthetic */ PlaybackMode[] $values() {
        return new PlaybackMode[]{AUTO_CONTINUOUS, PAUSE_WHEN_ENDED, LIST_LOOP, SINGLE_EPISODE_LOOP};
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [com.bilibili.ship.theseus.ugc.play.schedule.PlaybackMode$a, java.lang.Object] */
    static {
        PlaybackMode[] playbackModeArr$values = $values();
        $VALUES = playbackModeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(playbackModeArr$values);
        Companion = new Object();
    }

    private PlaybackMode(String str, int i7, int i8) {
        this.value = i8;
    }

    @NotNull
    public static EnumEntries<PlaybackMode> getEntries() {
        return $ENTRIES;
    }

    public static PlaybackMode valueOf(String str) {
        return (PlaybackMode) Enum.valueOf(PlaybackMode.class, str);
    }

    public static PlaybackMode[] values() {
        return (PlaybackMode[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.bilibili.ship.theseus.ugc.play.schedule.UGCEpisodeListRepository$a] */
    @NotNull
    public final UGCEpisodeListRepository.a toStrategy() throws NoWhenBranchMatchedException {
        int i7 = b.f98169a[ordinal()];
        if (i7 != 1 && i7 != 2 && i7 != 3 && i7 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        Object obj = new Object();
        return obj;
    }
}
