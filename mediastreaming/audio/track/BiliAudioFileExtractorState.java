package com.bilibili.mediastreaming.audio.track;

import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/audio/track/BiliAudioFileExtractorState.class */
public final class BiliAudioFileExtractorState {
    private static final EnumEntries $ENTRIES;
    private static final BiliAudioFileExtractorState[] $VALUES;
    public static final BiliAudioFileExtractorState UN_INIT = new BiliAudioFileExtractorState("UN_INIT", 0);
    public static final BiliAudioFileExtractorState INIT_EXTRACTOR = new BiliAudioFileExtractorState("INIT_EXTRACTOR", 1);
    public static final BiliAudioFileExtractorState EXTRACTING = new BiliAudioFileExtractorState("EXTRACTING", 2);
    public static final BiliAudioFileExtractorState EXTRACTED = new BiliAudioFileExtractorState("EXTRACTED", 3);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/audio/track/BiliAudioFileExtractorState$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f65785a;

        static {
            int[] iArr = new int[BiliAudioFileExtractorState.values().length];
            try {
                iArr[BiliAudioFileExtractorState.UN_INIT.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[BiliAudioFileExtractorState.INIT_EXTRACTOR.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[BiliAudioFileExtractorState.EXTRACTING.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[BiliAudioFileExtractorState.EXTRACTED.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            f65785a = iArr;
        }
    }

    private static final /* synthetic */ BiliAudioFileExtractorState[] $values() {
        return new BiliAudioFileExtractorState[]{UN_INIT, INIT_EXTRACTOR, EXTRACTING, EXTRACTED};
    }

    static {
        BiliAudioFileExtractorState[] biliAudioFileExtractorStateArr$values = $values();
        $VALUES = biliAudioFileExtractorStateArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(biliAudioFileExtractorStateArr$values);
    }

    private BiliAudioFileExtractorState(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<BiliAudioFileExtractorState> getEntries() {
        return $ENTRIES;
    }

    public static BiliAudioFileExtractorState valueOf(String str) {
        return (BiliAudioFileExtractorState) Enum.valueOf(BiliAudioFileExtractorState.class, str);
    }

    public static BiliAudioFileExtractorState[] values() {
        return (BiliAudioFileExtractorState[]) $VALUES.clone();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // java.lang.Enum
    @NotNull
    public String toString() throws NoWhenBranchMatchedException {
        String str;
        int i7 = a.f65785a[ordinal()];
        if (i7 == 1) {
            str = "UN_INIT";
        } else if (i7 == 2) {
            str = "INIT_EXTRACTOR";
        } else if (i7 == 3) {
            str = "EXTRACTING";
        } else {
            if (i7 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            str = "EXTRACTED";
        }
        return str;
    }
}
