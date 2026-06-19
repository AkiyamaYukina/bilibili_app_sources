package com.bilibili.upper.module.uppercenter.datacenter;

import IE0.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenter/datacenter/BiliCircleView.class */
@StabilityInferred(parameters = 0)
public final class BiliCircleView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Paint f114081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f114082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f114083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f114084d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f114085e;

    public BiliCircleView(@NotNull Context context) {
        this(context, null);
    }

    public BiliCircleView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Paint paint = new Paint();
        this.f114081a = paint;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, a.f10162b);
            this.f114084d = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 20);
            this.f114082b = typedArrayObtainStyledAttributes.getColor(0, Color.parseColor("#FFDFE7"));
            this.f114083c = typedArrayObtainStyledAttributes.getColor(1, Color.parseColor("#FF6699"));
            this.f114085e = typedArrayObtainStyledAttributes.getInt(3, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
    }

    @Override // android.view.View
    public final void onDraw(@NotNull Canvas canvas) {
        int measuredWidth = getMeasuredWidth();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int paddingBottom = getPaddingBottom();
        int paddingTop = getPaddingTop();
        float f7 = this.f114084d / 2.0f;
        float fMin = (Integer.min((measuredWidth - paddingLeft) - paddingRight, (measuredHeight - paddingBottom) - paddingTop) / 2.0f) - f7;
        canvas.translate(getPaddingLeft() + f7, getPaddingTop() + f7);
        this.f114081a.setColor(this.f114082b);
        Paint paint = this.f114081a;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.f114081a.setStrokeWidth(this.f114084d);
        canvas.drawCircle(fMin, fMin, fMin, this.f114081a);
        this.f114081a.setColor(this.f114083c);
        this.f114081a.setStyle(style);
        this.f114081a.setStrokeWidth(this.f114084d);
        float f8 = fMin * 2;
        canvas.drawArc(0.0f, 0.0f, f8, f8, 270.0f, this.f114085e * 3.6f, false, this.f114081a);
        int i7 = this.f114085e;
        if (1 > i7 || i7 >= 100) {
            return;
        }
        this.f114081a.setColor(this.f114083c);
        this.f114081a.setStyle(Paint.Style.FILL);
        canvas.translate(fMin - f7, -f7);
        canvas.drawCircle(f7, f7, f7, this.f114081a);
        double d7 = fMin;
        double d8 = (this.f114085e * 3.6f) - 90;
        canvas.translate((float) (Math.cos(Math.toRadians(d8)) * d7), (float) ((Math.sin(Math.toRadians(d8)) * d7) + d7));
        canvas.drawCircle(f7, f7, f7, this.f114081a);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        setMeasuredDimension(View.resolveSizeAndState(getPaddingRight() + getPaddingLeft() + 80, i7, 0), View.resolveSizeAndState(paddingBottom + paddingTop + 80, i8, 0));
    }

    public final void setProgress(int i7) {
        this.f114085e = i7;
        postInvalidate();
    }
}
