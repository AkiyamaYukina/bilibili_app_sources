package com.bilibili.playerbizcommonv2.widget;

import Nh1.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/BubbleContainer.class */
public class BubbleContainer extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f82270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f82271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f82272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f82273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f82274e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RectF f82275f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Paint f82276g;
    public boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f82277i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f82278j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f82279k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f82280l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f82281m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Bitmap f82282n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Canvas f82283o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Paint f82284p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Paint f82285q;

    public BubbleContainer(@NonNull Context context) {
        super(context);
        this.f82275f = new RectF();
        this.f82279k = -1.0f;
        a(context, null);
    }

    public BubbleContainer(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f82275f = new RectF();
        this.f82279k = -1.0f;
        a(context, attributeSet);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        if (this.h) {
            return;
        }
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.a);
            this.f82270a = typedArrayObtainStyledAttributes.getColor(1, ViewCompat.MEASURED_STATE_MASK);
            this.f82271b = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
            this.f82272c = typedArrayObtainStyledAttributes.getDimension(2, 0.0f);
            this.f82273d = typedArrayObtainStyledAttributes.getBoolean(3, true);
            typedArrayObtainStyledAttributes.recycle();
        }
        setWillNotDraw(false);
        this.h = true;
        Paint paint = new Paint();
        this.f82276g = paint;
        paint.setAntiAlias(true);
        this.f82276g.setColor(this.f82270a);
        Paint paint2 = this.f82276g;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        this.f82277i = (float) Math.sqrt(Math.pow((this.f82271b + this.f82272c) / 2.0f, 2.0d) + Math.pow(this.f82271b + this.f82272c, 2.0d));
        this.f82283o = new Canvas();
        Paint paint3 = new Paint();
        this.f82284p = paint3;
        paint3.setAntiAlias(true);
        this.f82284p.setColor(Color.argb(255, Color.red(this.f82270a), Color.green(this.f82270a), Color.blue(this.f82270a)));
        this.f82284p.setStyle(style);
        Paint paint4 = new Paint();
        this.f82285q = paint4;
        paint4.setAntiAlias(true);
        this.f82285q.setColor(Color.argb(Color.alpha(this.f82270a), 255, 255, 255));
        this.f82285q.setStyle(style);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        if (this.f82273d) {
            if (this.f82280l || this.f82281m) {
                int width = getWidth();
                if (this.f82278j < 0.0f) {
                    this.f82278j = 0.0f;
                }
                float f7 = width;
                if (this.f82278j > f7) {
                    this.f82278j = f7;
                }
                float f8 = this.f82279k;
                if (f8 >= 0.0f && f8 <= 1.0f) {
                    this.f82278j = f8 * f7;
                }
                float f9 = this.f82278j;
                float f10 = this.f82277i;
                float f11 = (f10 / 2.0f) + f9;
                float f12 = f9 - (f10 / 2.0f);
                float f13 = f12;
                float f14 = f11;
                if (f12 < 0.0f) {
                    f14 = f11 - f12;
                    f13 = 0.0f;
                }
                if (f14 > f7) {
                    f13 -= f14 - f7;
                    f14 = f7;
                }
                int i7 = this.f82274e;
                float f15 = i7 + this.f82271b;
                float f16 = i7 - this.f82272c;
                Path path = new Path();
                path.moveTo(f9, f15);
                path.lineTo(f13, f16);
                path.lineTo(f14, f16);
                path.lineTo(f9, f15);
                path.close();
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, getHeight(), Bitmap.Config.ARGB_8888);
                this.f82282n = bitmapCreateBitmap;
                this.f82283o.setBitmap(bitmapCreateBitmap);
                this.f82283o.translate(0.0f, 0.0f);
                Canvas canvas2 = this.f82283o;
                RectF rectF = this.f82275f;
                float f17 = this.f82272c;
                canvas2.drawRoundRect(rectF, f17, f17, this.f82284p);
                this.f82283o.drawPath(path, this.f82284p);
            }
            canvas.drawBitmap(this.f82282n, 0.0f, 0.0f, this.f82285q);
        } else {
            RectF rectF2 = this.f82275f;
            float f18 = this.f82272c;
            canvas.drawRoundRect(rectF2, f18, f18, this.f82276g);
        }
        canvas.restore();
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        this.f82274e = getMeasuredHeight();
        if (this.f82273d) {
            setMeasuredDimension(getMeasuredWidth(), (int) (this.f82274e + this.f82271b));
        } else {
            setMeasuredDimension(getMeasuredWidth(), this.f82274e);
        }
        RectF rectF = this.f82275f;
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        rectF.right = getMeasuredWidth();
        this.f82275f.bottom = this.f82274e;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        this.f82281m = (i7 == i9 && i8 == i10) ? false : true;
    }

    @Override // android.view.View
    public final void scrollBy(int i7, int i8) {
    }

    @Override // android.view.View
    public final void scrollTo(int i7, int i8) {
    }

    public void setAnchorX(float f7) {
        this.f82280l = Math.abs(f7 - this.f82278j) < 1.0E-6f;
        this.f82278j = f7;
    }

    public void setAnchorXPercentage(float f7) {
        this.f82280l = Math.abs(f7 - this.f82279k) < 1.0E-6f;
        this.f82279k = f7;
    }

    @Override // android.view.View
    public final void setPadding(int i7, int i8, int i9, int i10) {
    }
}
