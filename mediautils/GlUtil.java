package com.bilibili.mediautils;

import C0.d;
import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import androidx.annotation.RawRes;
import androidx.annotation.RequiresApi;
import com.bilibili.ad.adview.liveroom.answer.fragment.compont.category.Z;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediautils/GlUtil.class */
public class GlUtil {
    public static final int NO_TEXTURE = -1;
    private static final String TAG = "GlUtil";

    private GlUtil() {
    }

    public static void checkGlError(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError != 0) {
            StringBuilder sbA = d.a(str, ": glError 0x");
            sbA.append(Integer.toHexString(iGlGetError));
            BLog.e(TAG, sbA.toString());
        }
    }

    public static int createProgram(Context context, int i7, int i8) {
        return createProgram(readTextFromRawResource(context, i7), readTextFromRawResource(context, i8));
    }

    public static int createProgram(String str, String str2) {
        int iLoadShader;
        int iLoadShader2 = loadShader(35633, str);
        if (iLoadShader2 == 0 || (iLoadShader = loadShader(35632, str2)) == 0) {
            return 0;
        }
        int iGlCreateProgram = GLES20.glCreateProgram();
        checkGlError("glCreateProgram");
        if (iGlCreateProgram == 0) {
            BLog.e(TAG, "Could not create program");
        }
        GLES20.glAttachShader(iGlCreateProgram, iLoadShader2);
        checkGlError("glAttachShader");
        GLES20.glAttachShader(iGlCreateProgram, iLoadShader);
        checkGlError("glAttachShader");
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        int i7 = iGlCreateProgram;
        if (iArr[0] != 1) {
            BLog.e(TAG, "Could not link program: ");
            BLog.e(TAG, GLES20.glGetProgramInfoLog(iGlCreateProgram));
            GLES20.glDeleteProgram(iGlCreateProgram);
            i7 = 0;
        }
        GLES20.glDeleteShader(iLoadShader2);
        GLES20.glDeleteShader(iLoadShader);
        Z.b(iArr[0], TAG, new StringBuilder("linkStatus:"));
        return i7;
    }

    public static int gen2DTexture(int i7, int i8) {
        int[] iArr = new int[1];
        gen2DTexture(i7, i8, iArr);
        return iArr[0];
    }

    public static void gen2DTexture(int i7, int i8, int[] iArr) {
        int length = iArr.length;
        if (length > 0) {
            GLES20.glGenTextures(length, iArr, 0);
        }
        for (int i9 : iArr) {
            GLES20.glBindTexture(3553, i9);
            GLES20.glTexParameterf(3553, 10240, 9729.0f);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
            GLES20.glTexImage2D(3553, 0, 6408, i7, i8, 0, 6408, 5121, null);
            GLES20.glBindTexture(3553, 0);
        }
    }

    public static int genExternalOESTexture() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(36197, iArr[0]);
        GLES20.glTexParameterf(36197, 10241, 9729.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        GLES20.glBindTexture(36197, 0);
        return iArr[0];
    }

    public static int loadShader(int i7, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i7);
        checkGlError("glCreateShader type=" + i7);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        checkGlError("glCompileShader error");
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        int i8 = iGlCreateShader;
        if (iArr[0] == 0) {
            BLog.e(TAG, "Could not compile shader " + i7 + ":");
            StringBuilder sb = new StringBuilder(" ");
            sb.append(GLES20.glGetShaderInfoLog(iGlCreateShader));
            BLog.e(TAG, sb.toString());
            GLES20.glDeleteShader(iGlCreateShader);
            i8 = 0;
        }
        return i8;
    }

    public static int loadTexture(Bitmap bitmap, int i7) {
        if (bitmap == null || bitmap.getConfig() != Bitmap.Config.ARGB_8888) {
            return -1;
        }
        int[] iArr = new int[1];
        if (i7 == -1) {
            GLES20.glGenTextures(1, iArr, 0);
            GLES20.glBindTexture(3553, iArr[0]);
            GLES20.glTexParameterf(3553, 10240, 9729.0f);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
            GLUtils.texImage2D(3553, 0, bitmap, 0);
        } else {
            GLES20.glBindTexture(3553, i7);
            GLUtils.texImage2D(3553, 0, bitmap, 0);
            iArr[0] = i7;
        }
        return iArr[0];
    }

    public static int loadTexture(Buffer buffer, int i7, int i8, int i9) {
        if (buffer == null) {
            return -1;
        }
        int[] iArr = new int[1];
        if (i9 == -1) {
            GLES20.glGenTextures(1, iArr, 0);
            GLES20.glBindTexture(3553, iArr[0]);
            GLES20.glTexParameterf(3553, 10240, 9729.0f);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
            GLES20.glTexImage2D(3553, 0, 6408, i7, i8, 0, 6408, 5121, buffer);
        } else {
            GLES20.glBindTexture(3553, i9);
            GLES20.glTexImage2D(3553, 0, 6408, i7, i8, 0, 6408, 5121, buffer);
            iArr[0] = i9;
        }
        return iArr[0];
    }

    public static int loadTexture(Buffer buffer, int i7, int i8, int i9, int i10) {
        if (buffer == null) {
            return -1;
        }
        int[] iArr = new int[1];
        if (i9 == -1) {
            GLES20.glGenTextures(1, iArr, 0);
            GLES20.glBindTexture(3553, iArr[0]);
            GLES20.glTexParameterf(3553, 10240, 9729.0f);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
            GLES20.glTexImage2D(3553, 0, 6408, i7, i8, 0, 6408, i10, buffer);
        } else {
            GLES20.glBindTexture(3553, i9);
            GLES20.glTexSubImage2D(3553, 0, 0, 0, i7, i8, 6408, i10, buffer);
            iArr[0] = i9;
        }
        return iArr[0];
    }

    public static String readTextFromRawResource(Context context, @RawRes int i7) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().openRawResource(i7)));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line == null) {
                    return sb.toString();
                }
                sb.append(line);
                sb.append('\n');
            } catch (IOException e7) {
                return null;
            }
        }
    }

    @RequiresApi(api = 19)
    public static boolean writeTexture(String str, int i7, int i8, int i9, int i10) {
        int[] iArr = new int[1];
        if (i10 <= 0) {
            GLES20.glGenFramebuffers(1, iArr, 0);
            i10 = iArr[0];
        }
        GLES20.glBindFramebuffer(36160, i10);
        GLES20.glBindTexture(3553, i7);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i7, 0);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i8 * i9 * 4);
        GLES20.glReadPixels(0, 0, i8, i9, 6408, 5121, byteBufferAllocate);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i8, i9, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.copyPixelsFromBuffer(byteBufferAllocate);
        GLES20.glBindTexture(3553, 0);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
        GLES20.glBindFramebuffer(36160, 0);
        if (i10 > 0) {
            GLES20.glDeleteFramebuffers(1, iArr, 0);
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(str);
            try {
                bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                fileOutputStream.close();
            } finally {
            }
        } catch (IOException e7) {
            e7.printStackTrace();
        }
        bitmapCreateBitmap.recycle();
        return true;
    }
}
