package com.bilibili.playerbizcommonv2.widget.seek.v3;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/seek/v3/f.class */
@StabilityInferred(parameters = 0)
public final class f extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f82967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f82968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f82969c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f82971e;
    public int h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ArrayList<s> f82970d = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Paint f82972f = new Paint(5);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final RectF f82973g = new RectF();

    public f(@ColorInt int i7, @ColorInt int i8, float f7, float f8) {
        this.f82967a = i8;
        this.f82968b = f7;
        this.f82969c = f8;
        this.h = i7;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NotNull Canvas canvas) {
        int i7;
        this.f82972f.setColor(this.h);
        RectF rectF = this.f82973g;
        float f7 = this.f82968b;
        canvas.drawRoundRect(rectF, f7, f7, this.f82972f);
        ArrayList<s> arrayList = this.f82970d;
        RectF rectF2 = this.f82973g;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        this.f82972f.setColor(this.f82967a);
        Iterator<s> it = arrayList.iterator();
        while (it.hasNext()) {
            int i8 = it.next().f83067a;
            if (i8 > 0 && i8 < (i7 = this.f82971e)) {
                canvas.drawCircle((rectF2.width() * (i8 / i7)) + rectF2.left, rectF2.centerY(), this.f82969c, this.f82972f);
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
        this.f82973g.set(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        this.f82972f.setAlpha(i7);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f82972f.setColorFilter(colorFilter);
    }
}
