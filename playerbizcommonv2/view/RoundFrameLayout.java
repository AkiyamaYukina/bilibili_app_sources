package com.bilibili.playerbizcommonv2.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import ir0.C7613b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/view/RoundFrameLayout.class */
@StabilityInferred(parameters = 0)
public final class RoundFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f82088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Path f82089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final RectF f82090c;

    public RoundFrameLayout(@NotNull Context context) {
        super(context);
        this.f82089b = new Path();
        this.f82090c = new RectF();
        setWillNotDraw(false);
    }

    public RoundFrameLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f82089b = new Path();
        this.f82090c = new RectF();
        setWillNotDraw(false);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7613b.f122203j, 0, 0);
            this.f82088a = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(@NotNull Canvas canvas) {
        if (this.f82088a <= 0.0f) {
            super.dispatchDraw(canvas);
            return;
        }
        Path path = this.f82089b;
        int iSave = canvas.save();
        canvas.clipPath(path);
        try {
            super.dispatchDraw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        this.f82090c.set(0.0f, 0.0f, i7, i8);
        this.f82089b.reset();
        float f7 = this.f82088a;
        this.f82089b.addRoundRect(this.f82090c, new float[]{f7, f7, f7, f7, 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CW);
    }

    public final void setRadius(float f7) {
        if (this.f82088a == f7) {
            return;
        }
        this.f82088a = f7;
        this.f82089b.reset();
        float f8 = this.f82088a;
        this.f82089b.addRoundRect(this.f82090c, new float[]{f8, f8, f8, f8, 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CW);
        invalidate();
    }
}
