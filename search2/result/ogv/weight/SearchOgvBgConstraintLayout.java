package com.bilibili.search2.result.ogv.weight;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.magicasakura.widgets.TintConstraintLayout;
import com.bilibili.search2.main.ogv.a;
import com.bilibili.search2.main.ogv.b;
import com.bilibili.search2.result.ogv.OgvThemeColorHelper;
import kotlin.jvm.JvmOverloads;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/ogv/weight/SearchOgvBgConstraintLayout.class */
@StabilityInferred(parameters = 0)
public final class SearchOgvBgConstraintLayout extends TintConstraintLayout {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public RecyclerView f88481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f88482e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f88483f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f88484g;
    public float h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f88485i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f88486j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f88487k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public Bitmap f88488l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final Paint f88489m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Rect f88490n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final Rect f88491o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f88492p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f88493q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f88494r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f88495s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f88496t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final Paint f88497u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final PorterDuffXfermode f88498v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public a f88499w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final Paint f88500x;

    @JvmOverloads
    public SearchOgvBgConstraintLayout(@NotNull Context context) {
        this(context, null, 6, 0);
    }

    @JvmOverloads
    public SearchOgvBgConstraintLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public SearchOgvBgConstraintLayout(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        this.f88486j = ViewConfiguration.get(context).getScaledTouchSlop();
        Paint paint = new Paint();
        this.f88489m = paint;
        this.f88490n = new Rect();
        this.f88491o = new Rect();
        Paint paint2 = new Paint();
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        this.f88497u = paint2;
        this.f88498v = new PorterDuffXfermode(PorterDuff.Mode.DST_OVER);
        this.f88499w = a.C0582a.f86856a;
        this.f88500x = new Paint(1);
        paint.setStyle(style);
        paint.setAntiAlias(true);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i7) {
        RecyclerView recyclerView = this.f88481d;
        return recyclerView != null ? recyclerView.canScrollVertically(i7) : super.canScrollVertically(i7);
    }

    public final void j0() {
        int i7 = -this.f88493q;
        int i8 = OgvThemeColorHelper.f88263u;
        this.f88491o.set(0, i7, getWidth(), i8 + i7 + this.f88492p);
    }

    public final void k0() {
        Bitmap bitmap = this.f88488l;
        if (bitmap != null && bitmap.getWidth() == 1 && bitmap.getHeight() == 1) {
            this.f88490n.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
        } else {
            int height = bitmap != null ? bitmap.getHeight() : ((int) OgvThemeColorHelper.f88261s) + OgvThemeColorHelper.f88263u + this.f88492p;
            this.f88490n.set(0, RangesKt.coerceAtLeast(height - (OgvThemeColorHelper.f88263u + this.f88492p), 0), getWidth(), height);
        }
    }

    @Override // android.view.View
    public final void onDraw(@NotNull Canvas canvas) {
        super.onDraw(canvas);
        Bitmap bitmap = this.f88488l;
        if (bitmap != null && this.f88487k) {
            canvas.drawBitmap(bitmap, this.f88490n, this.f88491o, this.f88489m);
            if (this.f88495s) {
                int iSaveLayer = canvas.saveLayer(null, null);
                this.f88497u.setXfermode(this.f88496t ? null : this.f88498v);
                canvas.drawRect(this.f88491o, this.f88497u);
                this.f88497u.setXfermode(null);
                canvas.restoreToCount(iSaveLayer);
            }
        }
        b.a(canvas, this, this.f88499w, this.f88500x);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        super.onLayout(z6, i7, i8, i9, i10);
        k0();
        j0();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(@NotNull MotionEvent motionEvent) {
        ViewParent parent;
        RecyclerView recyclerView = this.f88481d;
        if (recyclerView == null) {
            return super.onTouchEvent(motionEvent);
        }
        float x6 = motionEvent.getX();
        float f7 = this.f88482e;
        if (x6 <= this.f88483f && f7 <= x6) {
            return super.onTouchEvent(motionEvent);
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setLocation(motionEvent.getX() - f7, motionEvent.getY() - 0.0f);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.h = motionEvent.getX();
            this.f88485i = motionEvent.getY();
            this.f88484g = false;
            ViewParent parent2 = getParent();
            if (parent2 != null) {
                parent2.requestDisallowInterceptTouchEvent(true);
            }
            recyclerView.dispatchTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            return true;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                float fAbs = Math.abs(motionEvent.getX() - this.h);
                float fAbs2 = Math.abs(motionEvent.getY() - this.f88485i);
                if (!this.f88484g && fAbs2 > this.f88486j && fAbs2 > fAbs) {
                    this.f88484g = true;
                }
                if (this.f88484g && (parent = getParent()) != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                recyclerView.dispatchTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
                return true;
            }
            if (actionMasked != 3) {
                motionEventObtain.recycle();
                return super.onTouchEvent(motionEvent);
            }
        }
        recyclerView.dispatchTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
        this.f88484g = false;
        return true;
    }

    public final void setBrand155GradientOverlay(@NotNull a aVar) {
        this.f88499w = aVar;
        invalidate();
        postInvalidateOnAnimation();
    }

    public final void setExtraBottomHeight(int i7) {
        this.f88492p = i7;
        k0();
        j0();
        invalidate();
    }
}
