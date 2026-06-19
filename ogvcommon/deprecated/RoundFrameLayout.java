package com.bilibili.ogvcommon.deprecated;

import Il0.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/deprecated/RoundFrameLayout.class */
@Deprecated
public class RoundFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f73173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f73174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f73175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f73176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f73177e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f73178f;

    public RoundFrameLayout(Context context) {
        super(context);
        this.f73174b = new Path();
    }

    public RoundFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f73174b = new Path();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f10332a);
        this.f73173a = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        this.f73175c = typedArrayObtainStyledAttributes.getBoolean(3, true);
        this.f73176d = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.f73177e = typedArrayObtainStyledAttributes.getBoolean(1, true);
        this.f73178f = typedArrayObtainStyledAttributes.getBoolean(2, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    private Path getRoundRectPath() {
        this.f73174b.reset();
        float f7 = this.f73173a;
        float[] fArr = {f7, f7, f7, f7, f7, f7, f7, f7};
        if (!this.f73175c) {
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
        }
        if (!this.f73176d) {
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
        }
        if (!this.f73177e) {
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
        }
        if (!this.f73178f) {
            fArr[6] = 0.0f;
            fArr[7] = 0.0f;
        }
        this.f73174b.addRoundRect(new RectF(0.0f, 0.0f, getWidth(), getHeight()), fArr, Path.Direction.CW);
        return this.f73174b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.clipPath(getRoundRectPath());
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        canvas.clipPath(getRoundRectPath());
        super.draw(canvas);
    }
}
