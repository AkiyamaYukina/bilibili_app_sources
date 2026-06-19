package com.bilibili.topix.center;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextPaint;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import kotlin.Lazy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.bilibili.topix.center.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/center/c.class */
public final class C6665c {
    public static final void a(@NotNull Canvas canvas, @NotNull C6663a c6663a) {
        Lazy lazy = c6663a.f112406q;
        ((Path) lazy.getValue()).rewind();
        Path path = (Path) lazy.getValue();
        Lazy lazy2 = c6663a.f112407r;
        ((RectF) lazy2.getValue()).setEmpty();
        RectF rectF = (RectF) lazy2.getValue();
        float f7 = c6663a.f112400k;
        int i7 = c6663a.f112397g;
        rectF.set(0.0f, i7 == 0 ? ListExtentionsKt.toPx(f7) : 0.0f, c6663a.b(), i7 == 0 ? c6663a.a() + ListExtentionsKt.toPx(f7) : c6663a.a());
        float px = ListExtentionsKt.toPx(c6663a.f112393c);
        path.addRoundRect((RectF) lazy2.getValue(), new float[]{px, px, px, px, px, px, px, px}, Path.Direction.CW);
        Lazy lazy3 = c6663a.f112408s;
        Path path2 = (Path) lazy3.getValue();
        path2.rewind();
        float f8 = 2;
        float px2 = ListExtentionsKt.toPx(Math.abs(c6663a.f112399j)) / f8;
        float f9 = c6663a.f112396f;
        float px3 = ((float) ListExtentionsKt.toPx(f9)) >= px2 ? ListExtentionsKt.toPx(f9) - px2 : ((float) ListExtentionsKt.toPx(f9)) <= (-px2) ? (c6663a.b() + ListExtentionsKt.toPx(f9)) - px2 : 0.0f;
        float px4 = i7 == 0 ? ListExtentionsKt.toPx(f7) : c6663a.a();
        float fA = i7 == 0 ? 0.0f : c6663a.a() + ListExtentionsKt.toPx(f7);
        path2.moveTo(px3, px4);
        path2.lineTo(px3 + px2, fA);
        path2.lineTo((f8 * px2) + px3, px4);
        ((Path) lazy.getValue()).op((Path) lazy3.getValue(), Path.Op.UNION);
        Lazy lazy4 = c6663a.f112410u;
        Paint paint = (Paint) lazy4.getValue();
        paint.reset();
        paint.setAntiAlias(true);
        paint.setStyle(c6663a.h == 1 ? Paint.Style.FILL : Paint.Style.STROKE);
        paint.setStrokeWidth(ListExtentionsKt.toPx(c6663a.f112398i));
        paint.setColor(c6663a.f112394d);
        canvas.drawPath((Path) lazy.getValue(), (Paint) lazy4.getValue());
        TextPaint textPaintC = c6663a.c();
        textPaintC.reset();
        textPaintC.setAntiAlias(true);
        textPaintC.setTextSize(c6663a.f112392b);
        textPaintC.setColor(c6663a.f112395e);
        float px5 = ListExtentionsKt.toPx(c6663a.f112402m);
        float f10 = c6663a.c().baselineShift;
        float f11 = c6663a.c().getFontMetrics().top;
        float px6 = ListExtentionsKt.toPx(c6663a.f112401l);
        float px7 = 0.0f;
        if (i7 == 0) {
            px7 = ListExtentionsKt.toPx(f7);
        }
        canvas.drawText(c6663a.f112391a, px5, (f10 - f11) + px6 + px7, c6663a.c());
    }
}
