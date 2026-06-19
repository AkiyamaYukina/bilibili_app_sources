package com.bilibili.live.streaming.gl;

import android.opengl.GLES31;
import com.bilibili.live.streaming.gl.BGLException;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/gl/OpenGLESBuffer.class */
public final class OpenGLESBuffer {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final String TAG = "OpenGLESBuffer";
    private int bufId;
    private final int bytes;
    private final int type;
    private final int usage;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/gl/OpenGLESBuffer$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getTAG() {
            return OpenGLESBuffer.TAG;
        }
    }

    public OpenGLESBuffer(int i7, int i8, int i9) {
        this.type = i7;
        this.bytes = i8;
        this.usage = i9;
    }

    public final int BufferId() {
        return this.bufId;
    }

    public final int BufferSize() {
        return this.bytes;
    }

    public final int BufferType() {
        return this.type;
    }

    public final void Load(@NotNull ByteBuffer byteBuffer, int i7, int i8) {
        MapBuffer(false, true, i7, i8).put(byteBuffer);
        UnmapBuffer();
    }

    @NotNull
    public final ByteBuffer MapBuffer(boolean z6, boolean z7, int i7, int i8) {
        int i9;
        try {
            GLES31.glBindBuffer(this.type, this.bufId);
            if (z7) {
                i9 = (!z6 ? 8 : 0) | 2;
            } else {
                i9 = 0;
            }
            ByteBuffer byteBuffer = (ByteBuffer) GLES31.glMapBufferRange(this.type, i7, i8, (z6 ? 1 : 0) | i9);
            BGLUtil.logGLErrAndThrow(TAG, BGLException.ID.BUFFER_ERROR, "Fail to map buffer type " + this.type + " id " + this.bufId);
            return byteBuffer;
        } finally {
            GLES31.glBindBuffer(this.type, 0);
        }
    }

    public final void Store(@NotNull ByteBuffer byteBuffer, int i7, int i8) {
        byteBuffer.put(MapBuffer(true, false, i7, i8));
        UnmapBuffer();
    }

    public final void UnmapBuffer() {
        GLES31.glBindBuffer(this.type, this.bufId);
        GLES31.glUnmapBuffer(this.type);
        GLES31.glBindBuffer(this.type, 0);
    }

    public final void destroy() {
        int i7 = this.bufId;
        if (i7 != 0) {
            GLES31.glDeleteBuffers(1, new int[]{i7}, 0);
            this.bufId = 0;
        }
    }

    public final int getBufId() {
        return this.bufId;
    }

    public final int getBytes() {
        return this.bytes;
    }

    public final int getType() {
        return this.type;
    }

    public final int getUsage() {
        return this.usage;
    }

    public final void init() throws BGLException {
        destroy();
        try {
            int[] iArr = new int[1];
            GLES31.glGenBuffers(1, iArr, 0);
            int i7 = iArr[0];
            this.bufId = i7;
            GLES31.glBindBuffer(this.type, i7);
            GLES31.glBufferData(this.type, this.bytes, null, this.usage);
            BGLUtil.logGLErrAndThrow(TAG, BGLException.ID.BUFFER_ERROR, "create buffer, type = " + this.type + ", bytes = " + this.bytes + ", usage = " + this.usage);
            GLES31.glBindBuffer(this.type, 0);
        } catch (BGLException e7) {
            destroy();
            throw e7;
        }
    }

    public final void setBufId(int i7) {
        this.bufId = i7;
    }
}
