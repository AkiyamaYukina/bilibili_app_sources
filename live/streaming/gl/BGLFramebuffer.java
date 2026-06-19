package com.bilibili.live.streaming.gl;

import android.opengl.GLES20;
import com.bilibili.live.streaming.gl.BGLException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/gl/BGLFramebuffer.class */
public class BGLFramebuffer {
    static final boolean $assertionsDisabled = false;
    static final String TAG = "BGLFramebuffer";
    int mHeight;
    boolean mIsF16;
    int mTextureId;
    int mWidth;
    Integer mFramebuffer = null;
    int[] mTmp = new int[1];

    private BGLFramebuffer() {
    }

    public static BGLFramebuffer create(BGLTexture bGLTexture, int i7, int i8, boolean z6) throws BGLException {
        BGLFramebuffer bGLFramebuffer = new BGLFramebuffer();
        bGLFramebuffer.create(bGLTexture.getTexId().intValue(), i7, i8, z6);
        return bGLFramebuffer;
    }

    private void create(int i7, int i8, int i9, boolean z6) throws BGLException {
        try {
            GLES20.glGenFramebuffers(1, this.mTmp, 0);
            BGLUtil.logGLErrAndThrow(TAG, BGLException.ID.TEXTURE_ERROR, "fail to generate framebuffer");
            this.mFramebuffer = Integer.valueOf(this.mTmp[0]);
            this.mWidth = i8;
            this.mHeight = i9;
            this.mTextureId = i7;
            this.mIsF16 = z6;
            setAsRenderTarget();
        } catch (BGLException e7) {
            destroyResources();
            throw e7;
        }
    }

    private void destroyResources() {
        Integer num = this.mFramebuffer;
        if (num != null) {
            this.mTmp[0] = num.intValue();
            GLES20.glDeleteFramebuffers(1, this.mTmp, 0);
            this.mFramebuffer = null;
        }
    }

    public void destroy() {
        destroyResources();
    }

    public void finalize() throws Throwable {
        super.finalize();
    }

    public ByteBuffer getPixels() throws BGLException {
        BGLCurrentState bGLCurrentStateFramebuffer = BGLCurrentState.save().framebuffer();
        try {
            setAsRenderTarget();
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(this.mWidth * this.mHeight * (this.mIsF16 ? 8 : 4)).order(ByteOrder.nativeOrder());
            byteBufferOrder.rewind();
            if (this.mIsF16) {
                GLES20.glReadPixels(0, 0, this.mWidth, this.mHeight, 6408, 5131, byteBufferOrder);
            } else {
                GLES20.glReadPixels(0, 0, this.mWidth, this.mHeight, 6408, 5121, byteBufferOrder);
            }
            byteBufferOrder.rewind();
            return byteBufferOrder;
        } finally {
            bGLCurrentStateFramebuffer.restore();
        }
    }

    public void setAsRenderTarget() throws BGLException {
        GLES20.glBindFramebuffer(36160, this.mFramebuffer.intValue());
        BGLException.ID id = BGLException.ID.TEXTURE_ERROR;
        BGLUtil.logGLErrAndThrow(TAG, id, "fail to bind framebuffer, frameBufferName: " + this.mFramebuffer);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.mTextureId, 0);
        BGLUtil.logGLErrAndThrow(TAG, id, "fail to bind texture to framebuffer");
        BGLUtil.logAndThrow(TAG, GLES20.glCheckFramebufferStatus(36160) != 36053, id, "framebuffer status error");
        GLES20.glViewport(0, 0, this.mWidth, this.mHeight);
        BGLUtil.logGLErrAndThrow(TAG, id, "fail to set viewport for texture framebuffer");
    }
}
