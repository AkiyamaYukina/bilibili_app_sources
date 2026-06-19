package com.bilibili.live.streaming.source;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import com.bilibili.live.streaming.gl.BGLDrawer;
import com.bilibili.live.streaming.gl.BGLException;
import com.bilibili.live.streaming.gl.BGLTexture;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/source/CameraTextureReceiver.class */
public final class CameraTextureReceiver extends CameraReceiver {

    @NotNull
    private final BGLTexture mOesTex;

    @NotNull
    private final SurfaceTexture mSurTex;

    @NotNull
    private final Surface mSurface;

    public CameraTextureReceiver(int i7, int i8, @NotNull Handler handler) throws BGLException {
        super(i7, i8, handler);
        BGLTexture bGLTextureCreateTexOES = BGLTexture.createTexOES();
        this.mOesTex = bGLTextureCreateTexOES;
        SurfaceTexture surfaceTexture = new SurfaceTexture(bGLTextureCreateTexOES.getTexId().intValue());
        surfaceTexture.setDefaultBufferSize(i7, i8);
        this.mSurTex = surfaceTexture;
        this.mSurface = new Surface(surfaceTexture);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void close$lambda$1(CameraTextureReceiver cameraTextureReceiver) {
        cameraTextureReceiver.mSurface.release();
        cameraTextureReceiver.mSurTex.release();
        cameraTextureReceiver.mOesTex.destroy();
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        getMHandler().post(new com.bilibili.biligame.web2.e(this, 1));
    }

    @NotNull
    public final BGLTexture getMOesTex() {
        return this.mOesTex;
    }

    @NotNull
    public final SurfaceTexture getMSurTex() {
        return this.mSurTex;
    }

    @NotNull
    public final Surface getMSurface() {
        return this.mSurface;
    }

    @Override // com.bilibili.live.streaming.source.ICameraReceiver
    public boolean render(@NotNull BGLDrawer bGLDrawer) throws BGLException {
        bGLDrawer.drawTexOESMix(this.mOesTex);
        return true;
    }

    @Override // com.bilibili.live.streaming.source.ICameraReceiver
    @NotNull
    public Surface surface() {
        return this.mSurface;
    }

    @Override // com.bilibili.live.streaming.source.ICameraReceiver
    public void tick() {
        this.mSurTex.updateTexImage();
    }
}
