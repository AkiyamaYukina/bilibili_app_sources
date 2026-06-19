package com.bilibili.live.streaming;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import com.bilibili.live.streaming.encoder.EncoderConfig;
import com.bilibili.live.streaming.gl.BEGLContext;
import com.bilibili.live.streaming.gl.BEGLCurrentState;
import com.bilibili.live.streaming.gl.BGLException;
import com.bilibili.live.streaming.log.LivePusherLog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/AVBaseContext.class */
public class AVBaseContext {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final String TAG = "BAVContext";

    @Nullable
    private BEGLContext eglContext;

    @NotNull
    private final EncoderConfig encoderConfig;

    @Nullable
    private Handler mBackgroundHandler;

    @Nullable
    private HandlerThread mBackgroundThread;

    @Nullable
    private Handler railgunHandler;
    private long timestampBeginPoint;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/AVBaseContext$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AVBaseContext(@NotNull EGLContext eGLContext, @NotNull EncoderConfig encoderConfig) {
        this.eglContext = BEGLContext.create(eGLContext, false);
        this.encoderConfig = encoderConfig;
    }

    public AVBaseContext(@NotNull EncoderConfig encoderConfig) {
        this(EGL14.EGL_NO_CONTEXT, encoderConfig);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.lang.Runnable] */
    private final void destroyBackgroundThread() {
        Handler handler = this.mBackgroundHandler;
        if (handler != 0) {
            handler.post(new Object());
        }
        try {
            HandlerThread handlerThread = this.mBackgroundThread;
            if (handlerThread != null) {
                handlerThread.join();
            }
            this.mBackgroundHandler = null;
            this.mBackgroundThread = null;
        } catch (InterruptedException e7) {
            LivePusherLog.e(TAG, "destroyBackgroundThread exception: ", e7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void destroyBackgroundThread$lambda$2() {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null) {
            looperMyLooper.quit();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enableBackgroundThread$lambda$1(AVBaseContext aVBaseContext) {
        try {
            BEGLContext bEGLContext = aVBaseContext.eglContext;
            if (bEGLContext != null) {
                bEGLContext.makeCurrent();
            }
        } catch (BGLException e7) {
            LivePusherLog.e(TAG, "run: OpenGL-BackgroundThread: fail to make current exception: ", e7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runInBackground$lambda$3(AVBaseContext aVBaseContext, Runnable runnable) {
        BEGLCurrentState bEGLCurrentState = null;
        BEGLCurrentState bEGLCurrentState2 = null;
        try {
            try {
                BEGLCurrentState bEGLCurrentStateSave = BEGLCurrentState.save();
                BEGLContext bEGLContext = aVBaseContext.eglContext;
                if (bEGLContext != null) {
                    bEGLContext.makeCurrent();
                }
                bEGLCurrentState2 = bEGLCurrentStateSave;
                bEGLCurrentState = bEGLCurrentStateSave;
                runnable.run();
                if (bEGLCurrentStateSave != null) {
                    bEGLCurrentStateSave.restore();
                }
                return Unit.INSTANCE;
            } catch (BGLException e7) {
                LivePusherLog.e(TAG, "runInBackground exception: ", e7);
                bEGLCurrentState2 = bEGLCurrentState;
                throw e7;
            }
        } catch (Throwable th) {
            if (bEGLCurrentState2 != null) {
                bEGLCurrentState2.restore();
            }
            throw th;
        }
    }

    public void destroy() {
        destroyBackgroundThread();
        BEGLContext bEGLContext = this.eglContext;
        if (bEGLContext != null) {
            bEGLContext.destroy();
        }
        this.eglContext = null;
    }

    public final void enableBackgroundThread() {
        destroyBackgroundThread();
        HandlerThread handlerThread = new HandlerThread("OpenGL-Background");
        this.mBackgroundThread = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.mBackgroundHandler = handler;
        handler.post(new com.bilibili.app.comment3.ui.nextholderexp3.handle.a(this, 2));
    }

    @Nullable
    public final BEGLContext getEglContext() {
        return this.eglContext;
    }

    @NotNull
    public final EncoderConfig getEncoderConfig() {
        return this.encoderConfig;
    }

    @Nullable
    public final Handler getRailgunHandler() {
        return this.railgunHandler;
    }

    public final long getTimeStampUs() {
        return (SystemClock.uptimeMillis() * ((long) 1000)) - this.timestampBeginPoint;
    }

    public final long getTimestampBeginPoint() {
        return this.timestampBeginPoint;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.live.streaming.b, java.lang.Object] */
    public final void runInBackground(long j7, @NotNull final Runnable runnable) {
        ?? r02 = new Function0(this, runnable) { // from class: com.bilibili.live.streaming.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final AVBaseContext f65241a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Runnable f65242b;

            {
                this.f65241a = this;
                this.f65242b = runnable;
            }

            public final Object invoke() {
                return AVBaseContext.runInBackground$lambda$3(this.f65241a, this.f65242b);
            }
        };
        Handler handler = this.mBackgroundHandler;
        Handler handler2 = handler;
        if (handler == null) {
            handler2 = this.railgunHandler;
        }
        if (handler2 != null) {
            handler2.postDelayed(new com.bilibili.bililive.room.ui.roomv3.player.sp.b((Object) r02, 1), j7);
        } else {
            r02.invoke();
        }
    }

    public final void runInBackground(@NotNull Runnable runnable) {
        runInBackground(0L, runnable);
    }

    public final void setEglContext(@Nullable BEGLContext bEGLContext) {
        this.eglContext = bEGLContext;
    }

    public final void setRailgunHandler(@Nullable Handler handler) {
        this.railgunHandler = handler;
    }

    public final void setTimestampBeginPoint() {
        this.timestampBeginPoint = SystemClock.uptimeMillis() * ((long) 1000);
    }

    public final void setTimestampBeginPoint(long j7) {
        this.timestampBeginPoint = j7;
    }
}
