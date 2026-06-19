package com.bilibili.montage.mediacodec;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import r2.C8509b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/mediacodec/GlUtil.class */
public class GlUtil {
    private GlUtil() {
    }

    public static void checkNoGLES2Error(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError != 0) {
            throw new RuntimeException(C8509b.a(iGlGetError, str, ": GLES20 error: "));
        }
    }

    public static FloatBuffer createFloatBuffer(float[] fArr) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArr);
        floatBufferAsFloatBuffer.position(0);
        return floatBufferAsFloatBuffer;
    }

    public static int generateTexture(int i7, int i8, int i9) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i10 = iArr[0];
        GLES20.glBindTexture(i7, i10);
        GLES20.glTexParameterf(i7, 10241, 9729.0f);
        GLES20.glTexParameterf(i7, 10240, 9729.0f);
        GLES20.glTexParameterf(i7, 10242, 33071.0f);
        GLES20.glTexParameterf(i7, 10243, 33071.0f);
        GLES20.glTexImage2D(i7, 0, 6408, i8, i9, 0, 6408, 5121, null);
        GLES20.glBindTexture(i7, 0);
        checkNoGLES2Error("generateTexture");
        return i10;
    }
}
