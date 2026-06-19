package com.bilibili.live.streaming.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import androidx.compose.ui.graphics.colorspace.C4369c;
import com.bilibili.live.streaming.gl.BGLTexture;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/utils/ImageUtilsKt.class */
public final class ImageUtilsKt {
    @Nullable
    public static final Bitmap loadBitmapFromString(@NotNull String str) {
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str);
        Bitmap bitmap = bitmapDecodeFile;
        if (bitmapDecodeFile == null) {
            bitmap = null;
        }
        return bitmap;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cb  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.bilibili.live.streaming.gl.BGLTexture loadImageTexture(@org.jetbrains.annotations.Nullable android.graphics.Bitmap r6) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.live.streaming.utils.ImageUtilsKt.loadImageTexture(android.graphics.Bitmap):com.bilibili.live.streaming.gl.BGLTexture");
    }

    @Nullable
    public static final BGLTexture loadImageTexture(@NotNull String str) {
        Bitmap bitmapLoadBitmapFromString = loadBitmapFromString(str);
        if (bitmapLoadBitmapFromString == null) {
            return null;
        }
        return loadImageTexture(bitmapLoadBitmapFromString);
    }

    @NotNull
    public static final Bitmap zoomImgIfLarge(@NotNull Bitmap bitmap, int i7, int i8) {
        float fMin;
        int i9;
        int i10;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float f7 = width;
        float f8 = height;
        float f9 = f7 / f8;
        float f10 = i7;
        float f11 = i8;
        float f12 = f10 / f11;
        if (i7 <= bitmap.getWidth() || i8 <= bitmap.getHeight()) {
            fMin = Math.min(f10 / f7, f11 / f8);
            i9 = i7;
            i10 = i8;
        } else {
            fMin = 1.0f;
            if (f9 > f12) {
                i10 = (int) (f7 / f12);
                i9 = width;
            } else {
                i9 = (int) (f12 * f8);
                i10 = height;
            }
        }
        float f13 = 2;
        float f14 = (i9 - (f7 * fMin)) / f13;
        float fA = C4369c.a(f8, fMin, i10, f13);
        Matrix matrix = new Matrix();
        matrix.postScale(fMin, fMin);
        matrix.postTranslate(f14, fA);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i9, i10, Bitmap.Config.ARGB_8888);
        new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, matrix, new Paint(3));
        return bitmapCreateBitmap;
    }
}
