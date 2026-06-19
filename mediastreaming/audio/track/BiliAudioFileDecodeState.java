package com.bilibili.mediastreaming.audio.track;

import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/audio/track/BiliAudioFileDecodeState.class */
public final class BiliAudioFileDecodeState {
    private static final EnumEntries $ENTRIES;
    private static final BiliAudioFileDecodeState[] $VALUES;
    public static final BiliAudioFileDecodeState UN_INIT = new BiliAudioFileDecodeState("UN_INIT", 0);
    public static final BiliAudioFileDecodeState INIT_DECODE = new BiliAudioFileDecodeState("INIT_DECODE", 1);
    public static final BiliAudioFileDecodeState DECODING = new BiliAudioFileDecodeState("DECODING", 2);
    public static final BiliAudioFileDecodeState DECODED = new BiliAudioFileDecodeState("DECODED", 3);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/audio/track/BiliAudioFileDecodeState$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f65784a;

        static {
            int[] iArr = new int[BiliAudioFileDecodeState.values().length];
            try {
                iArr[BiliAudioFileDecodeState.UN_INIT.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[BiliAudioFileDecodeState.INIT_DECODE.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[BiliAudioFileDecodeState.DECODING.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[BiliAudioFileDecodeState.DECODED.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            f65784a = iArr;
        }
    }

    private static final /* synthetic */ BiliAudioFileDecodeState[] $values() {
        return new BiliAudioFileDecodeState[]{UN_INIT, INIT_DECODE, DECODING, DECODED};
    }

    static {
        BiliAudioFileDecodeState[] biliAudioFileDecodeStateArr$values = $values();
        $VALUES = biliAudioFileDecodeStateArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(biliAudioFileDecodeStateArr$values);
    }

    private BiliAudioFileDecodeState(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<BiliAudioFileDecodeState> getEntries() {
        return $ENTRIES;
    }

    public static BiliAudioFileDecodeState valueOf(String str) {
        return (BiliAudioFileDecodeState) Enum.valueOf(BiliAudioFileDecodeState.class, str);
    }

    public static BiliAudioFileDecodeState[] values() {
        return (BiliAudioFileDecodeState[]) $VALUES.clone();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // java.lang.Enum
    @NotNull
    public String toString() throws NoWhenBranchMatchedException {
        String str;
        int i7 = a.f65784a[ordinal()];
        if (i7 == 1) {
            str = "UN_INIT";
        } else if (i7 == 2) {
            str = "INIT_DECODE";
        } else if (i7 == 3) {
            str = "DECODING";
        } else {
            if (i7 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            str = "DECODED";
        }
        return str;
    }
}
