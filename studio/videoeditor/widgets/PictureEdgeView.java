package com.bilibili.studio.videoeditor.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.bilibili.studio.videoeditor.util.DensityUtil;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/widgets/PictureEdgeView.class */
public class PictureEdgeView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f110409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f110410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f110411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Paint f110412d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f110413e;

    public PictureEdgeView(Context context) {
        this(context, null);
    }

    public PictureEdgeView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f110413e = true;
        this.f110409a = DensityUtil.dp2px(context, 4.0f);
        this.f110410b = DensityUtil.dp2px(context, 16.0f);
        this.f110411c = DensityUtil.dp2px(context, 2.0f);
        this.f110412d = new Paint();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f110412d.setStrokeWidth(this.f110411c);
        this.f110412d.setColor(-1);
        this.f110412d.setAlpha(128);
        this.f110412d.setStyle(Paint.Style.STROKE);
        if (this.f110413e) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f110412d);
        }
        this.f110412d.setStrokeWidth(this.f110409a);
        this.f110412d.setStyle(Paint.Style.FILL);
        this.f110412d.setColor(-1);
        this.f110412d.setAlpha(255);
        canvas.drawLine(0.0f, 0.0f, this.f110410b, 0.0f, this.f110412d);
        canvas.drawLine(getMeasuredWidth() - this.f110410b, 0.0f, getMeasuredWidth(), 0.0f, this.f110412d);
        canvas.drawLine(0.0f, getMeasuredHeight(), this.f110410b, getMeasuredHeight(), this.f110412d);
        canvas.drawLine(getMeasuredWidth() - this.f110410b, getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight(), this.f110412d);
        canvas.drawLine(0.0f, 0.0f, 0.0f, this.f110410b, this.f110412d);
        canvas.drawLine(getMeasuredWidth(), 0.0f, getMeasuredWidth(), this.f110410b, this.f110412d);
        canvas.drawLine(0.0f, getMeasuredHeight() - this.f110410b, 0.0f, getMeasuredHeight(), this.f110412d);
        canvas.drawLine(getMeasuredWidth(), getMeasuredHeight() - this.f110410b, getMeasuredWidth(), getMeasuredHeight(), this.f110412d);
    }

    public void setDrawEdgeLine(boolean z6) {
        this.f110413e = z6;
    }
}
