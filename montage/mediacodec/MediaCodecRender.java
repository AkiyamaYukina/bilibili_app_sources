package com.bilibili.montage.mediacodec;

import C0.d;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import com.bilibili.montage.avutil.LogSinker;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/mediacodec/MediaCodecRender.class */
public class MediaCodecRender implements SurfaceTexture.OnFrameAvailableListener {
    private static final String TAG = "MediaCodecRender";
    private boolean mFrameAvailable;
    private Handler mHandler;
    private HandlerThread mHandlerThread;
    private Surface mSurface;
    private SurfaceTexture mSurfaceTexture;
    private final int[] mTextures;
    private final Object lock = new Object();
    private final float[] mTransform = new float[16];
    private MediaCodecDrawer mDrawer = null;

    public MediaCodecRender() {
        int[] iArr = new int[1];
        this.mTextures = iArr;
        HandlerThread handlerThread = new HandlerThread("MediaCoderDecodeUpdate");
        this.mHandlerThread = handlerThread;
        handlerThread.start();
        this.mHandler = new Handler(this.mHandlerThread.getLooper());
        GLES20.glActiveTexture(33984);
        checkGlError("glActiveTexture");
        GLES20.glGenTextures(1, iArr, 0);
        checkGlError("glGenTextures");
        LogSinker.i(TAG, "createSurface: texture " + iArr[0]);
        GLES20.glBindTexture(36197, iArr[0]);
        checkGlError("glBindTexture mTextureID");
        GLES20.glTexParameterf(36197, 10241, 9729.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        checkGlError("Texture bind");
        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr[0]);
        this.mSurfaceTexture = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this, this.mHandler);
        this.mSurface = new Surface(this.mSurfaceTexture);
        GLES20.glBindTexture(36197, 0);
    }

    private void checkGlError(String str) {
        while (true) {
            int iEglGetError = EGL14.eglGetError();
            if (iEglGetError == 12288) {
                return;
            }
            String str2 = TAG;
            StringBuilder sbA = d.a(str, ": glError ");
            sbA.append(GLUtils.getEGLErrorString(iEglGetError));
            LogSinker.e(str2, sbA.toString());
        }
    }

    public void destroy() {
        Trace.beginSection("MediaCodecRender destroy");
        LogSinker.i(TAG, "destroy: ");
        MediaCodecDrawer mediaCodecDrawer = this.mDrawer;
        if (mediaCodecDrawer != null) {
            mediaCodecDrawer.release();
            this.mDrawer = null;
        }
        try {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.mHandler = null;
            }
            HandlerThread handlerThread = this.mHandlerThread;
            if (handlerThread != null) {
                handlerThread.quit();
                this.mHandlerThread = null;
            }
        } catch (Exception e7) {
            LogSinker.e(TAG, "Unexpected release mediacodec handler" + e7);
        }
        SurfaceTexture surfaceTexture = this.mSurfaceTexture;
        if (surfaceTexture != null) {
            surfaceTexture.setOnFrameAvailableListener(null);
            this.mSurfaceTexture.release();
            this.mSurfaceTexture = null;
        }
        Surface surface = this.mSurface;
        if (surface != null) {
            surface.release();
            this.mSurface = null;
        }
        GLES20.glDeleteTextures(1, this.mTextures, 0);
        Trace.endSection();
    }

    public int drawToTexture(int i7, int i8, int i9, int i10, int i11) {
        Trace.beginSection("MediaCodecRender drawToTexture");
        synchronized (this.lock) {
            while (!this.mFrameAvailable) {
                try {
                    this.lock.wait(500L);
                    if (!this.mFrameAvailable) {
                        Trace.endSection();
                        LogSinker.e(TAG, "waitRenderFinish: wait render failed");
                        return -1;
                    }
                } catch (Exception e7) {
                    Trace.endSection();
                    LogSinker.w(TAG, "waitRenderFinish: wait render failed" + e7);
                    return -1;
                }
            }
            this.mFrameAvailable = false;
            SurfaceTexture surfaceTexture = this.mSurfaceTexture;
            if (surfaceTexture == null) {
                LogSinker.e(TAG, "drawToTexture: mSurfaceTexture is null");
                Trace.endSection();
                return -1;
            }
            try {
                surfaceTexture.updateTexImage();
                this.mSurfaceTexture.getTransformMatrix(this.mTransform);
                if (this.mDrawer == null) {
                    this.mDrawer = new MediaCodecDrawer();
                }
                this.mDrawer.drawTexture(i7, this.mTextures[0], this.mTransform, i8, i9, i10, i11);
                checkGlError("Texture drawer draw");
                Trace.endSection();
                return 0;
            } catch (Exception e8) {
                LogSinker.e(TAG, "updateTexImage failed: " + e8);
                Trace.endSection();
                return -1;
            }
        }
    }

    public Surface getSurface() {
        return this.mSurface;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        Trace.beginSection("MediaCodecRender onFrameAvailable");
        synchronized (this.lock) {
            this.mFrameAvailable = true;
            this.lock.notify();
        }
        Trace.endSection();
    }
}
