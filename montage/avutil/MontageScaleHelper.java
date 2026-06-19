package com.bilibili.montage.avutil;

import com.bilibili.montage.avinfo.MontageSize;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/avutil/MontageScaleHelper.class */
public class MontageScaleHelper {
    private static int alignment(int i7, int i8) {
        return (((i7 + i8) - 1) / i8) * i8;
    }

    public static MontageSize calScaleImageSize(int i7, int i8, int i9, int i10, boolean z6) {
        double dMax;
        double dMin;
        double dMin2;
        if (i7 <= 0 || i8 <= 0 || i9 <= 0 || i10 <= 0) {
            new MontageSize(i7, i8);
        }
        if (z6) {
            dMax = ((double) Math.max(i9, i10)) / ((double) Math.max(i7, i8));
            dMin = Math.min(i9, i10);
            dMin2 = Math.min(i7, i8);
        } else {
            dMax = ((double) i9) / ((double) i7);
            dMin = i10;
            dMin2 = i8;
        }
        double dMin3 = Math.min(1.0d, Math.min(dMax, dMin / dMin2));
        return new MontageSize(alignment((int) (((double) i7) * dMin3), 2), alignment((int) (((double) i8) * dMin3), 2));
    }

    public static int calculateInSampleSize(int i7, int i8, int i9, int i10, boolean z6) {
        int iCeil;
        double dCeil;
        if (i7 <= 0 || i8 <= 0 || i9 <= 0 || i10 <= 0) {
            return 1;
        }
        if (z6) {
            int iCeil2 = (int) Math.ceil(Math.max(i7, i8) / Math.max(i9, i10));
            dCeil = Math.ceil(Math.min(i7, i8) / Math.min(i9, i10));
            iCeil = iCeil2;
        } else {
            iCeil = (int) Math.ceil(i7 / i9);
            dCeil = Math.ceil(i8 / i10);
        }
        return Math.max(1, Math.max(iCeil, (int) dCeil));
    }
}
