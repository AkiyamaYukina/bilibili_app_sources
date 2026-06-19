package com.bilibili.live.streaming.source;

import android.graphics.Canvas;
import android.graphics.Movie;
import android.graphics.SurfaceTexture;
import android.view.Surface;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/source/GifSourceOnLowerThanL.class */
public final class GifSourceOnLowerThanL extends CaptureSource {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final String TAG = "GifSourceOnLowerThanL";

    @Nullable
    private String gifPath;
    private boolean isDestroy;

    @Nullable
    private Surface mCaptureSurface;

    @Nullable
    private Integer mDuration;

    @Nullable
    private Movie mMovie;
    private float scale = 1.0f;
    private float targetXOffset = 1.0f;
    private float targetYOffset = 1.0f;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/source/GifSourceOnLowerThanL$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public GifSourceOnLowerThanL() {
        setMUseAlphaChannel(true);
        setMUseTexture2D(true);
    }

    private final void createSource() {
        try {
            destroy();
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
            this.mCaptureSurface = new Surface(getMCaptureSurfaceTexture());
            Movie movieDecodeFile = Movie.decodeFile(str);
            this.mMovie = movieDecodeFile;
            if (movieDecodeFile != null && movieDecodeFile.duration() != 0 && movieDecodeFile.width() != 0 && movieDecodeFile.height() != 0) {
                int iDuration = movieDecodeFile.duration();
                int iWidth = movieDecodeFile.width();
                int iHeight = movieDecodeFile.height();
                LivePusherLog.i$default(TAG, "GifSourceOnLowerThanL duration: " + iDuration + ", gifWidth:" + iWidth + ", gifHeight:" + iHeight, null, 4, null);
                float f7 = mWidth;
                float f8 = iWidth;
                float f9 = (f7 * 1.0f) / f8;
                float f10 = mHeight;
                float f11 = iHeight;
                float fMin = Math.min(f9, (1.0f * f10) / f11);
                this.scale = fMin;
                float f12 = 2;
                this.targetXOffset = (f7 - (f8 * fMin)) / f12;
                this.targetYOffset = C4369c.a(f11, fMin, f10, f12);
                this.mDuration = Integer.valueOf(iDuration);
            }
        } catch (BGLException e7) {
            destroy();
            LivePusherLog.e(TAG, "createSource exception: ", e7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tick$lambda$6(GifSourceOnLowerThanL gifSourceOnLowerThanL, int i7, int i8, Movie movie, long j7, int i9) throws BGLException {
        BEGLContext eglContext = gifSourceOnLowerThanL.mCtx.getEglContext();
        if (eglContext != null) {
            eglContext.makeCurrent();
            Surface surface = gifSourceOnLowerThanL.mCaptureSurface;
            if (surface != null) {
                Canvas canvasLockHardwareCanvas = surface.lockHardwareCanvas();
                movie.setTime((int) (j7 % ((long) i9)));
                float f7 = gifSourceOnLowerThanL.scale;
                canvasLockHardwareCanvas.scale(f7, f7);
                movie.draw(canvasLockHardwareCanvas, gifSourceOnLowerThanL.targetXOffset, gifSourceOnLowerThanL.targetYOffset);
                surface.unlockCanvasAndPost(canvasLockHardwareCanvas);
            }
        }
    }

    @Override // com.bilibili.live.streaming.source.CaptureSource, com.bilibili.live.streaming.filter.IVideoSource
    public void destroy() {
        LivePusherLog.i$default(TAG, this + ", destroy!!", null, 4, null);
        synchronized (this) {
            this.isDestroy = true;
            Surface surface = this.mCaptureSurface;
            if (surface != null) {
                surface.release();
            }
            this.mCaptureSurface = null;
            Unit unit = Unit.INSTANCE;
        }
        super.destroy();
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
    public void tick(final long j7) {
        Integer num;
        synchronized (this) {
            Unit unit = Unit.INSTANCE;
        }
        final Movie movie = this.mMovie;
        if (movie == null || (num = this.mDuration) == null) {
            return;
        }
        final int iIntValue = num.intValue();
        final int mWidth = getMWidth();
        final int mHeight = getMHeight();
        try {
            SurfaceTexture mCaptureSurfaceTexture = getMCaptureSurfaceTexture();
            if (mCaptureSurfaceTexture != null) {
                mCaptureSurfaceTexture.updateTexImage();
            }
            this.mCtx.runInBackground(0L, new Runnable(this, mWidth, mHeight, movie, j7, iIntValue) { // from class: com.bilibili.live.streaming.source.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final GifSourceOnLowerThanL f65381a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f65382b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final int f65383c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final Movie f65384d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final long f65385e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final int f65386f;

                {
                    this.f65381a = this;
                    this.f65382b = mWidth;
                    this.f65383c = mHeight;
                    this.f65384d = movie;
                    this.f65385e = j7;
                    this.f65386f = iIntValue;
                }

                @Override // java.lang.Runnable
                public final void run() throws BGLException {
                    GifSourceOnLowerThanL.tick$lambda$6(this.f65381a, this.f65382b, this.f65383c, this.f65384d, this.f65385e, this.f65386f);
                }
            });
        } catch (BGLException e7) {
            BGLTexture mCaptureTexture = getMCaptureTexture();
            LivePusherLog.w(TAG, "GifSourceOnLowerThanL, tick create texture fail, captureTexture id: " + (mCaptureTexture != null ? Integer.valueOf(mCaptureTexture.getTexName()) : null) + " BGLException: ", e7);
        }
        super.tick(j7);
    }
}
