package com.bilibili.live.streaming.source;

import com.bilibili.live.streaming.AVContext;
import com.bilibili.live.streaming.filter.FilterBase;
import com.bilibili.live.streaming.gl.BEGLContext;
import com.bilibili.live.streaming.gl.BGLDrawer;
import com.bilibili.live.streaming.gl.BGLMatrix;
import com.bilibili.live.streaming.gl.BGLTexture;
import com.bilibili.live.streaming.gl.Shaders;
import com.bilibili.live.streaming.log.LivePusherLog;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/source/CustomTexSource.class */
public final class CustomTexSource extends FilterBase {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String ID = "CustomTexSource";
    private int mHeight;

    @Nullable
    private BGLTexture mTex = BGLTexture.createEmpty();

    @Nullable
    private BGLMatrix mUVPreTrans;

    @Nullable
    private BGLMatrix mVTrans;
    private int mWidth;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/source/CustomTexSource$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public CustomTexSource() {
        BGLMatrix.Companion companion = BGLMatrix.Companion;
        this.mVTrans = companion.create();
        this.mUVPreTrans = companion.create();
    }

    @Override // com.bilibili.live.streaming.filter.IVideoSource
    public void destroy() {
        LivePusherLog.i$default(ID, this + ", destroy!!", null, 4, null);
        BGLTexture bGLTexture = this.mTex;
        if (bGLTexture != null) {
            bGLTexture.detachTex();
        }
        BGLTexture bGLTexture2 = this.mTex;
        if (bGLTexture2 != null) {
            bGLTexture2.destroy();
        }
        this.mTex = null;
        this.mVTrans = null;
        this.mUVPreTrans = null;
    }

    public final void finalize() {
    }

    @Override // com.bilibili.live.streaming.filter.IVideoSource
    public int getHeight() {
        return this.mHeight;
    }

    @Override // com.bilibili.live.streaming.filter.IVideoSource
    @NotNull
    public String getID() {
        return ID;
    }

    @NotNull
    public final BGLTexture getInnerTexture() {
        return this.mTex;
    }

    public final int getMHeight() {
        return this.mHeight;
    }

    public final int getMWidth() {
        return this.mWidth;
    }

    @Override // com.bilibili.live.streaming.filter.IVideoSource
    public int getWidth() {
        return this.mWidth;
    }

    @Override // com.bilibili.live.streaming.filter.FilterBase, com.bilibili.live.streaming.filter.IVideoSource
    public void init(@NotNull AVContext aVContext) {
        super.init(aVContext);
    }

    @Override // com.bilibili.live.streaming.filter.FilterBase, com.bilibili.live.streaming.filter.IVideoSource
    public boolean render() {
        BEGLContext eglContext;
        BGLDrawer inputTexDrawer;
        AVContext aVContext = this.mCtx;
        if (aVContext == null || (eglContext = aVContext.getEglContext()) == null || (inputTexDrawer = eglContext.getInputTexDrawer(Shaders.Transfer.SRGB, Shaders.Primaries.SRGB)) == null) {
            return true;
        }
        BGLMatrix bGLMatrix = this.mVTrans;
        if (bGLMatrix != null) {
            eglContext.getTransState().pushVPreTrans(bGLMatrix);
        }
        BGLMatrix bGLMatrix2 = this.mUVPreTrans;
        if (bGLMatrix2 != null) {
            eglContext.getTransState().pushUVPreTrans(bGLMatrix2);
        }
        try {
            inputTexDrawer.drawTex(this.mTex);
        } finally {
            if (this.mVTrans != null) {
                eglContext.getTransState().popVPreTrans();
            }
            if (this.mUVPreTrans != null) {
                eglContext.getTransState().popUVPreTrans();
            }
        }
    }

    public final void setMHeight(int i7) {
        this.mHeight = i7;
    }

    public final void setMWidth(int i7) {
        this.mWidth = i7;
    }

    public final void setTexSource(@Nullable Integer num, int i7, int i8) {
        BGLTexture bGLTexture = this.mTex;
        if (bGLTexture != null) {
            bGLTexture.detachTex();
        }
        BGLTexture bGLTexture2 = this.mTex;
        if (bGLTexture2 != null) {
            bGLTexture2.attachTo(num, 3553);
        }
        BGLTexture bGLTexture3 = this.mTex;
        if (bGLTexture3 != null) {
            bGLTexture3.setSize(i7, i8);
        }
        BGLMatrix bGLMatrix = this.mVTrans;
        if (bGLMatrix != null) {
            bGLMatrix.setIdent();
        }
        BGLMatrix bGLMatrix2 = this.mUVPreTrans;
        if (bGLMatrix2 != null) {
            bGLMatrix2.setIdent();
        }
        this.mWidth = i7;
        this.mHeight = i8;
    }

    @Override // com.bilibili.live.streaming.filter.IVideoSource
    public void tick(long j7) {
    }
}
