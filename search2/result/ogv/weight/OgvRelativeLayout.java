package com.bilibili.search2.result.ogv.weight;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.magicasakura.widgets.TintRelativeLayout;
import com.bilibili.search2.component.e;
import com.bilibili.search2.main.ogv.a;
import com.bilibili.search2.main.ogv.b;
import com.bilibili.search2.result.ogv.OgvThemeColorHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/ogv/weight/OgvRelativeLayout.class */
@StabilityInferred(parameters = 0)
public final class OgvRelativeLayout extends TintRelativeLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f88466c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f88467d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Bitmap f88468e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Paint f88469f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Paint f88470g;

    @NotNull
    public final Rect h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Rect f88471i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f88472j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f88473k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f88474l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final int[] f88475m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public a f88476n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final Paint f88477o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f88478p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f88479q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f88480r;

    public OgvRelativeLayout(@Nullable Context context) {
        super(context);
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(2131166960);
        Paint paint = new Paint();
        this.f88469f = paint;
        Paint paint2 = new Paint();
        this.f88470g = paint2;
        this.h = new Rect();
        this.f88471i = new Rect();
        this.f88473k = ListExtentionsKt.toPx(10.0f) + dimensionPixelSize;
        this.f88475m = new int[2];
        this.f88476n = a.C0582a.f86856a;
        this.f88477o = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setAntiAlias(true);
        paint2.setStyle(style);
        paint.setAntiAlias(true);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{2130969563});
        this.f88474l = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        setWillNotDraw(false);
    }

    public OgvRelativeLayout(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(2131166960);
        Paint paint = new Paint();
        this.f88469f = paint;
        Paint paint2 = new Paint();
        this.f88470g = paint2;
        this.h = new Rect();
        this.f88471i = new Rect();
        this.f88473k = ListExtentionsKt.toPx(10.0f) + dimensionPixelSize;
        this.f88475m = new int[2];
        this.f88476n = a.C0582a.f86856a;
        this.f88477o = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setAntiAlias(true);
        paint2.setStyle(style);
        paint.setAntiAlias(true);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{2130969563});
        this.f88474l = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        setWillNotDraw(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean c(android.graphics.Bitmap r3) {
        /*
            r0 = r3
            if (r0 == 0) goto L1b
            r0 = r3
            int r0 = r0.getWidth()
            r4 = r0
            r0 = 1
            r5 = r0
            r0 = r4
            r1 = 1
            if (r0 != r1) goto L1b
            r0 = r3
            int r0 = r0.getHeight()
            r1 = 1
            if (r0 != r1) goto L1b
            goto L1d
        L1b:
            r0 = 0
            r5 = r0
        L1d:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.ogv.weight.OgvRelativeLayout.c(android.graphics.Bitmap):boolean");
    }

    public final void a(int i7, @NotNull Bitmap bitmap) {
        int iMax = Math.max(0, this.f88472j + i7);
        this.f88472j = iMax;
        int i8 = this.f88473k;
        if (iMax < 0 || iMax > i8) {
            return;
        }
        this.f88466c = true;
        if (c(bitmap)) {
            d(bitmap);
        } else {
            int i9 = e.b(getContext()).f86403d;
            if (this.f88472j < bitmap.getHeight()) {
                Rect rect = this.h;
                int i10 = this.f88472j;
                rect.set(0, i10, i9, ((int) OgvThemeColorHelper.f88261s) + i10);
            } else {
                this.h.set(0, 0, i9, this.f88472j);
            }
        }
        invalidate();
    }

    public final void b() {
        float f7 = OgvThemeColorHelper.f88258p;
        OgvThemeColorHelper.f88261s = ((float) Math.ceil(OgvThemeColorHelper.f88258p)) + ((float) Math.ceil(this.f88474l)) + ((float) Math.ceil(this.f88478p));
    }

    public final void d(Bitmap bitmap) {
        int i7 = e.b(getContext()).f86403d;
        if (c(bitmap)) {
            this.h.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
            return;
        }
        Rect rect = this.h;
        int i8 = this.f88472j;
        rect.set(0, i8, i7, ((int) OgvThemeColorHelper.f88261s) + i8);
    }

    public final boolean getSkipStatusBarOffset() {
        return this.f88479q;
    }

    public final int getTopBarHeightPx() {
        return this.f88480r;
    }

    @Override // android.view.View
    public final void onDraw(@NotNull Canvas canvas) {
        super.onDraw(canvas);
        Bitmap bitmap = this.f88468e;
        if (bitmap != null && this.f88466c && !bitmap.isRecycled()) {
            int width = (!c(bitmap) && this.f88480r > 0 && getWidth() > 0) ? (int) ((bitmap.getWidth() * this.f88480r) / getWidth()) : 0;
            if (width > 0) {
                this.h.offset(0, width);
            }
            canvas.drawBitmap(bitmap, this.h, this.f88471i, this.f88469f);
            if (width > 0) {
                this.h.offset(0, -width);
            }
        }
        if (this.f88467d) {
            canvas.drawRect(this.f88471i, this.f88470g);
        }
        b.a(canvas, this, this.f88476n, this.f88477o);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onLayout(boolean r8, int r9, int r10, int r11, int r12) {
        /*
            r7 = this;
            r0 = r7
            r1 = r7
            int[] r1 = r1.f88475m
            r0.getLocationOnScreen(r1)
            float r0 = com.bilibili.search2.result.ogv.OgvThemeColorHelper.f88258p
            r13 = r0
            r0 = r7
            android.content.Context r0 = r0.getContext()
            android.app.Activity r0 = com.bilibili.magicasakura.utils.ThemeUtils.getWrapperActivity(r0)
            r16 = r0
            r0 = r16
            if (r0 == 0) goto L34
            r0 = r16
            boolean r0 = r0.isInMultiWindowMode()
            r15 = r0
            r0 = 1
            r14 = r0
            r0 = r15
            r1 = 1
            if (r0 != r1) goto L34
            r0 = r7
            int[] r0 = r0.f88475m
            r1 = 1
            r0 = r0[r1]
            if (r0 > 0) goto L37
        L34:
            r0 = 0
            r14 = r0
        L37:
            r0 = r14
            com.bilibili.search2.result.ogv.OgvThemeColorHelper.f88260r = r0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            super.onLayout(r1, r2, r3, r4, r5)
            r0 = r7
            r1 = 2131310921(0x7f093949, float:1.8240168E38)
            android.view.View r0 = r0.findViewById(r1)
            com.bilibili.magicasakura.widgets.TintLinearLayout r0 = (com.bilibili.magicasakura.widgets.TintLinearLayout) r0
            r16 = r0
            r0 = r16
            if (r0 == 0) goto L62
            r0 = r16
            int r0 = r0.getHeight()
            float r0 = (float) r0
            r13 = r0
            goto L65
        L62:
            r0 = 0
            r13 = r0
        L65:
            r0 = r13
            com.bilibili.search2.result.ogv.OgvThemeColorHelper.f88258p = r0
            r0 = r7
            r0.b()
            r0 = r7
            android.content.Context r0 = r0.getContext()
            com.bilibili.search2.component.e$a r0 = com.bilibili.search2.component.e.b(r0)
            int r0 = r0.f86403d
            r10 = r0
            r0 = r7
            android.graphics.Bitmap r0 = r0.f88468e
            r16 = r0
            r0 = r16
            if (r0 == 0) goto L8d
            r0 = r7
            r1 = r16
            r0.d(r1)
            goto La6
        L8d:
            r0 = r7
            android.graphics.Rect r0 = r0.h
            r16 = r0
            r0 = r7
            int r0 = r0.f88472j
            r9 = r0
            r0 = r16
            r1 = 0
            r2 = r9
            r3 = r10
            float r4 = com.bilibili.search2.result.ogv.OgvThemeColorHelper.f88261s
            int r4 = (int) r4
            r5 = r9
            int r4 = r4 + r5
            r0.set(r1, r2, r3, r4)
        La6:
            r0 = r7
            boolean r0 = r0.f88479q
            if (r0 == 0) goto Lb2
            r0 = 0
            r9 = r0
            goto Lb6
        Lb2:
            int r0 = com.bilibili.search2.result.ogv.OgvThemeColorHelper.a.a()
            r9 = r0
        Lb6:
            r0 = r7
            android.graphics.Rect r0 = r0.f88471i
            r1 = 0
            r2 = r9
            r3 = r10
            float r4 = com.bilibili.search2.result.ogv.OgvThemeColorHelper.f88261s
            int r4 = (int) r4
            r5 = r9
            int r4 = r4 + r5
            r0.set(r1, r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.ogv.weight.OgvRelativeLayout.onLayout(boolean, int, int, int, int):void");
    }

    public final void setBrandAdGradientOverlay(@NotNull a aVar) {
        this.f88476n = aVar;
        invalidate();
        postInvalidateOnAnimation();
    }

    public final void setMaxShowDistanceExtra(float f7) {
        this.f88478p = f7;
        b();
        invalidate();
    }

    public final void setSkipStatusBarOffset(boolean z6) {
        this.f88479q = z6;
    }

    public final void setTopBarHeightPx(int i7) {
        this.f88480r = i7;
    }
}
