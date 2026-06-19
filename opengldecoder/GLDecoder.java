package com.bilibili.opengldecoder;

import android.content.Context;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.text.TextUtils;
import android.view.Surface;
import androidx.annotation.NonNull;
import com.bilibili.opengldecoder.GLDecoderRunnable;
import com.bilibili.opengldecoder.IDecoder;
import com.bilibili.opengldecoder.IjkPlayer;
import javax.microedition.khronos.egl.EGLContext;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opengldecoder/GLDecoder.class */
public class GLDecoder {
    public static final int NO_TEXTUREID = -1;
    private IMediaPlayer.OnInfoListener decoderInfoListener;
    private IMediaPlayer.OnPreparedListener decoderPrepareListener;
    private IMediaPlayer.OnVideoSizeChangedListener decoderSizeChangeListener;
    private int decoderStartPosition;
    private IDecoder mDecoder;
    private Thread mDecoderThread;
    private AbsDecoderFactory mFactory;
    private GLDecoderRunnable mGLDecoderRunnable;
    private GLDecoderListener mListener;
    private IDecoder.OnDecoderPreparedListener onPreparedlistener;
    private IMediaPlayer.OnSeekCompleteListener seekCompleteListener;
    private int textureId = -1;
    private boolean decoderCreate = false;
    private Context decoderInitContext = null;
    private String decoderDataSource = "";
    private boolean decoderStart = false;
    private volatile boolean isWorking = false;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opengldecoder/GLDecoder$GLDecoderListener.class */
    public static abstract class GLDecoderListener {
        public int onAudioRawData(byte[] bArr, int i7, int i8, int i9, int i10, int i11) {
            return i8;
        }

        public void onFrameAvailable(SurfaceTexture surfaceTexture, int i7) {
        }

        public void onTextureIdGenerated(int i7) {
        }
    }

    public void backToStart() {
        IDecoder iDecoder = this.mDecoder;
        if (iDecoder != null) {
            iDecoder.backToStart();
        }
        this.decoderStart = false;
    }

    public void create(Context context) {
        IDecoder iDecoder = this.mDecoder;
        if (iDecoder != null) {
            iDecoder.init(context, this.mGLDecoderRunnable.getSurfaceTexture(), this.mGLDecoderRunnable.getSurfaceFrameListener());
        } else {
            this.decoderCreate = true;
            this.decoderInitContext = context;
        }
    }

    public long getCurrentPosition() {
        IDecoder iDecoder = this.mDecoder;
        if (iDecoder != null) {
            return iDecoder.getCurrentPosition();
        }
        return 0L;
    }

    public long getDuration() {
        IDecoder iDecoder = this.mDecoder;
        if (iDecoder != null) {
            return iDecoder.getDuration();
        }
        return 0L;
    }

    public float getSpeed() {
        IDecoder iDecoder = this.mDecoder;
        if (iDecoder != null) {
            return iDecoder.getSpeed();
        }
        return 0.0f;
    }

    public SurfaceTexture getSurfaceTexture() {
        return this.mGLDecoderRunnable.getSurfaceTexture();
    }

    public int getTextureId() {
        return this.textureId;
    }

    public Point getVideoSize() {
        IDecoder iDecoder = this.mDecoder;
        return iDecoder != null ? iDecoder.getVideoSize() : new Point(0, 0);
    }

    public void init(Context context, SurfaceTexture surfaceTexture, int i7, int i8, AbsDecoderFactory absDecoderFactory, @NonNull GLDecoderListener gLDecoderListener) {
        this.mListener = gLDecoderListener;
        this.mFactory = absDecoderFactory;
        this.isWorking = true;
        this.mGLDecoderRunnable = new GLDrawerRunnable(context, surfaceTexture, i7, i8, new GLDecoderRunnable.DecoderRunnableListener(this) { // from class: com.bilibili.opengldecoder.GLDecoder.4
            final GLDecoder this$0;

            {
                this.this$0 = this;
            }

            @Override // com.bilibili.opengldecoder.GLDecoderRunnable.DecoderRunnableListener
            public void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                if (this.this$0.isWorking) {
                    this.this$0.mListener.onFrameAvailable(surfaceTexture2, this.this$0.textureId);
                }
            }

            @Override // com.bilibili.opengldecoder.GLDecoderRunnable.DecoderRunnableListener
            public void onSurfaceCreated() {
                if (this.this$0.isWorking) {
                    GLDecoder gLDecoder = this.this$0;
                    gLDecoder.textureId = gLDecoder.mGLDecoderRunnable.getTextureId();
                    this.this$0.mListener.onTextureIdGenerated(this.this$0.textureId);
                    GLDecoder gLDecoder2 = this.this$0;
                    gLDecoder2.mDecoder = gLDecoder2.mFactory.build();
                    this.this$0.setDecoderListener();
                    if (this.this$0.decoderCreate) {
                        this.this$0.mDecoder.init(this.this$0.decoderInitContext, this.this$0.mGLDecoderRunnable.getSurfaceTexture(), this.this$0.mGLDecoderRunnable.getSurfaceFrameListener());
                        this.this$0.decoderCreate = false;
                        this.this$0.decoderInitContext = null;
                    }
                    if (!TextUtils.isEmpty(this.this$0.decoderDataSource)) {
                        this.this$0.mDecoder.setDataSource(this.this$0.decoderDataSource, this.this$0.decoderStartPosition);
                        this.this$0.decoderDataSource = "";
                        this.this$0.decoderStartPosition = 0;
                    }
                    if (this.this$0.decoderStart) {
                        this.this$0.mDecoder.start();
                        this.this$0.decoderStart = false;
                    }
                    if (this.this$0.decoderPrepareListener != null) {
                        this.this$0.mDecoder.setOnPreparedListener(this.this$0.decoderPrepareListener);
                        this.this$0.decoderPrepareListener = null;
                    }
                    if (this.this$0.decoderSizeChangeListener != null) {
                        this.this$0.mDecoder.setOnVideoSizeChangedListener(this.this$0.decoderSizeChangeListener);
                        this.this$0.decoderSizeChangeListener = null;
                    }
                    if (this.this$0.decoderInfoListener != null) {
                        this.this$0.mDecoder.setInfoListener(this.this$0.decoderInfoListener);
                        this.this$0.decoderInfoListener = null;
                    }
                    if (this.this$0.onPreparedlistener != null) {
                        this.this$0.mDecoder.setDecoderPrepared(this.this$0.onPreparedlistener);
                        this.this$0.onPreparedlistener = null;
                    }
                    if (this.this$0.seekCompleteListener != null) {
                        this.this$0.mDecoder.setOnSeekCompleteListener(this.this$0.seekCompleteListener);
                        this.this$0.seekCompleteListener = null;
                    }
                }
            }
        });
        Thread thread = new Thread(this.mGLDecoderRunnable);
        this.mDecoderThread = thread;
        thread.start();
    }

    public void init(Context context, Surface surface, int i7, int i8, AbsDecoderFactory absDecoderFactory, @NonNull GLDecoderListener gLDecoderListener) {
        this.mListener = gLDecoderListener;
        this.mFactory = absDecoderFactory;
        this.isWorking = true;
        this.mGLDecoderRunnable = new GLDrawerRunnable(context, surface, i7, i8, new GLDecoderRunnable.DecoderRunnableListener(this) { // from class: com.bilibili.opengldecoder.GLDecoder.3
            final GLDecoder this$0;

            {
                this.this$0 = this;
            }

            @Override // com.bilibili.opengldecoder.GLDecoderRunnable.DecoderRunnableListener
            public void onFrameAvailable(SurfaceTexture surfaceTexture) {
                if (this.this$0.isWorking) {
                    this.this$0.mListener.onFrameAvailable(surfaceTexture, this.this$0.textureId);
                }
            }

            @Override // com.bilibili.opengldecoder.GLDecoderRunnable.DecoderRunnableListener
            public void onSurfaceCreated() {
                if (this.this$0.isWorking) {
                    GLDecoder gLDecoder = this.this$0;
                    gLDecoder.textureId = gLDecoder.mGLDecoderRunnable.getTextureId();
                    this.this$0.mListener.onTextureIdGenerated(this.this$0.textureId);
                    GLDecoder gLDecoder2 = this.this$0;
                    gLDecoder2.mDecoder = gLDecoder2.mFactory.build();
                    this.this$0.setDecoderListener();
                    if (this.this$0.decoderCreate) {
                        this.this$0.mDecoder.init(this.this$0.decoderInitContext, this.this$0.mGLDecoderRunnable.getSurfaceTexture(), this.this$0.mGLDecoderRunnable.getSurfaceFrameListener());
                        this.this$0.decoderCreate = false;
                        this.this$0.decoderInitContext = null;
                    }
                    if (!TextUtils.isEmpty(this.this$0.decoderDataSource)) {
                        this.this$0.mDecoder.setDataSource(this.this$0.decoderDataSource, this.this$0.decoderStartPosition);
                        this.this$0.decoderDataSource = "";
                        this.this$0.decoderStartPosition = 0;
                    }
                    if (this.this$0.decoderStart) {
                        this.this$0.mDecoder.start();
                        this.this$0.decoderStart = false;
                    }
                    if (this.this$0.decoderPrepareListener != null) {
                        this.this$0.mDecoder.setOnPreparedListener(this.this$0.decoderPrepareListener);
                        this.this$0.decoderPrepareListener = null;
                    }
                    if (this.this$0.decoderSizeChangeListener != null) {
                        this.this$0.mDecoder.setOnVideoSizeChangedListener(this.this$0.decoderSizeChangeListener);
                        this.this$0.decoderSizeChangeListener = null;
                    }
                    if (this.this$0.decoderInfoListener != null) {
                        this.this$0.mDecoder.setInfoListener(this.this$0.decoderInfoListener);
                        this.this$0.decoderInfoListener = null;
                    }
                    if (this.this$0.onPreparedlistener != null) {
                        this.this$0.mDecoder.setDecoderPrepared(this.this$0.onPreparedlistener);
                        this.this$0.onPreparedlistener = null;
                    }
                    if (this.this$0.seekCompleteListener != null) {
                        this.this$0.mDecoder.setOnSeekCompleteListener(this.this$0.seekCompleteListener);
                        this.this$0.seekCompleteListener = null;
                    }
                }
            }
        });
        Thread thread = new Thread(this.mGLDecoderRunnable);
        this.mDecoderThread = thread;
        thread.start();
    }

    public void init(EGLContext eGLContext, int i7, AbsDecoderFactory absDecoderFactory, @NonNull GLDecoderListener gLDecoderListener) {
        this.mListener = gLDecoderListener;
        this.mFactory = absDecoderFactory;
        this.isWorking = true;
        this.mGLDecoderRunnable = new GL2DDecoderRunnable(eGLContext, i7, 1080, 1920, new GLDecoderRunnable.DecoderRunnableListener(this) { // from class: com.bilibili.opengldecoder.GLDecoder.1
            final GLDecoder this$0;

            {
                this.this$0 = this;
            }

            @Override // com.bilibili.opengldecoder.GLDecoderRunnable.DecoderRunnableListener
            public void onFrameAvailable(SurfaceTexture surfaceTexture) {
                if (this.this$0.isWorking) {
                    this.this$0.mListener.onFrameAvailable(surfaceTexture, this.this$0.textureId);
                }
            }

            @Override // com.bilibili.opengldecoder.GLDecoderRunnable.DecoderRunnableListener
            public void onSurfaceCreated() {
                if (this.this$0.isWorking) {
                    GLDecoder gLDecoder = this.this$0;
                    gLDecoder.textureId = gLDecoder.mGLDecoderRunnable.getTextureId();
                    this.this$0.mListener.onTextureIdGenerated(this.this$0.textureId);
                    GLDecoder gLDecoder2 = this.this$0;
                    gLDecoder2.mDecoder = gLDecoder2.mFactory.build();
                    this.this$0.setDecoderListener();
                    if (this.this$0.decoderCreate) {
                        this.this$0.mDecoder.init(this.this$0.decoderInitContext, this.this$0.mGLDecoderRunnable.getSurfaceTexture(), this.this$0.mGLDecoderRunnable.getSurfaceFrameListener());
                        this.this$0.decoderCreate = false;
                        this.this$0.decoderInitContext = null;
                    }
                    if (!TextUtils.isEmpty(this.this$0.decoderDataSource)) {
                        this.this$0.mDecoder.setDataSource(this.this$0.decoderDataSource, this.this$0.decoderStartPosition);
                        this.this$0.decoderDataSource = "";
                        this.this$0.decoderStartPosition = 0;
                    }
                    if (this.this$0.decoderStart) {
                        this.this$0.mDecoder.start();
                        this.this$0.decoderStart = false;
                    }
                    if (this.this$0.decoderPrepareListener != null) {
                        this.this$0.mDecoder.setOnPreparedListener(this.this$0.decoderPrepareListener);
                        this.this$0.decoderPrepareListener = null;
                    }
                    if (this.this$0.decoderSizeChangeListener != null) {
                        this.this$0.mDecoder.setOnVideoSizeChangedListener(this.this$0.decoderSizeChangeListener);
                        this.this$0.decoderSizeChangeListener = null;
                    }
                    if (this.this$0.decoderInfoListener != null) {
                        this.this$0.mDecoder.setInfoListener(this.this$0.decoderInfoListener);
                        this.this$0.decoderInfoListener = null;
                    }
                    if (this.this$0.onPreparedlistener != null) {
                        this.this$0.mDecoder.setDecoderPrepared(this.this$0.onPreparedlistener);
                        this.this$0.onPreparedlistener = null;
                    }
                    if (this.this$0.seekCompleteListener != null) {
                        this.this$0.mDecoder.setOnSeekCompleteListener(this.this$0.seekCompleteListener);
                        this.this$0.seekCompleteListener = null;
                    }
                }
            }
        });
        Thread thread = new Thread(this.mGLDecoderRunnable);
        this.mDecoderThread = thread;
        thread.start();
    }

    public void init(EGLContext eGLContext, AbsDecoderFactory absDecoderFactory, @NonNull GLDecoderListener gLDecoderListener) {
        this.mListener = gLDecoderListener;
        this.mFactory = absDecoderFactory;
        this.isWorking = true;
        this.mGLDecoderRunnable = new GL2DDecoderRunnable(eGLContext, 1080, 1920, new GLDecoderRunnable.DecoderRunnableListener(this) { // from class: com.bilibili.opengldecoder.GLDecoder.2
            final GLDecoder this$0;

            {
                this.this$0 = this;
            }

            @Override // com.bilibili.opengldecoder.GLDecoderRunnable.DecoderRunnableListener
            public void onFrameAvailable(SurfaceTexture surfaceTexture) {
                if (this.this$0.isWorking) {
                    this.this$0.mListener.onFrameAvailable(surfaceTexture, this.this$0.textureId);
                }
            }

            @Override // com.bilibili.opengldecoder.GLDecoderRunnable.DecoderRunnableListener
            public void onSurfaceCreated() {
                if (this.this$0.isWorking) {
                    GLDecoder gLDecoder = this.this$0;
                    gLDecoder.textureId = gLDecoder.mGLDecoderRunnable.getTextureId();
                    this.this$0.mListener.onTextureIdGenerated(this.this$0.textureId);
                    GLDecoder gLDecoder2 = this.this$0;
                    gLDecoder2.mDecoder = gLDecoder2.mFactory.build();
                    this.this$0.setDecoderListener();
                    if (this.this$0.decoderCreate) {
                        this.this$0.mDecoder.init(this.this$0.decoderInitContext, this.this$0.mGLDecoderRunnable.getSurfaceTexture(), this.this$0.mGLDecoderRunnable.getSurfaceFrameListener());
                        this.this$0.decoderCreate = false;
                        this.this$0.decoderInitContext = null;
                    }
                    if (!TextUtils.isEmpty(this.this$0.decoderDataSource)) {
                        this.this$0.mDecoder.setDataSource(this.this$0.decoderDataSource, this.this$0.decoderStartPosition);
                        this.this$0.decoderDataSource = "";
                        this.this$0.decoderStartPosition = 0;
                    }
                    if (this.this$0.decoderStart) {
                        this.this$0.mDecoder.start();
                        this.this$0.decoderStart = false;
                    }
                    if (this.this$0.decoderPrepareListener != null) {
                        this.this$0.mDecoder.setOnPreparedListener(this.this$0.decoderPrepareListener);
                        this.this$0.decoderPrepareListener = null;
                    }
                    if (this.this$0.decoderSizeChangeListener != null) {
                        this.this$0.mDecoder.setOnVideoSizeChangedListener(this.this$0.decoderSizeChangeListener);
                        this.this$0.decoderSizeChangeListener = null;
                    }
                    if (this.this$0.decoderInfoListener != null) {
                        this.this$0.mDecoder.setInfoListener(this.this$0.decoderInfoListener);
                        this.this$0.decoderInfoListener = null;
                    }
                    if (this.this$0.onPreparedlistener != null) {
                        this.this$0.mDecoder.setDecoderPrepared(this.this$0.onPreparedlistener);
                        this.this$0.onPreparedlistener = null;
                    }
                    if (this.this$0.seekCompleteListener != null) {
                        this.this$0.mDecoder.setOnSeekCompleteListener(this.this$0.seekCompleteListener);
                        this.this$0.seekCompleteListener = null;
                    }
                }
            }
        });
        Thread thread = new Thread(this.mGLDecoderRunnable);
        this.mDecoderThread = thread;
        thread.start();
    }

    public void lockTexture() {
        this.mGLDecoderRunnable.setLockUpdate(true);
    }

    public void pause() {
        IDecoder iDecoder = this.mDecoder;
        if (iDecoder != null) {
            iDecoder.pause();
        }
        this.decoderStart = false;
    }

    public void release() throws InterruptedException {
        this.isWorking = false;
        GLDecoderRunnable gLDecoderRunnable = this.mGLDecoderRunnable;
        if (gLDecoderRunnable != null) {
            gLDecoderRunnable.stopDraw();
        }
        Thread thread = this.mDecoderThread;
        if (thread != null) {
            thread.join();
        }
        IDecoder iDecoder = this.mDecoder;
        if (iDecoder != null) {
            iDecoder.release();
        }
        this.mDecoder = null;
        this.mListener = null;
        this.mFactory = null;
    }

    public void reset() {
        IDecoder iDecoder = this.mDecoder;
        if (iDecoder != null) {
            iDecoder.reset();
        }
        this.decoderStart = false;
    }

    public void seekTo(long j7) {
        IDecoder iDecoder = this.mDecoder;
        if (iDecoder != null) {
            iDecoder.seekTo(j7);
        }
    }

    public void setDataSource(String str, int i7) {
        IDecoder iDecoder = this.mDecoder;
        if (iDecoder != null) {
            iDecoder.setDataSource(str, i7);
        } else {
            this.decoderDataSource = str;
            this.decoderStartPosition = i7;
        }
    }

    public void setDecoderListener() {
        IDecoder iDecoder = this.mDecoder;
        if (iDecoder == null || !(iDecoder instanceof IjkPlayer)) {
            return;
        }
        ((IjkPlayer) iDecoder).setIjkPlayerListener(new IjkPlayer.IJKPlayerCallbackListener(this) { // from class: com.bilibili.opengldecoder.GLDecoder.5
            final GLDecoder this$0;

            {
                this.this$0 = this;
            }

            @Override // com.bilibili.opengldecoder.IjkPlayer.IJKPlayerCallbackListener
            public int onRawDataWrite(byte[] bArr, int i7, int i8, int i9, int i10, int i11) {
                return this.this$0.mListener.onAudioRawData(bArr, i7, i8, i9, i10, i11);
            }
        });
    }

    public void setInfoListener(IMediaPlayer.OnInfoListener onInfoListener) {
        IDecoder iDecoder = this.mDecoder;
        if (iDecoder != null) {
            iDecoder.setInfoListener(onInfoListener);
        } else {
            this.decoderInfoListener = onInfoListener;
        }
    }

    public void setLoop(boolean z6) {
        IDecoder iDecoder = this.mDecoder;
        if (iDecoder != null) {
            iDecoder.setLoop(z6);
        }
    }

    public void setOnCompletionListener(IMediaPlayer.OnCompletionListener onCompletionListener) {
        IDecoder iDecoder = this.mDecoder;
        if (iDecoder != null) {
            iDecoder.setOnCompletionListener(onCompletionListener);
        }
    }

    public void setOnDecoderListener(IDecoder.OnDecoderPreparedListener onDecoderPreparedListener) {
        IDecoder iDecoder = this.mDecoder;
        if (iDecoder != null) {
            iDecoder.setDecoderPrepared(onDecoderPreparedListener);
        } else {
            this.onPreparedlistener = onDecoderPreparedListener;
        }
    }

    public void setOnPrepareListener(IMediaPlayer.OnPreparedListener onPreparedListener) {
        IDecoder iDecoder = this.mDecoder;
        if (iDecoder != null) {
            iDecoder.setOnPreparedListener(onPreparedListener);
        } else {
            this.decoderPrepareListener = onPreparedListener;
        }
    }

    public void setOnVideoSizeChangedListener(IMediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener) {
        IDecoder iDecoder = this.mDecoder;
        if (iDecoder != null) {
            iDecoder.setOnVideoSizeChangedListener(onVideoSizeChangedListener);
        } else {
            this.decoderSizeChangeListener = onVideoSizeChangedListener;
        }
    }

    public void setSeekCompleteListener(IMediaPlayer.OnSeekCompleteListener onSeekCompleteListener) {
        IDecoder iDecoder = this.mDecoder;
        if (iDecoder != null) {
            iDecoder.setOnSeekCompleteListener(onSeekCompleteListener);
        } else {
            this.seekCompleteListener = onSeekCompleteListener;
        }
    }

    public void setSpeed(float f7) {
        IDecoder iDecoder = this.mDecoder;
        if (iDecoder != null) {
            iDecoder.setSpeed(f7);
        }
    }

    public void setVolume(float f7, float f8) {
        IDecoder iDecoder = this.mDecoder;
        if (iDecoder != null) {
            iDecoder.setVolume(f7, f8);
        }
    }

    public void start() {
        IDecoder iDecoder = this.mDecoder;
        if (iDecoder != null) {
            iDecoder.start();
        }
        this.decoderStart = true;
    }

    public void unlockTexture() {
        this.mGLDecoderRunnable.setLockUpdate(false);
    }
}
