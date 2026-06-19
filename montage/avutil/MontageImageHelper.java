package com.bilibili.montage.avutil;

import G.p;
import android.graphics.Bitmap;
import android.media.ExifInterface;
import android.opengl.GLES20;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/avutil/MontageImageHelper.class */
public class MontageImageHelper {
    private static final String TAG = "MontageImageHelper";

    public static Bitmap createBitmapFromByteBuffer(ByteBuffer byteBuffer, int i7, int i8) {
        if (byteBuffer == null || i7 <= 0 || i8 <= 0) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i7, i8, Bitmap.Config.ARGB_8888);
        byteBuffer.rewind();
        bitmapCreateBitmap.copyPixelsFromBuffer(byteBuffer);
        return bitmapCreateBitmap;
    }

    public static Bitmap createBitmapFromTexture(int i7, int i8, int i9) {
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        GLES20.glBindFramebuffer(36160, iArr[0]);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i8 * i9 * 4);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i7, 0);
        GLES20.glReadPixels(0, 0, i8, i9, 6408, 5121, byteBufferAllocateDirect);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i8, i9, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.copyPixelsFromBuffer(byteBufferAllocateDirect);
        return bitmapCreateBitmap;
    }

    public static int getImageOrientationRotate(String str) {
        if (TextUtils.isEmpty(str)) {
            return 1;
        }
        try {
            return new ExifInterface(str).getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 1);
        } catch (Exception e7) {
            e7.printStackTrace();
            return 1;
        }
    }

    public static int getImgRotate(String str) {
        int i7 = 0;
        try {
            int attributeInt = new ExifInterface(str).getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 1);
            if (attributeInt == 3) {
                i7 = 180;
            } else if (attributeInt == 6) {
                i7 = 90;
            } else if (attributeInt == 8) {
                i7 = 270;
            }
        } catch (Exception e7) {
            e7.printStackTrace();
        }
        return i7;
    }

    public static boolean saveBitmap(Bitmap bitmap, String str, String str2, int i7) throws Throwable {
        FileOutputStream fileOutputStream;
        boolean z6;
        if (bitmap == null || bitmap.isRecycled() || TextUtils.isEmpty(str)) {
            return false;
        }
        File file = new File(str);
        if (!file.exists() && file.mkdirs()) {
            return false;
        }
        String str3 = File.separator;
        String strA = str;
        if (!str.endsWith(str3)) {
            strA = p.a(str, str3);
        }
        File file2 = new File(p.a(strA, str2));
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                file2.createNewFile();
                fileOutputStream2 = null;
                FileOutputStream fileOutputStream3 = new FileOutputStream(file2);
                try {
                    bitmap.compress(Bitmap.CompressFormat.PNG, i7, fileOutputStream3);
                    try {
                        fileOutputStream3.close();
                    } catch (IOException e7) {
                        e7.printStackTrace();
                    }
                    z6 = true;
                } catch (IOException e8) {
                    e = e8;
                    fileOutputStream = fileOutputStream3;
                    fileOutputStream2 = fileOutputStream;
                    e.printStackTrace();
                    z6 = false;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                            z6 = false;
                        } catch (IOException e9) {
                            e9.printStackTrace();
                            z6 = false;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream2 = fileOutputStream3;
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                        } catch (IOException e10) {
                            e10.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (IOException e11) {
                e = e11;
                fileOutputStream = null;
            }
            return z6;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
