package com.bilibili.studio.videoeditor.util;

import kotlin.jvm.JvmStatic;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.studio.videoeditor.util.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/util/g.class */
public final class C6634g {
    public static int a(int i7, String str) {
        int i8;
        char cCharAt = str.charAt(i7);
        if ('0' <= cCharAt && cCharAt < ':') {
            i8 = cCharAt - '0';
        } else if ('A' <= cCharAt && cCharAt < 'G') {
            i8 = cCharAt - '7';
        } else {
            if ('a' > cCharAt || cCharAt >= 'g') {
                throw new IllegalArgumentException();
            }
            i8 = cCharAt - 'W';
        }
        return i8;
    }

    @JvmStatic
    @Nullable
    public static final Integer b(@Nullable String str) {
        if (str == null) {
            return null;
        }
        try {
            int[] iArrD = d(str);
            if (iArrD == null) {
                return null;
            }
            return Integer.valueOf(iArrD[3] | (iArrD[0] << 24) | (iArrD[1] << 16) | (iArrD[2] << 8));
        } catch (RuntimeException e7) {
            return null;
        }
    }

    public static int c(int i7, String str) {
        return a(i7 + 1, str) + (a(i7, str) * 16);
    }

    public static int[] d(String str) {
        int i7 = StringsKt.Z(str, "#") ? 1 : StringsKt.Z(str, "0x") ? 2 : 0;
        int length = str.length() - i7;
        if (length == 3) {
            return new int[]{255, a(i7, str) * 17, a(i7 + 1, str) * 17, a(i7 + 2, str) * 17};
        }
        if (length == 4) {
            return new int[]{a(i7, str) * 17, a(i7 + 1, str) * 17, a(i7 + 2, str) * 17, a(i7 + 3, str) * 17};
        }
        if (length == 6) {
            return new int[]{255, c(i7, str), c(i7 + 2, str), c(i7 + 4, str)};
        }
        if (length != 8) {
            return null;
        }
        return new int[]{c(i7, str), c(i7 + 2, str), c(i7 + 4, str), c(i7 + 6, str)};
    }
}
