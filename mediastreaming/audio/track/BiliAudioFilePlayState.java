package com.bilibili.mediastreaming.audio.track;

import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/audio/track/BiliAudioFilePlayState.class */
public final class BiliAudioFilePlayState {
    private static final EnumEntries $ENTRIES;
    private static final BiliAudioFilePlayState[] $VALUES;
    public static final BiliAudioFilePlayState UN_PLAY = new BiliAudioFilePlayState("UN_PLAY", 0);
    public static final BiliAudioFilePlayState PLAY_START = new BiliAudioFilePlayState("PLAY_START", 1);
    public static final BiliAudioFilePlayState PLAYING = new BiliAudioFilePlayState("PLAYING", 2);
    public static final BiliAudioFilePlayState PAUSE = new BiliAudioFilePlayState("PAUSE", 3);
    public static final BiliAudioFilePlayState PLAY_DONE = new BiliAudioFilePlayState("PLAY_DONE", 4);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/audio/track/BiliAudioFilePlayState$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f65786a;

        static {
            int[] iArr = new int[BiliAudioFilePlayState.values().length];
            try {
                iArr[BiliAudioFilePlayState.UN_PLAY.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[BiliAudioFilePlayState.PLAY_START.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[BiliAudioFilePlayState.PLAYING.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[BiliAudioFilePlayState.PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr[BiliAudioFilePlayState.PLAY_DONE.ordinal()] = 5;
            } catch (NoSuchFieldError e11) {
            }
            f65786a = iArr;
        }
    }

    private static final /* synthetic */ BiliAudioFilePlayState[] $values() {
        return new BiliAudioFilePlayState[]{UN_PLAY, PLAY_START, PLAYING, PAUSE, PLAY_DONE};
    }

    static {
        BiliAudioFilePlayState[] biliAudioFilePlayStateArr$values = $values();
        $VALUES = biliAudioFilePlayStateArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(biliAudioFilePlayStateArr$values);
    }

    private BiliAudioFilePlayState(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<BiliAudioFilePlayState> getEntries() {
        return $ENTRIES;
    }

    public static BiliAudioFilePlayState valueOf(String str) {
        return (BiliAudioFilePlayState) Enum.valueOf(BiliAudioFilePlayState.class, str);
    }

    public static BiliAudioFilePlayState[] values() {
        return (BiliAudioFilePlayState[]) $VALUES.clone();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // java.lang.Enum
    @NotNull
    public String toString() throws NoWhenBranchMatchedException {
        String str;
        int i7 = a.f65786a[ordinal()];
        if (i7 == 1) {
            str = "UN_PLAY";
        } else if (i7 == 2) {
            str = "PLAY_START";
        } else if (i7 == 3) {
            str = "PLAYING";
        } else if (i7 == 4) {
            str = "PAUSE";
        } else {
            if (i7 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            str = "PLAY_DONE";
        }
        return str;
    }
}
