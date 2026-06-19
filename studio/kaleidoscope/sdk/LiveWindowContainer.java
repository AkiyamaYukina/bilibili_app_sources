package com.bilibili.studio.kaleidoscope.sdk;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bilibili.studio.kaleidoscope.sdk.LiveWindow;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/LiveWindowContainer.class */
public class LiveWindowContainer extends FrameLayout implements LiveWindow {
    protected static final int IMPL_INDEX = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, Object> f108384a;

    public LiveWindowContainer(@NonNull Context context) {
        super(context);
        this.f108384a = new HashMap();
    }

    public LiveWindowContainer(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f108384a = new HashMap();
    }

    public LiveWindowContainer(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f108384a = new HashMap();
    }

    public LiveWindowContainer(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7, i8);
        this.f108384a = new HashMap();
    }

    public static void addLiveWindow(@NonNull LiveWindow liveWindow, @NonNull View view) {
        if (!(liveWindow instanceof LiveWindowContainer)) {
            throw new IllegalArgumentException("Container must be instanceof LiveWindowContainer");
        }
        if (!(view instanceof LiveWindow)) {
            throw new IllegalArgumentException("Impl must be instanceof LiveWindow");
        }
        LiveWindowContainer liveWindowContainer = (LiveWindowContainer) liveWindow;
        if (liveWindowContainer.getChildCount() > 0) {
            liveWindowContainer.removeViewAt(0);
        }
        liveWindowContainer.addView(view, 0, new FrameLayout.LayoutParams(-1, -1));
        liveWindowContainer.initLazyAttr();
        liveWindowContainer.clearLazyAttr();
    }

    @Nullable
    public static View getLiveWindow(@NonNull LiveWindow liveWindow) {
        LiveWindowContainer liveWindowContainer = (LiveWindowContainer) liveWindow;
        if (liveWindowContainer.getChildCount() > 0) {
            return liveWindowContainer.getChildAt(0);
        }
        return null;
    }

    public final void clearLazyAttr() {
        this.f108384a.clear();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.LiveWindow
    public void clearVideoFrameX() {
        getLiveWindowImpl().clearVideoFrameX();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.LiveWindow
    public int getFillModeX() {
        return getLiveWindowImpl().getFillModeX();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.LiveWindow
    public int getHDRDisplayModeX() {
        return getLiveWindowImpl().getHDRDisplayModeX();
    }

    public final View getImpl() {
        return getChildAt(0);
    }

    public LiveWindow getLiveWindowImpl() {
        return (LiveWindow) getImpl();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.LiveWindow
    public Context getViewContext() {
        return getContext();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.LiveWindow
    public int[] getViewWH() {
        View impl = getImpl();
        int[] iArr = new int[2];
        if (impl != null) {
            iArr[0] = impl.getWidth();
            iArr[1] = impl.getHeight();
        }
        return iArr;
    }

    public void initAttr(String str, Object obj) {
        str.getClass();
        switch (str) {
            case "videoFrameCallback":
                setVideoFrameCallbackX((LiveWindow.a) obj);
                break;
            case "fillMode":
                setFillModeX(((Integer) obj).intValue());
                break;
            case "HDRDisplayMode":
                setHDRDisplayModeX(((Integer) obj).intValue());
                break;
        }
    }

    public final void initLazyAttr() {
        for (Map.Entry<String, Object> entry : this.f108384a.entrySet()) {
            initAttr(entry.getKey(), entry.getValue());
        }
    }

    public final boolean lazyInit(String str, Object obj) {
        if (getLiveWindowImpl() != null) {
            return false;
        }
        this.f108384a.put(str, obj);
        return true;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.LiveWindow
    public PointF mapCanonicalToViewX(PointF pointF) {
        return getLiveWindowImpl().mapCanonicalToViewX(pointF);
    }

    public float mapDistanceViewToCanonical(int i7, int i8, float f7, boolean z6) {
        float f8;
        int height;
        if (z6) {
            f8 = i7;
            height = getWidth();
        } else {
            f8 = i8;
            height = getHeight();
        }
        return f7 * (f8 / height);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.LiveWindow
    public PointF mapNormalizedToViewX(PointF pointF) {
        return getLiveWindowImpl().mapNormalizedToViewX(pointF);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.LiveWindow
    public PointF mapViewToCanonicalX(PointF pointF) {
        return getLiveWindowImpl().mapViewToCanonicalX(pointF);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.LiveWindow
    public PointF mapViewToNormalizedX(PointF pointF) {
        return getLiveWindowImpl().mapViewToNormalizedX(pointF);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.LiveWindow
    public void setFillModeX(int i7) {
        if (lazyInit("fillMode", Integer.valueOf(i7))) {
            return;
        }
        getLiveWindowImpl().setFillModeX(i7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.LiveWindow
    public void setHDRDisplayModeX(int i7) {
        if (lazyInit("HDRDisplayMode", Integer.valueOf(i7))) {
            return;
        }
        getLiveWindowImpl().setHDRDisplayModeX(i7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.LiveWindow
    public void setTimeline(Timeline timeline) {
        LiveWindow liveWindowImpl = getLiveWindowImpl();
        if (liveWindowImpl != null) {
            liveWindowImpl.setTimeline(timeline);
        }
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.LiveWindow
    public void setVideoFrameCallbackX(LiveWindow.a aVar) {
        if (lazyInit("videoFrameCallback", aVar)) {
            return;
        }
        getLiveWindowImpl().setVideoFrameCallbackX(aVar);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.LiveWindow
    public Bitmap takeScreenshotX() {
        return getLiveWindowImpl().takeScreenshotX();
    }
}
