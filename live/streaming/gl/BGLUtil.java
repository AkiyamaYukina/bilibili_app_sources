package com.bilibili.live.streaming.gl;

import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLES30;
import com.bilibili.live.streaming.gl.BGLException;
import com.bilibili.live.streaming.log.LivePusherLog;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/gl/BGLUtil.class */
public class BGLUtil {
    static final boolean $assertionsDisabled = false;
    static final String TAG = "BGLUtil";

    public static boolean LoadYUV420PTextures(int i7, int i8, ByteBuffer byteBuffer, BGLTexture[] bGLTextureArr) {
        return LoadYUV420PTexturesImpl(i7, i8, byteBuffer, bGLTextureArr, false);
    }

    public static boolean LoadYUV420PTextures(int i7, int i8, ByteBuffer byteBuffer, BGLTexture[] bGLTextureArr, int i9) throws Throwable {
        int i10 = (i7 + 1) / 2;
        int i11 = (i8 + 1) / 2;
        int i12 = i7 * i8;
        byteBuffer.rewind();
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(3317, IntBuffer.wrap(iArr));
        GLES20.glPixelStorei(3317, i9);
        try {
            bGLTextureArr[0].bind();
            byteBuffer.position(0);
            try {
                GLES30.glTexImage2D(3553, 0, 33321, i7, i8, 0, 6403, 5121, byteBuffer);
                bGLTextureArr[0].unbind();
                BGLException.ID id = BGLException.ID.TEXTURE_ERROR;
                logGLErrAndThrow("LoadYUV420PTextures", id, "fail to load Y channel");
                bGLTextureArr[1].bind();
                byteBuffer.position(i12);
                GLES30.glTexImage2D(3553, 0, 33321, i10, i11, 0, 6403, 5121, byteBuffer);
                bGLTextureArr[1].unbind();
                logGLErrAndThrow("LoadYUV420PTextures", id, "fail to load U channel");
                bGLTextureArr[2].bind();
                byteBuffer.position((i10 * i11) + i12);
                GLES30.glTexImage2D(3553, 0, 33321, i10, i11, 0, 6403, 5121, byteBuffer);
                bGLTextureArr[2].unbind();
                logGLErrAndThrow("LoadYUV420PTextures", id, "fail to load V channel");
                GLES20.glPixelStorei(3317, iArr[0]);
                return true;
            } catch (BGLException e7) {
                GLES20.glPixelStorei(3317, iArr[0]);
                return false;
            } catch (Throwable th) {
                th = th;
                GLES20.glPixelStorei(3317, iArr[0]);
                throw th;
            }
        } catch (BGLException e8) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static boolean LoadYUV420PTexturesImpl(int i7, int i8, ByteBuffer byteBuffer, BGLTexture[] bGLTextureArr, boolean z6) {
        int i9 = (i7 + 1) / 2;
        int i10 = (i8 + 1) / 2;
        int i11 = i7 * i8;
        byteBuffer.rewind();
        try {
            bGLTextureArr[0].bind();
            byteBuffer.position(0);
            try {
                if (z6) {
                    GLES30.glTexSubImage2D(3553, 0, 0, 0, i7, i8, 6403, 5121, byteBuffer);
                } else {
                    GLES30.glTexImage2D(3553, 0, 33321, i7, i8, 0, 6403, 5121, byteBuffer);
                }
                bGLTextureArr[0].unbind();
                BGLException.ID id = BGLException.ID.TEXTURE_ERROR;
                logGLErrAndThrow("LoadYUV420PTextures", id, "fail to load Y channel");
                bGLTextureArr[1].bind();
                byteBuffer.position(i11);
                if (z6) {
                    GLES30.glTexSubImage2D(3553, 0, 0, 0, i9, i10, 6403, 5121, byteBuffer);
                } else {
                    GLES30.glTexImage2D(3553, 0, 33321, i9, i10, 0, 6403, 5121, byteBuffer);
                }
                bGLTextureArr[1].unbind();
                logGLErrAndThrow("LoadYUV420PTextures", id, "fail to load U channel");
                bGLTextureArr[2].bind();
                byteBuffer.position((i9 * i10) + i11);
                if (z6) {
                    GLES30.glTexSubImage2D(3553, 0, 0, 0, i9, i10, 6403, 5121, byteBuffer);
                } else {
                    GLES30.glTexImage2D(3553, 0, 33321, i9, i10, 0, 6403, 5121, byteBuffer);
                }
                bGLTextureArr[2].unbind();
                logGLErrAndThrow("LoadYUV420PTextures", id, "fail to load V channel");
                return true;
            } catch (BGLException e7) {
                return false;
            }
        } catch (BGLException e8) {
            return false;
        }
    }

    public static boolean ReloadYUV420PTextures(int i7, int i8, ByteBuffer byteBuffer, BGLTexture[] bGLTextureArr) {
        return LoadYUV420PTexturesImpl(i7, i8, byteBuffer, bGLTextureArr, true);
    }

    public static void clear() throws BGLException {
        clear(0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
    }

    public static void clear(float f7, float f8, float f9, float f10, float f11) throws BGLException {
        GLES20.glClearColor(f7, f8, f9, f10);
        GLES20.glClearDepthf(f11);
        GLES20.glClear(16640);
        logGLErrAndThrow(TAG, BGLException.ID.GL_INSTRUMENT, "glClear");
    }

    public static void clearErrors() {
        while (GLES20.glGetError() != 0) {
        }
        while (EGL14.eglGetError() != 12288) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void doDummyRender(int r4, int r5) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.live.streaming.gl.BGLUtil.doDummyRender(int, int):void");
    }

    public static native void glReadPixels(int i7, int i8, int i9, int i10, int i11, int i12, long j7);

    public static void logAndThrow(String str, BGLException.ID id, String str2) throws BGLException {
        logAndThrow(str, true, id, str2);
    }

    public static void logAndThrow(String str, boolean z6, BGLException.ID id, String str2) throws BGLException {
        if (z6) {
            BGLException bGLException = new BGLException(id, str2);
            LivePusherLog.e(str, "Exception: ", bGLException);
            throw bGLException;
        }
    }

    public static void logEGLErrAndThrow(String str, BGLException.ID id, String str2) throws BGLException {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            return;
        }
        BGLException bGLException = new BGLException(id, str2, 0, iEglGetError);
        LivePusherLog.e(str, "Exception: ", bGLException);
        throw bGLException;
    }

    public static void logGLErrAndThrow(String str, BGLException.ID id, String str2) throws BGLException {
        int iGlGetError = GLES20.glGetError();
        int iEglGetError = EGL14.eglGetError();
        if (iGlGetError == 0 && iEglGetError == 12288) {
            return;
        }
        BGLException bGLException = new BGLException(id, str2, iGlGetError, iEglGetError);
        LivePusherLog.e(str, "Exception: ", bGLException);
        throw bGLException;
    }

    public static BGLMatrix matrixTranspose(BGLMatrix bGLMatrix) {
        if (bGLMatrix == null) {
            return null;
        }
        BGLMatrix bGLMatrixCreate = BGLMatrix.create();
        float[] fArrData = bGLMatrix.data();
        float[] fArrData2 = bGLMatrixCreate.data();
        for (int i7 = 0; i7 < 4; i7++) {
            for (int i8 = 0; i8 < 4; i8++) {
                fArrData2[(i8 * 4) + i7] = fArrData[(i7 * 4) + i8];
            }
        }
        return bGLMatrixCreate;
    }

    public static float[] rectToScissor(float f7, float f8, float f9, float f10, float f11, float f12) {
        return new float[]{((f9 * 2.0f) / f7) - 1.0f, (((f9 + f11) * 2.0f) / f7) - 1.0f, ((f10 * 2.0f) / f8) - 1.0f, (((f10 + f12) * 2.0f) / f8) - 1.0f};
    }

    public static void setTexture(int i7, BGLTexture bGLTexture, int i8) throws BGLException {
        GLES20.glActiveTexture(33984 + i7);
        if (bGLTexture != null) {
            bGLTexture.bind();
        }
        GLES20.glUniform1i(i8, i7);
    }

    public static void unbindTextureSlot(int i7, BGLTexture bGLTexture) throws BGLException {
        GLES20.glActiveTexture(i7 + 33984);
        GLES20.glBindTexture(bGLTexture.getTexTarget().intValue(), 0);
        logGLErrAndThrow(TAG, BGLException.ID.TEXTURE_ERROR, "unbindTextureSlot, target: " + bGLTexture.getTexTarget());
    }

    @Deprecated
    public static BGLMatrix uvTransToFitRect(float f7, float f8) {
        float f9;
        float f10;
        float f11;
        BGLMatrix bGLMatrixCreate = BGLMatrix.create();
        float f12 = 0.0f;
        if (f8 > f7) {
            f11 = (f8 / f7) / 1.0f;
            f10 = 1.0f - (1.0f / f11);
            f9 = 1.0f;
        } else {
            f9 = (f7 * 1.0f) / f8;
            f10 = 0.0f;
            f12 = 1.0f - (1.0f / f9);
            f11 = 1.0f;
        }
        bGLMatrixCreate.doScale(1.0f / f9, 1.0f / f11);
        bGLMatrixCreate.doTranslate(f12 / 2.0f, f10 / 2.0f);
        return bGLMatrixCreate;
    }

    public static BGLMatrix vTransToFitRect(float f7, float f8, Float f9, float f10, float f11, float f12, float f13, int i7) {
        return vTransToFitRect(f7, f8, f9, f10, f11, f12, f13, i7, 0.0f, 0.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.bilibili.live.streaming.gl.BGLMatrix vTransToFitRect(float r5, float r6, java.lang.Float r7, float r8, float r9, float r10, float r11, int r12, float r13, float r14) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.live.streaming.gl.BGLUtil.vTransToFitRect(float, float, java.lang.Float, float, float, float, float, int, float, float):com.bilibili.live.streaming.gl.BGLMatrix");
    }
}
