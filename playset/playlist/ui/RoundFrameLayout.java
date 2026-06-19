package com.bilibili.playset.playlist.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bilibili.playset.O0;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/ui/RoundFrameLayout.class */
public class RoundFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f85516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f85517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f85518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f85519d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f85520e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f85521f;

    public RoundFrameLayout(Context context) {
        super(context);
        this.f85517b = new Path();
    }

    public RoundFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f85517b = new Path();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, O0.f83995c);
        this.f85516a = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        this.f85518c = typedArrayObtainStyledAttributes.getBoolean(3, true);
        this.f85519d = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.f85520e = typedArrayObtainStyledAttributes.getBoolean(1, true);
        this.f85521f = typedArrayObtainStyledAttributes.getBoolean(2, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    private Path getRoundRectPath() {
        this.f85517b.reset();
        float f7 = this.f85516a;
        float[] fArr = {f7, f7, f7, f7, f7, f7, f7, f7};
        if (!this.f85518c) {
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
        }
        if (!this.f85519d) {
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
        }
        if (!this.f85520e) {
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
        }
        if (!this.f85521f) {
            fArr[6] = 0.0f;
            fArr[7] = 0.0f;
        }
        this.f85517b.addRoundRect(new RectF(0.0f, 0.0f, getWidth(), getHeight()), fArr, Path.Direction.CW);
        return this.f85517b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.isHardwareAccelerated();
        canvas.clipPath(getRoundRectPath());
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        canvas.isHardwareAccelerated();
        canvas.clipPath(getRoundRectPath());
        super.draw(canvas);
    }
}
