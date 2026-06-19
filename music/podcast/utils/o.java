package com.bilibili.music.podcast.utils;

import android.R;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import androidx.core.content.ContextCompat;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/utils/o.class */
public final class o extends ReplacementSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f67019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f67020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f67021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f67022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f67023e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Paint f67024f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Rect f67025g;

    @NotNull
    public final RectF h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f67026i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Paint f67027j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Paint.FontMetrics f67028k;

    public o(@NotNull String str, @NotNull Context context) {
        this.f67019a = str;
        int color = ContextCompat.getColor(context, 2131100750);
        this.f67020b = context.getResources().getDimensionPixelSize(2131166730);
        this.f67021c = context.getResources().getDimensionPixelSize(2131166729);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131166732);
        this.f67022d = context.getResources().getDimensionPixelSize(2131166731);
        this.f67023e = context.getResources().getDimensionPixelSize(2131166728);
        int color2 = ContextCompat.getColor(context, R.color.white);
        this.f67024f = new Paint();
        this.f67025g = new Rect();
        this.h = new RectF();
        Paint paintA = qe.i.a(true);
        paintA.setTextSize(dimensionPixelSize);
        paintA.setColor(color2);
        this.f67024f = paintA;
        this.f67028k = paintA.getFontMetrics();
        Paint paintA2 = qe.i.a(true);
        paintA2.setStyle(Paint.Style.FILL);
        paintA2.setColor(color);
        this.f67027j = paintA2;
    }

    public final int b() {
        this.f67025g.setEmpty();
        Paint paint = this.f67024f;
        String str = this.f67019a;
        paint.getTextBounds(str, 0, str.length(), this.f67025g);
        return (this.f67021c * 2) + this.f67025g.width() + this.f67022d;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x00ab  */
    @Override // android.text.style.ReplacementSpan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void draw(@org.jetbrains.annotations.NotNull android.graphics.Canvas r8, @org.jetbrains.annotations.Nullable java.lang.CharSequence r9, int r10, int r11, float r12, int r13, int r14, int r15, @org.jetbrains.annotations.NotNull android.graphics.Paint r16) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.music.podcast.utils.o.draw(android.graphics.Canvas, java.lang.CharSequence, int, int, float, int, int, int, android.graphics.Paint):void");
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(@NotNull Paint paint, @Nullable CharSequence charSequence, int i7, int i8, @Nullable Paint.FontMetricsInt fontMetricsInt) {
        this.f67026i = b();
        this.f67025g.height();
        return this.f67026i;
    }
}
