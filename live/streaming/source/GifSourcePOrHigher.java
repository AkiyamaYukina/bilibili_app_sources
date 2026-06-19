package com.bilibili.live.streaming.source;

import android.graphics.Canvas;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.colorspace.C4369c;
import com.bilibili.live.streaming.gl.BEGLContext;
import com.bilibili.live.streaming.gl.BGLDrawer;
import com.bilibili.live.streaming.gl.BGLException;
import com.bilibili.live.streaming.gl.BGLTexture;
import com.bilibili.live.streaming.gl.Shaders;
import com.bilibili.live.streaming.log.LivePusherLog;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/source/GifSourcePOrHigher.class */
@RequiresApi(28)
public final class GifSourcePOrHigher extends CaptureSource {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final String TAG = "GifSourcePOrHigher";

    @Nullable
    private String gifPath;
    private boolean isDestroy;

    @Nullable
    private Drawable mAnimatedImageDrawable;

    @Nullable
    private Surface mCaptureSurface;
    private float scale = 1.0f;
    private float targetXOffset = 1.0f;
    private float targetYOffset = 1.0f;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/source/GifSourcePOrHigher$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public GifSourcePOrHigher() {
        setMUseAlphaChannel(true);
        setMUseTexture2D(true);
    }

    private final void createSource() {
        try {
            synchronized (this) {
                this.isDestroy = false;
                Unit unit = Unit.INSTANCE;
            }
            String str = this.gifPath;
            if (str == null) {
                return;
            }
            int mWidth = getMWidth();
            int mHeight = getMHeight();
            attachCaptureTexture();
            Surface surface = this.mCaptureSurface;
            if (surface != null) {
                surface.release();
            }
            this.mCaptureSurface = new Surface(getMCaptureSurfaceTexture());
            Drawable drawableCreateFromPath = AnimatedImageDrawable.createFromPath(str);
            this.mAnimatedImageDrawable = drawableCreateFromPath;
            if (drawableCreateFromPath == null) {
                return;
            }
            int intrinsicWidth = drawableCreateFromPath.getIntrinsicWidth();
            int intrinsicHeight = drawableCreateFromPath.getIntrinsicHeight();
            float f7 = mWidth;
            float f8 = intrinsicWidth;
            float f9 = (f7 * 1.0f) / f8;
            float f10 = mHeight;
            float f11 = intrinsicHeight;
            float fMin = Math.min(f9, (1.0f * f10) / f11);
            this.scale = fMin;
            float f12 = 2;
            this.targetXOffset = (f7 - (f8 * fMin)) / f12;
            this.targetYOffset = C4369c.a(f11, fMin, f10, f12);
            if (drawableCreateFromPath instanceof AnimatedImageDrawable) {
                ((AnimatedImageDrawable) drawableCreateFromPath).setRepeatCount(-1);
                ((AnimatedImageDrawable) drawableCreateFromPath).start();
            }
        } catch (BGLException e7) {
            destroy();
            LivePusherLog.e(TAG, "createSource exception: ", e7);
        }
    }

    @Override // com.bilibili.live.streaming.source.CaptureSource, com.bilibili.live.streaming.filter.IVideoSource
    public void destroy() {
        LivePusherLog.i$default(TAG, this + ", destroy!!", null, 4, null);
        super.destroy();
        synchronized (this) {
            this.isDestroy = true;
            Drawable drawable = this.mAnimatedImageDrawable;
            if (drawable != null && (drawable instanceof AnimatedImageDrawable)) {
                ((AnimatedImageDrawable) drawable).stop();
            }
            this.mAnimatedImageDrawable = null;
            Unit unit = Unit.INSTANCE;
        }
        Surface surface = this.mCaptureSurface;
        if (surface != null) {
            surface.release();
        }
        this.mCaptureSurface = null;
    }

    @Override // com.bilibili.live.streaming.filter.IVideoSource
    @NotNull
    public String getID() {
        return GifSource.ID;
    }

    @Override // com.bilibili.live.streaming.filter.FilterBase, com.bilibili.live.streaming.filter.IVideoSource
    public void loadConfig(@Nullable JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        if (jSONObject.has(GifSource.GIF_PATH)) {
            this.gifPath = jSONObject.getString(GifSource.GIF_PATH);
        }
        if (jSONObject.has("width")) {
            setMWidth(jSONObject.getInt("width"));
        }
        if (jSONObject.has("height")) {
            setMHeight(jSONObject.getInt("height"));
        }
        createSource();
    }

    @Override // com.bilibili.live.streaming.filter.FilterBase, com.bilibili.live.streaming.filter.IVideoSource
    public boolean render() {
        BGLDrawer inputTexDrawer;
        synchronized (this) {
            if (this.isDestroy) {
                return false;
            }
            BEGLContext eglContext = this.mCtx.getEglContext();
            if (eglContext == null || (inputTexDrawer = eglContext.getInputTexDrawer(Shaders.Transfer.SRGB, Shaders.Primaries.SRGB)) == null) {
                return false;
            }
            BGLTexture mCaptureTexture2D = getMCaptureTexture2D();
            if (mCaptureTexture2D == null) {
                return false;
            }
            if (mCaptureTexture2D.getWidth() != 0 && mCaptureTexture2D.getHeight() != 0) {
                mCaptureTexture2D.waitSyncGPU();
                inputTexDrawer.drawTex(mCaptureTexture2D);
                return true;
            }
            return true;
        }
    }

    @Override // com.bilibili.live.streaming.filter.FilterBase, com.bilibili.live.streaming.filter.IVideoSource
    @NotNull
    public JSONObject saveConfig() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("width", getWidth());
            jSONObject.put("height", getHeight());
            jSONObject.put(GifSource.GIF_PATH, this.gifPath);
        } catch (Exception e7) {
            LivePusherLog.e(TAG, "saveConfig: fail to generate json: " + e7.getMessage(), e7);
        }
        return jSONObject;
    }

    @Override // com.bilibili.live.streaming.source.CaptureSource, com.bilibili.live.streaming.filter.IVideoSource
    public void tick(long j7) {
        synchronized (this) {
            Unit unit = Unit.INSTANCE;
        }
        Drawable drawable = this.mAnimatedImageDrawable;
        if (drawable != null && (drawable instanceof AnimatedImageDrawable) && ((AnimatedImageDrawable) drawable).isRunning()) {
            try {
                Surface surface = this.mCaptureSurface;
                if (surface != null) {
                    Canvas canvasLockHardwareCanvas = surface.lockHardwareCanvas();
                    float f7 = this.scale;
                    canvasLockHardwareCanvas.scale(f7, f7);
                    ((AnimatedImageDrawable) drawable).draw(canvasLockHardwareCanvas);
                    surface.unlockCanvasAndPost(canvasLockHardwareCanvas);
                }
            } catch (BGLException e7) {
                BGLTexture mCaptureTexture = getMCaptureTexture();
                LivePusherLog.w(TAG, "GifSourcePOrHigher, tick create texture fail, captureTexture id: " + (mCaptureTexture != null ? Integer.valueOf(mCaptureTexture.getTexName()) : null) + " BGLException: ", e7);
            }
            super.tick(j7);
        }
    }
}
