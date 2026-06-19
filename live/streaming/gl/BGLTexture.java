package com.bilibili.live.streaming.gl;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.opengl.GLES31;
import android.opengl.GLUtils;
import com.bilibili.live.streaming.gl.BGLException;
import com.bilibili.live.streaming.log.LivePusherLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/gl/BGLTexture.class */
public class BGLTexture {
    static final boolean $assertionsDisabled = false;
    private static String TAG = "LIVEGL-BGLTexture";
    private long mGlSync;
    private int mHeight;
    private Integer mTexTarget;
    private int mWidth;
    private int[] mTmp = new int[1];
    private Integer mTexName = null;
    private boolean mSizeTrusted = false;

    private BGLTexture() {
    }

    private void attach(int i7, int i8) {
        this.mTexName = Integer.valueOf(i8);
        this.mTexTarget = Integer.valueOf(i7);
        this.mSizeTrusted = false;
    }

    public static BGLTexture attachTex2D(int i7) throws BGLException {
        BGLTexture bGLTexture = new BGLTexture();
        bGLTexture.attach(3553, i7);
        return bGLTexture;
    }

    private void create(int i7) throws BGLException {
        this.mTexTarget = Integer.valueOf(i7);
        this.mSizeTrusted = false;
        this.mGlSync = 0L;
        boolean z6 = true;
        GLES20.glGenTextures(1, this.mTmp, 0);
        String str = TAG;
        if (this.mTmp[0] != 0) {
            z6 = false;
        }
        BGLException.ID id = BGLException.ID.TEXTURE_ERROR;
        BGLUtil.logAndThrow(str, z6, id, "fail to gen texture");
        BGLUtil.logGLErrAndThrow(TAG, id, "fail to gen texture");
        this.mTexName = Integer.valueOf(this.mTmp[0]);
        try {
            applySamplerParam();
        } catch (BGLException e7) {
            destroyResource();
            throw e7;
        }
    }

    public static BGLTexture createEmpty() {
        return new BGLTexture();
    }

    public static BGLTexture createTex2D() throws BGLException {
        BGLTexture bGLTexture = new BGLTexture();
        bGLTexture.create(3553);
        return bGLTexture;
    }

    public static BGLTexture createTexOES() throws BGLException {
        BGLTexture bGLTexture = new BGLTexture();
        bGLTexture.create(36197);
        return bGLTexture;
    }

    private void destroyResource() {
        Integer num = this.mTexName;
        if (num != null) {
            this.mTmp[0] = num.intValue();
            GLES20.glDeleteTextures(1, this.mTmp, 0);
            if (GLES20.glGetError() != 0) {
                LivePusherLog.e(TAG, "destroy: fail to destroy texture", null);
            } else {
                this.mTexName = null;
            }
        }
        long j7 = this.mGlSync;
        if (j7 != 0) {
            GLES30.glDeleteSync(j7);
            this.mGlSync = 0L;
        }
        this.mTexTarget = null;
        this.mSizeTrusted = false;
        this.mWidth = 0;
        this.mHeight = 0;
    }

    private void setSampler(int i7) throws BGLException {
        try {
            bind();
            GLES20.glTexParameteri(this.mTexTarget.intValue(), 10241, i7);
            String str = TAG;
            BGLException.ID id = BGLException.ID.TEXTURE_ERROR;
            BGLUtil.logGLErrAndThrow(str, id, "fail to set texture param, target: " + this.mTexTarget + ", param: " + i7);
            GLES20.glTexParameteri(this.mTexTarget.intValue(), 10240, i7);
            BGLUtil.logGLErrAndThrow(TAG, id, "fail to set texture param, target: " + this.mTexTarget + ", param: " + i7);
        } finally {
            unbind();
        }
    }

    private void setWrapMode(int i7) throws BGLException {
        try {
            bind();
            if (this.mTexTarget.intValue() == 36197) {
                i7 = 33071;
            }
            GLES20.glTexParameteri(this.mTexTarget.intValue(), 10242, i7);
            String str = TAG;
            BGLException.ID id = BGLException.ID.TEXTURE_ERROR;
            BGLUtil.logGLErrAndThrow(str, id, "fail to set texture param, target: " + this.mTexTarget + ", param: " + i7);
            GLES20.glTexParameteri(this.mTexTarget.intValue(), 10243, i7);
            BGLUtil.logGLErrAndThrow(TAG, id, "fail to set texture param, target: " + this.mTexTarget + ", param: " + i7);
        } finally {
            unbind();
        }
    }

    public void applySamplerParam() throws BGLException {
        if (this.mTexTarget == null) {
            return;
        }
        setLinearSampler();
        setClampWrap();
    }

    public void attachTo(Integer num, int i7) {
        destroyResource();
        this.mTexName = num;
        this.mTexTarget = Integer.valueOf(i7);
        this.mSizeTrusted = false;
    }

    public void bind() throws BGLException {
        GLES20.glBindTexture(this.mTexTarget.intValue(), this.mTexName.intValue());
        BGLUtil.logGLErrAndThrow(TAG, BGLException.ID.TEXTURE_ERROR, "texTarget: " + this.mTexTarget + "texture: " + this.mTexName + " fail to bind texture");
    }

    public BGLFramebuffer createFramebuffer(int i7, int i8) throws BGLException {
        return createFramebuffer(i7, i8, false);
    }

    public BGLFramebuffer createFramebuffer(int i7, int i8, boolean z6) throws BGLException {
        if (this.mTexTarget.intValue() != 3553) {
            BGLUtil.logAndThrow(TAG, BGLException.ID.TEXTURE_ERROR, "Only Texture2D can be used as render target");
        }
        if (!this.mSizeTrusted || i7 != this.mWidth || i8 != this.mHeight) {
            GLES20.glBindTexture(3553, this.mTexName.intValue());
            String str = TAG;
            BGLException.ID id = BGLException.ID.TEXTURE_ERROR;
            BGLUtil.logGLErrAndThrow(str, id, "fail to set texture resolution, texture: " + this.mTexName);
            if (z6) {
                GLES31.glTexImage2D(3553, 0, 34842, i7, i8, 0, 6408, 5131, null);
            } else {
                GLES20.glTexImage2D(3553, 0, 6408, i7, i8, 0, 6408, 5121, null);
            }
            BGLUtil.logGLErrAndThrow(TAG, id, "fail to set texture resolution");
            GLES20.glBindTexture(3553, 0);
            BGLUtil.logGLErrAndThrow(TAG, id, "fail to unset texture binding");
            this.mWidth = i7;
            this.mHeight = i8;
            this.mSizeTrusted = true;
        }
        return BGLFramebuffer.create(this, i7, i8, z6);
    }

    public void destroy() {
        destroyResource();
    }

    public Integer detachTex() {
        Integer num = this.mTexName;
        this.mTexName = null;
        return num;
    }

    public void finalize() throws Throwable {
        super.finalize();
    }

    public int getHeight() {
        return this.mHeight;
    }

    public Integer getTexId() {
        return this.mTexName;
    }

    public int getTexName() {
        return this.mTexName.intValue();
    }

    public Integer getTexTarget() {
        return this.mTexTarget;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public void loadBmp(Bitmap bitmap) throws BGLException {
        bind();
        if (this.mSizeTrusted && this.mWidth == bitmap.getWidth() && this.mHeight == bitmap.getHeight()) {
            GLUtils.texSubImage2D(this.mTexTarget.intValue(), 0, 0, 0, bitmap, 6408, 5121);
            BGLUtil.logGLErrAndThrow(TAG, BGLException.ID.TEXTURE_ERROR, "fail to load bitmap to texture (texSubImage2D), target: " + this.mTexTarget + ", bmp is null: false");
        } else {
            GLES31.glTexImage2D(3553, 0, 6408, bitmap.getWidth(), bitmap.getHeight(), 0, 6408, 5121, null);
            String str = TAG;
            BGLException.ID id = BGLException.ID.TEXTURE_ERROR;
            BGLUtil.logGLErrAndThrow(str, id, "fail to load bitmap to texture (glTexImage2D), target: " + this.mTexTarget + ", bmp is null: false");
            GLUtils.texSubImage2D(this.mTexTarget.intValue(), 0, 0, 0, bitmap, 6408, 5121);
            BGLUtil.logGLErrAndThrow(TAG, id, "fail to load bitmap to texture (texSubImage2D), target: " + this.mTexTarget + ", bmp is null: false");
            this.mWidth = bitmap.getWidth();
            this.mHeight = bitmap.getHeight();
            this.mSizeTrusted = true;
        }
        unbind();
        setSyncFlag(false);
    }

    public BGLTexture setClampWrap() throws BGLException {
        setWrapMode(33071);
        return this;
    }

    public BGLTexture setLinearSampler() throws BGLException {
        setSampler(9729);
        return this;
    }

    public BGLTexture setMirrorWrap() throws BGLException {
        setWrapMode(33648);
        return this;
    }

    public BGLTexture setNearestSampler() throws BGLException {
        setSampler(9728);
        return this;
    }

    public BGLTexture setRepeatWrap() throws BGLException {
        setWrapMode(10497);
        return this;
    }

    public void setSize(int i7, int i8) {
        this.mWidth = i7;
        this.mHeight = i8;
        this.mSizeTrusted = false;
    }

    public void setSyncFlag(boolean z6) {
        long j7 = this.mGlSync;
        if (j7 != 0) {
            GLES30.glDeleteSync(j7);
            this.mGlSync = 0L;
        }
        if (z6) {
            this.mGlSync = GLES30.glFenceSync(37143, 0);
        }
    }

    public void swap(BGLTexture bGLTexture) {
        Integer num = this.mTexName;
        this.mTexName = bGLTexture.mTexName;
        bGLTexture.mTexName = num;
        Integer num2 = this.mTexTarget;
        this.mTexTarget = bGLTexture.mTexTarget;
        bGLTexture.mTexTarget = num2;
        int i7 = this.mWidth;
        this.mWidth = bGLTexture.mWidth;
        bGLTexture.mWidth = i7;
        int i8 = this.mHeight;
        this.mHeight = bGLTexture.mHeight;
        bGLTexture.mHeight = i8;
        boolean z6 = this.mSizeTrusted;
        this.mSizeTrusted = bGLTexture.mSizeTrusted;
        bGLTexture.mSizeTrusted = z6;
        long j7 = this.mGlSync;
        this.mGlSync = bGLTexture.mGlSync;
        bGLTexture.mGlSync = j7;
    }

    public void unbind() {
        GLES20.glBindTexture(this.mTexTarget.intValue(), 0);
    }

    public boolean waitSyncCPU(int i7) {
        int iGlClientWaitSync;
        long j7 = this.mGlSync;
        return j7 == 0 || (iGlClientWaitSync = GLES30.glClientWaitSync(j7, 1, ((long) i7) * 1000)) == 37146 || iGlClientWaitSync == 37148;
    }

    public void waitSyncGPU() {
        long j7 = this.mGlSync;
        if (j7 != 0) {
            GLES30.glWaitSync(j7, 0, -1L);
        }
    }
}
