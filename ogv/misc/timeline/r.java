package com.bilibili.ogv.misc.timeline;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Spanned;
import android.text.style.ReplacementSpan;
import android.util.TypedValue;
import androidx.annotation.ColorRes;
import com.bilibili.magicasakura.utils.ThemeUtils;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/timeline/r.class */
public class r extends ReplacementSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f69476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f69477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f69478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f69479d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @ColorRes
    public final int f69480e;

    public r(Context context) {
        this.f69479d = 6;
        this.f69480e = 2131103284;
        this.f69476a = context;
        float f7 = 4;
        this.f69477b = MathKt.roundToInt(TypedValue.applyDimension(1, Float.isNaN(f7) ? 0.0f : f7, context.getResources().getDisplayMetrics()));
        float f8 = 8;
        this.f69478c = MathKt.roundToInt(TypedValue.applyDimension(1, Float.isNaN(f8) ? 0.0f : f8, context.getResources().getDisplayMetrics()));
        this.f69480e = 2131103284;
        this.f69479d = MathKt.roundToInt(TypedValue.applyDimension(1, Float.isNaN(2.0f) ? 0.0f : 2.0f, context.getResources().getDisplayMetrics()));
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i8, float f7, int i9, int i10, int i11, Paint paint) {
        int i12;
        char cCharAt;
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        int color = paint.getColor();
        if (charSequence instanceof Spanned) {
            i12 = i8;
            for (int i13 = i8 - 1; i13 >= 0 && ((cCharAt = charSequence.charAt(i13)) == ' ' || cCharAt == 160); i13--) {
                i12--;
            }
        } else {
            i12 = i8;
        }
        int size = getSize(paint, charSequence, i7, i8, null);
        int i14 = this.f69478c;
        float textSize = paint.getTextSize();
        float f8 = i10;
        float f9 = fontMetrics.ascent + f8;
        float f10 = f8 + fontMetrics.descent;
        float f11 = (f10 - f9) / 2.0f;
        float f12 = 0.100000024f * f11;
        paint.setColor(ThemeUtils.getColorById(this.f69476a, this.f69480e));
        float f13 = size - i14;
        RectF rectF = new RectF(f7, f9 + f12, f13, f10 - f12);
        float f14 = this.f69479d;
        canvas.drawRoundRect(rectF, f14, f14, paint);
        paint.setColor(-1);
        paint.setTextSize(0.71428573f * textSize);
        Paint.FontMetrics fontMetrics2 = paint.getFontMetrics();
        canvas.drawText(charSequence, i7, i12, ((f13 - f7) / 2.0f) - (paint.measureText(charSequence, i7, i12) / 2.0f), (f11 - ((fontMetrics2.ascent + fontMetrics2.descent) / 2.0f)) + f9, paint);
        paint.setTextSize(textSize);
        paint.setColor(color);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i8, Paint.FontMetricsInt fontMetricsInt) {
        paint.getTextBounds(charSequence.toString(), i7, i8, new Rect());
        return ((int) ((r0.right * 0.71428573f) + (this.f69477b * 2))) + this.f69478c;
    }
}
