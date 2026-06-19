package com.bilibili.mediacore.mediacodec;

import android.opengl.GLES20;
import androidx.annotation.Keep;
import com.bilibili.mediacore.avutil.LogSinker;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediacore/mediacodec/ShaderHelper.class */
@Keep
public class ShaderHelper {
    private static final String TAG = "ShaderHelper";

    public static int compileShader(int i7, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i7);
        int i8 = iGlCreateShader;
        if (iGlCreateShader != 0) {
            GLES20.glShaderSource(iGlCreateShader, str);
            GLES20.glCompileShader(iGlCreateShader);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
            i8 = iGlCreateShader;
            if (iArr[0] == 0) {
                LogSinker.e(TAG, "Error compiling shader: " + GLES20.glGetShaderInfoLog(iGlCreateShader));
                GLES20.glDeleteShader(iGlCreateShader);
                i8 = 0;
            }
        }
        if (i8 != 0) {
            return i8;
        }
        throw new RuntimeException("Error creating shader.");
    }

    public static int createAndLinkProgram(int i7, int i8, String[] strArr) {
        int iGlCreateProgram = GLES20.glCreateProgram();
        int i9 = iGlCreateProgram;
        if (iGlCreateProgram != 0) {
            GLES20.glAttachShader(iGlCreateProgram, i7);
            GLES20.glAttachShader(iGlCreateProgram, i8);
            if (strArr != null) {
                int length = strArr.length;
                for (int i10 = 0; i10 < length; i10++) {
                    GLES20.glBindAttribLocation(iGlCreateProgram, i10, strArr[i10]);
                }
            }
            GLES20.glLinkProgram(iGlCreateProgram);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
            i9 = iGlCreateProgram;
            if (iArr[0] == 0) {
                LogSinker.e(TAG, "Error compiling program: " + GLES20.glGetProgramInfoLog(iGlCreateProgram));
                GLES20.glDeleteProgram(iGlCreateProgram);
                i9 = 0;
            }
        }
        if (i9 != 0) {
            return i9;
        }
        throw new RuntimeException("Error creating program.");
    }
}
