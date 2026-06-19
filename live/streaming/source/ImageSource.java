package com.bilibili.live.streaming.source;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bilibili.live.streaming.AVContext;
import com.bilibili.live.streaming.callback.LoadImageCallback;
import com.bilibili.live.streaming.filter.FilterBase;
import com.bilibili.live.streaming.gl.BEGLContext;
import com.bilibili.live.streaming.gl.BGLDrawer;
import com.bilibili.live.streaming.gl.BGLException;
import com.bilibili.live.streaming.gl.BGLTexture;
import com.bilibili.live.streaming.gl.Shaders;
import com.bilibili.live.streaming.log.LivePusherLog;
import java.io.InputStream;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/source/ImageSource.class */
public final class ImageSource extends FilterBase {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String ID = "ImageSource";

    @NotNull
    public static final String IMAGE_FROM = "image_from";

    @NotNull
    public static final String IMAGE_FROM_ASSETS = "assets";

    @NotNull
    public static final String IMAGE_FROM_FILE = "file";

    @NotNull
    public static final String IMAGE_PATH = "image_path";

    @Nullable
    private BGLTexture loadTexture;

    @Nullable
    private String mImageFrom;

    @Nullable
    private String mImagePath;

    @Nullable
    private Integer preFitMode;

    @Nullable
    private BGLTexture showTexture;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/source/ImageSource$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ void loadBitmap$default(ImageSource imageSource, Bitmap bitmap, LoadImageCallback loadImageCallback, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            loadImageCallback = null;
        }
        imageSource.loadBitmap(bitmap, loadImageCallback);
    }

    public static /* synthetic */ void loadBitmap$default(ImageSource imageSource, String str, LoadImageCallback loadImageCallback, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            loadImageCallback = null;
        }
        imageSource.loadBitmap(str, loadImageCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadBitmap$lambda$4(ImageSource imageSource, String str, LoadImageCallback loadImageCallback) throws BGLException {
        BEGLContext eglContext;
        AVContext aVContext = imageSource.mCtx;
        if (aVContext != null && (eglContext = aVContext.getEglContext()) != null) {
            eglContext.makeCurrent();
        }
        imageSource.loadBitmapImpl(BitmapFactory.decodeFile(str), loadImageCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadBitmap$lambda$5(ImageSource imageSource, Bitmap bitmap, LoadImageCallback loadImageCallback) throws BGLException {
        BEGLContext eglContext;
        AVContext aVContext = imageSource.mCtx;
        if (aVContext != null && (eglContext = aVContext.getEglContext()) != null) {
            eglContext.makeCurrent();
        }
        imageSource.loadBitmapImpl(bitmap, loadImageCallback);
    }

    private final void loadBitmapImpl(Bitmap bitmap, LoadImageCallback loadImageCallback) throws BGLException {
        BGLTexture bGLTextureCreateTex2D = BGLTexture.createTex2D();
        if (!bitmap.isRecycled()) {
            bGLTextureCreateTex2D.loadBmp(bitmap);
            bGLTextureCreateTex2D.setSyncFlag(true);
            setTexture(bGLTextureCreateTex2D, loadImageCallback);
        } else {
            LivePusherLog.w$default(ID, "input bitmap isRecycled!!!", null, 4, null);
            if (loadImageCallback != null) {
                loadImageCallback.onResult(false);
            }
        }
    }

    public static /* synthetic */ void loadBitmapImpl$default(ImageSource imageSource, Bitmap bitmap, LoadImageCallback loadImageCallback, int i7, Object obj) throws BGLException {
        if ((i7 & 2) != 0) {
            loadImageCallback = null;
        }
        imageSource.loadBitmapImpl(bitmap, loadImageCallback);
    }

    private final void setTexture(BGLTexture bGLTexture, LoadImageCallback loadImageCallback) {
        if (bGLTexture == null) {
            if (loadImageCallback != null) {
                loadImageCallback.onResult(false);
                return;
            }
            return;
        }
        synchronized (this) {
            BGLTexture bGLTexture2 = this.loadTexture;
            if (bGLTexture2 != null) {
                bGLTexture2.destroy();
            }
            this.loadTexture = bGLTexture;
            if (loadImageCallback != null) {
                loadImageCallback.onResult(true);
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public static /* synthetic */ void setTexture$default(ImageSource imageSource, BGLTexture bGLTexture, LoadImageCallback loadImageCallback, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            loadImageCallback = null;
        }
        imageSource.setTexture(bGLTexture, loadImageCallback);
    }

    public static /* synthetic */ void updateSource$default(ImageSource imageSource, String str, LoadImageCallback loadImageCallback, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            loadImageCallback = null;
        }
        imageSource.updateSource(str, loadImageCallback);
    }

    @Override // com.bilibili.live.streaming.filter.IVideoSource
    public void destroy() {
        LivePusherLog.i$default(ID, this + ", destroy!!", null, 4, null);
        synchronized (this) {
            BGLTexture bGLTexture = this.loadTexture;
            if (bGLTexture != null) {
                bGLTexture.destroy();
            }
            this.loadTexture = null;
            BGLTexture bGLTexture2 = this.showTexture;
            if (bGLTexture2 != null) {
                bGLTexture2.destroy();
            }
            this.showTexture = null;
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void finalize() {
    }

    @Override // com.bilibili.live.streaming.filter.IVideoSource
    public int getHeight() {
        BGLTexture bGLTexture = this.showTexture;
        return bGLTexture != null ? bGLTexture.getHeight() : 0;
    }

    @Override // com.bilibili.live.streaming.filter.IVideoSource
    @NotNull
    public String getID() {
        return ID;
    }

    @Nullable
    public final Integer getPreFitMode() {
        return this.preFitMode;
    }

    @Override // com.bilibili.live.streaming.filter.IVideoSource
    public int getWidth() {
        BGLTexture bGLTexture = this.showTexture;
        return bGLTexture != null ? bGLTexture.getWidth() : 0;
    }

    public final void loadBitmap(@NotNull final Bitmap bitmap, @Nullable final LoadImageCallback loadImageCallback) {
        AVContext aVContext = this.mCtx;
        if (aVContext != null) {
            aVContext.runInBackground(0L, new Runnable(this, bitmap, loadImageCallback) { // from class: com.bilibili.live.streaming.source.d

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final ImageSource f65387a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Bitmap f65388b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final LoadImageCallback f65389c;

                {
                    this.f65387a = this;
                    this.f65388b = bitmap;
                    this.f65389c = loadImageCallback;
                }

                @Override // java.lang.Runnable
                public final void run() throws BGLException {
                    ImageSource.loadBitmap$lambda$5(this.f65387a, this.f65388b, this.f65389c);
                }
            });
        }
    }

    public final void loadBitmap(@NotNull final String str, @Nullable final LoadImageCallback loadImageCallback) {
        AVContext aVContext = this.mCtx;
        if (aVContext != null) {
            aVContext.runInBackground(0L, new Runnable(this, str, loadImageCallback) { // from class: com.bilibili.live.streaming.source.e

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final ImageSource f65390a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f65391b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final LoadImageCallback f65392c;

                {
                    this.f65390a = this;
                    this.f65391b = str;
                    this.f65392c = loadImageCallback;
                }

                @Override // java.lang.Runnable
                public final void run() throws BGLException {
                    ImageSource.loadBitmap$lambda$4(this.f65390a, this.f65391b, this.f65392c);
                }
            });
        }
    }

    @Override // com.bilibili.live.streaming.filter.FilterBase, com.bilibili.live.streaming.filter.IVideoSource
    public void loadConfig(@Nullable JSONObject jSONObject) {
        String str;
        Bitmap bitmapDecodeFile;
        Context activityContext;
        AssetManager assets;
        if (jSONObject == null) {
            LivePusherLog.w$default(ID, "config is null!!!!", null, 4, null);
            return;
        }
        try {
            if (jSONObject.has("image_path")) {
                this.mImagePath = jSONObject.getString("image_path");
            }
            if (jSONObject.has("image_from")) {
                this.mImageFrom = jSONObject.getString("image_from");
            }
            String str2 = this.mImagePath;
            if (str2 == null || this.mImageFrom == null) {
                LivePusherLog.w$default(ID, "imagePath is null!!!!!, imageFrom is null!!!!, imagePath=" + str2 + ", imageFrom=" + this.mImageFrom, null, 4, null);
            }
            String str3 = this.mImagePath;
            if (str3 == null || (str = this.mImageFrom) == null) {
                return;
            }
            if (Intrinsics.areEqual(str, "assets")) {
                AVContext aVContext = this.mCtx;
                InputStream inputStreamOpen = (aVContext == null || (activityContext = aVContext.getActivityContext()) == null || (assets = activityContext.getAssets()) == null) ? null : assets.open(str3);
                Bitmap bitmapDecodeStream = inputStreamOpen != null ? BitmapFactory.decodeStream(inputStreamOpen) : null;
                bitmapDecodeFile = bitmapDecodeStream;
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                    bitmapDecodeFile = bitmapDecodeStream;
                }
            } else if (Intrinsics.areEqual(str, "file")) {
                bitmapDecodeFile = BitmapFactory.decodeFile(str3);
            } else {
                LivePusherLog.w$default(ID, "imageFrom:(" + str + ") not is: assets Or file", null, 4, null);
                bitmapDecodeFile = null;
            }
            if (bitmapDecodeFile != null) {
                loadBitmap(bitmapDecodeFile, (LoadImageCallback) null);
            }
        } catch (Exception e7) {
            LivePusherLog.e(ID, "loadConfig error, msg: " + e7.getMessage(), e7);
        }
    }

    @Override // com.bilibili.live.streaming.filter.FilterBase, com.bilibili.live.streaming.filter.IVideoSource
    public int preferFitMode() {
        Integer num = this.preFitMode;
        return num != null ? num.intValue() : super.preferFitMode();
    }

    @Override // com.bilibili.live.streaming.filter.FilterBase, com.bilibili.live.streaming.filter.IVideoSource
    public boolean render() {
        BGLDrawer inputTexDrawer;
        BEGLContext eglContext = this.mCtx.getEglContext();
        if (eglContext == null || (inputTexDrawer = eglContext.getInputTexDrawer(Shaders.Transfer.SRGB, Shaders.Primaries.SRGB)) == null) {
            return true;
        }
        synchronized (this) {
            BGLTexture bGLTexture = this.showTexture;
            if (bGLTexture == null) {
                return true;
            }
            if (bGLTexture.getWidth() != 0 && bGLTexture.getHeight() != 0) {
                inputTexDrawer.drawTex(bGLTexture);
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
            jSONObject.put("image_path", this.mImagePath);
            jSONObject.put("image_from", this.mImageFrom);
        } catch (Exception e7) {
            LivePusherLog.e(ID, "saveConfig: fail to generate json: " + e7.getMessage(), e7);
        }
        return jSONObject;
    }

    public final void setPreFitMode(@Nullable Integer num) {
        this.preFitMode = num;
    }

    @Override // com.bilibili.live.streaming.filter.IVideoSource
    public void tick(long j7) {
        synchronized (this) {
            BGLTexture bGLTexture = this.loadTexture;
            if (bGLTexture != null) {
                if (bGLTexture.waitSyncCPU(0)) {
                    BGLTexture bGLTexture2 = this.showTexture;
                    if (bGLTexture2 != null) {
                        bGLTexture2.destroy();
                    }
                    this.showTexture = bGLTexture;
                    this.loadTexture = null;
                }
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public final void updateSource(@NotNull String str, @Nullable LoadImageCallback loadImageCallback) {
        synchronized (this) {
            try {
                loadBitmap(str, loadImageCallback);
                this.mImagePath = str;
            } catch (Exception e7) {
                LivePusherLog.e(ID, "update source exception: ", e7);
            }
            Unit unit = Unit.INSTANCE;
        }
    }
}
