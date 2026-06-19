package com.bilibili.search2.utils;

import android.graphics.Color;
import kotlin.ranges.RangesKt;

/* JADX INFO: renamed from: com.bilibili.search2.utils.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/utils/a.class */
public final class C6077a {
    /* JADX WARN: Removed duplicated region for block: B:108:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0146 A[EDGE_INSN: B:124:0x0146->B:32:0x0146 BREAK  A[LOOP:0: B:15:0x009f->B:29:0x0130], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0129 A[EDGE_INSN: B:125:0x0129->B:27:0x0129 BREAK  A[LOOP:1: B:24:0x00f5->B:26:0x011a], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x011a A[LOOP:1: B:24:0x00f5->B:26:0x011a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0130 A[LOOP:0: B:15:0x009f->B:29:0x0130, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int a(int r11, android.graphics.Bitmap r12) {
        /*
            Method dump skipped, instruction units count: 1098
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.utils.C6077a.a(int, android.graphics.Bitmap):int");
    }

    public static final boolean b(int i7, float[] fArr, float f7, float f8, float f9, float f10, int[] iArr, float[] fArr2, float[] fArr3, float[] fArr4) {
        if ((i7 >>> 24) < 128) {
            return false;
        }
        int i8 = (i7 >> 16) & 255;
        int i9 = (i7 >> 8) & 255;
        int i10 = i7 & 255;
        int iMax = Math.max(i8, Math.max(i9, i10));
        int iMin = Math.min(i8, Math.min(i9, i10));
        if (iMax < 10) {
            return false;
        }
        float f11 = iMax - iMin;
        float f12 = iMax;
        float f13 = f11 / f12;
        if (f7 > 0.1f && f13 < 0.5f * f7) {
            return false;
        }
        float f14 = f12 / 255.0f;
        if (f14 < f9 - 0.3f || f14 > 0.3f + f10) {
            return false;
        }
        Color.colorToHSV(i7, fArr);
        float f15 = fArr[0];
        float f16 = fArr[1];
        float f17 = fArr[2];
        if (f7 > f16 || f16 > f8 || f9 > f17 || f17 > f10) {
            return false;
        }
        int iCoerceIn = RangesKt.coerceIn((int) (0.1f * f15), 0, 35);
        fArr2[iCoerceIn] = fArr2[iCoerceIn] + f15;
        fArr3[iCoerceIn] = fArr3[iCoerceIn] + f16;
        fArr4[iCoerceIn] = fArr4[iCoerceIn] + f17;
        iArr[iCoerceIn] = iArr[iCoerceIn] + 1;
        return true;
    }

    public static final Integer c(int i7, int[] iArr) {
        int i8 = i7;
        if (i7 < 0) {
            int length = iArr.length;
            int i9 = 0;
            while (true) {
                i8 = i7;
                if (i9 >= length) {
                    break;
                }
                if (iArr[i9] > 0) {
                    i8 = i9;
                    break;
                }
                i9++;
            }
        }
        int i10 = i8 >= 0 ? iArr[i8] : 0;
        int length2 = iArr.length;
        for (int i11 = 0; i11 < length2; i11++) {
            if (iArr[i11] > i10) {
                return Integer.valueOf(i11);
            }
        }
        return i8 >= 0 ? Integer.valueOf(i8) : null;
    }
}
