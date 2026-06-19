package com.bilibili.playerbizcommon.miniplayer;

import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/miniplayer/MiniPlayerSize.class */
public final class MiniPlayerSize {
    private static final EnumEntries $ENTRIES;
    private static final MiniPlayerSize[] $VALUES;
    private final float magnification;
    public static final MiniPlayerSize SMALL = new MiniPlayerSize("SMALL", 0, 1.0f);
    public static final MiniPlayerSize DEFAULT = new MiniPlayerSize("DEFAULT", 1, 1.3f);
    public static final MiniPlayerSize BIG = new MiniPlayerSize("BIG", 2, 1.62f);
    public static final MiniPlayerSize LARGE = new MiniPlayerSize("LARGE", 3, 1.92f);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/miniplayer/MiniPlayerSize$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f80228a;

        static {
            int[] iArr = new int[MiniPlayerSize.values().length];
            try {
                iArr[MiniPlayerSize.SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[MiniPlayerSize.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[MiniPlayerSize.BIG.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[MiniPlayerSize.LARGE.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            f80228a = iArr;
        }
    }

    private static final /* synthetic */ MiniPlayerSize[] $values() {
        return new MiniPlayerSize[]{SMALL, DEFAULT, BIG, LARGE};
    }

    static {
        MiniPlayerSize[] miniPlayerSizeArr$values = $values();
        $VALUES = miniPlayerSizeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(miniPlayerSizeArr$values);
    }

    private MiniPlayerSize(String str, int i7, float f7) {
        this.magnification = f7;
    }

    @NotNull
    public static EnumEntries<MiniPlayerSize> getEntries() {
        return $ENTRIES;
    }

    public static MiniPlayerSize valueOf(String str) {
        return (MiniPlayerSize) Enum.valueOf(MiniPlayerSize.class, str);
    }

    public static MiniPlayerSize[] values() {
        return (MiniPlayerSize[]) $VALUES.clone();
    }

    public final float getMagnification() {
        return this.magnification;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final float getVerticalSize() throws NoWhenBranchMatchedException {
        float f7;
        int i7 = a.f80228a[ordinal()];
        if (i7 == 1) {
            f7 = 0.65f;
        } else if (i7 == 2) {
            f7 = 0.8f;
        } else if (i7 == 3) {
            f7 = 1.0f;
        } else {
            if (i7 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            f7 = 1.1f;
        }
        return f7;
    }
}
