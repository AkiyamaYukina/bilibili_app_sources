package com.bilibili.playerbizcommon.view;

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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/view/BubbleContainer.class */
public class BubbleContainer extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f80312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f80313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f80314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f80315d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f80316e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RectF f80317f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Paint f80318g;
    public boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f80319i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f80320j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f80321k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f80322l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f80323m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Bitmap f80324n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Canvas f80325o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Paint f80326p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Paint f80327q;

    public BubbleContainer(@NonNull Context context) {
        super(context);
        this.f80317f = new RectF();
        this.f80321k = -1.0f;
        a(context, null);
    }

    public BubbleContainer(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f80317f = new RectF();
        this.f80321k = -1.0f;
        a(context, attributeSet);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        if (this.h) {
            return;
        }
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Nh1.a.a);
            this.f80312a = typedArrayObtainStyledAttributes.getColor(1, ViewCompat.MEASURED_STATE_MASK);
            this.f80313b = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
            this.f80314c = typedArrayObtainStyledAttributes.getDimension(2, 0.0f);
            this.f80315d = typedArrayObtainStyledAttributes.getBoolean(3, true);
            typedArrayObtainStyledAttributes.recycle();
        }
        setWillNotDraw(false);
        this.h = true;
        Paint paint = new Paint();
        this.f80318g = paint;
        paint.setAntiAlias(true);
        this.f80318g.setColor(this.f80312a);
        Paint paint2 = this.f80318g;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        this.f80319i = (float) Math.sqrt(Math.pow((this.f80313b + this.f80314c) / 2.0f, 2.0d) + Math.pow(this.f80313b + this.f80314c, 2.0d));
        this.f80325o = new Canvas();
        Paint paint3 = new Paint();
        this.f80326p = paint3;
        paint3.setAntiAlias(true);
        this.f80326p.setColor(Color.argb(255, Color.red(this.f80312a), Color.green(this.f80312a), Color.blue(this.f80312a)));
        this.f80326p.setStyle(style);
        Paint paint4 = new Paint();
        this.f80327q = paint4;
        paint4.setAntiAlias(true);
        this.f80327q.setColor(Color.argb(Color.alpha(this.f80312a), 255, 255, 255));
        this.f80327q.setStyle(style);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f7;
        float f8;
        canvas.save();
        if (this.f80315d) {
            if (this.f80322l || this.f80323m) {
                int width = getWidth();
                if (this.f80320j < 0.0f) {
                    this.f80320j = 0.0f;
                }
                float f9 = width;
                if (this.f80320j > f9) {
                    this.f80320j = f9;
                }
                float f10 = this.f80321k;
                if (f10 >= 0.0f && f10 <= 1.0f) {
                    this.f80320j = f10 * f9;
                }
                float f11 = this.f80320j;
                float f12 = this.f80319i;
                float f13 = (f12 / 2.0f) + f11;
                float f14 = f11 - (f12 / 2.0f);
                float f15 = f14;
                float f16 = f13;
                if (f14 < 0.0f) {
                    f16 = f13 - f14;
                    f15 = 0.0f;
                }
                if (f16 > f9) {
                    f7 = f15 - (f16 - f9);
                    f8 = f9;
                } else {
                    float f17 = f16;
                    f7 = f15;
                    f8 = f17;
                }
                int i7 = this.f80316e;
                float f18 = i7 + this.f80313b;
                float f19 = i7 - this.f80314c;
                Path path = new Path();
                path.moveTo(f11, f18);
                path.lineTo(f7, f19);
                path.lineTo(f8, f19);
                path.lineTo(f11, f18);
                path.close();
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, getHeight(), Bitmap.Config.ARGB_8888);
                this.f80324n = bitmapCreateBitmap;
                this.f80325o.setBitmap(bitmapCreateBitmap);
                this.f80325o.translate(0.0f, 0.0f);
                Canvas canvas2 = this.f80325o;
                RectF rectF = this.f80317f;
                float f20 = this.f80314c;
                canvas2.drawRoundRect(rectF, f20, f20, this.f80326p);
                this.f80325o.drawPath(path, this.f80326p);
            }
            canvas.drawBitmap(this.f80324n, 0.0f, 0.0f, this.f80327q);
        } else {
            RectF rectF2 = this.f80317f;
            float f21 = this.f80314c;
            canvas.drawRoundRect(rectF2, f21, f21, this.f80318g);
        }
        canvas.restore();
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        this.f80316e = getMeasuredHeight();
        if (this.f80315d) {
            setMeasuredDimension(getMeasuredWidth(), (int) (this.f80316e + this.f80313b));
        } else {
            setMeasuredDimension(getMeasuredWidth(), this.f80316e);
        }
        RectF rectF = this.f80317f;
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        rectF.right = getMeasuredWidth();
        this.f80317f.bottom = this.f80316e;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        this.f80323m = (i7 == i9 && i8 == i10) ? false : true;
    }

    @Override // android.view.View
    public final void scrollBy(int i7, int i8) {
    }

    @Override // android.view.View
    public final void scrollTo(int i7, int i8) {
    }

    public void setAnchorX(float f7) {
        this.f80322l = Math.abs(f7 - this.f80320j) < 1.0E-6f;
        this.f80320j = f7;
    }

    public void setAnchorXPercentage(float f7) {
        this.f80322l = Math.abs(f7 - this.f80321k) < 1.0E-6f;
        this.f80321k = f7;
    }

    @Override // android.view.View
    public final void setPadding(int i7, int i8, int i9, int i10) {
    }
}
