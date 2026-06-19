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
import com.bilibili.live.streaming.utils.ImageUtilsKt;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.LinkedList;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/source/SlideSource.class */
public final class SlideSource extends FilterBase {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String HEIGHT = "height";

    @NotNull
    public static final String ID = "SlideSource";

    @NotNull
    public static final String IMAGE_FROM = "image_from";

    @NotNull
    public static final String IMAGE_FROM_ASSETS = "assets";

    @NotNull
    public static final String IMAGE_FROM_FILE = "file";

    @NotNull
    public static final String IMAGE_PATH = "image_path";

    @NotNull
    public static final String IMAGE_PATH_LIST = "image_path_list";

    @NotNull
    public static final String PER_SHOW_TIME = "per_show_time";

    @NotNull
    public static final String PER_TRANSITION_TIME = "per_transition_time";

    @NotNull
    public static final String WIDTH = "width";

    @Nullable
    private LinkedList<ImageData> mImageList;
    private float mOffset;

    @Nullable
    private LinkedList<BGLTexture> mTextureList;
    private int mWidth = 1;
    private int mHeight = 1;
    private int mShowTime = 1;
    private int mTransitionTime = 1;
    private int mPosition = -1;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/source/SlideSource$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final void addTexture(int i7) {
        Context activityContext;
        AssetManager assets;
        InputStream inputStreamOpen;
        LinkedList<BGLTexture> linkedList;
        BGLTexture bGLTexturePoll;
        LinkedList<BGLTexture> linkedList2 = this.mTextureList;
        if (linkedList2 != null && linkedList2.size() == 2 && (linkedList = this.mTextureList) != null && (bGLTexturePoll = linkedList.poll()) != null) {
            bGLTexturePoll.destroy();
        }
        LinkedList<ImageData> linkedList3 = this.mImageList;
        if (linkedList3 == null) {
            return;
        }
        try {
            ImageData imageData = linkedList3.get(i7);
            if (imageData.getImageFrom().length() != 0 && !Intrinsics.areEqual(imageData.getImageFrom(), "assets")) {
                loadBitmap$default(this, imageData.getImagePath(), (LoadImageCallback) null, 2, (Object) null);
                Unit unit = Unit.INSTANCE;
                return;
            }
            AVContext aVContext = this.mCtx;
            if (aVContext == null || (activityContext = aVContext.getActivityContext()) == null || (assets = activityContext.getAssets()) == null || (inputStreamOpen = assets.open(imageData.getImagePath())) == null) {
                return;
            }
            try {
                loadBitmap$default(this, BitmapFactory.decodeStream(inputStreamOpen), (LoadImageCallback) null, 2, (Object) null);
                Unit unit2 = Unit.INSTANCE;
                CloseableKt.closeFinally(inputStreamOpen, (Throwable) null);
            } finally {
            }
        } catch (FileNotFoundException e7) {
            LivePusherLog.e(ID, "addTexture exception: ", e7);
            Unit unit3 = Unit.INSTANCE;
        }
    }

    public static /* synthetic */ void loadBitmap$default(SlideSource slideSource, Bitmap bitmap, LoadImageCallback loadImageCallback, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            loadImageCallback = null;
        }
        slideSource.loadBitmap(bitmap, loadImageCallback);
    }

    public static /* synthetic */ void loadBitmap$default(SlideSource slideSource, String str, LoadImageCallback loadImageCallback, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            loadImageCallback = null;
        }
        slideSource.loadBitmap(str, loadImageCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadBitmap$lambda$7(SlideSource slideSource, String str, LoadImageCallback loadImageCallback) throws BGLException {
        BEGLContext eglContext = slideSource.mCtx.getEglContext();
        if (eglContext != null) {
            eglContext.makeCurrent();
        }
        Bitmap bitmapLoadBitmapFromString = ImageUtilsKt.loadBitmapFromString(str);
        if (bitmapLoadBitmapFromString == null) {
            if (loadImageCallback != null) {
                loadImageCallback.onResult(false);
                return;
            }
            return;
        }
        Bitmap bitmapZoomImgIfLarge = ImageUtilsKt.zoomImgIfLarge(bitmapLoadBitmapFromString, slideSource.mWidth, slideSource.mHeight);
        BGLTexture bGLTextureLoadImageTexture = ImageUtilsKt.loadImageTexture(bitmapZoomImgIfLarge);
        if (bGLTextureLoadImageTexture != null) {
            bGLTextureLoadImageTexture.setSyncFlag(true);
            slideSource.setTexture(bGLTextureLoadImageTexture, loadImageCallback);
        }
        bitmapLoadBitmapFromString.recycle();
        bitmapZoomImgIfLarge.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadBitmap$lambda$9(SlideSource slideSource, Bitmap bitmap, LoadImageCallback loadImageCallback) throws BGLException {
        BEGLContext eglContext = slideSource.mCtx.getEglContext();
        if (eglContext != null) {
            eglContext.makeCurrent();
        }
        Bitmap bitmapZoomImgIfLarge = ImageUtilsKt.zoomImgIfLarge(bitmap, slideSource.mWidth, slideSource.mHeight);
        BGLTexture bGLTextureLoadImageTexture = ImageUtilsKt.loadImageTexture(bitmapZoomImgIfLarge);
        if (bGLTextureLoadImageTexture != null) {
            bGLTextureLoadImageTexture.setSyncFlag(true);
            slideSource.setTexture(bGLTextureLoadImageTexture, loadImageCallback);
        }
        bitmap.recycle();
        bitmapZoomImgIfLarge.recycle();
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
            LinkedList<BGLTexture> linkedList = this.mTextureList;
            if (linkedList != null) {
                linkedList.offer(bGLTexture);
            }
            if (loadImageCallback != null) {
                loadImageCallback.onResult(true);
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public static /* synthetic */ void setTexture$default(SlideSource slideSource, BGLTexture bGLTexture, LoadImageCallback loadImageCallback, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            loadImageCallback = null;
        }
        slideSource.setTexture(bGLTexture, loadImageCallback);
    }

    @Override // com.bilibili.live.streaming.filter.IVideoSource
    public void destroy() {
        BGLTexture bGLTexture;
        LivePusherLog.i$default(ID, this + ", destroy!!", null, 4, null);
        LinkedList<BGLTexture> linkedList = this.mTextureList;
        int size = linkedList != null ? linkedList.size() : 0;
        for (int i7 = 0; i7 < size; i7++) {
            LinkedList<BGLTexture> linkedList2 = this.mTextureList;
            if (linkedList2 != null && (bGLTexture = linkedList2.get(i7)) != null) {
                bGLTexture.destroy();
            }
        }
        this.mTextureList = null;
    }

    public final void finalize() {
    }

    @Override // com.bilibili.live.streaming.filter.IVideoSource
    public int getHeight() {
        return this.mHeight;
    }

    @Override // com.bilibili.live.streaming.filter.IVideoSource
    @NotNull
    public String getID() {
        return ID;
    }

    @Override // com.bilibili.live.streaming.filter.IVideoSource
    public int getWidth() {
        return this.mWidth;
    }

    public final void loadBitmap(@Nullable Bitmap bitmap, @Nullable LoadImageCallback loadImageCallback) {
        if (bitmap != null) {
            this.mCtx.runInBackground(0L, new g(this, 0, bitmap, loadImageCallback));
        } else if (loadImageCallback != null) {
            loadImageCallback.onResult(false);
        }
    }

    public final void loadBitmap(@NotNull final String str, @Nullable final LoadImageCallback loadImageCallback) {
        this.mCtx.runInBackground(0L, new Runnable(this, str, loadImageCallback) { // from class: com.bilibili.live.streaming.source.f

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final SlideSource f65393a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f65394b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final LoadImageCallback f65395c;

            {
                this.f65393a = this;
                this.f65394b = str;
                this.f65395c = loadImageCallback;
            }

            @Override // java.lang.Runnable
            public final void run() throws BGLException {
                SlideSource.loadBitmap$lambda$7(this.f65393a, this.f65394b, this.f65395c);
            }
        });
    }

    @Override // com.bilibili.live.streaming.filter.FilterBase, com.bilibili.live.streaming.filter.IVideoSource
    public void loadConfig(@Nullable JSONObject jSONObject) {
        LinkedList<ImageData> linkedList;
        synchronized (this) {
            if (jSONObject != null) {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(IMAGE_PATH_LIST);
                this.mWidth = jSONObject.optInt("width");
                this.mHeight = jSONObject.optInt("height");
                this.mShowTime = jSONObject.optInt(PER_SHOW_TIME);
                this.mTransitionTime = jSONObject.optInt(PER_TRANSITION_TIME);
                this.mImageList = new LinkedList<>();
                if (jSONArrayOptJSONArray != null) {
                    int length = jSONArrayOptJSONArray.length();
                    for (int i7 = 0; i7 < length; i7++) {
                        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i7);
                        if (jSONObjectOptJSONObject != null && (linkedList = this.mImageList) != null) {
                            linkedList.offer(new ImageData(jSONObjectOptJSONObject.optString("image_path"), jSONObjectOptJSONObject.optString("image_from")));
                        }
                    }
                }
                LinkedList<ImageData> linkedList2 = this.mImageList;
                if (linkedList2 != null && (linkedList2 == null || linkedList2.size() != 0)) {
                    this.mTextureList = new LinkedList<>();
                    addTexture(0);
                    Unit unit = Unit.INSTANCE;
                }
            }
        }
    }

    @Override // com.bilibili.live.streaming.filter.FilterBase, com.bilibili.live.streaming.filter.IVideoSource
    public boolean render() {
        BEGLContext eglContext;
        BGLDrawer inputTexDrawer;
        synchronized (this) {
            LinkedList<BGLTexture> linkedList = this.mTextureList;
            if (linkedList == null) {
                return true;
            }
            if (linkedList.size() == 0) {
                return true;
            }
            AVContext aVContext = this.mCtx;
            if (aVContext == null || (eglContext = aVContext.getEglContext()) == null || (inputTexDrawer = eglContext.getInputTexDrawer(Shaders.Transfer.SRGB, Shaders.Primaries.SRGB)) == null) {
                return true;
            }
            if (linkedList.size() != 2 || this.mOffset == 0.0f) {
                if (linkedList.size() > 0 && linkedList.getFirst().waitSyncCPU(0)) {
                    inputTexDrawer.drawTexMix(linkedList.getFirst(), 1.0f);
                }
            } else {
                if (!linkedList.getFirst().waitSyncCPU(0)) {
                    return false;
                }
                if (linkedList.getLast().waitSyncCPU(0)) {
                    inputTexDrawer.drawTexMix(linkedList.getFirst(), 1.0f - this.mOffset, linkedList.getLast(), this.mOffset);
                } else {
                    inputTexDrawer.drawTexMix(linkedList.getFirst(), 1.0f - this.mOffset);
                }
            }
            return true;
        }
    }

    @Override // com.bilibili.live.streaming.filter.FilterBase, com.bilibili.live.streaming.filter.IVideoSource
    @NotNull
    public JSONObject saveConfig() {
        ImageData imageData;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("width", this.mWidth);
            jSONObject.put("height", this.mHeight);
            jSONObject.put(PER_SHOW_TIME, this.mShowTime);
            jSONObject.put(PER_TRANSITION_TIME, this.mTransitionTime);
            JSONArray jSONArray = new JSONArray();
            LinkedList<ImageData> linkedList = this.mImageList;
            int size = linkedList != null ? linkedList.size() : 0;
            for (int i7 = 0; i7 < size; i7++) {
                JSONObject jSONObject2 = new JSONObject();
                LinkedList<ImageData> linkedList2 = this.mImageList;
                jSONObject2.put("image_path", (linkedList2 == null || (imageData = linkedList2.get(i7)) == null) ? null : imageData.getImagePath());
                LinkedList<ImageData> linkedList3 = this.mImageList;
                String imageFrom = null;
                if (linkedList3 != null) {
                    ImageData imageData2 = linkedList3.get(i7);
                    imageFrom = null;
                    if (imageData2 != null) {
                        imageFrom = imageData2.getImageFrom();
                    }
                }
                jSONObject2.put("image_from", imageFrom);
                jSONArray.put(i7, jSONObject2);
            }
            jSONObject.put(IMAGE_PATH_LIST, jSONArray);
        } catch (Exception e7) {
            LivePusherLog.e(ID, "saveConfig: fail to generate json", e7);
        }
        return jSONObject;
    }

    @Override // com.bilibili.live.streaming.filter.IVideoSource
    public void tick(long j7) {
        LinkedList<ImageData> linkedList = this.mImageList;
        if (linkedList == null || linkedList.size() == 0) {
            return;
        }
        int size = (int) ((j7 / ((long) (this.mShowTime + this.mTransitionTime))) % ((long) linkedList.size()));
        int i7 = this.mShowTime;
        int i8 = this.mTransitionTime;
        this.mOffset = j7 % ((long) (i7 + i8)) < ((long) i7) ? 0.0f : ((r0 - ((long) i7)) * 1.0f) / i8;
        if (size != this.mPosition) {
            addTexture(size == linkedList.size() - 1 ? 0 : size + 1);
            this.mPosition = size;
        }
    }
}
