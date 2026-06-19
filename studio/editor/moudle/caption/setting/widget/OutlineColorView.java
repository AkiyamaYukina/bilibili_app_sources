package com.bilibili.studio.editor.moudle.caption.setting.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.bilibili.studio.videoeditor.util.DensityUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/caption/setting/widget/OutlineColorView.class */
public final class OutlineColorView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Paint f105967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f105968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f105969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f105970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f105971e;

    public OutlineColorView(@NotNull Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f105967a = paint;
        paint.setStrokeWidth(DensityUtil.dp2px(context, 2.0f));
        this.f105967a.setStyle(Paint.Style.STROKE);
    }

    public OutlineColorView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint(1);
        this.f105967a = paint;
        paint.setStrokeWidth(DensityUtil.dp2px(context, 2.0f));
        this.f105967a.setStyle(Paint.Style.STROKE);
    }

    public final void a() {
        this.f105968b = (Math.min(this.f105970d, this.f105971e) - this.f105967a.getStrokeWidth()) - (this.f105969c ? DensityUtil.dp2px(getContext(), 1.0f) : DensityUtil.dp2px(getContext(), 3.0f));
    }

    @Override // android.view.View
    public final void onDraw(@NotNull Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(this.f105970d, this.f105971e, this.f105968b, this.f105967a);
    }

    @Override // android.view.View
    public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        super.onLayout(z6, i7, i8, i9, i10);
        this.f105970d = Math.round((i7 + i9) / 2.0f);
        this.f105971e = Math.round((i8 + i10) / 2.0f);
        a();
    }

    public final void setColor(int i7) {
        this.f105967a.setColor(i7);
        invalidate();
    }

    public final void setIsSelectView(boolean z6) {
        this.f105969c = z6;
        a();
        invalidate();
    }
}
