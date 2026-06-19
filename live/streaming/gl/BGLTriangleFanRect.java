package com.bilibili.live.streaming.gl;

import android.opengl.GLES20;
import com.bilibili.live.streaming.gl.BGLException;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/gl/BGLTriangleFanRect.class */
public class BGLTriangleFanRect {
    static final String TAG = "LIVEGL-BGLTriangleFanRect";
    BGLArrayBuffer mBuf;

    private BGLTriangleFanRect() {
    }

    public static BGLTriangleFanRect create() throws BGLException {
        BGLTriangleFanRect bGLTriangleFanRect = new BGLTriangleFanRect();
        try {
            bGLTriangleFanRect.mBuf = BGLArrayBuffer.create(new float[]{-1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 1.0f, -1.0f, -1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, -1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f});
            return bGLTriangleFanRect;
        } catch (BGLException e7) {
            bGLTriangleFanRect.destroy();
            throw e7;
        }
    }

    public void applyUV(int i7) throws BGLException {
        try {
            this.mBuf.bind();
            GLES20.glEnableVertexAttribArray(i7);
            BGLException.ID id = BGLException.ID.SHADER_ERROR;
            BGLUtil.logGLErrAndThrow(TAG, id, "applyUV.glEnableVertexAttribArray");
            GLES20.glVertexAttribPointer(i7, 4, 5126, false, 32, 16);
            BGLUtil.logGLErrAndThrow(TAG, id, "applyUV.glVertexAttribPointer");
        } finally {
            this.mBuf.unbind();
        }
    }

    public void applyVertex(int i7) throws BGLException {
        try {
            this.mBuf.bind();
            GLES20.glEnableVertexAttribArray(i7);
            BGLException.ID id = BGLException.ID.SHADER_ERROR;
            BGLUtil.logGLErrAndThrow(TAG, id, "applyVertex.glEnableVertexAttribArray");
            GLES20.glVertexAttribPointer(i7, 4, 5126, false, 32, 0);
            BGLUtil.logGLErrAndThrow(TAG, id, "applyVertex.glVertexAttribPointer");
        } finally {
            this.mBuf.unbind();
        }
    }

    public void destroy() {
        this.mBuf.destroy();
    }

    public void drawRect(float f7) throws BGLException {
        GLES20.glLineWidth(f7);
        BGLException.ID id = BGLException.ID.SHADER_ERROR;
        BGLUtil.logGLErrAndThrow(TAG, id, "drawRect.glLineWidth");
        GLES20.glDrawArrays(2, 0, 4);
        BGLUtil.logGLErrAndThrow(TAG, id, "drawRect.glDrawArrays");
    }

    public void fillRect() throws BGLException {
        GLES20.glDrawArrays(6, 0, 4);
        BGLUtil.logGLErrAndThrow(TAG, BGLException.ID.SHADER_ERROR, "fillRect.glDrawArrays");
    }
}
