package com.bilibili.playerbizcommon.gesture;

import android.util.Log;
import android.view.MotionEvent;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/gesture/RotateGestureDetector.class */
public class RotateGestureDetector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OnRotateGestureListener f80047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MotionEvent f80048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public MotionEvent f80049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f80050d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f80051e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f80052f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f80053g;
    public boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f80054i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f80055j = 1;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/gesture/RotateGestureDetector$OnRotateGestureListener.class */
    public interface OnRotateGestureListener {
        boolean onRotate(RotateGestureDetector rotateGestureDetector);

        boolean onRotateBegin(RotateGestureDetector rotateGestureDetector);

        void onRotateEnd(RotateGestureDetector rotateGestureDetector);
    }

    public RotateGestureDetector(OnRotateGestureListener onRotateGestureListener) {
        this.f80047a = onRotateGestureListener;
    }

    public final void a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        boolean z6 = true;
        if (actionMasked != 1) {
            z6 = actionMasked == 3;
        }
        OnRotateGestureListener onRotateGestureListener = this.f80047a;
        if (actionMasked == 0 || z6) {
            if (this.h) {
                onRotateGestureListener.onRotateEnd(this);
            }
            this.h = false;
            MotionEvent motionEvent2 = this.f80048b;
            if (motionEvent2 != null) {
                motionEvent2.recycle();
                this.f80048b = null;
            }
            MotionEvent motionEvent3 = this.f80049c;
            if (motionEvent3 != null) {
                motionEvent3.recycle();
                this.f80049c = null;
                return;
            }
            return;
        }
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked != 6) {
            if (actionMasked == 5) {
                this.f80048b = MotionEvent.obtain(motionEvent);
                b(motionEvent);
                c(motionEvent);
                this.h = onRotateGestureListener.onRotateBegin(this);
            }
            if (actionMasked != 2 || pointerCount < 2) {
                return;
            }
            if (this.f80048b == null) {
                this.f80048b = MotionEvent.obtain(motionEvent);
            }
            c(motionEvent);
            if (onRotateGestureListener.onRotate(this)) {
                this.f80048b.recycle();
                this.f80048b = MotionEvent.obtain(motionEvent);
                return;
            }
            return;
        }
        if (pointerCount >= 2) {
            b(motionEvent);
            this.f80048b = null;
            return;
        }
        if (this.h) {
            onRotateGestureListener.onRotateEnd(this);
        }
        this.h = false;
        MotionEvent motionEvent4 = this.f80048b;
        if (motionEvent4 != null) {
            motionEvent4.recycle();
            this.f80048b = null;
        }
        MotionEvent motionEvent5 = this.f80049c;
        if (motionEvent5 != null) {
            motionEvent5.recycle();
            this.f80049c = null;
        }
    }

    public final void b(MotionEvent motionEvent) {
        float f7;
        float f8;
        int i7;
        int i8;
        int i9;
        float f9;
        int pointerCount = motionEvent.getPointerCount();
        int actionIndex = motionEvent.getActionMasked() == 6 ? motionEvent.getActionIndex() : Integer.MAX_VALUE;
        if (pointerCount <= 2) {
            this.f80054i = 0;
            this.f80055j = 1;
            return;
        }
        float f10 = 0.0f;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        float f11 = Float.MAX_VALUE;
        float f12 = Float.MAX_VALUE;
        float f13 = 0.0f;
        int i14 = 0;
        while (i14 < pointerCount) {
            if (i14 == actionIndex) {
                f7 = f10;
                f8 = f13;
                i7 = i10;
                i8 = i11;
                i9 = i13;
                f9 = f11;
            } else {
                float x6 = motionEvent.getX(i14);
                float y6 = motionEvent.getY(i14);
                float f14 = f11;
                if (x6 <= f11) {
                    i11 = i14;
                    f14 = x6;
                }
                float f15 = f10;
                if (x6 >= f10) {
                    i13 = i14;
                    f15 = x6;
                }
                float f16 = f12;
                if (y6 <= f12) {
                    i10 = i14;
                    f16 = y6;
                }
                f7 = f15;
                f8 = f13;
                i7 = i10;
                i8 = i11;
                i9 = i13;
                f9 = f14;
                f12 = f16;
                if (y6 >= f13) {
                    i12 = i14;
                    f12 = f16;
                    f9 = f14;
                    i9 = i13;
                    i8 = i11;
                    i7 = i10;
                    f8 = y6;
                    f7 = f15;
                }
            }
            i14++;
            f10 = f7;
            f13 = f8;
            i10 = i7;
            i11 = i8;
            i13 = i9;
            f11 = f9;
        }
        if (f10 - f11 > f13 - f12) {
            int i15 = i11;
            if (i11 >= actionIndex) {
                i15 = i11 - 1;
            }
            this.f80054i = i15;
            int i16 = i13;
            if (i13 >= actionIndex) {
                i16 = i13 - 1;
            }
            this.f80055j = i16;
            return;
        }
        int i17 = i10;
        if (i10 >= actionIndex) {
            i17 = i10 - 1;
        }
        this.f80054i = i17;
        int i18 = i12;
        if (i12 >= actionIndex) {
            i18 = i12 - 1;
        }
        this.f80055j = i18;
    }

    public final void c(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = this.f80049c;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
            this.f80049c = null;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        this.f80049c = motionEventObtain;
        MotionEvent motionEvent3 = this.f80048b;
        float x6 = motionEvent3.getX(this.f80054i);
        float y6 = motionEvent3.getY(this.f80054i);
        float x7 = motionEvent3.getX(this.f80055j);
        float y7 = motionEvent3.getY(this.f80055j);
        this.f80050d = x7 - x6;
        this.f80051e = y7 - y6;
        float x8 = motionEventObtain.getX(this.f80054i);
        float y8 = motionEventObtain.getY(this.f80054i);
        float x9 = motionEventObtain.getX(this.f80055j);
        float y9 = motionEventObtain.getY(this.f80055j);
        this.f80052f = x9 - x8;
        this.f80053g = y9 - y8;
    }

    public float getDegree() {
        return (float) (((Math.atan2(this.f80053g, this.f80052f) - Math.atan2(this.f80051e, this.f80050d)) * 180.0d) / 3.141592653589793d);
    }

    public boolean isInProgress() {
        return this.h;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z6 = false;
        try {
            if (this.f80047a != null) {
                a(motionEvent);
                z6 = true;
            }
            return z6;
        } catch (Exception e7) {
            Log.e("RotateGestureDetector", e7.toString());
            return false;
        }
    }
}
