package com.bilibili.module.vip.choosecoupon;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.bilibili.lib.theme.R$color;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/choosecoupon/VerticalDashView.class */
public class VerticalDashView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f66119a;

    public VerticalDashView(Context context) {
        super(context);
    }

    public VerticalDashView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint(1);
        this.f66119a = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f66119a.setColor(getResources().getColor(R$color.Ga2));
        setLayerType(1, this.f66119a);
        this.f66119a.setPathEffect(new DashPathEffect(new float[]{10.0f, 10.0f}, 1.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawLine(0.0f, getTop(), 0.0f, getBottom(), this.f66119a);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        this.f66119a.setStrokeWidth(View.MeasureSpec.getSize(i7));
        super.onMeasure(i7, i8);
    }
}
