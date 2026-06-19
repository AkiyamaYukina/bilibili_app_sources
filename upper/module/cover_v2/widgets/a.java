package com.bilibili.upper.module.cover_v2.widgets;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.bilibili.upper.module.cover_v2.widgets.MultiCaptionRectView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/widgets/a.class */
public final class a extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MultiCaptionRectView f113039a;

    public a(MultiCaptionRectView multiCaptionRectView) {
        this.f113039a = multiCaptionRectView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        MultiCaptionRectView.a aVar = this.f113039a.f113015y;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        MultiCaptionRectView.a aVar = this.f113039a.f113015y;
        return true;
    }
}
