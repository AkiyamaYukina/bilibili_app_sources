package com.bilibili.mediautils;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediautils/ImageUtil.class */
public class ImageUtil {
    public static void yuv420ToYuv420sp(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i7, int i8) {
        int i9 = 0;
        System.arraycopy(bArr, 0, bArr4, 0, bArr.length);
        int length = bArr.length;
        int length2 = bArr2.length;
        int length3 = bArr3.length;
        int i10 = i7 * i8;
        int i11 = 0;
        while (i10 < length + length2 + length3) {
            bArr4[i10] = bArr3[i9];
            i10++;
            bArr4[i10] = bArr2[i11];
            i11++;
            i9++;
        }
    }

    public static void yuv422ToYuv420sp(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i7, int i8) {
        int i9 = 0;
        System.arraycopy(bArr, 0, bArr4, 0, bArr.length);
        int length = bArr.length;
        int length2 = bArr2.length / 2;
        int length3 = bArr3.length / 2;
        int i10 = 0;
        for (int i11 = i7 * i8; i11 < length3 + length2 + length; i11 += 2) {
            bArr4[i11] = bArr3[i9];
            bArr4[i11 + 1] = bArr2[i10];
            i9 += 2;
            i10 += 2;
        }
    }
}
