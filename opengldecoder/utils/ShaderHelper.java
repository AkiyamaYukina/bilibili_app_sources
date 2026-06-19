package com.bilibili.opengldecoder.utils;

import android.opengl.GLES20;
import android.util.Log;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opengldecoder/utils/ShaderHelper.class */
public class ShaderHelper {
    public static final String FRAGMENT_SHADER = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nuniform samplerExternalOES texture;\nvarying vec2 v_TexCoordinate;\n\nvoid main()\n{\n\tgl_FragColor = texture2D(texture, v_TexCoordinate);\n}";
    private static final String TAG = "ShaderHelper";
    public static final String VERTEX_SHADER = "attribute vec4 vPosition;\nattribute vec4 vTexCoordinate;\nuniform mat4 textureTransform;\nvarying vec2 v_TexCoordinate;\n\nvoid main()\n{\n\tv_TexCoordinate = (textureTransform * vTexCoordinate).xy;\n\tgl_Position = vPosition;\n}";

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
                Log.e(TAG, "Error compiling shader: " + GLES20.glGetShaderInfoLog(iGlCreateShader));
                GLES20.glDeleteShader(iGlCreateShader);
                i8 = 0;
            }
        }
        return i8;
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
                Log.e(TAG, "Error compiling program: " + GLES20.glGetProgramInfoLog(iGlCreateProgram));
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
