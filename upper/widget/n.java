package com.bilibili.upper.widget;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import androidx.annotation.ColorInt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.upper.widget.n;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/n.class */
@StabilityInferred(parameters = 0)
public final class n extends ReplacementSpan {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final String f114549c = "&";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f114550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final RectF f114551b = new RectF();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/n$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final String f114552a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f114553b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f114554c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f114556e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @ColorInt
        public int f114558g;
        public int h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final float f114559i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f114560j;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f114555d = a(8.0f);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f114557f = a(2.0f);

        public a(@Nullable String str, int i7, @ColorInt int i8) {
            this.f114552a = str;
            this.f114553b = i7;
            this.f114554c = i8;
            float fA = a(4.0f);
            this.f114556e = a(2.5f);
            this.f114559i = fA;
        }

        public static float a(float f7) {
            return (f7 * Resources.getSystem().getDisplayMetrics().density) + 0.5f;
        }
    }

    public n(@NotNull a aVar) {
        this.f114550a = aVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.upper.widget.m] */
    @Override // android.text.style.ReplacementSpan
    public final void draw(@NotNull final Canvas canvas, @Nullable CharSequence charSequence, int i7, int i8, final float f7, final int i9, int i10, final int i11, @NotNull final Paint paint) {
        ?? r02 = new Function0(this, paint, canvas, f7, i11, i9) { // from class: com.bilibili.upper.widget.m

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final n f114543a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Paint f114544b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Canvas f114545c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final float f114546d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final int f114547e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final int f114548f;

            {
                this.f114543a = this;
                this.f114544b = paint;
                this.f114545c = canvas;
                this.f114546d = f7;
                this.f114547e = i11;
                this.f114548f = i9;
            }

            public final Object invoke() {
                Paint paint2 = this.f114544b;
                Canvas canvas2 = this.f114545c;
                n nVar = this.f114543a;
                n.a aVar = nVar.f114550a;
                String str = aVar.f114552a;
                if (str != null && !StringsKt.isBlank(str)) {
                    float fMeasureText = paint2.measureText((CharSequence) str, 0, str.length());
                    n.a aVar2 = nVar.f114550a;
                    aVar2.getClass();
                    float f8 = aVar2.f114555d;
                    float f9 = 2;
                    float f10 = (f8 * f9) + fMeasureText;
                    float width = canvas2.getWidth();
                    float f11 = this.f114546d;
                    float f12 = f10;
                    String strA = str;
                    if (f11 + f10 > width) {
                        f12 = width - f11;
                        String str2 = n.f114549c;
                        strA = q8.d.a(str.subSequence(0, paint2.breakText(str, 0, str.length(), true, f12 - (0 - paint2.measureText(str2)), null)), str2);
                    }
                    float fDescent = paint2.descent() - paint2.ascent();
                    float f13 = 0;
                    float f14 = fDescent > f13 ? (aVar.f114556e * f9) + fDescent : f13 + (aVar.f114557f * f9);
                    float f15 = (f14 - fDescent) / f9;
                    float fDescent2 = paint2.descent();
                    int i12 = aVar.h;
                    int i13 = this.f114547e;
                    float fMax = (aVar.f114556e / f9) + this.f114548f + aVar.f114560j + Math.max((((i13 - i12) - r0) - f14) / f9, 0.0f);
                    nVar.f114551b.set(0.0f, 0.0f, f12, f14);
                    nVar.f114551b.offset(f11, fMax);
                    float f16 = f14 / f9;
                    float strokeWidth = paint2.getStrokeWidth();
                    int color = paint2.getColor();
                    Paint.Style style = paint2.getStyle();
                    paint2.setAntiAlias(true);
                    paint2.setStrokeJoin(Paint.Join.ROUND);
                    paint2.setStrokeCap(Paint.Cap.ROUND);
                    paint2.setColor(nVar.f114550a.f114558g);
                    Paint.Style style2 = Paint.Style.FILL;
                    paint2.setStyle(style2);
                    canvas2.drawRoundRect(nVar.f114551b, f16, f16, paint2);
                    paint2.setStrokeWidth(strokeWidth);
                    paint2.setColor(color);
                    paint2.setStyle(style);
                    float f17 = f11;
                    if (f11 == f11) {
                        f17 = f11 + aVar.f114555d;
                    }
                    int length = strA.length();
                    float strokeWidth2 = paint2.getStrokeWidth();
                    int color2 = paint2.getColor();
                    Paint.Style style3 = paint2.getStyle();
                    paint2.setPathEffect(null);
                    paint2.setStrokeWidth(1.0f);
                    paint2.setStyle(style2);
                    paint2.setColor(nVar.f114550a.f114554c);
                    canvas2.drawText((CharSequence) strA, 0, length, f17, fMax + ((f14 - f15) - fDescent2), paint2);
                    paint2.setStrokeWidth(strokeWidth2);
                    paint2.setColor(color2);
                    paint2.setStyle(style3);
                }
                return Unit.INSTANCE;
            }
        };
        if (this.f114550a.f114553b <= 0) {
            r02.invoke();
            return;
        }
        float textSize = paint.getTextSize();
        paint.setTextSize(this.f114550a.f114553b);
        r02.invoke();
        paint.setTextSize(textSize);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.bilibili.upper.widget.l] */
    @Override // android.text.style.ReplacementSpan
    public final int getSize(@NotNull final Paint paint, @Nullable CharSequence charSequence, int i7, int i8, @Nullable final Paint.FontMetricsInt fontMetricsInt) {
        final int[] iArr = new int[1];
        ?? r02 = new Function0(this, fontMetricsInt, iArr, paint) { // from class: com.bilibili.upper.widget.l

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final n f114539a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Paint.FontMetricsInt f114540b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final int[] f114541c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final Paint f114542d;

            {
                this.f114539a = this;
                this.f114540b = fontMetricsInt;
                this.f114541c = iArr;
                this.f114542d = paint;
            }

            public final Object invoke() {
                Unit unit;
                Paint.FontMetricsInt fontMetricsInt2 = this.f114540b;
                Paint paint2 = this.f114542d;
                n nVar = this.f114539a;
                n.a aVar = nVar.f114550a;
                if (fontMetricsInt2 != null) {
                    Paint.FontMetricsInt fontMetricsInt3 = paint2.getFontMetricsInt();
                    float f7 = fontMetricsInt3.ascent;
                    float f8 = aVar.f114556e;
                    float f9 = fontMetricsInt3.descent;
                    int i9 = (int) (f7 - f8);
                    fontMetricsInt2.ascent = i9;
                    fontMetricsInt2.top = i9;
                    int i10 = (int) (f9 + f8);
                    fontMetricsInt2.descent = i10;
                    fontMetricsInt2.bottom = i10;
                }
                String str = aVar.f114552a;
                if (str == null || StringsKt.isBlank(str)) {
                    unit = Unit.INSTANCE;
                } else {
                    float fMeasureText = paint2.measureText((CharSequence) str, 0, str.length());
                    n.a aVar2 = nVar.f114550a;
                    aVar2.getClass();
                    this.f114541c[0] = (int) ((aVar2.f114555d * 2) + fMeasureText + aVar.f114559i + 0.5f);
                    unit = Unit.INSTANCE;
                }
                return unit;
            }
        };
        if (this.f114550a.f114553b <= 0) {
            r02.invoke();
        } else {
            float textSize = paint.getTextSize();
            paint.setTextSize(this.f114550a.f114553b);
            r02.invoke();
            paint.setTextSize(textSize);
        }
        return iArr[0];
    }
}
