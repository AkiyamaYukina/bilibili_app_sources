package com.bilibili.upper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/ShadowLayout.class */
public class ShadowLayout extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Paint f114413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RectF f114414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RectF f114415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f114416d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f114417e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Paint f114418f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f114419g;

    public ShadowLayout(@NonNull Context context) {
        super(context);
        this.f114419g = -1;
        a(null);
    }

    public ShadowLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f114419g = -1;
        a(attributeSet);
    }

    public final void a(AttributeSet attributeSet) {
        this.f114414b = new RectF();
        this.f114413a = new Paint(5);
        Paint paint = new Paint(5);
        this.f114418f = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f114415c = new RectF();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, IE0.a.h);
            int color = typedArrayObtainStyledAttributes.getColor(11, -16776961);
            int iArgb = 0;
            int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(15, 0);
            int dimensionPixelOffset2 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(13, 0);
            int dimensionPixelOffset3 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(14, 0);
            this.f114416d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(12, 0);
            this.f114419g = typedArrayObtainStyledAttributes.getColor(16, -1);
            typedArrayObtainStyledAttributes.recycle();
            this.f114417e = Math.max(Math.abs(dimensionPixelOffset2) + dimensionPixelOffset, Math.abs(dimensionPixelOffset3) + dimensionPixelOffset);
            this.f114413a.setMaskFilter(new BlurMaskFilter(this.f114417e, BlurMaskFilter.Blur.OUTER));
            Paint paint2 = this.f114413a;
            float f7 = 1.0f - ((dimensionPixelOffset * 1.0f) / this.f114417e);
            if (f7 != 0.0f) {
                int iAlpha = Color.alpha(color);
                int iRed = Color.red(color);
                int iGreen = Color.green(color);
                int iBlue = Color.blue(color);
                int i7 = (int) (((double) (iAlpha / (1.0f - f7))) + 0.5d);
                int i8 = i7;
                if (i7 > 255) {
                    i8 = 255;
                }
                iArgb = Color.argb(i8, iRed, iGreen, iBlue);
            }
            paint2.setColor(iArgb);
            setPadding(dimensionPixelOffset - dimensionPixelOffset2, dimensionPixelOffset - dimensionPixelOffset3, dimensionPixelOffset2 + dimensionPixelOffset, dimensionPixelOffset + dimensionPixelOffset3);
            setLayerType(1, null);
            b(getWidth(), getHeight());
        }
        this.f114418f.setColor(this.f114419g);
    }

    public final void b(int i7, int i8) {
        if (i7 <= 0 || i8 <= 0) {
            return;
        }
        this.f114414b.set(0.0f, 0.0f, i7, i8);
        RectF rectF = this.f114414b;
        int i9 = this.f114417e;
        rectF.inset(i9, i9);
        this.f114415c.set(getPaddingLeft(), getPaddingTop(), i7 - getPaddingRight(), i8 - getPaddingBottom());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.f114414b.width() > 0.0f) {
            RectF rectF = this.f114414b;
            int i7 = this.f114416d;
            canvas.drawRoundRect(rectF, i7, i7, this.f114413a);
            RectF rectF2 = this.f114415c;
            int i8 = this.f114416d;
            canvas.drawRoundRect(rectF2, i8, i8, this.f114418f);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        b(i7, i8);
    }

    public void setCorner(int i7) {
        this.f114416d = i7;
        b(getWidth(), getHeight());
        invalidate();
    }
}
