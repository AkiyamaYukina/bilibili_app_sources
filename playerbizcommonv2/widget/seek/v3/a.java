package com.bilibili.playerbizcommonv2.widget.seek.v3;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/seek/v3/a.class */
@StabilityInferred(parameters = 0)
public final class a extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Paint f82952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Paint f82953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Path f82954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Path f82955d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Matrix f82956e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f82957f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public Rect f82958g;
    public boolean h;

    public a() {
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(654272153);
        this.f82952a = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        this.f82953b = paint2;
        this.f82956e = new Matrix();
    }

    public final void a() {
        Path path = this.f82954c;
        if (path == null) {
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            return;
        }
        if (!Intrinsics.areEqual(bounds, this.f82958g) || this.f82955d == null) {
            this.f82958g = new Rect(bounds);
            this.f82956e.reset();
            this.f82956e.setScale(bounds.width() / 1000.0f, bounds.height() / 100.0f);
            this.f82956e.postTranslate(bounds.left, bounds.top);
            Path path2 = new Path();
            path.transform(this.f82956e, path2);
            this.f82955d = path2;
            this.f82953b.setShader(new LinearGradient(0.0f, bounds.top, 0.0f, bounds.bottom, 1509949439, 234881023, Shader.TileMode.CLAMP));
        }
    }

    public final void b(boolean z6) {
        if (this.h != z6) {
            this.h = z6;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NotNull Canvas canvas) {
        Path path;
        if (this.h && (path = this.f82955d) != null) {
            Rect bounds = getBounds();
            if (bounds.isEmpty()) {
                return;
            }
            canvas.drawPath(path, this.f82953b);
            float f7 = bounds.left;
            float fWidth = bounds.width();
            float f8 = this.f82957f;
            float f9 = bounds.left;
            float f10 = bounds.top;
            float f11 = bounds.bottom;
            int iSave = canvas.save();
            canvas.clipRect(f9, f10, (fWidth * f8) + f7, f11);
            try {
                canvas.drawPath(path, this.f82952a);
            } finally {
                canvas.restoreToCount(iSave);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(@NotNull Rect rect) {
        super.onBoundsChange(rect);
        a();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        this.f82952a.setAlpha(i7);
        this.f82953b.setAlpha(i7);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f82952a.setColorFilter(colorFilter);
        this.f82953b.setColorFilter(colorFilter);
    }
}
