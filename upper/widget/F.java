package com.bilibili.upper.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/F.class */
@StabilityInferred(parameters = 0)
public final class F extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Drawable f114388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f114389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f114390c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f114391d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Paint f114392e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Rect f114393f;

    public F(Drawable drawable, String str, float f7) {
        this.f114388a = drawable;
        this.f114389b = str;
        Paint paint = new Paint(1);
        this.f114392e = paint;
        this.f114393f = drawable != null ? drawable.getBounds() : null;
        paint.setColor(-1);
        paint.setTextSize(f7);
        paint.setStyle(Paint.Style.FILL);
        paint.setTextAlign(Paint.Align.CENTER);
        Rect rect = this.f114393f;
        if (rect != null) {
            rect.offset(0, 0);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NotNull Canvas canvas) {
        Rect rect = this.f114393f;
        if (rect == null) {
            return;
        }
        Drawable drawable = this.f114388a;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Paint.FontMetrics fontMetrics = this.f114392e.getFontMetrics();
        float f7 = fontMetrics.top;
        float f8 = fontMetrics.bottom;
        float fCenterY = rect.centerY();
        float f9 = 2;
        float f10 = f7 / f9;
        float f11 = f8 / f9;
        String str = this.f114389b;
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        canvas.drawText(str2, rect.centerX(), (fCenterY - f10) - f11, this.f114392e);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(@NotNull Rect rect) {
        super.onBoundsChange(rect);
        if (this.f114388a == null) {
            Rect rect2 = new Rect(rect);
            rect2.offset(this.f114390c, this.f114391d);
            this.f114393f = rect2;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        this.f114392e.setAlpha(i7);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f114392e.setColorFilter(colorFilter);
    }
}
