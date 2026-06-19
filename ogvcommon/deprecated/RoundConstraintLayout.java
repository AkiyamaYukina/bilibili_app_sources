package com.bilibili.ogvcommon.deprecated;

import Il0.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/deprecated/RoundConstraintLayout.class */
@Deprecated
public class RoundConstraintLayout extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f73167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f73168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f73169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f73170d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f73171e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f73172f;

    public RoundConstraintLayout(Context context) {
        super(context);
        this.f73168b = new Path();
    }

    public RoundConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f73168b = new Path();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f10332a);
        this.f73167a = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        this.f73169c = typedArrayObtainStyledAttributes.getBoolean(3, true);
        this.f73170d = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.f73171e = typedArrayObtainStyledAttributes.getBoolean(1, true);
        this.f73172f = typedArrayObtainStyledAttributes.getBoolean(2, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    private Path getRoundRectPath() {
        this.f73168b.reset();
        float f7 = this.f73167a;
        float[] fArr = {f7, f7, f7, f7, f7, f7, f7, f7};
        if (!this.f73169c) {
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
        }
        if (!this.f73170d) {
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
        }
        if (!this.f73171e) {
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
        }
        if (!this.f73172f) {
            fArr[6] = 0.0f;
            fArr[7] = 0.0f;
        }
        this.f73168b.addRoundRect(new RectF(0.0f, 0.0f, getWidth(), getHeight()), fArr, Path.Direction.CW);
        return this.f73168b;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.clipPath(getRoundRectPath());
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        canvas.clipPath(getRoundRectPath());
        super.draw(canvas);
    }

    public void setRadius(int i7) {
        this.f73167a = i7;
    }
}
