package com.bilibili.studio.videoeditor.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.exifinterface.media.ExifInterface;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.view.BiliImageView;
import java.io.IOException;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/util/K.class */
public final class K {
    public static Bitmap a(Drawable drawable, int i7, int i8) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i7, i8, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, i7, i8);
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    public static Bitmap b(Bitmap bitmap) {
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            return bitmap;
        }
        Bitmap bitmapCopy = bitmap.copy(config, false);
        int width = bitmapCopy.getWidth();
        int height = bitmapCopy.getHeight();
        int iMin = Math.min(width, height);
        return Bitmap.createBitmap(bitmapCopy, (width - iMin) / 2, (height - iMin) / 2, iMin, iMin, (Matrix) null, false);
    }

    public static int c(String str) {
        if (TextUtils.isEmpty(str)) {
            return 1;
        }
        try {
            return new ExifInterface(str).getAttributeInt(ExifInterface.TAG_ORIENTATION, 1);
        } catch (IOException e7) {
            e7.printStackTrace();
            return 1;
        }
    }

    public static String d(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            return options.outWidth + ":" + options.outHeight;
        } catch (Exception e7) {
            e7.printStackTrace();
            return "";
        }
    }

    public static void e(@NonNull BiliImageView biliImageView, @NonNull String str) {
        BiliImageLoader.INSTANCE.with(biliImageView.getContext()).uri(Uri.parse(str)).enableAutoPlayAnimation(true).into(biliImageView);
    }

    @Nullable
    public static Bitmap f(int i7, Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(i7 != 3 ? i7 != 6 ? i7 != 8 ? 0.0f : 270.0f : 90.0f : 180.0f);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0108 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean g(android.graphics.Bitmap r5, java.lang.String r6, java.lang.String r7, boolean r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.util.K.g(android.graphics.Bitmap, java.lang.String, java.lang.String, boolean):boolean");
    }
}
