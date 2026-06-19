package com.bilibili.live.streaming.source;

import android.graphics.SurfaceTexture;
import android.os.SystemClock;
import com.bilibili.bililive.framecapture.LiveScreenCaptureFrameCount;
import com.bilibili.lib.ghost.api.Insertion;
import com.bilibili.live.streaming.AVContext;
import com.bilibili.live.streaming.callback.ILivePushEventCallback;
import com.bilibili.live.streaming.filter.FilterBase;
import com.bilibili.live.streaming.gl.BEGLContext;
import com.bilibili.live.streaming.gl.BGLDrawer;
import com.bilibili.live.streaming.gl.BGLException;
import com.bilibili.live.streaming.gl.BGLFramebuffer;
import com.bilibili.live.streaming.gl.BGLMatrix;
import com.bilibili.live.streaming.gl.BGLTexture;
import com.bilibili.live.streaming.gl.BGLUtil;
import com.bilibili.live.streaming.gl.Shaders;
import com.bilibili.live.streaming.log.LivePusherLog;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/source/CaptureSource.class */
public abstract class CaptureSource extends FilterBase implements SurfaceTexture.OnFrameAvailableListener {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final String TAG = "CaptureSource";

    @Nullable
    private SurfaceTexture mCaptureSurfaceTexture;

    @Nullable
    private BGLTexture mCaptureTexture;

    @Nullable
    private BGLTexture mCaptureTexture2D;
    private long mFirstFrameReceivedTimeMs;
    private int mHeight;

    @Nullable
    private Integer mRealHeight;

    @Nullable
    private Integer mRealWidth;
    private boolean mUseAlphaChannel;
    private boolean mUseTexture2D;
    private int mWidth;

    @NotNull
    private final AtomicInteger mTickSinceTextureUpdated = new AtomicInteger(0);

    @NotNull
    private final BGLMatrix mTransformMatrix = BGLMatrix.Companion.create();

    @NotNull
    private final AtomicLong mHasFrameArrived = new AtomicLong(0);

    @NotNull
    private AtomicInteger mReceivedFrameCount = new AtomicInteger();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/source/CaptureSource$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @JvmStatic
    @Insertion(isStatic = false, name = "onFrameAvailable", owner = {"com.bilibili.live.streaming.source.CaptureSource"})
    private static void __Ghost$Insertion$com_bilibili_bililive_framecapture_LiveScreenFrameCaptureGhost_hookScreenCapture(@NotNull Object obj, @NotNull SurfaceTexture surfaceTexture) {
        if (obj instanceof ScreenCaptureSource) {
            LiveScreenCaptureFrameCount.INSTANCE.getScreenCaptureFrameCount().incrementAndGet();
        }
        ((CaptureSource) obj).__Ghost$Origin$onFrameAvailable(surfaceTexture);
    }

    private void __Ghost$Origin$onFrameAvailable(@Nullable SurfaceTexture surfaceTexture) {
        AtomicLong atomicLong = this.mHasFrameArrived;
        atomicLong.set(atomicLong.get() + 1);
        this.mTickSinceTextureUpdated.set(0);
        this.mReceivedFrameCount.incrementAndGet();
    }

    private final void destroyThis() {
        SurfaceTexture surfaceTexture = this.mCaptureSurfaceTexture;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        this.mCaptureSurfaceTexture = null;
        BGLTexture bGLTexture = this.mCaptureTexture;
        if (bGLTexture != null) {
            bGLTexture.destroy();
        }
        this.mCaptureTexture = null;
        BGLTexture bGLTexture2 = this.mCaptureTexture2D;
        if (bGLTexture2 != null) {
            bGLTexture2.destroy();
        }
        this.mCaptureTexture2D = null;
        this.mFirstFrameReceivedTimeMs = 0L;
        this.mReceivedFrameCount.set(0);
    }

    public final void attachCaptureTexture() {
        BEGLContext eglContext;
        destroyThis();
        try {
            AVContext aVContext = this.mCtx;
            if (aVContext == null || (eglContext = aVContext.getEglContext()) == null) {
                return;
            }
            eglContext.makeCurrent();
            BGLTexture bGLTextureCreateTexOES = BGLTexture.createTexOES();
            if (bGLTextureCreateTexOES != null) {
                SurfaceTexture surfaceTexture = new SurfaceTexture(bGLTextureCreateTexOES.getTexName());
                BGLUtil.clearErrors();
                surfaceTexture.setDefaultBufferSize(getWidth(), getHeight());
                surfaceTexture.setOnFrameAvailableListener(this);
                this.mCaptureSurfaceTexture = surfaceTexture;
                bGLTextureCreateTexOES.setSize(getWidth(), getHeight());
            } else {
                bGLTextureCreateTexOES = null;
            }
            this.mCaptureTexture = bGLTextureCreateTexOES;
        } catch (BGLException e7) {
            LivePusherLog.e(TAG, "attachCaptureTexture exception: ", e7);
            destroyThis();
        }
    }

    public final void attachCaptureTexture(@NotNull SurfaceTexture surfaceTexture) {
        BEGLContext eglContext;
        destroyThis();
        try {
            AVContext aVContext = this.mCtx;
            if (aVContext == null || (eglContext = aVContext.getEglContext()) == null) {
                return;
            }
            eglContext.makeCurrent();
            BGLTexture bGLTextureCreateTexOES = BGLTexture.createTexOES();
            BGLUtil.clearErrors();
            surfaceTexture.attachToGLContext(bGLTextureCreateTexOES.getTexName());
            this.mCaptureTexture = bGLTextureCreateTexOES;
            surfaceTexture.setOnFrameAvailableListener(this);
            this.mCaptureSurfaceTexture = surfaceTexture;
        } catch (BGLException e7) {
            LivePusherLog.e(TAG, "attachCaptureTexture(surfaceTexture: SurfaceTexture) exception: ", e7);
            destroyThis();
        }
    }

    @Override // com.bilibili.live.streaming.filter.IVideoSource
    public void destroy() {
        LivePusherLog.i$default(TAG, this + ", destroy!!", null, 4, null);
        destroyThis();
    }

    @Nullable
    public final SurfaceTexture detachCaptureTexture() {
        BEGLContext eglContext;
        SurfaceTexture surfaceTexture;
        try {
            AVContext aVContext = this.mCtx;
            if (aVContext == null || (eglContext = aVContext.getEglContext()) == null) {
                return null;
            }
            SurfaceTexture surfaceTexture2 = this.mCaptureSurfaceTexture;
            if (surfaceTexture2 != null) {
                eglContext.makeCurrent();
                surfaceTexture2.setOnFrameAvailableListener(null);
                surfaceTexture2.detachFromGLContext();
                BGLTexture bGLTexture = this.mCaptureTexture;
                surfaceTexture = surfaceTexture2;
                if (bGLTexture != null) {
                    bGLTexture.destroy();
                    surfaceTexture = surfaceTexture2;
                }
            } else {
                surfaceTexture = null;
            }
            this.mCaptureTexture = null;
            this.mCaptureSurfaceTexture = null;
            return surfaceTexture;
        } catch (BGLException e7) {
            e7.printStackTrace();
            return null;
        }
    }

    public void finalize() {
    }

    @Override // com.bilibili.live.streaming.filter.IVideoSource
    public int getHeight() {
        return this.mHeight;
    }

    @Nullable
    public final SurfaceTexture getMCaptureSurfaceTexture() {
        return this.mCaptureSurfaceTexture;
    }

    @Nullable
    public final BGLTexture getMCaptureTexture() {
        return this.mCaptureTexture;
    }

    @Nullable
    public final BGLTexture getMCaptureTexture2D() {
        return this.mCaptureTexture2D;
    }

    public final long getMFirstFrameReceivedTimeMs() {
        return this.mFirstFrameReceivedTimeMs;
    }

    @NotNull
    public final AtomicLong getMHasFrameArrived() {
        return this.mHasFrameArrived;
    }

    public final int getMHeight() {
        return this.mHeight;
    }

    @Nullable
    public final Integer getMRealHeight() {
        return this.mRealHeight;
    }

    @Nullable
    public final Integer getMRealWidth() {
        return this.mRealWidth;
    }

    @NotNull
    public final AtomicInteger getMReceivedFrameCount() {
        return this.mReceivedFrameCount;
    }

    @NotNull
    public final AtomicInteger getMTickSinceTextureUpdated() {
        return this.mTickSinceTextureUpdated;
    }

    @NotNull
    public final BGLMatrix getMTransformMatrix() {
        return this.mTransformMatrix;
    }

    public final boolean getMUseAlphaChannel() {
        return this.mUseAlphaChannel;
    }

    public final boolean getMUseTexture2D() {
        return this.mUseTexture2D;
    }

    public final int getMWidth() {
        return this.mWidth;
    }

    @Override // com.bilibili.live.streaming.filter.IVideoSource
    public int getWidth() {
        return this.mWidth;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        __Ghost$Insertion$com_bilibili_bililive_framecapture_LiveScreenFrameCaptureGhost_hookScreenCapture(this, surfaceTexture);
    }

    public final void setMCaptureSurfaceTexture(@Nullable SurfaceTexture surfaceTexture) {
        this.mCaptureSurfaceTexture = surfaceTexture;
    }

    public final void setMCaptureTexture(@Nullable BGLTexture bGLTexture) {
        this.mCaptureTexture = bGLTexture;
    }

    public final void setMCaptureTexture2D(@Nullable BGLTexture bGLTexture) {
        this.mCaptureTexture2D = bGLTexture;
    }

    public final void setMFirstFrameReceivedTimeMs(long j7) {
        this.mFirstFrameReceivedTimeMs = j7;
    }

    public final void setMHeight(int i7) {
        this.mHeight = i7;
    }

    public final void setMRealHeight(@Nullable Integer num) {
        this.mRealHeight = num;
    }

    public final void setMRealWidth(@Nullable Integer num) {
        this.mRealWidth = num;
    }

    public final void setMReceivedFrameCount(@NotNull AtomicInteger atomicInteger) {
        this.mReceivedFrameCount = atomicInteger;
    }

    public final void setMUseAlphaChannel(boolean z6) {
        this.mUseAlphaChannel = z6;
    }

    public final void setMUseTexture2D(boolean z6) {
        this.mUseTexture2D = z6;
    }

    public final void setMWidth(int i7) {
        this.mWidth = i7;
    }

    @Override // com.bilibili.live.streaming.filter.IVideoSource
    public void tick(long j7) {
        BGLTexture bGLTexture;
        BGLDrawer inputTexDrawer;
        if (this.mTickSinceTextureUpdated.incrementAndGet() > 15) {
            return;
        }
        if (this.mFirstFrameReceivedTimeMs == 0) {
            this.mFirstFrameReceivedTimeMs = SystemClock.uptimeMillis();
        } else {
            long jUptimeMillis = SystemClock.uptimeMillis();
            long j8 = jUptimeMillis - this.mFirstFrameReceivedTimeMs;
            if (j8 > this.mCtx.getReportTimeIntervalMs()) {
                double d7 = (((double) this.mReceivedFrameCount.get()) * 1000.0d) / j8;
                LivePusherLog.i$default(TAG, getName() + ": FPS=" + d7, null, 4, null);
                String strTrimIndent = StringsKt.trimIndent("\n                    {\"name\":\"" + getName() + "\", \"fps\":" + d7 + "}\n                ");
                ILivePushEventCallback livePushEventCallback = this.mCtx.getLivePushEventCallback();
                if (livePushEventCallback != null) {
                    livePushEventCallback.onEventMessage(ILivePushEventCallback.LivePushEventID.CAPTURE_RENDER, strTrimIndent);
                }
                this.mFirstFrameReceivedTimeMs = jUptimeMillis;
                this.mReceivedFrameCount.set(0);
            }
        }
        try {
            SurfaceTexture surfaceTexture = this.mCaptureSurfaceTexture;
            if (surfaceTexture != null) {
                surfaceTexture.updateTexImage();
                surfaceTexture.getTransformMatrix(this.mTransformMatrix.data());
                BGLMatrix bGLMatrix = this.mTransformMatrix;
                float[] fArrData = bGLMatrix.data();
                BGLMatrix bGLMatrixClone = bGLMatrix.clone();
                float[] fArrData2 = bGLMatrixClone.data();
                for (int i7 = 0; i7 < 4; i7++) {
                    for (int i8 = 0; i8 < 4; i8++) {
                        BGLMatrix.Companion companion = BGLMatrix.Companion;
                        fArrData[(i8 * 4) + i7] = fArrData2[(i7 * 4) + i8];
                    }
                }
                bGLMatrixClone.release();
                if (this.mUseTexture2D) {
                    if (this.mCaptureTexture2D == null) {
                        this.mCaptureTexture2D = BGLTexture.createTex2D();
                    }
                    Integer num = this.mRealWidth;
                    int iIntValue = num != null ? num.intValue() : this.mWidth;
                    Integer num2 = this.mRealHeight;
                    int iIntValue2 = num2 != null ? num2.intValue() : this.mHeight;
                    if (iIntValue <= 0 || iIntValue2 <= 0 || (bGLTexture = this.mCaptureTexture2D) == null) {
                        return;
                    }
                    BGLFramebuffer bGLFramebufferCreateFramebuffer = bGLTexture.createFramebuffer(iIntValue, iIntValue2);
                    try {
                        bGLFramebufferCreateFramebuffer.setAsRenderTarget();
                        BGLUtil.clear();
                        BEGLContext eglContext = this.mCtx.getEglContext();
                        if (eglContext != null && (inputTexDrawer = eglContext.getInputTexDrawer(Shaders.Transfer.NO_CONV, Shaders.Primaries.NO_CONV)) != null) {
                            inputTexDrawer.drawTexOESMix(this.mCaptureTexture, this.mUseAlphaChannel);
                            Unit unit = Unit.INSTANCE;
                        }
                        bGLFramebufferCreateFramebuffer.destroy();
                    } catch (Throwable th) {
                        bGLFramebufferCreateFramebuffer.destroy();
                        throw th;
                    }
                }
            }
        } catch (BGLException e7) {
            LivePusherLog.e(TAG, "CaptureSource tick BGLException: ", e7);
            BGLTexture bGLTexture2 = this.mCaptureTexture2D;
            if (bGLTexture2 != null) {
                bGLTexture2.destroy();
            }
            this.mCaptureTexture2D = null;
        } catch (Exception e8) {
            LivePusherLog.e(TAG, "tick exception: ", e8);
        }
    }
}
