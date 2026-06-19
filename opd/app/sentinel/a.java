package com.bilibili.opd.app.sentinel;

import androidx.collection.C3263b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/sentinel/a.class */
public final class a {
    public static final long a(float f7, long j7) {
        return C3263b.a(d(j7) / f7, e(j7) / f7);
    }

    public static final float b(long j7, long j8) {
        float fD = d(j7);
        float fD2 = d(j8);
        return (e(j8) * e(j7)) + (fD2 * fD);
    }

    public static final float c(long j7) {
        float fD = d(j7);
        float fD2 = d(j7);
        return (float) Math.sqrt((e(j7) * e(j7)) + (fD2 * fD));
    }

    public static final float d(long j7) {
        return Float.intBitsToFloat((int) (j7 >> 32));
    }

    public static final float e(long j7) {
        return Float.intBitsToFloat((int) (j7 & 4294967295L));
    }

    public static final long f(long j7, long j8) {
        return C3263b.a(d(j7) - d(j8), e(j7) - e(j8));
    }

    public static final long g(long j7, long j8) {
        float fD = d(j7);
        return C3263b.a(d(j8) + fD, e(j8) + e(j7));
    }

    public static final long h(float f7, long j7) {
        return C3263b.a(d(j7) * f7, e(j7) * f7);
    }
}
