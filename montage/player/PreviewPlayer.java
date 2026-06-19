package com.bilibili.montage.player;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bilibili.montage.MontageLiveWindow;
import com.bilibili.montage.MontageLiveWindowExt;
import com.bilibili.montage.avutil.LogSinker;
import com.bilibili.montage.timeline.MontageTimeline;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/player/PreviewPlayer.class */
public class PreviewPlayer {
    private static final long INVALID_PTR = -1;
    public static final int MONTAGE_PLAYBACK_ERROR = 3;
    public static final int MONTAGE_PLAYBACK_MESSAGE = 1;
    public static final int MONTAGE_PLAYBACK_STATUS = 0;
    public static final int PLAYBACK_AUDIO_CLOCK = 1;
    public static final int PLAYBACK_AUDIO_MCM_SHUTDOWN = 0;
    public static final int PLAYBACK_EXTERNAL_CLOCK = 0;
    public static final int PLAYBACK_MSG_COMPLETED = 3;
    public static final int PLAYBACK_MSG_FIRST_FRAME = 5;
    public static final int PLAYBACK_MSG_PREPARED = 0;
    public static final int PLAYBACK_MSG_PROGRESS = 1;
    public static final int PLAYBACK_MSG_SEEK_COMPLETED = 2;
    public static final int PLAYBACK_MSG_TIMELINE_CHANGED = 4;
    public static final int PLAYBACK_STATUS_IDLE = 0;
    public static final int PLAYBACK_STATUS_INITIALIZED = 1;
    public static final int PLAYBACK_STATUS_PAUSED = 3;
    public static final int PLAYBACK_STATUS_PLAYING = 2;
    public static final int PLAYBACK_STATUS_STOPPED = 4;
    public static final int PLAYBACK_VIDEO_MCM_SHUTDOWN = 1;
    private static final String TAG = "PreviewPlayer";
    private EventHandler mEventHandler;
    private HandlerThread mHandlerThread;
    private boolean mIsSurfaceView;
    private long mNativePlayer;
    private IPlaybackCallback mPlaybackCallback;
    private final ReadWriteLock mReadWriteLock;
    private MontageTimeline mTimeline;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/player/PreviewPlayer$EventHandler.class */
    public static class EventHandler extends Handler {
        private final WeakReference<PreviewPlayer> mWeakPlayer;

        public EventHandler(PreviewPlayer previewPlayer, Looper looper) {
            super(looper);
            this.mWeakPlayer = new WeakReference<>(previewPlayer);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            PreviewPlayer previewPlayer = this.mWeakPlayer.get();
            if (previewPlayer == null) {
                LogSinker.w(PreviewPlayer.TAG, "PreviewPlayer went away with unhandled events");
                return;
            }
            int i7 = message.what;
            if (i7 == 0) {
                if (message.arg1 == 4 && previewPlayer.mPlaybackCallback != null) {
                    previewPlayer.mPlaybackCallback.onPlaybackStopped(previewPlayer.mTimeline);
                    return;
                }
                return;
            }
            if (i7 != 1) {
                if (i7 == 3 && previewPlayer.mPlaybackCallback != null) {
                    previewPlayer.mPlaybackCallback.onPlaybackError(previewPlayer.mTimeline, message.arg1, (String) message.obj);
                    return;
                }
                return;
            }
            int i8 = message.arg1;
            if (i8 == 0) {
                if (previewPlayer.mPlaybackCallback != null) {
                    previewPlayer.mPlaybackCallback.onPlaybackPrepared(previewPlayer.mTimeline);
                    return;
                }
                return;
            }
            if (i8 == 1) {
                if (previewPlayer.mPlaybackCallback == null || message.obj == null) {
                    return;
                }
                previewPlayer.mPlaybackCallback.onPlaybackPosition(previewPlayer.mTimeline, ((Long) message.obj).longValue());
                return;
            }
            if (i8 == 2) {
                if (previewPlayer.mPlaybackCallback != null) {
                    previewPlayer.mPlaybackCallback.onSeekCompleted(previewPlayer.mTimeline);
                }
            } else {
                if (i8 != 3) {
                    if (i8 == 5 && previewPlayer.mPlaybackCallback != null) {
                        previewPlayer.mPlaybackCallback.onPlaybackFirstFrame(previewPlayer.mTimeline);
                        return;
                    }
                    return;
                }
                if (previewPlayer.mPlaybackCallback != null) {
                    previewPlayer.pausePlayback();
                    previewPlayer.mPlaybackCallback.onPlaybackEOF(previewPlayer.mTimeline);
                }
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/player/PreviewPlayer$IPlaybackCallback.class */
    public interface IPlaybackCallback {
        void onPlaybackEOF(MontageTimeline montageTimeline);

        void onPlaybackError(MontageTimeline montageTimeline, int i7, String str);

        void onPlaybackFirstFrame(MontageTimeline montageTimeline);

        void onPlaybackPosition(MontageTimeline montageTimeline, long j7);

        void onPlaybackPrepared(MontageTimeline montageTimeline);

        void onPlaybackStopped(MontageTimeline montageTimeline);

        void onSeekCompleted(MontageTimeline montageTimeline);
    }

    private PreviewPlayer() {
        this.mIsSurfaceView = false;
        this.mReadWriteLock = new ReentrantReadWriteLock();
        this.mPlaybackCallback = new IPlaybackCallback(this) { // from class: com.bilibili.montage.player.PreviewPlayer.1
            final PreviewPlayer this$0;

            {
                this.this$0 = this;
            }

            @Override // com.bilibili.montage.player.PreviewPlayer.IPlaybackCallback
            public void onPlaybackEOF(MontageTimeline montageTimeline) {
                LogSinker.i(PreviewPlayer.TAG, "onPlaybackEOF");
            }

            @Override // com.bilibili.montage.player.PreviewPlayer.IPlaybackCallback
            public void onPlaybackError(MontageTimeline montageTimeline, int i7, String str) {
                LogSinker.e(PreviewPlayer.TAG, "onPlaybackError errorCode : " + i7 + "  errorMessage : " + str);
            }

            @Override // com.bilibili.montage.player.PreviewPlayer.IPlaybackCallback
            public void onPlaybackFirstFrame(MontageTimeline montageTimeline) {
                LogSinker.i(PreviewPlayer.TAG, "onPlaybackFirstFrame");
            }

            @Override // com.bilibili.montage.player.PreviewPlayer.IPlaybackCallback
            public void onPlaybackPosition(MontageTimeline montageTimeline, long j7) {
            }

            @Override // com.bilibili.montage.player.PreviewPlayer.IPlaybackCallback
            public void onPlaybackPrepared(MontageTimeline montageTimeline) {
                LogSinker.i(PreviewPlayer.TAG, "onPlaybackPrepared");
            }

            @Override // com.bilibili.montage.player.PreviewPlayer.IPlaybackCallback
            public void onPlaybackStopped(MontageTimeline montageTimeline) {
                LogSinker.i(PreviewPlayer.TAG, "onPlaybackStopped");
            }

            @Override // com.bilibili.montage.player.PreviewPlayer.IPlaybackCallback
            public void onSeekCompleted(MontageTimeline montageTimeline) {
            }
        };
    }

    public PreviewPlayer(MontageTimeline montageTimeline, IPlaybackCallback iPlaybackCallback) {
        this.mIsSurfaceView = false;
        this.mReadWriteLock = new ReentrantReadWriteLock();
        new IPlaybackCallback(this) { // from class: com.bilibili.montage.player.PreviewPlayer.1
            final PreviewPlayer this$0;

            {
                this.this$0 = this;
            }

            @Override // com.bilibili.montage.player.PreviewPlayer.IPlaybackCallback
            public void onPlaybackEOF(MontageTimeline montageTimeline2) {
                LogSinker.i(PreviewPlayer.TAG, "onPlaybackEOF");
            }

            @Override // com.bilibili.montage.player.PreviewPlayer.IPlaybackCallback
            public void onPlaybackError(MontageTimeline montageTimeline2, int i7, String str) {
                LogSinker.e(PreviewPlayer.TAG, "onPlaybackError errorCode : " + i7 + "  errorMessage : " + str);
            }

            @Override // com.bilibili.montage.player.PreviewPlayer.IPlaybackCallback
            public void onPlaybackFirstFrame(MontageTimeline montageTimeline2) {
                LogSinker.i(PreviewPlayer.TAG, "onPlaybackFirstFrame");
            }

            @Override // com.bilibili.montage.player.PreviewPlayer.IPlaybackCallback
            public void onPlaybackPosition(MontageTimeline montageTimeline2, long j7) {
            }

            @Override // com.bilibili.montage.player.PreviewPlayer.IPlaybackCallback
            public void onPlaybackPrepared(MontageTimeline montageTimeline2) {
                LogSinker.i(PreviewPlayer.TAG, "onPlaybackPrepared");
            }

            @Override // com.bilibili.montage.player.PreviewPlayer.IPlaybackCallback
            public void onPlaybackStopped(MontageTimeline montageTimeline2) {
                LogSinker.i(PreviewPlayer.TAG, "onPlaybackStopped");
            }

            @Override // com.bilibili.montage.player.PreviewPlayer.IPlaybackCallback
            public void onSeekCompleted(MontageTimeline montageTimeline2) {
            }
        };
        this.mPlaybackCallback = iPlaybackCallback;
        HandlerThread handlerThread = new HandlerThread("native-message-thread");
        this.mHandlerThread = handlerThread;
        handlerThread.start();
        this.mEventHandler = new EventHandler(this, this.mHandlerThread.getLooper());
        this.mTimeline = montageTimeline;
        this.mNativePlayer = nativeSetup(new WeakReference(this), montageTimeline);
        setClockType(0);
    }

    private native boolean nativeConnectLiveWindow(long j7, long j8);

    private native boolean nativeConnectSurfaceTexture(long j7, SurfaceTexture surfaceTexture);

    private native void nativeDestroy(long j7);

    private native long nativeGetCurrentPosition(long j7);

    private native int nativeGetPlayerState(long j7);

    private native boolean nativePausePlayback(long j7);

    private native boolean nativePlaybackTimeline(long j7, long j8, long j9);

    private native boolean nativeRefresh(long j7);

    private native boolean nativeResumePlayback(long j7);

    private native boolean nativeSaveLastFrameToLiveWindow(long j7);

    private native boolean nativeSeekTimeline(long j7, long j8);

    private static native void nativeSetAuroraResPath(String str);

    private native void nativeSetClockType(long j7, int i7);

    private native void nativeSetPlayBackFlag(long j7, int i7);

    private native long nativeSetup(Object obj, MontageTimeline montageTimeline);

    private native void nativeShowLastFrameOfLiveWindow(long j7, boolean z6);

    private native boolean nativeUpdateTimeline(long j7, MontageTimeline montageTimeline);

    private static void postEventFromNative(Object obj, int i7, int i8, int i9, Object obj2) {
        PreviewPlayer previewPlayer;
        EventHandler eventHandler;
        if (obj == null || (previewPlayer = (PreviewPlayer) ((WeakReference) obj).get()) == null || (eventHandler = previewPlayer.mEventHandler) == null) {
            return;
        }
        previewPlayer.mEventHandler.sendMessage(eventHandler.obtainMessage(i7, i8, i9, obj2));
    }

    public static void setAuroraResPath(String str) {
        nativeSetAuroraResPath(str);
    }

    public boolean connectLiveWindow(MontageLiveWindow montageLiveWindow) {
        this.mReadWriteLock.readLock().lock();
        long j7 = this.mNativePlayer;
        boolean zNativeConnectLiveWindow = j7 != 0 ? nativeConnectLiveWindow(j7, montageLiveWindow.getNativeLiveWindow()) : false;
        this.mReadWriteLock.readLock().unlock();
        if (zNativeConnectLiveWindow) {
            this.mIsSurfaceView = true;
        }
        return zNativeConnectLiveWindow;
    }

    public boolean connectLiveWindow(MontageLiveWindowExt montageLiveWindowExt) {
        this.mReadWriteLock.readLock().lock();
        long j7 = this.mNativePlayer;
        boolean zNativeConnectLiveWindow = j7 != 0 ? nativeConnectLiveWindow(j7, montageLiveWindowExt.getNativeLiveWindow()) : false;
        this.mReadWriteLock.readLock().unlock();
        if (zNativeConnectLiveWindow) {
            this.mIsSurfaceView = false;
        }
        return zNativeConnectLiveWindow;
    }

    public boolean connectSurfaceTexture(SurfaceTexture surfaceTexture) {
        this.mReadWriteLock.readLock().lock();
        long j7 = this.mNativePlayer;
        boolean zNativeConnectSurfaceTexture = j7 != 0 ? nativeConnectSurfaceTexture(j7, surfaceTexture) : false;
        this.mReadWriteLock.readLock().unlock();
        if (zNativeConnectSurfaceTexture) {
            this.mIsSurfaceView = false;
        }
        return zNativeConnectSurfaceTexture;
    }

    public void destroy() {
        this.mReadWriteLock.writeLock().lock();
        long j7 = this.mNativePlayer;
        if (0 != j7) {
            nativeDestroy(j7);
            this.mNativePlayer = 0L;
        }
        this.mReadWriteLock.writeLock().unlock();
        HandlerThread handlerThread = this.mHandlerThread;
        if (handlerThread != null) {
            handlerThread.quit();
            this.mHandlerThread = null;
        }
        this.mEventHandler = null;
    }

    public long getCurrentPosition() {
        this.mReadWriteLock.readLock().lock();
        long j7 = this.mNativePlayer;
        long jNativeGetCurrentPosition = 0;
        if (j7 != 0) {
            jNativeGetCurrentPosition = nativeGetCurrentPosition(j7);
        }
        this.mReadWriteLock.readLock().unlock();
        return jNativeGetCurrentPosition;
    }

    public int getPlayerState() {
        this.mReadWriteLock.readLock().lock();
        long j7 = this.mNativePlayer;
        int iNativeGetPlayerState = j7 != 0 ? nativeGetPlayerState(j7) : 0;
        this.mReadWriteLock.readLock().unlock();
        return iNativeGetPlayerState;
    }

    public boolean pausePlayback() {
        this.mReadWriteLock.readLock().lock();
        long j7 = this.mNativePlayer;
        boolean zNativePausePlayback = j7 != 0 ? nativePausePlayback(j7) : true;
        this.mReadWriteLock.readLock().unlock();
        return zNativePausePlayback;
    }

    public boolean playbackTimeline(long j7) {
        this.mReadWriteLock.readLock().lock();
        long j8 = this.mNativePlayer;
        boolean zNativePlaybackTimeline = j8 != 0 ? nativePlaybackTimeline(j8, j7, 0L) : true;
        this.mReadWriteLock.readLock().unlock();
        return zNativePlaybackTimeline;
    }

    public boolean playbackTimeline(long j7, long j8) {
        this.mReadWriteLock.readLock().lock();
        long j9 = this.mNativePlayer;
        boolean zNativePlaybackTimeline = j9 != 0 ? nativePlaybackTimeline(j9, j7, j8) : true;
        this.mReadWriteLock.readLock().unlock();
        return zNativePlaybackTimeline;
    }

    public boolean refresh() {
        this.mReadWriteLock.readLock().lock();
        long j7 = this.mNativePlayer;
        boolean zNativeRefresh = j7 != 0 ? nativeRefresh(j7) : true;
        this.mReadWriteLock.readLock().unlock();
        return zNativeRefresh;
    }

    public boolean resumePlayback() {
        this.mReadWriteLock.readLock().lock();
        long j7 = this.mNativePlayer;
        boolean zNativeResumePlayback = j7 != 0 ? nativeResumePlayback(j7) : true;
        this.mReadWriteLock.readLock().unlock();
        return zNativeResumePlayback;
    }

    public boolean saveLastFrameToLiveWindow() {
        this.mReadWriteLock.readLock().lock();
        long j7 = this.mNativePlayer;
        boolean zNativeSaveLastFrameToLiveWindow = (j7 == 0 || !this.mIsSurfaceView) ? false : nativeSaveLastFrameToLiveWindow(j7);
        this.mReadWriteLock.readLock().unlock();
        return zNativeSaveLastFrameToLiveWindow;
    }

    public boolean seekTimelinePosition(long j7) {
        this.mReadWriteLock.readLock().lock();
        long j8 = this.mNativePlayer;
        boolean zNativeSeekTimeline = j8 != 0 ? nativeSeekTimeline(j8, j7) : true;
        this.mReadWriteLock.readLock().unlock();
        return zNativeSeekTimeline;
    }

    public void setClockType(int i7) {
        this.mReadWriteLock.readLock().lock();
        long j7 = this.mNativePlayer;
        if (j7 != 0) {
            nativeSetClockType(j7, i7);
        }
        this.mReadWriteLock.readLock().unlock();
    }

    public void setPlayBackFlag(int i7) {
        this.mReadWriteLock.readLock().lock();
        long j7 = this.mNativePlayer;
        if (j7 != 0) {
            nativeSetPlayBackFlag(j7, i7);
        }
        this.mReadWriteLock.readLock().unlock();
    }

    public void setPlaybackCallback(IPlaybackCallback iPlaybackCallback) {
        this.mPlaybackCallback = iPlaybackCallback;
    }

    public void showLastFrameOfLiveWindow(boolean z6) {
        this.mReadWriteLock.readLock().lock();
        long j7 = this.mNativePlayer;
        if (j7 != 0) {
            nativeShowLastFrameOfLiveWindow(j7, z6);
        }
        this.mReadWriteLock.readLock().unlock();
    }

    public boolean updateTimeline(MontageTimeline montageTimeline) {
        boolean zNativeUpdateTimeline;
        this.mReadWriteLock.readLock().lock();
        long j7 = this.mNativePlayer;
        if (j7 != 0) {
            this.mTimeline = montageTimeline;
            zNativeUpdateTimeline = nativeUpdateTimeline(j7, montageTimeline);
        } else {
            zNativeUpdateTimeline = true;
        }
        this.mReadWriteLock.readLock().unlock();
        return zNativeUpdateTimeline;
    }
}
