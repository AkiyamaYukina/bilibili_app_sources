package com.bilibili.studio.videoeditor.editor.imagemake.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import pC0.c$a;
import qC0.C8405a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/editor/imagemake/views/GestureCropImageView.class */
public class GestureCropImageView extends C8405a {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public ScaleGestureDetector f109484F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public pC0.c f109485G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public GestureDetector f109486H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public float f109487I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public float f109488J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f109489K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f109490L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f109491M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f109492N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f109493O;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/editor/imagemake/views/GestureCropImageView$a.class */
    public final class a extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GestureCropImageView f109494a;

        public a(GestureCropImageView gestureCropImageView) {
            this.f109494a = gestureCropImageView;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f8) {
            this.f109494a.u(-f7, -f8);
            return true;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/editor/imagemake/views/GestureCropImageView$b.class */
    public final class b extends c$a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GestureCropImageView f109495a;

        public b(GestureCropImageView gestureCropImageView) {
            this.f109495a = gestureCropImageView;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/editor/imagemake/views/GestureCropImageView$c.class */
    public final class c extends ScaleGestureDetector.SimpleOnScaleGestureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GestureCropImageView f109496a;

        public c(GestureCropImageView gestureCropImageView) {
            this.f109496a = gestureCropImageView;
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            GestureCropImageView gestureCropImageView = this.f109496a;
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            GestureCropImageView gestureCropImageView2 = this.f109496a;
            gestureCropImageView.t(scaleFactor, gestureCropImageView2.f109487I, gestureCropImageView2.f109488J);
            return true;
        }
    }

    public GestureCropImageView(Context context) {
        super(context);
        this.f109489K = true;
        this.f109490L = true;
        this.f109491M = true;
        this.f109492N = true;
        this.f109493O = false;
    }

    public GestureCropImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f109489K = true;
        this.f109490L = true;
        this.f109491M = true;
        this.f109492N = true;
        this.f109493O = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, pC0.c] */
    @Override // qC0.b
    public final void init() {
        super.init();
        this.f109486H = new GestureDetector(getContext(), new a(this), null, true);
        this.f109484F = new ScaleGestureDetector(getContext(), new c(this));
        b bVar = new b(this);
        ?? obj = new Object();
        ((pC0.c) obj).i = bVar;
        ((pC0.c) obj).e = -1;
        ((pC0.c) obj).f = -1;
        this.f109485G = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if ((motionEvent.getAction() & 255) == 0) {
            removeCallbacks(this.f125919B);
            removeCallbacks(null);
        }
        if (!this.f109492N) {
            return false;
        }
        if (motionEvent.getPointerCount() > 1) {
            this.f109487I = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
            this.f109488J = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
        }
        if (this.f109491M) {
            this.f109486H.onTouchEvent(motionEvent);
        }
        if (this.f109490L) {
            this.f109484F.onTouchEvent(motionEvent);
        }
        if (this.f109489K) {
            pC0.c cVar = this.f109485G;
            cVar.getClass();
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                cVar.c = motionEvent.getX();
                cVar.d = motionEvent.getY();
                cVar.e = motionEvent.findPointerIndex(motionEvent.getPointerId(0));
                cVar.g = 0.0f;
                cVar.h = true;
            } else if (actionMasked == 1) {
                cVar.e = -1;
            } else if (actionMasked != 2) {
                if (actionMasked == 5) {
                    cVar.a = motionEvent.getX();
                    cVar.b = motionEvent.getY();
                    cVar.f = motionEvent.findPointerIndex(motionEvent.getPointerId(motionEvent.getActionIndex()));
                    cVar.g = 0.0f;
                    cVar.h = true;
                } else if (actionMasked == 6) {
                    cVar.f = -1;
                }
            } else if (cVar.e != -1 && cVar.f != -1 && motionEvent.getPointerCount() > cVar.f) {
                float x6 = motionEvent.getX(cVar.e);
                float y6 = motionEvent.getY(cVar.e);
                float x7 = motionEvent.getX(cVar.f);
                float y7 = motionEvent.getY(cVar.f);
                if (cVar.h) {
                    cVar.g = 0.0f;
                    cVar.h = false;
                } else {
                    float f7 = cVar.a;
                    float degrees = (((float) Math.toDegrees((float) Math.atan2(y7 - y6, x7 - x6))) % 360.0f) - (((float) Math.toDegrees((float) Math.atan2(cVar.b - cVar.d, f7 - cVar.c))) % 360.0f);
                    cVar.g = degrees;
                    if (degrees < -180.0f) {
                        cVar.g = degrees + 360.0f;
                    } else if (degrees > 180.0f) {
                        cVar.g = degrees - 360.0f;
                    }
                }
                b bVar = cVar.i;
                float f8 = cVar.g;
                GestureCropImageView gestureCropImageView = bVar.f109495a;
                float f9 = gestureCropImageView.f109487I;
                float f10 = gestureCropImageView.f109488J;
                if (f8 != 0.0f) {
                    gestureCropImageView.f125934u.postRotate(f8, f9, f10);
                    gestureCropImageView.setExtraMatrix(gestureCropImageView.f125934u);
                }
                cVar.a = x7;
                cVar.b = y7;
                cVar.c = x6;
                cVar.d = y6;
            }
        }
        if ((motionEvent.getAction() & 255) != 1) {
            return true;
        }
        setImageToWrapCropBounds(true);
        this.f109493O = true;
        return true;
    }

    public void setGestureEnabled(boolean z6) {
        this.f109491M = z6;
    }

    public void setRotateEnabled(boolean z6) {
        this.f109489K = z6;
    }

    public void setScaleEnabled(boolean z6) {
        this.f109490L = z6;
    }

    public void setTouchEnabled(boolean z6) {
        this.f109492N = z6;
    }
}
