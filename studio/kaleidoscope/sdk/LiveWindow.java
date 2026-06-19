package com.bilibili.studio.kaleidoscope.sdk;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/LiveWindow.class */
public interface LiveWindow {
    public static final int FILLMODE_PRESERVEASPECTCROP = 0;
    public static final int FILLMODE_PRESERVEASPECTFIT = 1;
    public static final int FILLMODE_PRESERVEASPECTFIT_BLUR = 3;
    public static final int FILLMODE_STRETCH = 2;
    public static final int HDR_DISPLAY_MODE_DEPEND_DEVICE = 1;
    public static final int HDR_DISPLAY_MODE_SDR = 0;
    public static final int HDR_DISPLAY_MODE_TONE_MAP_SDR = 2;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/LiveWindow$a.class */
    public interface a {
        void a();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/LiveWindow$b.class */
    public interface b {
        Object getVideoFrameInfo();
    }

    void clearVideoFrameX();

    int getFillModeX();

    int getHDRDisplayModeX();

    Context getViewContext();

    int[] getViewWH();

    PointF mapCanonicalToViewX(PointF pointF);

    PointF mapNormalizedToViewX(PointF pointF);

    PointF mapViewToCanonicalX(PointF pointF);

    PointF mapViewToNormalizedX(PointF pointF);

    void setFillModeX(int i7);

    void setHDRDisplayModeX(int i7);

    void setTimeline(Timeline timeline);

    void setVideoFrameCallbackX(a aVar);

    Bitmap takeScreenshotX();
}
