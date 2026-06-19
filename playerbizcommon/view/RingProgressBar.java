package com.bilibili.playerbizcommon.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.bilibili.magicasakura.utils.ThemeUtils;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/view/RingProgressBar.class */
public class RingProgressBar extends View implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f80355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f80356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f80357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f80358d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f80359e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f80360f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f80361g;
    public int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f80362i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f80363j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f80364k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f80365l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ValueAnimator f80366m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f80367n;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/view/RingProgressBar$a.class */
    public interface a {
        void a(int i7, int i8);
    }

    public RingProgressBar(Context context) {
        this(context, null);
    }

    public RingProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f80358d = 0;
        this.f80355a = new Paint();
        this.f80358d = (int) ((100.0f * getContext().getResources().getDisplayMetrics().density) + 0.5f);
        this.f80359e = 0;
        this.f80360f = ThemeUtils.getColorById(context, 2131102728);
        this.f80361g = (int) ((1.5f * getContext().getResources().getDisplayMetrics().density) + 0.5f);
        this.h = 100;
        this.f80362i = 0;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
        this.f80366m = valueAnimatorOfInt;
        valueAnimatorOfInt.addUpdateListener(this);
    }

    public final void a() {
        this.f80366m.cancel();
        setProgress(0);
    }

    public final void b() {
        if (this.f80366m.isRunning()) {
            this.f80366m.reverse();
        }
    }

    public final void c() {
        this.f80366m.setDuration(1500L);
        this.f80366m.setIntValues(0, this.h);
        this.f80366m.start();
    }

    public int getMax() {
        int i7;
        synchronized (this) {
            i7 = this.h;
        }
        return i7;
    }

    public int getProgress() {
        int i7;
        synchronized (this) {
            i7 = this.f80362i;
        }
        return i7;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        setProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth() / 2;
        this.f80364k = width;
        this.f80365l = (int) (width - (this.f80361g / 2.0f));
        this.f80355a.setColor(this.f80359e);
        Paint paint = this.f80355a;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.f80355a.setStrokeWidth(this.f80361g);
        this.f80355a.setAntiAlias(true);
        float f7 = this.f80364k;
        canvas.drawCircle(f7, f7, this.f80365l, this.f80355a);
        this.f80355a.setStrokeWidth(this.f80361g);
        this.f80355a.setColor(this.f80360f);
        int i7 = this.f80364k;
        int i8 = this.f80365l;
        float f8 = i7 - i8;
        float f9 = i7 + i8;
        RectF rectF = new RectF(f8, f8, f9, f9);
        this.f80355a.setStyle(style);
        this.f80355a.setStrokeCap(Paint.Cap.ROUND);
        if (this.f80367n) {
            canvas.drawArc(rectF, -90.0f, (this.f80362i * 360) / this.h, false, this.f80355a);
        } else {
            canvas.drawArc(rectF, -90.0f, (this.f80362i * (-360)) / this.h, false, this.f80355a);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        int mode2 = View.MeasureSpec.getMode(i8);
        int size2 = View.MeasureSpec.getSize(i8);
        if (mode == Integer.MIN_VALUE) {
            this.f80356b = this.f80358d;
        } else {
            this.f80356b = size;
        }
        if (mode2 == Integer.MIN_VALUE) {
            this.f80357c = this.f80358d;
        } else {
            this.f80357c = size2;
        }
        setMeasuredDimension(this.f80356b, this.f80357c);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        this.f80356b = i7;
        this.f80357c = i8;
    }

    public void setClockwise(boolean z6) {
        this.f80367n = z6;
    }

    public void setMax(int i7) {
        synchronized (this) {
            if (i7 < 0) {
                throw new IllegalArgumentException("The max progress of 0");
            }
            this.h = i7;
        }
    }

    public void setOnProgressListener(a aVar) {
        this.f80363j = aVar;
    }

    public void setProgress(int i7) {
        synchronized (this) {
            if (i7 < 0) {
                throw new IllegalArgumentException("The progress of 0");
            }
            int i8 = this.h;
            int i9 = i7;
            if (i7 > i8) {
                i9 = i8;
            }
            if (i9 <= i8) {
                this.f80362i = i9;
                postInvalidate();
            }
            a aVar = this.f80363j;
            if (aVar != null) {
                aVar.a(i9, this.h);
            }
        }
    }

    public void setRingColor(int i7) {
        this.f80359e = i7;
    }

    public void setRingProgressColor(int i7) {
        this.f80360f = i7;
    }

    public void setRingWidth(float f7) {
        this.f80361g = f7;
    }
}
