package com.bilibili.montage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import androidx.annotation.NonNull;
import com.bilibili.montage.MontageLiveWindow;
import com.bilibili.montage.avinfo.MontageVideoResolution;
import com.bilibili.montage.timeline.MontageTimeline;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/MontageLiveWindowExt.class */
public class MontageLiveWindowExt extends TextureView implements TextureView.SurfaceTextureListener {
    private static final String TAG = "MontageLiveWindowExt";
    private int mFillMode;
    private Object mFrameInfoMutex;
    protected long mInternalObj;
    private ArrayList<MontageLiveWindow.VideoFrameInfo> mPendingVideoFrameInfoList;
    private Surface mSurface;
    private MontageTimeline mTimeline;
    private MontageLiveWindow.VideoFrameCallback mVideoFrameCallback;

    public MontageLiveWindowExt(@NonNull Context context) {
        super(context);
        this.mFillMode = 0;
        this.mInternalObj = 0L;
        this.mSurface = null;
        this.mVideoFrameCallback = null;
        this.mPendingVideoFrameInfoList = new ArrayList<>();
        this.mFrameInfoMutex = new Object();
        init();
    }

    public MontageLiveWindowExt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mFillMode = 0;
        this.mInternalObj = 0L;
        this.mSurface = null;
        this.mVideoFrameCallback = null;
        this.mPendingVideoFrameInfoList = new ArrayList<>();
        this.mFrameInfoMutex = new Object();
        init();
    }

    public MontageLiveWindowExt(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.mFillMode = 0;
        this.mInternalObj = 0L;
        this.mSurface = null;
        this.mVideoFrameCallback = null;
        this.mPendingVideoFrameInfoList = new ArrayList<>();
        this.mFrameInfoMutex = new Object();
        init();
    }

    public MontageLiveWindowExt(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7, i8);
        this.mFillMode = 0;
        this.mInternalObj = 0L;
        this.mSurface = null;
        this.mVideoFrameCallback = null;
        this.mPendingVideoFrameInfoList = new ArrayList<>();
        this.mFrameInfoMutex = new Object();
        init();
    }

    private void destroyCurrentSurface() {
        if (isInEditMode() || this.mSurface == null) {
            return;
        }
        nativeSurfaceDestroyed(this.mInternalObj);
        this.mSurface.release();
        this.mSurface = null;
    }

    private void init() {
        synchronized (this) {
            setSurfaceTextureListener(this);
            if (!isInEditMode() && this.mInternalObj == 0) {
                nativeInit();
            }
        }
    }

    private native void nativeInit();

    private native PointF nativeMapCanonicalToView(PointF pointF, int i7, int i8, int i9, int i10, int i11);

    private native PointF nativeMapNormalizedToView(PointF pointF, int i7, int i8, int i9, int i10, int i11);

    private native PointF nativeMapViewToCanonical(PointF pointF, int i7, int i8, int i9, int i10, int i11);

    private native PointF nativeMapViewToNormalized(PointF pointF, int i7, int i8, int i9, int i10, int i11);

    private native void nativeRelease(long j7);

    private native void nativeSetFillMode(long j7, int i7);

    private native void nativeSetHdrHighlight(long j7, boolean z6);

    private native void nativeSetVideoFrameCallback(long j7, MontageLiveWindow.InternalVideoFrameCallback internalVideoFrameCallback);

    private native void nativeSurfaceChanged(long j7, Surface surface, int i7, int i8);

    private native void nativeSurfaceDestroyed(long j7);

    private native Bitmap nativeTakeScreenshot(long j7);

    public void clearVideoFrame() {
    }

    public int getFillMode() {
        return this.mFillMode;
    }

    public int getHDRDisplayMode() {
        return 0;
    }

    public long getNativeLiveWindow() {
        return this.mInternalObj;
    }

    public PointF mapCanonicalToView(PointF pointF) {
        MontageTimeline montageTimeline = this.mTimeline;
        if (montageTimeline == null) {
            return new PointF(0.0f, 0.0f);
        }
        MontageVideoResolution videoRes = montageTimeline.getVideoRes();
        return nativeMapCanonicalToView(pointF, videoRes.imageWidth, videoRes.imageHeight, getWidth(), getHeight(), this.mFillMode);
    }

    public PointF mapNormalizedToView(PointF pointF) {
        MontageTimeline montageTimeline = this.mTimeline;
        if (montageTimeline == null) {
            return new PointF(0.0f, 0.0f);
        }
        MontageVideoResolution videoRes = montageTimeline.getVideoRes();
        return nativeMapNormalizedToView(pointF, videoRes.imageWidth, videoRes.imageHeight, getWidth(), getHeight(), this.mFillMode);
    }

    public PointF mapViewToCanonical(PointF pointF) {
        MontageTimeline montageTimeline = this.mTimeline;
        if (montageTimeline == null) {
            return new PointF(0.0f, 0.0f);
        }
        MontageVideoResolution videoRes = montageTimeline.getVideoRes();
        return nativeMapViewToCanonical(pointF, videoRes.imageWidth, videoRes.imageHeight, getWidth(), getHeight(), this.mFillMode);
    }

    public PointF mapViewToNormalized(PointF pointF) {
        MontageTimeline montageTimeline = this.mTimeline;
        if (montageTimeline == null) {
            return new PointF(0.0f, 0.0f);
        }
        MontageVideoResolution videoRes = montageTimeline.getVideoRes();
        return nativeMapViewToNormalized(pointF, videoRes.imageWidth, videoRes.imageHeight, getWidth(), getHeight(), this.mFillMode);
    }

    @Override // android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        init();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        nativeSetVideoFrameCallback(this.mInternalObj, null);
        synchronized (this) {
            this.mVideoFrameCallback = null;
        }
        if (!isInEditMode()) {
            destroyCurrentSurface();
            long j7 = this.mInternalObj;
            if (j7 != 0) {
                nativeRelease(j7);
                this.mInternalObj = 0L;
            }
        }
        setSurfaceTextureListener(null);
        super.onDetachedFromWindow();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(@NonNull SurfaceTexture surfaceTexture, int i7, int i8) {
        destroyCurrentSurface();
        if (isInEditMode() || i7 < 1 || i8 < 1) {
            return;
        }
        Surface surface = new Surface(surfaceTexture);
        this.mSurface = surface;
        nativeSurfaceChanged(this.mInternalObj, surface, i7, i8);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(@NonNull SurfaceTexture surfaceTexture) {
        destroyCurrentSurface();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(@NonNull SurfaceTexture surfaceTexture, int i7, int i8) {
        destroyCurrentSurface();
        if (isInEditMode() || i7 < 1 || i8 < 1) {
            return;
        }
        Surface surface = new Surface(surfaceTexture);
        this.mSurface = surface;
        nativeSurfaceChanged(this.mInternalObj, surface, i7, i8);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(@NonNull SurfaceTexture surfaceTexture) {
        MontageLiveWindow.VideoFrameInfo next;
        MontageLiveWindow.VideoFrameInfo videoFrameInfo;
        if (this.mVideoFrameCallback != null) {
            long timestamp = surfaceTexture.getTimestamp();
            synchronized (this.mFrameInfoMutex) {
                Iterator<MontageLiveWindow.VideoFrameInfo> it = this.mPendingVideoFrameInfoList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (next.frameId == timestamp) {
                            break;
                        }
                    }
                }
                if (next != null) {
                    while (true) {
                        videoFrameInfo = next;
                        if (!this.mPendingVideoFrameInfoList.isEmpty()) {
                            videoFrameInfo = next;
                            if (this.mPendingVideoFrameInfoList.get(0).frameId >= timestamp) {
                                break;
                            } else {
                                this.mPendingVideoFrameInfoList.remove(0);
                            }
                        } else {
                            break;
                        }
                    }
                } else {
                    videoFrameInfo = next;
                    if (!this.mPendingVideoFrameInfoList.isEmpty()) {
                        ArrayList<MontageLiveWindow.VideoFrameInfo> arrayList = this.mPendingVideoFrameInfoList;
                        videoFrameInfo = arrayList.get(arrayList.size() - 1);
                        this.mPendingVideoFrameInfoList.clear();
                    }
                }
            }
            if (videoFrameInfo != null) {
                synchronized (this) {
                    MontageLiveWindow.VideoFrameCallback videoFrameCallback = this.mVideoFrameCallback;
                    if (videoFrameCallback != null) {
                        videoFrameCallback.onVideoFrameRendered(videoFrameInfo);
                    }
                }
            }
        }
    }

    public void setFillMode(int i7) {
        if (i7 != this.mFillMode) {
            this.mFillMode = i7;
            nativeSetFillMode(this.mInternalObj, i7);
        }
    }

    public void setHDRDisplayMode(int i7) {
    }

    public void setTimeline(MontageTimeline montageTimeline) {
        this.mTimeline = montageTimeline;
    }

    public void setVideoFrameCallback(MontageLiveWindow.VideoFrameCallback videoFrameCallback) {
        if (isInEditMode()) {
            return;
        }
        this.mVideoFrameCallback = videoFrameCallback;
        if (videoFrameCallback != null) {
            nativeSetVideoFrameCallback(this.mInternalObj, new MontageLiveWindow.InternalVideoFrameCallback(this) { // from class: com.bilibili.montage.MontageLiveWindowExt.1
                final MontageLiveWindowExt this$0;

                {
                    this.this$0 = this;
                }

                @Override // com.bilibili.montage.MontageLiveWindow.InternalVideoFrameCallback
                public void onVideoFrameRendered(MontageLiveWindow.VideoFrameInfo videoFrameInfo) {
                    synchronized (this.this$0.mFrameInfoMutex) {
                        if (videoFrameInfo.frameId < 0) {
                            this.this$0.mPendingVideoFrameInfoList.clear();
                        }
                        this.this$0.mPendingVideoFrameInfoList.add(videoFrameInfo);
                    }
                }
            });
        } else {
            nativeSetVideoFrameCallback(this.mInternalObj, null);
        }
    }

    public Bitmap takeScreenshot() {
        Bitmap bitmapNativeTakeScreenshot;
        if (this.mTimeline == null || (bitmapNativeTakeScreenshot = nativeTakeScreenshot(this.mInternalObj)) == null) {
            return null;
        }
        int width = bitmapNativeTakeScreenshot.getWidth();
        int height = bitmapNativeTakeScreenshot.getHeight();
        MontageVideoResolution videoRes = this.mTimeline.getVideoRes();
        int i7 = videoRes.imageWidth;
        int i8 = videoRes.imageHeight;
        if (width == i7 && height == i8) {
            return bitmapNativeTakeScreenshot;
        }
        float f7 = i7;
        float f8 = width;
        float f9 = f7 / f8;
        float f10 = i8;
        float f11 = height;
        float fMin = Math.min(f9, f10 / f11);
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapNativeTakeScreenshot, Math.round(f8 * fMin), Math.round(f11 * fMin), true);
        bitmapNativeTakeScreenshot.recycle();
        return bitmapCreateScaledBitmap;
    }
}
