package com.bilibili.opd.app.bizcommon.imageselector.media.camera;

import Km0.C2457e;
import Km0.C2458f;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.SurfaceView;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/media/camera/MallMediaCameraSurfaceView.class */
@StabilityInferred(parameters = 0)
public final class MallMediaCameraSurfaceView extends SurfaceView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public C2457e f73743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public ScaleGestureDetector f73744b;

    public MallMediaCameraSurfaceView(@Nullable Context context) {
        this(context, null);
    }

    public MallMediaCameraSurfaceView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f73743a = new C2457e(this);
        Context context2 = getContext();
        C2457e c2457e = this.f73743a;
        if (c2457e.h == null) {
            c2457e.h = new C2458f(c2457e);
        }
        this.f73744b = new ScaleGestureDetector(context2, c2457e.h);
    }

    @Nullable
    public final ScaleGestureDetector getMScaleGestureDetector() {
        return this.f73744b;
    }

    @Nullable
    public final C2457e getMediaCameraManager() {
        return this.f73743a;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(@NotNull MotionEvent motionEvent) {
        ScaleGestureDetector scaleGestureDetector = this.f73744b;
        if (scaleGestureDetector == null || scaleGestureDetector == null) {
            return true;
        }
        scaleGestureDetector.onTouchEvent(motionEvent);
        return true;
    }

    public final void setMScaleGestureDetector(@Nullable ScaleGestureDetector scaleGestureDetector) {
        this.f73744b = scaleGestureDetector;
    }

    public final void setMediaCameraManager(@Nullable C2457e c2457e) {
        this.f73743a = c2457e;
    }
}
