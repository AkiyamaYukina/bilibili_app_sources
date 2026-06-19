package com.bilibili.studio.template.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.annotation.Nullable;
import com.alipay.sdk.app.PayTask;
import com.bilibili.droid.ScreenUtil;
import com.bilibili.studio.videoeditor.w;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/template/widget/AudioCircleGradientProgressView.class */
public class AudioCircleGradientProgressView extends View {
    public static final int[] h = {16472255, -304961, -886159};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RectF f108636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f108637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f108638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f108639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f108640e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ObjectAnimator f108641f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f108642g;

    public AudioCircleGradientProgressView(Context context) {
        this(context, null);
    }

    public AudioCircleGradientProgressView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f108642g = h;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, w.f110264a);
        this.f108640e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, ScreenUtil.dip2px(getContext(), 8.0f));
        this.f108642g = new int[]{typedArrayObtainStyledAttributes.getColor(3, 16472255), typedArrayObtainStyledAttributes.getColor(2, -304961), typedArrayObtainStyledAttributes.getColor(1, -886159)};
        typedArrayObtainStyledAttributes.recycle();
        this.f108636a = new RectF();
        Paint paint = new Paint();
        this.f108637b = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f108637b.setStrokeWidth(this.f108640e);
        this.f108637b.setStrokeCap(Paint.Cap.ROUND);
        setRotation(90.0f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<AudioCircleGradientProgressView, Float>) View.ROTATION, 90.0f, 450.0f);
        this.f108641f = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setRepeatCount(-1);
        this.f108641f.setInterpolator(new LinearInterpolator());
        this.f108641f.setDuration(PayTask.f60018j);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f108641f == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<AudioCircleGradientProgressView, Float>) View.ROTATION, 90.0f, 450.0f);
            this.f108641f = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setRepeatCount(-1);
            this.f108641f.setInterpolator(new LinearInterpolator());
            this.f108641f.setDuration(PayTask.f60018j);
        }
        this.f108641f.start();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ObjectAnimator objectAnimator = this.f108641f;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.f108641f = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawArc(this.f108636a, 10.0f, 340.0f, false, this.f108637b);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        this.f108638c = getMeasuredWidth();
        this.f108639d = getMeasuredHeight();
        RectF rectF = this.f108636a;
        int i9 = this.f108640e;
        rectF.left = i9 >> 1;
        rectF.top = i9 >> 1;
        rectF.right = this.f108638c - (i9 >> 1);
        rectF.bottom = r0 - (i9 >> 1);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        this.f108637b.setShader(new SweepGradient(this.f108638c >> 1, this.f108639d >> 1, this.f108642g, (float[]) null));
    }
}
