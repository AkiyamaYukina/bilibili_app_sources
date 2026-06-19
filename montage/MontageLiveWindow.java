package com.bilibili.montage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.bilibili.montage.avinfo.MontageVideoResolution;
import com.bilibili.montage.timeline.MontageTimeline;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/MontageLiveWindow.class */
public class MontageLiveWindow extends SurfaceView implements SurfaceHolder.Callback {
    public static final int FILLMODE_PRESERVEASPECTCROP = 0;
    public static final int FILLMODE_PRESERVEASPECTFIT = 1;
    public static final int FILLMODE_STRETCH = 2;
    private static final String TAG = "MontageLiveWindow";
    private int mFillMode;
    protected long mInternalObj;
    protected Surface mSurface;
    private MontageTimeline mTimeline;
    private VideoFrameCallback mVideoFrameCallback;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/MontageLiveWindow$InternalVideoFrameCallback.class */
    public interface InternalVideoFrameCallback {
        void onVideoFrameRendered(VideoFrameInfo videoFrameInfo);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/MontageLiveWindow$VideoFrameCallback.class */
    public interface VideoFrameCallback {
        void onVideoFrameRendered(VideoFrameInfo videoFrameInfo);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/MontageLiveWindow$VideoFrameInfo.class */
    public static class VideoFrameInfo {
        public long frameId;
        public long streamTime;
        public float captionAnchorX = 0.0f;
        public float captionAnchorY = 0.0f;
        public float captionScaleX = 1.0f;
        public float captionScaleY = 1.0f;
        public float captionRotationZ = 0.0f;
        public float captionTransX = 0.0f;
        public float captionTransY = 0.0f;
    }

    public MontageLiveWindow(Context context) {
        this(context, null);
    }

    public MontageLiveWindow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MontageLiveWindow(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.mInternalObj = 0L;
        this.mFillMode = 0;
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
        if (isInEditMode() || this.mInternalObj != 0) {
            return;
        }
        nativeInit();
        getHolder().addCallback(this);
    }

    private native void nativeInit();

    private native PointF nativeMapCanonicalToView(PointF pointF, int i7, int i8, int i9, int i10, int i11);

    private native PointF nativeMapNormalizedToView(PointF pointF, int i7, int i8, int i9, int i10, int i11);

    private native PointF nativeMapViewToCanonical(PointF pointF, int i7, int i8, int i9, int i10, int i11);

    private native PointF nativeMapViewToNormalized(PointF pointF, int i7, int i8, int i9, int i10, int i11);

    private native void nativeRelease(long j7);

    private native void nativeSetFillMode(long j7, int i7);

    private native void nativeSetHdrHighlight(long j7, boolean z6);

    private native void nativeSetVideoFrameCallback(long j7, InternalVideoFrameCallback internalVideoFrameCallback);

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

    @Override // android.view.SurfaceView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.i(TAG, "onAttachedToWindow");
        init();
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        Log.i(TAG, "onDetachedFromWindow");
        nativeSetVideoFrameCallback(this.mInternalObj, null);
        this.mVideoFrameCallback = null;
        if (!isInEditMode()) {
            long j7 = this.mInternalObj;
            if (j7 != 0) {
                nativeRelease(j7);
                this.mInternalObj = 0L;
                getHolder().removeCallback(this);
            }
        }
        super.onDetachedFromWindow();
    }

    public void setFillMode(int i7) {
        if (this.mFillMode != i7) {
            this.mFillMode = i7;
            nativeSetFillMode(this.mInternalObj, i7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setHDRDisplayMode(int r6) {
        /*
            r5 = this;
            boolean r0 = com.bilibili.montage.utils.HDRUtils.isSupportBT2020PQ()
            if (r0 == 0) goto L19
            r0 = 1
            r8 = r0
            r0 = r8
            r7 = r0
            r0 = r6
            r1 = 1
            if (r0 == r1) goto L1b
            r0 = r6
            r1 = 2
            if (r0 != r1) goto L19
            r0 = r8
            r7 = r0
            goto L1b
        L19:
            r0 = 0
            r7 = r0
        L1b:
            r0 = r5
            r1 = r5
            long r1 = r1.mInternalObj
            r2 = r7
            r0.nativeSetHdrHighlight(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.montage.MontageLiveWindow.setHDRDisplayMode(int):void");
    }

    public void setTimeline(MontageTimeline montageTimeline) {
        this.mTimeline = montageTimeline;
    }

    public void setVideoFrameCallback(VideoFrameCallback videoFrameCallback) {
        if (isInEditMode()) {
            return;
        }
        this.mVideoFrameCallback = videoFrameCallback;
        if (videoFrameCallback != null) {
            nativeSetVideoFrameCallback(this.mInternalObj, new InternalVideoFrameCallback(this) { // from class: com.bilibili.montage.MontageLiveWindow.1
                final MontageLiveWindow this$0;

                {
                    this.this$0 = this;
                }

                @Override // com.bilibili.montage.MontageLiveWindow.InternalVideoFrameCallback
                public void onVideoFrameRendered(VideoFrameInfo videoFrameInfo) {
                    if (this.this$0.mVideoFrameCallback != null) {
                        this.this$0.mVideoFrameCallback.onVideoFrameRendered(videoFrameInfo);
                    }
                }
            });
        } else {
            nativeSetVideoFrameCallback(this.mInternalObj, null);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i7, int i8, int i9) {
        Log.e(TAG, "surfaceChanged width: " + i8 + " height: " + i9);
        if (isInEditMode() || i8 < 1 || i9 < 1) {
            return;
        }
        nativeSurfaceChanged(this.mInternalObj, surfaceHolder.getSurface(), i8, i9);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        Log.i(TAG, "surfaceCreated");
        if (isInEditMode() || getWidth() < 1 || getHeight() < 1) {
            return;
        }
        Surface surface = surfaceHolder.getSurface();
        this.mSurface = surface;
        nativeSurfaceChanged(this.mInternalObj, surface, getWidth(), getHeight());
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        Log.e(TAG, "surfaceDestroyed");
        if (isInEditMode()) {
            return;
        }
        destroyCurrentSurface();
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
