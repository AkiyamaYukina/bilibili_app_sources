package com.bilibili.live.streaming.source;

import android.graphics.SurfaceTexture;
import android.hardware.display.VirtualDisplay;
import android.media.projection.MediaProjection;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.Surface;
import android.view.WindowMetrics;
import com.bilibili.live.streaming.gl.BEGLContext;
import com.bilibili.live.streaming.gl.BGLCurrentState;
import com.bilibili.live.streaming.gl.BGLDrawer;
import com.bilibili.live.streaming.gl.BGLException;
import com.bilibili.live.streaming.gl.BGLFramebuffer;
import com.bilibili.live.streaming.gl.BGLMatrix;
import com.bilibili.live.streaming.gl.BGLTexture;
import com.bilibili.live.streaming.gl.BGLUtil;
import com.bilibili.live.streaming.gl.Shaders;
import com.bilibili.live.streaming.log.LivePusherLog;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/source/ScreenCaptureSource.class */
public final class ScreenCaptureSource extends CaptureSource {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String ID = "ScreenCaptureSource";

    @NotNull
    public static final String SCREEN_CAPTURE_DPI = "capture_dpi";

    @NotNull
    public static final String SCREEN_CAPTURE_HEIGHT = "capture_height";

    @NotNull
    public static final String SCREEN_CAPTURE_WIDTH = "capture_width";

    @NotNull
    private static final String TAG = "ScreenCaptureSource";

    @Nullable
    private Surface mCaptureSurface;
    private int mDpi;
    private boolean mIsRegisterMediaProjectionCallback;

    @Nullable
    private MediaProjection mMediaProjection;
    private volatile boolean mResizeFlag;
    private int mResizeHeight;
    private int mResizeWidth;

    @Nullable
    private BGLTexture mShowTexture;

    @Nullable
    private VirtualDisplay mVirtualDisplay;

    @NotNull
    private MediaProjectionCallback mMediaProjectionCallback = new MediaProjectionCallback(this);

    @NotNull
    private BGLMatrix mScreenCaptureMatrix = BGLMatrix.Companion.create();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/source/ScreenCaptureSource$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/source/ScreenCaptureSource$MediaProjectionCallback.class */
    public final class MediaProjectionCallback extends MediaProjection.Callback {
        final ScreenCaptureSource this$0;

        public MediaProjectionCallback(ScreenCaptureSource screenCaptureSource) {
            this.this$0 = screenCaptureSource;
        }

        @Override // android.media.projection.MediaProjection.Callback
        public void onCapturedContentResize(int i7, int i8) {
            super.onCapturedContentResize(i7, i8);
        }

        @Override // android.media.projection.MediaProjection.Callback
        public void onCapturedContentVisibilityChanged(boolean z6) {
            super.onCapturedContentVisibilityChanged(z6);
        }

        @Override // android.media.projection.MediaProjection.Callback
        public void onStop() {
            super.onStop();
        }
    }

    private final void createCaptureTexture() {
        int iHeight;
        int iWidth;
        int i7;
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                WindowMetrics currentWindowMetrics = this.mCtx.getWindowManager().getCurrentWindowMetrics();
                iWidth = currentWindowMetrics.getBounds().width();
                iHeight = currentWindowMetrics.getBounds().height();
                i7 = this.mCtx.getConfiguration().densityDpi;
            } else {
                Display display = this.mCtx.getDisplay();
                if (display != null) {
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    display.getRealMetrics(displayMetrics);
                    iWidth = displayMetrics.widthPixels;
                    iHeight = displayMetrics.heightPixels;
                    i7 = displayMetrics.densityDpi;
                } else {
                    iHeight = 0;
                    iWidth = 0;
                    i7 = 0;
                }
            }
            if (getMWidth() == 0) {
                setMWidth(iWidth);
            }
            if (getMHeight() == 0) {
                setMHeight(iHeight);
            }
            if (this.mDpi == 0) {
                this.mDpi = i7;
            }
            if (getWidth() > 0 && getHeight() > 0 && this.mDpi > 0) {
                attachCaptureTexture();
                MediaProjection mediaProject = this.mCtx.getMediaProject();
                this.mMediaProjection = mediaProject;
                if (!this.mIsRegisterMediaProjectionCallback && mediaProject != null) {
                    mediaProject.registerCallback(this.mMediaProjectionCallback, null);
                    this.mIsRegisterMediaProjectionCallback = true;
                }
                this.mCaptureSurface = new Surface(getMCaptureSurfaceTexture());
                LivePusherLog.i$default("ScreenCaptureSource", "createVirtualDisplay width:" + getWidth() + ", height:" + getHeight() + ", dpi:" + this.mDpi, null, 4, null);
                MediaProjection mediaProjection = this.mMediaProjection;
                this.mVirtualDisplay = mediaProjection != null ? mediaProjection.createVirtualDisplay("ScreenCaptureSource", getWidth(), getHeight(), this.mDpi, 1, this.mCaptureSurface, null, null) : null;
                BGLMatrix ident = this.mScreenCaptureMatrix.setIdent();
                float[] fArrData = ident.data();
                for (int i8 = 0; i8 < 4; i8++) {
                    BGLMatrix.Companion companion = BGLMatrix.Companion;
                    float f7 = fArrData[12 + i8];
                    if (f7 != 0.0f) {
                        float f8 = fArrData[i8];
                        float f9 = (-0.5f) * f7;
                        fArrData[i8] = f8 + f9;
                        int i9 = 4 + i8;
                        fArrData[i9] = fArrData[i9] + f9;
                    }
                }
                float[] fArrData2 = ident.data();
                for (int i10 = 0; i10 < 4; i10++) {
                    BGLMatrix.Companion companion2 = BGLMatrix.Companion;
                    fArrData2[i10] = fArrData2[i10] * 1.0f;
                    int i11 = 4 + i10;
                    fArrData2[i11] = fArrData2[i11] * (-1.0f);
                }
                float[] fArrData3 = ident.data();
                for (int i12 = 0; i12 < 4; i12++) {
                    BGLMatrix.Companion companion3 = BGLMatrix.Companion;
                    float f10 = fArrData3[12 + i12];
                    if (f10 != 0.0f) {
                        float f11 = fArrData3[i12];
                        float f12 = 0.5f * f10;
                        fArrData3[i12] = f11 + f12;
                        int i13 = 4 + i12;
                        fArrData3[i13] = fArrData3[i13] + f12;
                    }
                }
            }
        } catch (Exception e7) {
            LivePusherLog.e("ScreenCaptureSource", "create CaptureTexture: exception, msg: " + e7.getMessage(), e7);
        }
    }

    @Override // com.bilibili.live.streaming.source.CaptureSource, com.bilibili.live.streaming.filter.IVideoSource
    public void destroy() {
        MediaProjection mediaProjection = this.mMediaProjection;
        if (mediaProjection != null) {
            mediaProjection.unregisterCallback(this.mMediaProjectionCallback);
        }
        VirtualDisplay virtualDisplay = this.mVirtualDisplay;
        if (virtualDisplay != null) {
            virtualDisplay.release();
        }
        this.mVirtualDisplay = null;
        Surface surface = this.mCaptureSurface;
        if (surface != null) {
            surface.release();
        }
        this.mCaptureSurface = null;
        BGLTexture bGLTexture = this.mShowTexture;
        if (bGLTexture != null) {
            bGLTexture.destroy();
        }
        this.mShowTexture = null;
        super.destroy();
    }

    @Override // com.bilibili.live.streaming.source.CaptureSource
    public void finalize() {
        super.finalize();
    }

    @Override // com.bilibili.live.streaming.filter.IVideoSource
    @NotNull
    public String getID() {
        return "ScreenCaptureSource";
    }

    @Override // com.bilibili.live.streaming.filter.FilterBase, com.bilibili.live.streaming.filter.IVideoSource
    public void loadConfig(@Nullable JSONObject jSONObject) {
        super.loadConfig(jSONObject);
        if (jSONObject != null) {
            if (jSONObject.has(SCREEN_CAPTURE_WIDTH)) {
                setMWidth(jSONObject.optInt(SCREEN_CAPTURE_WIDTH));
            }
            if (jSONObject.has(SCREEN_CAPTURE_HEIGHT)) {
                setMHeight(jSONObject.optInt(SCREEN_CAPTURE_HEIGHT));
            }
            if (jSONObject.has(SCREEN_CAPTURE_DPI)) {
                this.mDpi = jSONObject.optInt(SCREEN_CAPTURE_DPI);
            }
        }
        createCaptureTexture();
    }

    public final void onResume() {
        destroy();
        createCaptureTexture();
    }

    @Override // com.bilibili.live.streaming.filter.FilterBase, com.bilibili.live.streaming.filter.IVideoSource
    public int preferFitMode() {
        return 2;
    }

    @Override // com.bilibili.live.streaming.filter.FilterBase, com.bilibili.live.streaming.filter.IVideoSource
    public boolean render() {
        BGLDrawer inputTexDrawer;
        BGLTexture bGLTexture;
        BEGLContext eglContext = this.mCtx.getEglContext();
        if (eglContext == null || (inputTexDrawer = eglContext.getInputTexDrawer(Shaders.Transfer.NO_CONV, Shaders.Primaries.NO_CONV)) == null || (bGLTexture = this.mShowTexture) == null) {
            return true;
        }
        eglContext.getTransState().pushUVPreTrans(this.mScreenCaptureMatrix);
        eglContext.getTransState().pushUVPreTrans(getMTransformMatrix());
        try {
            try {
                inputTexDrawer.drawTex(bGLTexture);
            } catch (Exception e7) {
                LivePusherLog.e("ScreenCaptureSource", "ScreenCaptureSource render exception, msg: " + e7.getMessage(), e7);
            }
            return true;
        } finally {
            eglContext.getTransState().popUVPreTrans();
            eglContext.getTransState().popUVPreTrans();
        }
    }

    public final void resizeVirtualDisplay(@Nullable Integer num, @Nullable Integer num2) {
        if (num != null) {
            this.mResizeWidth = num.intValue();
        }
        if (num2 != null) {
            this.mResizeHeight = num2.intValue();
        }
        if (num != null && num.intValue() == 0 && num2 != null && num2.intValue() == 0) {
            return;
        }
        this.mResizeFlag = true;
    }

    /* JADX WARN: Not initialized variable reg: 12, insn: 0x0122: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r12 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:40:0x0122 */
    @Override // com.bilibili.live.streaming.source.CaptureSource, com.bilibili.live.streaming.filter.IVideoSource
    public void tick(long j7) throws Throwable {
        BGLCurrentState bGLCurrentState;
        BGLCurrentState bGLCurrentStateFramebuffer;
        BGLFramebuffer bGLFramebuffer;
        BGLFramebuffer bGLFramebufferCreateFramebuffer;
        BGLDrawer inputTexDrawer;
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        if (this.mResizeFlag) {
            LivePusherLog.i$default("ScreenCaptureSource", androidx.compose.runtime.collection.d.a(this.mResizeWidth, this.mResizeHeight, "resize w: ", ", h: ", ", createNew SurfaceTexture"), null, 4, null);
            BGLTexture mCaptureTexture = getMCaptureTexture();
            if (mCaptureTexture == null) {
                return;
            }
            Surface surface = this.mCaptureSurface;
            if (surface != null) {
                surface.release();
            }
            SurfaceTexture mCaptureSurfaceTexture = getMCaptureSurfaceTexture();
            if (mCaptureSurfaceTexture != null) {
                mCaptureSurfaceTexture.release();
            }
            SurfaceTexture surfaceTexture = new SurfaceTexture(mCaptureTexture.getTexName());
            BGLUtil.clearErrors();
            surfaceTexture.setDefaultBufferSize(this.mResizeWidth, this.mResizeHeight);
            surfaceTexture.setOnFrameAvailableListener(this);
            setMCaptureSurfaceTexture(surfaceTexture);
            Surface surface2 = new Surface(getMCaptureSurfaceTexture());
            this.mCaptureSurface = surface2;
            VirtualDisplay virtualDisplay = this.mVirtualDisplay;
            if (virtualDisplay != null) {
                virtualDisplay.setSurface(surface2);
            }
            VirtualDisplay virtualDisplay2 = this.mVirtualDisplay;
            if (virtualDisplay2 != null) {
                virtualDisplay2.resize(this.mResizeWidth, this.mResizeHeight, this.mDpi);
            }
            setMWidth(this.mResizeWidth);
            setMHeight(this.mResizeHeight);
            this.mResizeFlag = false;
        }
        super.tick(j7);
        try {
            if (this.mShowTexture == null) {
                this.mShowTexture = BGLTexture.createTex2D();
            }
            BGLTexture bGLTexture = this.mShowTexture;
            try {
                if (bGLTexture != null) {
                    try {
                        bGLCurrentStateFramebuffer = BGLCurrentState.save().viewport().framebuffer();
                    } catch (BGLException e7) {
                        e = e7;
                        bGLFramebufferCreateFramebuffer = null;
                        bGLCurrentStateFramebuffer = null;
                    } catch (Throwable th) {
                        th = th;
                        bGLFramebuffer = null;
                        bGLCurrentStateFramebuffer = null;
                    }
                    try {
                        bGLFramebufferCreateFramebuffer = bGLTexture.createFramebuffer(getWidth(), getHeight());
                        if (bGLFramebufferCreateFramebuffer != null) {
                            try {
                                bGLFramebufferCreateFramebuffer.setAsRenderTarget();
                            } catch (BGLException e8) {
                                e = e8;
                                LivePusherLog.e$default("ScreenCaptureSource", e.getMessage(), null, 4, null);
                                BGLFramebuffer bGLFramebuffer2 = bGLFramebufferCreateFramebuffer;
                                Unit unit = Unit.INSTANCE;
                                if (bGLCurrentStateFramebuffer != null) {
                                    bGLCurrentStateFramebuffer.restore();
                                }
                                if (bGLFramebufferCreateFramebuffer == null) {
                                    return;
                                }
                            }
                        }
                        BEGLContext eglContext = this.mCtx.getEglContext();
                        if (eglContext != null && (inputTexDrawer = eglContext.getInputTexDrawer(Shaders.Transfer.SRGB, Shaders.Primaries.SRGB)) != null) {
                            inputTexDrawer.drawTexOESMix(getMCaptureTexture());
                            Unit unit2 = Unit.INSTANCE;
                        }
                        if (bGLCurrentStateFramebuffer != null) {
                            bGLCurrentStateFramebuffer.restore();
                        }
                        if (bGLFramebufferCreateFramebuffer == null) {
                            return;
                        }
                    } catch (BGLException e9) {
                        e = e9;
                        bGLFramebufferCreateFramebuffer = null;
                    } catch (Throwable th2) {
                        th = th2;
                        bGLFramebuffer = null;
                        if (bGLCurrentStateFramebuffer != null) {
                            bGLCurrentStateFramebuffer.restore();
                        }
                        if (bGLFramebuffer != null) {
                            bGLFramebuffer.destroy();
                        }
                        throw th;
                    }
                    bGLFramebufferCreateFramebuffer.destroy();
                }
            } catch (Throwable th3) {
                th = th3;
                bGLCurrentStateFramebuffer = bGLCurrentState;
            }
        } catch (BGLException e10) {
            BGLTexture bGLTexture2 = this.mShowTexture;
            LivePusherLog.w("ScreenCaptureSource", "create texture fail, mTextureBuffer id: " + (bGLTexture2 != null ? Integer.valueOf(bGLTexture2.getTexName()) : null), e10);
            BGLTexture bGLTexture3 = this.mShowTexture;
            if (bGLTexture3 == null || bGLTexture3.getTexName() != 0) {
                return;
            }
            BGLTexture bGLTexture4 = this.mShowTexture;
            if (bGLTexture4 != null) {
                bGLTexture4.destroy();
            }
            this.mShowTexture = null;
        }
    }
}
