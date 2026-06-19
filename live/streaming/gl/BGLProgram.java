package com.bilibili.live.streaming.gl;

import android.opengl.GLES20;
import android.opengl.GLES31;
import com.bilibili.live.streaming.gl.BGLException;
import java.util.HashMap;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/gl/BGLProgram.class */
public class BGLProgram {
    static final boolean $assertionsDisabled = false;
    static final String TAG = "LIVEGL-BGLProgram";
    String mComputeShaderSource;
    String mFragmentShaderSource;
    String mVertexShaderSource;
    int mProgram = 0;
    HashMap<String, Integer> mAttrVarToLoc = new HashMap<>();
    HashMap<String, Integer> mUniVarToLoc = new HashMap<>();
    boolean mIsComputeShader = false;

    private BGLProgram() {
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void buildComputeProgram() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.live.streaming.gl.BGLProgram.buildComputeProgram():void");
    }

    private void buildRenderProgram() throws Throwable {
        int i7;
        int iCompileShader;
        int i8;
        int i9;
        int iCompileShader2;
        int iGlCreateProgram;
        boolean z6;
        int i10 = 0;
        try {
            try {
                iCompileShader = compileShader(35633, this.mVertexShaderSource);
                try {
                    iCompileShader2 = compileShader(35632, this.mFragmentShaderSource);
                    try {
                        iGlCreateProgram = GLES20.glCreateProgram();
                        z6 = iGlCreateProgram < 0;
                    } catch (BGLException e7) {
                        e = e7;
                        i8 = iCompileShader;
                        i9 = iCompileShader2;
                    }
                } catch (BGLException e8) {
                    e = e8;
                    i8 = iCompileShader;
                    i9 = 0;
                } catch (Throwable th) {
                    th = th;
                    i7 = 0;
                    if (iCompileShader != 0) {
                        GLES20.glDeleteShader(iCompileShader);
                    }
                    if (i7 != 0) {
                        GLES20.glDeleteShader(i7);
                    }
                    throw th;
                }
            } catch (BGLException e9) {
                e = e9;
                i8 = 0;
                i9 = 0;
            } catch (Throwable th2) {
                th = th2;
                i7 = 0;
                iCompileShader = 0;
            }
            try {
                BGLException.ID id = BGLException.ID.SHADER_ERROR;
                BGLUtil.logAndThrow(TAG, z6, id, "compile: fail to createEGLContext GL program");
                GLES20.glAttachShader(iGlCreateProgram, iCompileShader);
                GLES20.glAttachShader(iGlCreateProgram, iCompileShader2);
                GLES20.glLinkProgram(iGlCreateProgram);
                int[] iArr = new int[1];
                GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
                boolean z7 = false;
                if (iArr[0] == 0) {
                    z7 = true;
                }
                String strGlGetProgramInfoLog = GLES20.glGetProgramInfoLog(iGlCreateProgram);
                StringBuilder sb = new StringBuilder("compile: fail to link program, ");
                sb.append(strGlGetProgramInfoLog);
                BGLUtil.logAndThrow(TAG, z7, id, sb.toString());
                this.mProgram = iGlCreateProgram;
                if (iCompileShader != 0) {
                    GLES20.glDeleteShader(iCompileShader);
                }
                if (iCompileShader2 != 0) {
                    GLES20.glDeleteShader(iCompileShader2);
                }
            } catch (BGLException e10) {
                e = e10;
                i10 = iGlCreateProgram;
                i8 = iCompileShader;
                i9 = iCompileShader2;
                if (i10 != 0) {
                    GLES20.glDeleteProgram(i10);
                }
                throw e;
            }
        } catch (Throwable th3) {
            th = th3;
            iCompileShader = 0;
        }
    }

    private void checkProgram() throws Throwable {
        if (this.mProgram == 0) {
            build();
        }
        BGLUtil.logAndThrow(TAG, this.mProgram == 0, BGLException.ID.SHADER_ERROR, "");
    }

    public static BGLProgram compile(String str, String str2) throws BGLException {
        BGLProgram bGLProgram = new BGLProgram();
        bGLProgram.mVertexShaderSource = str;
        bGLProgram.mFragmentShaderSource = str2;
        bGLProgram.mIsComputeShader = false;
        return bGLProgram;
    }

    public static BGLProgram compileCompute(String str) throws BGLException {
        BGLProgram bGLProgram = new BGLProgram();
        bGLProgram.mComputeShaderSource = str;
        bGLProgram.mIsComputeShader = true;
        return bGLProgram;
    }

    private static int compileShader(int i7, String str) throws BGLException {
        int iGlCreateShader = GLES20.glCreateShader(i7);
        boolean z6 = iGlCreateShader <= 0;
        BGLException.ID id = BGLException.ID.SHADER_ERROR;
        BGLUtil.logAndThrow(TAG, z6, id, "compileShader: createEGLContext shader failed");
        try {
            GLES20.glShaderSource(iGlCreateShader, str);
            GLES20.glCompileShader(iGlCreateShader);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
            int i8 = iArr[0];
            if (i8 == 0) {
                boolean z7 = i8 == 0;
                BGLUtil.logAndThrow(TAG, z7, id, "compile shader error: " + GLES20.glGetShaderInfoLog(iGlCreateShader));
            }
            return iGlCreateShader;
        } catch (BGLException e7) {
            if (iGlCreateShader >= 0) {
                GLES20.glDeleteShader(iGlCreateShader);
            }
            throw e7;
        }
    }

    public void build() throws Throwable {
        if (this.mIsComputeShader) {
            buildComputeProgram();
        } else {
            buildRenderProgram();
        }
    }

    public void destroy() {
        int i7 = this.mProgram;
        if (i7 != 0) {
            GLES20.glDeleteProgram(i7);
            this.mProgram = 0;
        }
    }

    public void dispatch(int i7, int i8, int i9) throws Throwable {
        BGLUtil.logAndThrow(TAG, !this.mIsComputeShader, BGLException.ID.SHADER_ERROR, "dispatch: not a compute shader");
        checkProgram();
        GLES31.glDispatchCompute(i7, i8, i9);
    }

    public void finalize() throws Throwable {
        super.finalize();
    }

    public int getAttrParam(String str) throws Throwable {
        Integer num = this.mAttrVarToLoc.get(str);
        Integer numValueOf = num;
        if (num == null) {
            checkProgram();
            int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.mProgram, str);
            numValueOf = Integer.valueOf(iGlGetAttribLocation);
            BGLUtil.logAndThrow(TAG, iGlGetAttribLocation < 0, BGLException.ID.SHADER_ERROR, android.support.v4.media.a.a("getAttrParam: ", str, " not found"));
            this.mAttrVarToLoc.put(str, numValueOf);
        }
        return numValueOf.intValue();
    }

    public int getUniParam(String str) throws BGLException {
        Integer num = this.mUniVarToLoc.get(str);
        Integer numValueOf = num;
        if (num == null) {
            checkProgram();
            int iGlGetUniformLocation = GLES20.glGetUniformLocation(this.mProgram, str);
            numValueOf = Integer.valueOf(iGlGetUniformLocation);
            BGLUtil.logAndThrow(TAG, iGlGetUniformLocation < 0, BGLException.ID.SHADER_ERROR, android.support.v4.media.a.a("getUniParam: ", str, " not found"));
            this.mUniVarToLoc.put(str, numValueOf);
        }
        return numValueOf.intValue();
    }

    public void memoryBarrier(int i7) {
        GLES31.glMemoryBarrier(i7);
    }

    public void unuse() {
        GLES20.glUseProgram(0);
    }

    public void use() throws BGLException {
        checkProgram();
        GLES20.glUseProgram(this.mProgram);
    }
}
