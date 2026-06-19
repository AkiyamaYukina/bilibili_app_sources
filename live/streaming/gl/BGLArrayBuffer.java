package com.bilibili.live.streaming.gl;

import android.opengl.GLES20;
import com.bilibili.live.streaming.gl.BGLException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/gl/BGLArrayBuffer.class */
public class BGLArrayBuffer {
    static final boolean $assertionsDisabled = false;
    static final String TAG = "LIVEGL-BGLArrayBuffer";
    private int mBufName = -1;
    private int mBufSize;

    private BGLArrayBuffer() {
    }

    public static BGLArrayBuffer create(float[] fArr) throws BGLException {
        BGLArrayBuffer bGLArrayBuffer;
        BGLCurrentState bGLCurrentStateArrayBuffer = BGLCurrentState.save().arrayBuffer();
        try {
            try {
                int length = (fArr.length * 32) / 8;
                ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(length);
                byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
                byteBufferAllocateDirect.rewind();
                for (float f7 : fArr) {
                    byteBufferAllocateDirect.putFloat(f7);
                }
                byteBufferAllocateDirect.rewind();
                bGLArrayBuffer = new BGLArrayBuffer();
                try {
                    int[] iArr = new int[1];
                    GLES20.glGenBuffers(1, iArr, 0);
                    BGLException.ID id = BGLException.ID.BUFFER_ERROR;
                    BGLUtil.logGLErrAndThrow(TAG, id, "BGLArrayBuffer.glGenBuffers");
                    bGLArrayBuffer.mBufSize = length;
                    int i7 = iArr[0];
                    bGLArrayBuffer.mBufName = i7;
                    GLES20.glBindBuffer(34962, i7);
                    BGLUtil.logGLErrAndThrow(TAG, id, "BGLArrayBuffer.glBindBuffer, bufferName: " + bGLArrayBuffer.mBufName);
                    GLES20.glBufferData(34962, length, byteBufferAllocateDirect, 35044);
                    BGLUtil.logGLErrAndThrow(TAG, id, "BGLArrayBuffer.glBufferData");
                    bGLCurrentStateArrayBuffer.restore();
                    return bGLArrayBuffer;
                } catch (BGLException e7) {
                    e = e7;
                    if (bGLArrayBuffer != null) {
                        bGLArrayBuffer.destroy();
                    }
                    throw e;
                }
            } catch (Throwable th) {
                bGLCurrentStateArrayBuffer.restore();
                throw th;
            }
        } catch (BGLException e8) {
            e = e8;
            bGLArrayBuffer = null;
        }
    }

    public void bind() throws BGLException {
        GLES20.glBindBuffer(34962, this.mBufName);
        BGLUtil.logGLErrAndThrow(TAG, BGLException.ID.BUFFER_ERROR, "BGLArrayBuffer.glBindBuffer, bufferName: " + this.mBufName);
    }

    public void destroy() {
        int i7 = this.mBufName;
        if (i7 != -1) {
            GLES20.glDeleteBuffers(1, new int[]{i7}, 0);
            this.mBufName = -1;
        }
    }

    public void finalize() throws Throwable {
        super.finalize();
    }

    public int getSize() {
        return this.mBufSize;
    }

    public void unbind() {
        GLES20.glBindBuffer(34962, 0);
    }
}
