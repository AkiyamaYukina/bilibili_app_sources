package com.bilibili.playerbizcommonv2.danmaku.setting.v2;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/setting/v2/DMBlockType.class */
public final class DMBlockType {
    private static final EnumEntries $ENTRIES;
    private static final DMBlockType[] $VALUES;

    @NotNull
    public static final a Companion;
    private final int desc;
    private final int disableRes;
    private final int enableRes;
    public static final DMBlockType FIXED = new DMBlockType("FIXED", 0, 2131242061, 2131242060, 2131845939);
    public static final DMBlockType SCROLL = new DMBlockType("SCROLL", 1, 2131233427, 2131233428, 2131847247);
    public static final DMBlockType COLORFUL = new DMBlockType("COLORFUL", 2, 2131242055, 2131242054, 2131845930);
    public static final DMBlockType ADVANCED = new DMBlockType("ADVANCED", 3, 2131242059, 2131242058, 2131845650);
    public static final DMBlockType COUNT = new DMBlockType("COUNT", 4, 2131242057, 2131242056, 2131845938);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/setting/v2/DMBlockType$a.class */
    public static final class a {
        @Nullable
        public static DMBlockType a(int i7) {
            DMBlockType dMBlockType = DMBlockType.FIXED;
            if (i7 != dMBlockType.getDesc()) {
                dMBlockType = DMBlockType.SCROLL;
                if (i7 != dMBlockType.getDesc()) {
                    dMBlockType = DMBlockType.COLORFUL;
                    if (i7 != dMBlockType.getDesc()) {
                        dMBlockType = DMBlockType.ADVANCED;
                        if (i7 != dMBlockType.getDesc()) {
                            dMBlockType = DMBlockType.COUNT;
                            if (i7 != dMBlockType.getDesc()) {
                                dMBlockType = null;
                            }
                        }
                    }
                }
            }
            return dMBlockType;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/setting/v2/DMBlockType$b.class */
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f81287a;

        static {
            int[] iArr = new int[DMBlockType.values().length];
            try {
                iArr[DMBlockType.SCROLL.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[DMBlockType.COLORFUL.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[DMBlockType.ADVANCED.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[DMBlockType.FIXED.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr[DMBlockType.COUNT.ordinal()] = 5;
            } catch (NoSuchFieldError e11) {
            }
            f81287a = iArr;
        }
    }

    private static final /* synthetic */ DMBlockType[] $values() {
        return new DMBlockType[]{FIXED, SCROLL, COLORFUL, ADVANCED, COUNT};
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [com.bilibili.playerbizcommonv2.danmaku.setting.v2.DMBlockType$a, java.lang.Object] */
    static {
        DMBlockType[] dMBlockTypeArr$values = $values();
        $VALUES = dMBlockTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(dMBlockTypeArr$values);
        Companion = new Object();
    }

    private DMBlockType(@DrawableRes String str, @DrawableRes int i7, @StringRes int i8, int i9, int i10) {
        this.enableRes = i8;
        this.disableRes = i9;
        this.desc = i10;
    }

    @NotNull
    public static EnumEntries<DMBlockType> getEntries() {
        return $ENTRIES;
    }

    public static DMBlockType valueOf(String str) {
        return (DMBlockType) Enum.valueOf(DMBlockType.class, str);
    }

    public static DMBlockType[] values() {
        return (DMBlockType[]) $VALUES.clone();
    }

    public final int getDesc() {
        return this.desc;
    }

    public final int getDisableRes() {
        return this.disableRes;
    }

    public final int getEnableRes() {
        return this.enableRes;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @NotNull
    public final String reportType() throws NoWhenBranchMatchedException {
        String str;
        int i7 = b.f81287a[ordinal()];
        if (i7 == 1) {
            str = "3";
        } else if (i7 == 2) {
            str = "5";
        } else if (i7 == 3) {
            str = "6";
        } else if (i7 == 4) {
            str = "7";
        } else {
            if (i7 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            str = "8";
        }
        return str;
    }
}
