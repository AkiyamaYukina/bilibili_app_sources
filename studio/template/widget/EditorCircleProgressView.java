package com.bilibili.studio.template.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.ProgressBar;
import com.bilibili.studio.videoeditor.w;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/template/widget/EditorCircleProgressView.class */
public class EditorCircleProgressView extends ProgressBar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f108643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f108644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f108645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f108646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f108647e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f108648f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f108649g;
    public final int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f108650i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f108651j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f108652k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Paint f108653l;

    public EditorCircleProgressView(Context context) {
        this(context, null);
    }

    public EditorCircleProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f108643a = a(3.0f);
        this.f108644b = a(3.0f);
        int iApplyDimension = (int) TypedValue.applyDimension(2, 18, getResources().getDisplayMetrics());
        int iApplyDimension2 = (int) TypedValue.applyDimension(2, 10, getResources().getDisplayMetrics());
        this.f108645c = a(30.0f);
        this.f108651j = 0;
        Paint paint = new Paint();
        this.f108653l = paint;
        int color = context.getResources().getColor(R.color.white);
        int color2 = context.getResources().getColor(R.color.white);
        int color3 = context.getResources().getColor(2131103598);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w.f110269f);
        this.f108645c = (int) typedArrayObtainStyledAttributes.getDimension(8, this.f108645c);
        this.f108647e = typedArrayObtainStyledAttributes.getColor(3, color3);
        this.f108646d = typedArrayObtainStyledAttributes.getColor(0, color2);
        this.f108650i = (int) typedArrayObtainStyledAttributes.getDimension(7, iApplyDimension);
        this.f108648f = (int) typedArrayObtainStyledAttributes.getDimension(5, iApplyDimension2);
        this.h = typedArrayObtainStyledAttributes.getColor(6, color);
        this.f108652k = typedArrayObtainStyledAttributes.getInteger(4, 100);
        this.f108643a = (int) typedArrayObtainStyledAttributes.getDimension(1, a(3.0f));
        this.f108644b = (int) typedArrayObtainStyledAttributes.getDimension(2, a(3.0f));
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
        return this.f108652k;
    }

    @Override // android.widget.ProgressBar
    public int getProgress() {
        return this.f108651j;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDraw(Canvas canvas) {
        synchronized (this) {
            this.f108653l.setTextSize(this.f108650i);
            String strValueOf = String.valueOf(this.f108651j);
            float fMeasureText = this.f108653l.measureText(strValueOf);
            float fDescent = (this.f108653l.descent() + this.f108653l.ascent()) / 2.0f;
            this.f108653l.setTextSize(this.f108648f);
            float fMeasureText2 = this.f108653l.measureText("%");
            this.f108653l.setTextSize(this.f108650i);
            canvas.save();
            canvas.translate(getPaddingLeft() + (this.f108649g / 2), getPaddingTop() + (this.f108649g / 2));
            this.f108653l.setStyle(Paint.Style.STROKE);
            this.f108653l.setColor(this.f108647e);
            this.f108653l.setStrokeWidth(this.f108644b);
            float f7 = this.f108645c;
            canvas.drawCircle(f7, f7, f7, this.f108653l);
            this.f108653l.setColor(this.f108646d);
            this.f108653l.setStrokeWidth(this.f108643a);
            float f8 = this.f108645c * 2;
            canvas.drawArc(new RectF(0.0f, 0.0f, f8, f8), -90.0f, ((getProgress() * 1.0f) / getMax()) * 360.0f, false, this.f108653l);
            this.f108653l.setColor(this.h);
            this.f108653l.setStyle(Paint.Style.FILL);
            this.f108653l.setTextSize(this.f108650i);
            float f9 = this.f108645c;
            float f10 = (fMeasureText2 + fMeasureText) / 2.0f;
            canvas.drawText(strValueOf, f9 - f10, f9 - fDescent, this.f108653l);
            this.f108653l.setTextSize(this.f108648f);
            float f11 = this.f108645c;
            canvas.drawText("%", (f11 - f10) + fMeasureText, f11 - fDescent, this.f108653l);
            canvas.restore();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onMeasure(int i7, int i8) {
        synchronized (this) {
            int iMax = Math.max(this.f108643a, this.f108644b);
            this.f108649g = iMax;
            int paddingLeft = (this.f108645c * 2) + iMax + getPaddingLeft() + getPaddingRight();
            int iMin = Math.min(ProgressBar.resolveSize(paddingLeft, i7), ProgressBar.resolveSize(paddingLeft, i8));
            this.f108645c = (((iMin - getPaddingLeft()) - getPaddingRight()) - this.f108649g) / 2;
            setMeasuredDimension(iMin, iMin);
        }
    }

    public void setFlowProgressColor(int i7) {
        this.f108646d = i7;
    }

    @Override // android.widget.ProgressBar
    public void setMax(int i7) {
        this.f108652k = i7;
    }

    @Override // android.widget.ProgressBar
    public void setProgress(int i7) {
        this.f108651j = i7;
        invalidate();
    }
}
