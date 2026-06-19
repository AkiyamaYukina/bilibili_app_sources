package com.bilibili.upper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.ProgressBar;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/UpperCircleProgressView.class */
public class UpperCircleProgressView extends ProgressBar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f114420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f114421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f114422c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f114423d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f114424e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f114425f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f114426g;
    public final int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f114427i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f114428j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f114429k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Paint f114430l;

    public UpperCircleProgressView(Context context) {
        this(context, null);
    }

    public UpperCircleProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f114420a = a(3.0f);
        this.f114421b = a(3.0f);
        int iApplyDimension = (int) TypedValue.applyDimension(2, 18, getResources().getDisplayMetrics());
        int iApplyDimension2 = (int) TypedValue.applyDimension(2, 10, getResources().getDisplayMetrics());
        this.f114422c = a(30.0f);
        this.f114428j = 0;
        Paint paint = new Paint();
        this.f114430l = paint;
        int color = context.getResources().getColor(2131103591);
        int color2 = context.getResources().getColor(2131103591);
        int color3 = context.getResources().getColor(2131103598);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, IE0.a.f10170k);
        this.f114422c = (int) typedArrayObtainStyledAttributes.getDimension(8, this.f114422c);
        this.f114424e = typedArrayObtainStyledAttributes.getColor(3, color3);
        this.f114423d = typedArrayObtainStyledAttributes.getColor(0, color2);
        this.f114427i = (int) typedArrayObtainStyledAttributes.getDimension(7, iApplyDimension);
        this.f114425f = (int) typedArrayObtainStyledAttributes.getDimension(5, iApplyDimension2);
        this.h = typedArrayObtainStyledAttributes.getColor(6, color);
        this.f114429k = typedArrayObtainStyledAttributes.getInteger(4, 100);
        this.f114420a = (int) typedArrayObtainStyledAttributes.getDimension(1, a(3.0f));
        this.f114421b = (int) typedArrayObtainStyledAttributes.getDimension(2, a(3.0f));
        typedArrayObtainStyledAttributes.recycle();
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    public final int a(float f7) {
        return (int) ((f7 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    @Override // android.widget.ProgressBar
    public int getMax() {
        return this.f114429k;
    }

    @Override // android.widget.ProgressBar
    public int getProgress() {
        return this.f114428j;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDraw(Canvas canvas) {
        synchronized (this) {
            this.f114430l.setTextSize(this.f114427i);
            String strValueOf = String.valueOf(this.f114428j);
            float fMeasureText = this.f114430l.measureText(strValueOf);
            float fDescent = (this.f114430l.descent() + this.f114430l.ascent()) / 2.0f;
            this.f114430l.setTextSize(this.f114425f);
            float fMeasureText2 = this.f114430l.measureText("%");
            this.f114430l.setTextSize(this.f114427i);
            canvas.save();
            canvas.translate(getPaddingLeft() + (this.f114426g / 2), getPaddingTop() + (this.f114426g / 2));
            this.f114430l.setStyle(Paint.Style.STROKE);
            this.f114430l.setColor(this.f114424e);
            this.f114430l.setStrokeWidth(this.f114421b);
            float f7 = this.f114422c;
            canvas.drawCircle(f7, f7, f7, this.f114430l);
            this.f114430l.setColor(this.f114423d);
            this.f114430l.setStrokeWidth(this.f114420a);
            float f8 = this.f114422c * 2;
            canvas.drawArc(new RectF(0.0f, 0.0f, f8, f8), -90.0f, ((getProgress() * 1.0f) / getMax()) * 360.0f, false, this.f114430l);
            this.f114430l.setColor(this.h);
            this.f114430l.setStyle(Paint.Style.FILL);
            this.f114430l.setTextSize(this.f114427i);
            float f9 = this.f114422c;
            float f10 = (fMeasureText2 + fMeasureText) / 2.0f;
            canvas.drawText(strValueOf, f9 - f10, f9 - fDescent, this.f114430l);
            this.f114430l.setTextSize(this.f114425f);
            float f11 = this.f114422c;
            canvas.drawText("%", (f11 - f10) + fMeasureText, f11 - fDescent, this.f114430l);
            canvas.restore();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onMeasure(int i7, int i8) {
        synchronized (this) {
            int iMax = Math.max(this.f114420a, this.f114421b);
            this.f114426g = iMax;
            int paddingLeft = (this.f114422c * 2) + iMax + getPaddingLeft() + getPaddingRight();
            int iMin = Math.min(ProgressBar.resolveSize(paddingLeft, i7), ProgressBar.resolveSize(paddingLeft, i8));
            this.f114422c = (((iMin - getPaddingLeft()) - getPaddingRight()) - this.f114426g) / 2;
            setMeasuredDimension(iMin, iMin);
        }
    }

    @Override // android.widget.ProgressBar
    public void setMax(int i7) {
        this.f114429k = i7;
    }

    @Override // android.widget.ProgressBar
    public void setProgress(int i7) {
        this.f114428j = i7;
        invalidate();
    }
}
