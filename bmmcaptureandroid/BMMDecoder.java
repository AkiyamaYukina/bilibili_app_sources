package com.bilibili.bmmcaptureandroid;

import android.content.Context;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import bilibili.live.app.service.resolver.c;
import com.bilibili.bplus.im.protobuf.a;
import com.bilibili.opengldecoder.AbsDecoderFactory;
import com.bilibili.opengldecoder.GLDecoder;
import com.bilibili.opengldecoder.IDecoder;
import com.bilibili.opengldecoder.IjkPlayerDecoderFactory;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import tv.danmaku.android.log.BLog;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/bmmcaptureandroid/BMMDecoder.class */
public class BMMDecoder {
    private static final int EGL_VERSION = 3;
    private static final String TAG = "BMMDecoder";
    private EGLContext eglContext;
    private AbsDecoderFactory factory;
    private GLDecoder mDecoder;
    private boolean isLoopFlag = true;
    private final Object object = new Object();
    private long ijkHandle = 0;
    private boolean isPrepareFlag = false;
    private boolean isStartFlag = false;
    private boolean isPauseFlag = false;

    public BMMDecoder() {
        BLog.i(TAG, "constructor");
        this.eglContext = ((EGL10) EGLContext.getEGL()).eglGetCurrentContext();
        this.mDecoder = new GLDecoder();
        this.factory = new IjkPlayerDecoderFactory(false, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void complete() {
        nativeComplete(this.ijkHandle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void encodeAudioDataCallback(byte[] bArr, int i7, int i8, int i9, int i10, int i11) {
        nativeAudioRawDataCallBack(bArr, i7, i8, this.ijkHandle, i9, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void generateTextureId(int i7) {
        nativeSetTextureId(i7, this.ijkHandle);
    }

    private static native void nativeAudioRawDataCallBack(byte[] bArr, int i7, int i8, long j7, int i9, int i10, int i11);

    private static native void nativeComplete(long j7);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativePrepared(long j7);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeRenderStart(long j7);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeSeekComplete(long j7);

    private static native void nativeSetTextureId(int i7, long j7);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeVideoSizeChanged(long j7);

    public long getCurrentPosition() {
        return this.mDecoder.getCurrentPosition();
    }

    public long getDuration() {
        return this.mDecoder.getDuration();
    }

    public float getSpeed() {
        GLDecoder gLDecoder = this.mDecoder;
        if (gLDecoder != null) {
            return gLDecoder.getSpeed();
        }
        return 0.0f;
    }

    public Point getVideoSize() {
        BLog.i(TAG, "getVideoSize :");
        return this.mDecoder.getVideoSize();
    }

    public void init() {
        BLog.i(TAG, "init: ");
        this.mDecoder.init(this.eglContext, 3, this.factory, new GLDecoder.GLDecoderListener(this) { // from class: com.bilibili.bmmcaptureandroid.BMMDecoder.1
            final BMMDecoder this$0;

            {
                this.this$0 = this;
            }

            @Override // com.bilibili.opengldecoder.GLDecoder.GLDecoderListener
            public int onAudioRawData(byte[] bArr, int i7, int i8, int i9, int i10, int i11) {
                this.this$0.encodeAudioDataCallback(bArr, i7, i8, i9, i10, i11);
                return i8;
            }

            @Override // com.bilibili.opengldecoder.GLDecoder.GLDecoderListener
            public void onFrameAvailable(SurfaceTexture surfaceTexture, int i7) {
            }

            @Override // com.bilibili.opengldecoder.GLDecoder.GLDecoderListener
            public void onTextureIdGenerated(int i7) {
                c.a(i7, " Generated textureId =", BMMDecoder.TAG);
                this.this$0.generateTextureId(i7);
            }
        });
        this.mDecoder.setOnVideoSizeChangedListener(new IMediaPlayer.OnVideoSizeChangedListener(this) { // from class: com.bilibili.bmmcaptureandroid.BMMDecoder.2
            final BMMDecoder this$0;

            {
                this.this$0 = this;
            }

            public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i7, int i8, int i9, int i10) {
                a.b(i7, i8, "onVideoSizeChanged width:", " -- height:", BMMDecoder.TAG);
                BMMDecoder.nativeVideoSizeChanged(this.this$0.ijkHandle);
            }
        });
        this.mDecoder.setOnCompletionListener(new IMediaPlayer.OnCompletionListener(this) { // from class: com.bilibili.bmmcaptureandroid.BMMDecoder.3
            final BMMDecoder this$0;

            {
                this.this$0 = this;
            }

            public void onCompletion(IMediaPlayer iMediaPlayer) {
                this.this$0.complete();
            }
        });
        this.mDecoder.setInfoListener(new IMediaPlayer.OnInfoListener(this) { // from class: com.bilibili.bmmcaptureandroid.BMMDecoder.4
            final BMMDecoder this$0;

            {
                this.this$0 = this;
            }

            public boolean onInfo(IMediaPlayer iMediaPlayer, int i7, int i8, Bundle bundle) {
                if (i7 != 3) {
                    return false;
                }
                BLog.i(BMMDecoder.TAG, "RENDERING_START :");
                BMMDecoder.nativeRenderStart(this.this$0.ijkHandle);
                return false;
            }
        });
        this.mDecoder.setOnDecoderListener(new IDecoder.OnDecoderPreparedListener(this) { // from class: com.bilibili.bmmcaptureandroid.BMMDecoder.5
            final BMMDecoder this$0;

            {
                this.this$0 = this;
            }

            @Override // com.bilibili.opengldecoder.IDecoder.OnDecoderPreparedListener
            public void onDecoderPrepared(IMediaPlayer iMediaPlayer) {
                synchronized (this.this$0.object) {
                    BLog.i(BMMDecoder.TAG, "onPrepared :");
                    this.this$0.isPrepareFlag = true;
                    BMMDecoder.nativePrepared(this.this$0.ijkHandle);
                    this.this$0.mDecoder.setLoop(this.this$0.isLoopFlag);
                    if (this.this$0.isStartFlag) {
                        this.this$0.mDecoder.start();
                    }
                    if (this.this$0.isPauseFlag) {
                        this.this$0.mDecoder.pause();
                    }
                }
            }
        });
        this.mDecoder.setSeekCompleteListener(new IMediaPlayer.OnSeekCompleteListener(this) { // from class: com.bilibili.bmmcaptureandroid.BMMDecoder.6
            final BMMDecoder this$0;

            {
                this.this$0 = this;
            }

            public void onSeekComplete(IMediaPlayer iMediaPlayer) {
                BMMDecoder.nativeSeekComplete(this.this$0.ijkHandle);
            }
        });
    }

    public void pause() {
        synchronized (this.object) {
            BLog.i(TAG, "pause :");
            this.isPauseFlag = true;
            this.isStartFlag = false;
            if (this.isPrepareFlag) {
                this.mDecoder.pause();
            }
        }
    }

    public void release() {
        synchronized (this.object) {
            this.isPrepareFlag = false;
            this.isStartFlag = false;
            this.isPauseFlag = false;
            this.isLoopFlag = true;
            try {
                this.mDecoder.release();
            } catch (InterruptedException e7) {
                e7.printStackTrace();
            }
        }
    }

    public void seekTo(long j7) {
        this.mDecoder.seekTo(j7);
    }

    public void setCompleteListener(Object obj) {
        BLog.i(TAG, "setCompleteListener :");
        GLDecoder gLDecoder = this.mDecoder;
        if (gLDecoder != null) {
            gLDecoder.setOnCompletionListener((IMediaPlayer.OnCompletionListener) obj);
        }
    }

    public void setContext(Context context) {
        BLog.i(TAG, "setContext :");
        this.mDecoder.create(context);
    }

    public void setDataSource(String str, int i7) {
        ze.c.a(i7, "path: ", str, "startPosition", TAG);
        this.mDecoder.setDataSource(str, i7);
    }

    public void setIjkHandle(long j7) {
        this.ijkHandle = j7;
    }

    public void setLoop(boolean z6) {
        synchronized (this.object) {
            if (this.isPrepareFlag) {
                this.mDecoder.setLoop(z6);
            }
            this.isLoopFlag = z6;
        }
    }

    public void setSpeed(float f7) {
        BLog.d(TAG, "setSpeed: " + f7);
        GLDecoder gLDecoder = this.mDecoder;
        if (gLDecoder != null) {
            gLDecoder.setSpeed(f7);
        }
    }

    public void setVolume(float f7) {
        GLDecoder gLDecoder = this.mDecoder;
        if (gLDecoder != null) {
            gLDecoder.setVolume(f7, f7);
        }
    }

    public void start() {
        synchronized (this.object) {
            BLog.i(TAG, "start ");
            this.isStartFlag = true;
            this.isPauseFlag = false;
            if (this.isPrepareFlag) {
                this.mDecoder.start();
            }
        }
    }
}
