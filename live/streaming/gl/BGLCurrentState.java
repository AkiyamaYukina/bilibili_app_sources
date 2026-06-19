package com.bilibili.live.streaming.gl;

import android.opengl.GLES20;
import com.bilibili.live.streaming.utils.BObjectPool;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/gl/BGLCurrentState.class */
public class BGLCurrentState {
    private static Pool mPool = new Pool();
    private Integer mSaveArrayBuffer;
    private int[] mSaveBlend;
    private Integer mSaveFramebuffer;
    private Integer mSaveProgram;
    private int[] mSaveViewport;
    private Integer mTempFramebufferToDelete;
    private int[] mTmp;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/gl/BGLCurrentState$Pool.class */
    public static class Pool extends BObjectPool<BGLCurrentState> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.bilibili.live.streaming.utils.BObjectPool
        public BGLCurrentState construct() {
            return new BGLCurrentState(0);
        }

        @Override // com.bilibili.live.streaming.utils.BObjectPool
        public void onReuse(BGLCurrentState bGLCurrentState) {
            bGLCurrentState.clear();
        }
    }

    private BGLCurrentState() {
        this.mTmp = new int[1];
        int[] iArr = new int[5];
        this.mSaveViewport = iArr;
        iArr[0] = 0;
        this.mSaveBlend = new int[]{0, 0, 0};
    }

    public /* synthetic */ BGLCurrentState(int i7) {
        this();
    }

    public static BGLCurrentState save() {
        return mPool.getObject();
    }

    public BGLCurrentState arrayBuffer() {
        GLES20.glGetIntegerv(34964, this.mTmp, 0);
        this.mSaveArrayBuffer = Integer.valueOf(this.mTmp[0]);
        this.mTmp[0] = -1;
        return this;
    }

    public BGLCurrentState blend() {
        int[] iArr = this.mSaveBlend;
        iArr[0] = 1;
        GLES20.glGetIntegerv(32971, iArr, 1);
        GLES20.glGetIntegerv(32970, this.mSaveBlend, 2);
        return this;
    }

    public void clear() {
        this.mSaveProgram = null;
        this.mSaveArrayBuffer = null;
        this.mSaveFramebuffer = null;
        this.mSaveViewport[0] = 0;
        this.mSaveBlend[0] = 0;
        this.mTempFramebufferToDelete = null;
    }

    public BGLCurrentState framebuffer() {
        GLES20.glGetIntegerv(36006, this.mTmp, 0);
        this.mSaveFramebuffer = Integer.valueOf(this.mTmp[0]);
        this.mTmp[0] = -1;
        return this;
    }

    public BGLCurrentState program() {
        GLES20.glGetIntegerv(35725, this.mTmp, 0);
        this.mSaveProgram = Integer.valueOf(this.mTmp[0]);
        this.mTmp[0] = -1;
        return this;
    }

    public void restore() {
        Integer num = this.mSaveProgram;
        if (num != null) {
            GLES20.glUseProgram(num.intValue());
        }
        Integer num2 = this.mSaveArrayBuffer;
        if (num2 != null) {
            GLES20.glBindBuffer(34962, num2.intValue());
        }
        Integer num3 = this.mSaveFramebuffer;
        if (num3 != null) {
            GLES20.glBindFramebuffer(36160, num3.intValue());
        }
        Integer num4 = this.mTempFramebufferToDelete;
        if (num4 != null) {
            this.mTmp[0] = num4.intValue();
            GLES20.glDeleteFramebuffers(1, this.mTmp, 0);
            this.mTempFramebufferToDelete = null;
        }
        int[] iArr = this.mSaveViewport;
        if (iArr[0] != 0) {
            GLES20.glViewport(iArr[1], iArr[2], iArr[3], iArr[4]);
        }
        int[] iArr2 = this.mSaveBlend;
        if (iArr2[0] != 0) {
            GLES20.glBlendFunc(iArr2[1], iArr2[2]);
        }
        mPool.releaseObject(this);
    }

    public BGLCurrentState tempFramebufferToDelete(int i7) {
        this.mTempFramebufferToDelete = Integer.valueOf(i7);
        return this;
    }

    public BGLCurrentState viewport() {
        int[] iArr = this.mSaveViewport;
        iArr[0] = 1;
        GLES20.glGetIntegerv(2978, iArr, 1);
        return this;
    }
}
