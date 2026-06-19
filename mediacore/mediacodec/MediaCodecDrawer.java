package com.bilibili.mediacore.mediacodec;

import C0.d;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import androidx.annotation.Keep;
import com.bilibili.mediacore.avutil.LogSinker;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediacore/mediacodec/MediaCodecDrawer.class */
@Keep
public class MediaCodecDrawer {
    private static final int FLOAT_SIZE_BYTES = 4;
    private static final String TAG = "MediaCodecDrawer";
    private static final int TRIANGLE_VERTICES_DATA_POS_OFFSET = 0;
    private static final int TRIANGLE_VERTICES_DATA_STRIDE_BYTES = 16;
    private static final int TRIANGLE_VERTICES_DATA_UV_OFFSET = 2;
    private static final float[] sTriangleVerticesData = {-1.0f, -1.0f, 0.0f, 1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f};
    private final int[] mFrameBuffers;
    private int muSTMatrixHandle;
    private int shaderProgram;
    private FloatBuffer triangleVerticesBuffer;
    private int maTextureHandle = 0;
    private int maPositionHandle = 0;

    public MediaCodecDrawer() {
        int[] iArr = new int[1];
        this.mFrameBuffers = iArr;
        GLES20.glGenFramebuffers(1, iArr, 0);
        setupGraphics();
    }

    private void checkGlError(String str) {
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                return;
            }
            String str2 = TAG;
            StringBuilder sbA = d.a(str, ": glError ");
            sbA.append(GLUtils.getEGLErrorString(iGlGetError));
            LogSinker.e(str2, sbA.toString());
        }
    }

    private void setupGraphics() {
        this.shaderProgram = ShaderHelper.createAndLinkProgram(ShaderHelper.compileShader(35633, "uniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = aPosition;\n    vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}"), ShaderHelper.compileShader(35632, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}"), new String[]{"aPosition", "aTextureCoord", "uMVPMatrix", "uSTMatrix"});
        float[] fArr = sTriangleVerticesData;
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.triangleVerticesBuffer = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArr).position(0);
        this.maPositionHandle = GLES20.glGetAttribLocation(this.shaderProgram, "aPosition");
        this.maTextureHandle = GLES20.glGetAttribLocation(this.shaderProgram, "aTextureCoord");
        this.muSTMatrixHandle = GLES20.glGetUniformLocation(this.shaderProgram, "uSTMatrix");
        LogSinker.i(TAG, "setupGraphics: maPositionHandle " + this.maPositionHandle + ", maTextureHandle " + this.maTextureHandle + ", muSTMatrixHandle " + this.muSTMatrixHandle);
    }

    public void drawTexture(int i7, int i8, float[] fArr, int i9, int i10) {
        GLES20.glBindFramebuffer(36160, this.mFrameBuffers[0]);
        checkGlError("glBindFramebuffer");
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i7, 0);
        int iGlCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (iGlCheckFramebufferStatus != 36053) {
            LogSinker.e(TAG, "bind frame buffer error code: " + iGlCheckFramebufferStatus);
        }
        checkGlError("glBindFramebuffer finish");
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16640);
        checkGlError("glClear");
        GLES20.glViewport(0, 0, i9, i10);
        checkGlError("glViewport");
        GLES20.glUseProgram(this.shaderProgram);
        checkGlError("glUseProgram");
        this.triangleVerticesBuffer.position(0);
        GLES20.glEnableVertexAttribArray(this.maPositionHandle);
        GLES20.glVertexAttribPointer(this.maPositionHandle, 3, 5126, false, 16, (Buffer) this.triangleVerticesBuffer);
        checkGlError("glVertexAttribPointer maPosition");
        this.triangleVerticesBuffer.position(2);
        GLES20.glEnableVertexAttribArray(this.maTextureHandle);
        GLES20.glVertexAttribPointer(this.maTextureHandle, 3, 5126, false, 16, (Buffer) this.triangleVerticesBuffer);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i8);
        GLES20.glUniformMatrix4fv(this.muSTMatrixHandle, 1, false, fArr, 0);
        GLES20.glDrawArrays(5, 0, 4);
        checkGlError("glDrawArrays");
        GLES20.glBindTexture(36197, 0);
        GLES20.glDisableVertexAttribArray(this.maPositionHandle);
        GLES20.glDisableVertexAttribArray(this.maTextureHandle);
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glUseProgram(0);
        checkGlError("after disable");
    }

    public void release() {
        LogSinker.i(TAG, "release: ");
        int[] iArr = this.mFrameBuffers;
        if (iArr[0] != 0) {
            GLES20.glDeleteFramebuffers(1, iArr, 0);
            this.mFrameBuffers[0] = 0;
        }
        int i7 = this.shaderProgram;
        if (i7 > 0) {
            GLES20.glDeleteProgram(i7);
        }
    }
}
