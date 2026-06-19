package com.bilibili.playerbizcommonv2.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Pair;

/* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.utils.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/utils/b.class */
@StabilityInferred(parameters = 1)
public final class C5801b {
    public static Bitmap a(int i7, int i8, int i9, String str) {
        int i10;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        if ((i9 & 4) != 0) {
            i7 = 0;
        }
        if ((i9 & 8) != 0) {
            i8 = 0;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = config;
        if (i7 == 0 && i8 == 0) {
            i10 = 1;
        } else {
            new BitmapFactory.Options().inJustDecodeBounds = true;
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str);
            Pair pair = bitmapDecodeFile == null ? new Pair(0, 0) : new Pair(Integer.valueOf(bitmapDecodeFile.getWidth()), Integer.valueOf(bitmapDecodeFile.getHeight()));
            int iIntValue = ((Number) pair.component1()).intValue();
            int iIntValue2 = ((Number) pair.component2()).intValue();
            if (i7 <= 0 || iIntValue <= 0) {
                i10 = 1;
                if (iIntValue2 > 0) {
                    i10 = iIntValue2 / i8;
                }
            } else {
                i10 = iIntValue / i7;
            }
        }
        options.inSampleSize = i10;
        return BitmapFactory.decodeFile(str, options);
    }
}
