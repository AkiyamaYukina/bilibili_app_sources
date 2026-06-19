package com.bilibili.studio.kaleidoscope.sdk.montage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import com.bilibili.montage.MontageLiveWindowExt;
import com.bilibili.studio.kaleidoscope.sdk.LiveWindow;
import com.bilibili.studio.kaleidoscope.sdk.LiveWindowExt;
import com.bilibili.studio.kaleidoscope.sdk.Timeline;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonLiveWindowExtImpl.class */
public final class MonLiveWindowExtImpl extends MontageLiveWindowExt implements LiveWindowExt {
    private static final String TAG = "Mon.LWE.Impl";

    public MonLiveWindowExtImpl(@NonNull Context context) {
        super(context);
    }

    public MonLiveWindowExtImpl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MonLiveWindowExtImpl(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
    }

    public MonLiveWindowExtImpl(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7, i8);
    }

    public static MonLiveWindowExtImpl newInstance(Context context) {
        return new MonLiveWindowExtImpl(context);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.LiveWindow
    public void clearVideoFrameX() {
        clearVideoFrame();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.LiveWindow
    public int getFillModeX() {
        return getFillMode();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.LiveWindow
    public int getHDRDisplayModeX() {
        return getHDRDisplayMode();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.LiveWindow
    public Context getViewContext() {
        return getContext();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.LiveWindowExt
    public Context getViewExtContext() {
        return getContext();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.LiveWindow
    public int[] getViewWH() {
        return new int[]{getWidth(), getHeight()};
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.LiveWindow
    public PointF mapCanonicalToViewX(PointF pointF) {
        return mapCanonicalToView(pointF);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.LiveWindow
    public PointF mapNormalizedToViewX(PointF pointF) {
        return mapNormalizedToView(pointF);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.LiveWindow
    public PointF mapViewToCanonicalX(PointF pointF) {
        return mapViewToCanonical(pointF);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.LiveWindow
    public PointF mapViewToNormalizedX(PointF pointF) {
        return mapViewToNormalized(pointF);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.LiveWindow
    public void setFillModeX(int i7) {
        setFillMode(i7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.LiveWindow
    public void setHDRDisplayModeX(int i7) {
        setHDRDisplayMode(i7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.LiveWindowExt
    public void setOpaqueX(boolean z6) {
        setOpaque(z6);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.LiveWindow
    public void setTimeline(Timeline timeline) {
        setTimeline(MonTimelineImpl.unbox(timeline));
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.LiveWindow
    public void setVideoFrameCallbackX(LiveWindow.a aVar) {
        setVideoFrameCallback(aVar != null ? new b(aVar) : null);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.LiveWindow
    public Bitmap takeScreenshotX() {
        return takeScreenshot();
    }
}
