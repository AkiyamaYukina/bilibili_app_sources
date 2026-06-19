package com.bilibili.live.streaming.gl;

import android.opengl.EGL14;
import android.opengl.GLES20;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/gl/BGLException.class */
public class BGLException extends Exception {
    private String mMessage;
    private ID mReason;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/gl/BGLException$ID.class */
    public enum ID {
        OK,
        FAIL_INIT,
        MAKE_CURRENT,
        SURFACE_ERROR,
        SHADER_ERROR,
        TEXTURE_ERROR,
        BUFFER_ERROR,
        MISMATCH_CONTEXT,
        DRAW_ERROR,
        GL_INSTRUMENT,
        IMAGE_PATH_ERROR,
        GIF_RESOLUTION_ERROR,
        GIF_IMAGE_CREATE_FAIL,
        SCENE_ERROR,
        ENCODER_ERROR
    }

    public BGLException(ID id, String str) {
        super(str);
        Init(id, str, GLES20.glGetError(), EGL14.eglGetError());
    }

    public BGLException(ID id, String str, int i7, int i8) {
        super(str);
        Init(id, str, i7, i8);
    }

    private void Init(ID id, String str, int i7, int i8) {
        this.mReason = id;
        this.mMessage = String.format("EGLERR[%d] GLERR[%d] %s", Integer.valueOf(i8), Integer.valueOf(i7), str);
    }

    @Override // java.lang.Throwable
    @NotNull
    public String getMessage() {
        String str = this.mMessage;
        String str2 = str;
        if (str == null) {
            str2 = "(null)";
        }
        return str2;
    }

    public ID getReason() {
        return this.mReason;
    }
}
