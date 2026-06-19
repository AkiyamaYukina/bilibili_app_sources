package com.bilibili.playerbizcommon.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import dq0.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/view/a.class */
public final class a extends View {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @NotNull
    public final List<b> f80389A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @NotNull
    public final List<InterfaceC0522a> f80390B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f80391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f80392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f80393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f80394d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f80395e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f80396f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final c f80397g;
    public final int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f80398i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f80399j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f80400k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f80401l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final RectF f80402m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final RectF f80403n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final RectF f80404o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final RectF f80405p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final RectF f80406q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final RectF f80407r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final RectF f80408s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f80409t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final Paint f80410u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f80411v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final Point f80412w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final Point f80413x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f80414y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f80415z;

    /* JADX INFO: renamed from: com.bilibili.playerbizcommon.view.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/view/a$a.class */
    public interface InterfaceC0522a {
        void a(int i7, boolean z6);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/view/a$b.class */
    public interface b {
        void a(int i7);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/view/a$c.class */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f80416a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f80417b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f80418c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f80419d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f80420e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f80421f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f80422g;
        public int h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f80423i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f80424j;
    }

    @JvmOverloads
    public a(@NotNull Context context) {
        this(context, null, 0);
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [com.bilibili.playerbizcommon.view.a$c, java.lang.Object] */
    @JvmOverloads
    public a(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f80395e = 20;
        this.f80396f = 1.5f;
        int px = NewPlayerUtilsKt.toPx(8.0f);
        int px2 = NewPlayerUtilsKt.toPx(20.0f);
        int px3 = NewPlayerUtilsKt.toPx(4.0f);
        int px4 = NewPlayerUtilsKt.toPx(4.0f);
        int px5 = NewPlayerUtilsKt.toPx(20.0f);
        int px6 = NewPlayerUtilsKt.toPx(2.0f);
        int px7 = NewPlayerUtilsKt.toPx(3.0f);
        ?? obj = new Object();
        obj.f80416a = -1;
        obj.f80417b = px;
        obj.f80418c = px2;
        obj.f80419d = px3;
        obj.f80420e = px4;
        obj.f80421f = px5;
        obj.f80422g = -39271;
        obj.h = px6;
        obj.f80423i = -1;
        obj.f80424j = px7;
        this.f80397g = obj;
        this.h = -1291845632;
        this.f80402m = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f80403n = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f80404o = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f80405p = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f80406q = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f80407r = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f80408s = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        Paint paint = new Paint();
        this.f80410u = paint;
        this.f80412w = new Point(0, 0);
        this.f80413x = new Point(0, 0);
        this.f80389A = new ArrayList();
        this.f80390B = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.f116625e, i7, 0);
        obj.f80416a = typedArrayObtainStyledAttributes.getColor(8, obj.f80416a);
        obj.f80417b = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, obj.f80417b);
        obj.f80418c = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, obj.f80418c);
        obj.f80419d = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, obj.f80419d);
        obj.f80420e = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, obj.f80420e);
        obj.f80421f = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, obj.f80421f);
        obj.f80422g = typedArrayObtainStyledAttributes.getColor(0, obj.f80422g);
        obj.h = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, obj.h);
        obj.f80423i = typedArrayObtainStyledAttributes.getColor(6, obj.f80423i);
        obj.f80424j = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, obj.f80424j);
        typedArrayObtainStyledAttributes.recycle();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean b(android.graphics.Point r4, android.graphics.RectF r5, float r6) {
        /*
            r0 = r5
            float r0 = r0.width()
            r8 = r0
            r0 = r5
            float r0 = r0.height()
            r11 = r0
            r0 = r5
            float r0 = r0.centerX()
            r7 = r0
            r0 = 2
            float r0 = (float) r0
            r12 = r0
            r0 = r8
            r1 = r6
            float r0 = r0 * r1
            r1 = r12
            float r0 = r0 / r1
            r9 = r0
            r0 = r5
            float r0 = r0.centerX()
            r10 = r0
            r0 = r5
            float r0 = r0.centerY()
            r8 = r0
            r0 = r11
            r1 = r6
            float r0 = r0 * r1
            r1 = r12
            float r0 = r0 / r1
            r6 = r0
            r0 = r5
            float r0 = r0.centerY()
            r11 = r0
            r0 = r4
            int r0 = r0.x
            float r0 = (float) r0
            r12 = r0
            r0 = r7
            r1 = r9
            float r0 = r0 - r1
            r1 = r12
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L72
            r0 = r12
            r1 = r10
            r2 = r9
            float r1 = r1 + r2
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L72
            r0 = r4
            int r0 = r0.y
            float r0 = (float) r0
            r7 = r0
            r0 = r8
            r1 = r6
            float r0 = r0 - r1
            r1 = r7
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L72
            r0 = r7
            r1 = r11
            r2 = r6
            float r1 = r1 + r2
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L72
            r0 = 1
            r13 = r0
            goto L75
        L72:
            r0 = 0
            r13 = r0
        L75:
            r0 = r13
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommon.view.a.b(android.graphics.Point, android.graphics.RectF, float):boolean");
    }

    public final void a(Canvas canvas, RectF rectF, RectF rectF2) {
        this.f80410u.setColor(this.f80397g.f80416a);
        int i7 = this.f80397g.f80417b;
        canvas.drawRoundRect(rectF, i7, i7, this.f80410u);
        this.f80410u.setColor(this.f80397g.f80422g);
        int i8 = this.f80397g.h;
        canvas.drawRoundRect(rectF2, i8, i8, this.f80410u);
    }

    public final void c(int i7, int i8) {
        if (this.f80398i == i7 && this.f80399j == i8) {
            return;
        }
        this.f80398i = i7;
        this.f80399j = i8;
        RectF rectF = this.f80402m;
        rectF.top = 0.0f;
        float f7 = i7;
        rectF.left = f7;
        rectF.right = f7 + this.f80397g.f80418c;
        rectF.bottom = getHeight();
        RectF rectF2 = this.f80402m;
        float f8 = rectF2.bottom;
        float f9 = rectF2.top;
        RectF rectF3 = this.f80404o;
        c cVar = this.f80397g;
        float f10 = cVar.f80421f;
        float f11 = ((f8 - f9) - f10) / 2.0f;
        rectF3.top = f11;
        rectF3.bottom = f11 + f10;
        float f12 = rectF2.left;
        int i9 = cVar.f80418c;
        int i10 = cVar.f80420e;
        float f13 = ((i9 - i10) / 2.0f) + f12;
        rectF3.left = f13;
        rectF3.right = f13 + i10;
        RectF rectF4 = this.f80403n;
        rectF4.top = 0.0f;
        rectF4.bottom = getHeight();
        this.f80403n.right = getWidth() - this.f80399j;
        RectF rectF5 = this.f80403n;
        float f14 = rectF5.right;
        c cVar2 = this.f80397g;
        float f15 = f14 - cVar2.f80418c;
        rectF5.left = f15;
        float f16 = rectF5.bottom;
        float f17 = rectF5.top;
        RectF rectF6 = this.f80405p;
        float f18 = cVar2.f80421f;
        float f19 = ((f16 - f17) - f18) / 2.0f;
        rectF6.top = f19;
        rectF6.bottom = f19 + f18;
        int i11 = cVar2.f80420e;
        float f20 = ((r0 - i11) / 2.0f) + f15;
        rectF6.left = f20;
        rectF6.right = f20 + i11;
        RectF rectF7 = this.f80406q;
        rectF7.top = 0.0f;
        rectF7.left = this.f80402m.right;
        rectF7.bottom = 0.0f + cVar2.f80419d;
        rectF7.right = rectF5.left;
        this.f80407r.bottom = getHeight();
        RectF rectF8 = this.f80407r;
        rectF8.top = rectF8.bottom - this.f80397g.f80419d;
        RectF rectF9 = this.f80406q;
        rectF8.left = rectF9.left;
        rectF8.right = rectF9.right;
        setCurrentRange(((getWidth() - this.f80398i) - this.f80399j) - (this.f80397g.f80418c * 2));
    }

    public final void d() {
        if (getWidth() <= 0 || this.f80392b <= 0) {
            return;
        }
        this.f80400k = Bk.a.a(this.f80397g.f80418c, 2, getWidth() - this.f80393c, 2);
        int iA = Bk.a.a(this.f80397g.f80418c, 2, getWidth() - this.f80392b, 2);
        this.f80401l = iA;
        c(iA, iA);
        invalidate();
    }

    public final int getCurrentRange() {
        return this.f80394d;
    }

    public final int getFrameHeight() {
        return this.f80397g.f80419d;
    }

    public final float getIndicatorProgress() {
        return this.f80391a;
    }

    @Override // android.view.View
    public final void onDraw(@NotNull Canvas canvas) {
        super.onDraw(canvas);
        this.f80410u.setColor(this.h);
        canvas.drawRect(0.0f, this.f80406q.bottom, this.f80402m.left + this.f80397g.f80417b, this.f80407r.top, this.f80410u);
        canvas.drawRect(this.f80403n.right - this.f80397g.f80417b, this.f80406q.bottom, getWidth(), this.f80407r.top, this.f80410u);
        this.f80410u.setColor(this.f80397g.f80416a);
        RectF rectF = this.f80402m;
        float f7 = rectF.right;
        canvas.drawRect(f7 - (this.f80397g.f80417b * 1.2f), rectF.top, f7, rectF.bottom, this.f80410u);
        a(canvas, this.f80402m, this.f80404o);
        this.f80410u.setColor(this.f80397g.f80416a);
        RectF rectF2 = this.f80403n;
        float f8 = rectF2.left;
        canvas.drawRect(f8, rectF2.top, (this.f80397g.f80417b * 1.2f) + f8, rectF2.bottom, this.f80410u);
        a(canvas, this.f80403n, this.f80405p);
        this.f80410u.setColor(this.f80397g.f80416a);
        canvas.drawRect(this.f80406q, this.f80410u);
        canvas.drawRect(this.f80407r, this.f80410u);
        if (this.f80409t || this.f80411v) {
            return;
        }
        RectF rectF3 = this.f80408s;
        if (rectF3.left < this.f80402m.right || rectF3.right > this.f80403n.left) {
            return;
        }
        this.f80410u.setColor(this.f80397g.f80423i);
        canvas.drawRect(this.f80408s, this.f80410u);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        d();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0129 A[LOOP:0: B:39:0x011f->B:41:0x0129, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01e2  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(@org.jetbrains.annotations.Nullable android.view.MotionEvent r6) {
        /*
            Method dump skipped, instruction units count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommon.view.a.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setCurrentRange(int i7) {
        if (this.f80394d == i7) {
            return;
        }
        this.f80394d = i7;
        Iterator it = ((ArrayList) this.f80389A).iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(i7);
        }
    }

    public final void setIndicatorProgress(float f7) {
        this.f80391a = f7;
        float f8 = this.f80403n.left;
        float f9 = this.f80402m.right;
        float f10 = (f8 - f9) - this.f80397g.f80424j;
        float f11 = f7 * f10;
        StringBuilder sbA = Dp.b.a("progress changed currentOffset:", f11, " totalWidth:", f10, " start:");
        sbA.append(f9);
        BLog.i(sbA.toString());
        float f12 = this.f80402m.right + f11;
        float f13 = this.f80397g.f80419d;
        if (!this.f80408s.isEmpty() && Math.abs(f12 - this.f80408s.left) >= 1.0f && Math.abs(this.f80408s.top - f13) >= 1.0f) {
            float height = getHeight();
            RectF rectF = this.f80408s;
            if (Math.abs((height - rectF.bottom) - rectF.top) >= 1.0f) {
                return;
            }
        }
        RectF rectF2 = this.f80408s;
        rectF2.left = f12;
        rectF2.top = f13;
        rectF2.right = f12 + this.f80397g.f80424j;
        rectF2.bottom = getHeight() - this.f80408s.top;
        invalidate();
    }

    public final void setIndicatorVisible(boolean z6) {
        this.f80409t = !z6;
    }
}
