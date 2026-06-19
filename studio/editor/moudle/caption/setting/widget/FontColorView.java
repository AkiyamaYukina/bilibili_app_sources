package com.bilibili.studio.editor.moudle.caption.setting.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.bilibili.studio.videoeditor.util.DensityUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/caption/setting/widget/FontColorView.class */
public final class FontColorView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Paint f105956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Paint f105957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Paint f105958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f105959d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f105960e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f105961f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f105962g;
    public int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f105963i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f105964j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f105965k;

    public FontColorView(@NotNull Context context) {
        super(context);
        this.f105962g = -65536;
        this.h = -65536;
        a(context);
    }

    public FontColorView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f105962g = -65536;
        this.h = -65536;
        a(context);
    }

    public final void a(Context context) {
        this.f105956a = new Paint(1);
        this.f105957b = new Paint(1);
        Paint paint = new Paint(1);
        this.f105958c = paint;
        paint.setStrokeWidth(DensityUtil.dp2px(context, 1.5f));
        this.f105958c.setStyle(Paint.Style.STROKE);
        this.f105962g = ContextCompat.getColor(getContext(), 2131104222);
    }

    @Override // android.view.View
    public final void onDraw(@NotNull Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f105963i) {
            this.f105957b.setStyle(Paint.Style.FILL);
            this.f105957b.setColor(this.h);
            canvas.drawCircle(this.f105964j, this.f105965k, this.f105961f, this.f105957b);
        } else {
            this.f105956a.setStyle(Paint.Style.FILL);
            this.f105956a.setColor(this.h);
            canvas.drawCircle(this.f105964j, this.f105965k, this.f105959d, this.f105956a);
            this.f105958c.setColor(this.f105962g);
            canvas.drawCircle(this.f105964j, this.f105965k, this.f105960e, this.f105958c);
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        super.onLayout(z6, i7, i8, i9, i10);
        this.f105964j = Math.round((i7 + i9) / 2.0f);
        this.f105965k = Math.round((i8 + i10) / 2.0f);
        float fMin = (Math.min(this.f105964j, r0) - this.f105956a.getStrokeWidth()) - DensityUtil.dp2px(getContext(), 1.0f);
        this.f105959d = fMin;
        this.f105960e = fMin - DensityUtil.dp2px(getContext(), 1.5f);
        this.f105961f = this.f105959d - DensityUtil.dp2px(getContext(), 2.0f);
    }

    public final void setColor(int i7) {
        this.h = i7;
        invalidate();
    }

    public final void setIsSelectView(boolean z6) {
        this.f105963i = z6;
        invalidate();
    }

    public final void setMiddleCircleColor(int i7) {
        this.f105962g = i7;
        invalidate();
    }
}
