package com.bilibili.mediastreaming.enums;

import androidx.annotation.Keep;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/enums/BiliVideoCodec.class */
@Keep
public final class BiliVideoCodec {
    private static final EnumEntries $ENTRIES;
    private static final BiliVideoCodec[] $VALUES;
    public static final BiliVideoCodec UN_DEFINE = new BiliVideoCodec("UN_DEFINE", 0);
    public static final BiliVideoCodec AVC = new BiliVideoCodec("AVC", 1);
    public static final BiliVideoCodec HEVC = new BiliVideoCodec("HEVC", 2);
    public static final BiliVideoCodec BILI_HEVC = new BiliVideoCodec("BILI_HEVC", 3);
    public static final BiliVideoCodec AV1 = new BiliVideoCodec("AV1", 4);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/enums/BiliVideoCodec$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f65978a;

        static {
            int[] iArr = new int[BiliVideoCodec.values().length];
            try {
                iArr[BiliVideoCodec.AVC.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[BiliVideoCodec.HEVC.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[BiliVideoCodec.BILI_HEVC.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[BiliVideoCodec.AV1.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr[BiliVideoCodec.UN_DEFINE.ordinal()] = 5;
            } catch (NoSuchFieldError e11) {
            }
            f65978a = iArr;
        }
    }

    private static final /* synthetic */ BiliVideoCodec[] $values() {
        return new BiliVideoCodec[]{UN_DEFINE, AVC, HEVC, BILI_HEVC, AV1};
    }

    static {
        BiliVideoCodec[] biliVideoCodecArr$values = $values();
        $VALUES = biliVideoCodecArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(biliVideoCodecArr$values);
    }

    private BiliVideoCodec(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<BiliVideoCodec> getEntries() {
        return $ENTRIES;
    }

    public static BiliVideoCodec valueOf(String str) {
        return (BiliVideoCodec) Enum.valueOf(BiliVideoCodec.class, str);
    }

    public static BiliVideoCodec[] values() {
        return (BiliVideoCodec[]) $VALUES.clone();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // java.lang.Enum
    @NotNull
    public String toString() throws NoWhenBranchMatchedException {
        String str;
        int i7 = a.f65978a[ordinal()];
        if (i7 == 1) {
            str = "AVC";
        } else if (i7 == 2) {
            str = "HEVC";
        } else if (i7 == 3) {
            str = "BILI_HEVC";
        } else if (i7 == 4) {
            str = "AV1";
        } else {
            if (i7 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            str = "UN_DEFINE";
        }
        return str;
    }
}
