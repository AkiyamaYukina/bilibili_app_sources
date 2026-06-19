package com.bilibili.mediacore.utils;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import androidx.annotation.Keep;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediacore/utils/PlatformUtils.class */
@Keep
public class PlatformUtils {
    public static void textureDump(int i7, int i8, int i9) {
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        GLES20.glGetIntegerv(36006, iArr, 0);
        GLES20.glGenFramebuffers(1, iArr2, 0);
        GLES20.glBindFramebuffer(36160, iArr2[0]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i7, 0);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i8 * i9 * 4);
        GLES20.glReadPixels(0, 0, i8, i9, 6408, 5121, byteBufferAllocate);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i8, i9, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.copyPixelsFromBuffer(byteBufferAllocate);
        GLES20.glBindFramebuffer(36160, iArr[0]);
        GLES20.glDeleteFramebuffers(1, iArr2, 0);
        bitmapCreateBitmap.recycle();
    }
}
