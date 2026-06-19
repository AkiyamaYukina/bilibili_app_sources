package com.bilibili.mediastreaming.enums;

import androidx.annotation.Keep;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/enums/BiliAudioCodec.class */
@Keep
public final class BiliAudioCodec {
    private static final EnumEntries $ENTRIES;
    private static final BiliAudioCodec[] $VALUES;
    public static final BiliAudioCodec UN_DEFINE = new BiliAudioCodec("UN_DEFINE", 0);
    public static final BiliAudioCodec AAC = new BiliAudioCodec("AAC", 1);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/enums/BiliAudioCodec$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f65977a;

        static {
            int[] iArr = new int[BiliAudioCodec.values().length];
            try {
                iArr[BiliAudioCodec.AAC.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[BiliAudioCodec.UN_DEFINE.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            f65977a = iArr;
        }
    }

    private static final /* synthetic */ BiliAudioCodec[] $values() {
        return new BiliAudioCodec[]{UN_DEFINE, AAC};
    }

    static {
        BiliAudioCodec[] biliAudioCodecArr$values = $values();
        $VALUES = biliAudioCodecArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(biliAudioCodecArr$values);
    }

    private BiliAudioCodec(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<BiliAudioCodec> getEntries() {
        return $ENTRIES;
    }

    public static BiliAudioCodec valueOf(String str) {
        return (BiliAudioCodec) Enum.valueOf(BiliAudioCodec.class, str);
    }

    public static BiliAudioCodec[] values() {
        return (BiliAudioCodec[]) $VALUES.clone();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // java.lang.Enum
    @NotNull
    public String toString() throws NoWhenBranchMatchedException {
        String str;
        int i7 = a.f65977a[ordinal()];
        if (i7 == 1) {
            str = "AAC";
        } else {
            if (i7 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "UN_DEFINE";
        }
        return str;
    }
}
