package com.bilibili.ogv.review.reviewpublish;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Deprecated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/reviewpublish/a.class */
@StabilityInferred(parameters = 0)
public final class a extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f72519a = 40;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Rect f72520b = new Rect();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Paint f72521c;

    public a() {
        Paint paintA = androidx.constraintlayout.widget.a.a(1291845631);
        paintA.setStyle(Paint.Style.FILL);
        this.f72521c = paintA;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NotNull Canvas canvas) {
        Rect bounds = getBounds();
        int iWidth = bounds.width() / ((this.f72519a * 2) - 1);
        int iHeight = bounds.height();
        int i7 = 0;
        int i8 = 0;
        while (i7 < bounds.width()) {
            int i9 = i8 * 2;
            this.f72520b.set(i9 * iWidth, 0, (i9 + 1) * iWidth, iHeight);
            i8++;
            i7 += iWidth * 2;
            canvas.drawRect(this.f72520b, this.f72521c);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @Deprecated(message = "Deprecated in Java")
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
    }
}
