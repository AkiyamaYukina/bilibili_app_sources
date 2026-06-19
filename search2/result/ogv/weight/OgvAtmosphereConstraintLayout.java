package com.bilibili.search2.result.ogv.weight;

import Vn.A;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comm.list.common.search.BitmapProcessType;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.magicasakura.widgets.TintConstraintLayout;
import com.bilibili.search2.component.e;
import com.bilibili.search2.result.ogv.OgvThemeColorHelper;
import java.lang.ref.WeakReference;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/ogv/weight/OgvAtmosphereConstraintLayout.class */
@StabilityInferred(parameters = 0)
public final class OgvAtmosphereConstraintLayout extends TintConstraintLayout {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f88443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f88444e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Bitmap f88445f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Paint f88446g;

    @NotNull
    public final Rect h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Rect f88447i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f88448j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public String f88449k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public WeakReference<OgvThemeColorHelper> f88450l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f88451m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f88452n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final int[] f88453o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public BitmapProcessType f88454p;

    public OgvAtmosphereConstraintLayout(@Nullable Context context) {
        super(context);
        this.f88444e = ListExtentionsKt.toPx(44);
        Paint paint = new Paint();
        this.f88446g = paint;
        this.h = new Rect();
        this.f88447i = new Rect();
        this.f88448j = (int) OgvThemeColorHelper.f88261s;
        this.f88453o = new int[2];
        this.f88454p = BitmapProcessType.FIT_HEIGHT_BOTH_SHADOW;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{2130969563});
        typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        this.f88448j = (int) OgvThemeColorHelper.f88261s;
        setWillNotDraw(false);
    }

    public OgvAtmosphereConstraintLayout(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f88444e = ListExtentionsKt.toPx(44);
        Paint paint = new Paint();
        this.f88446g = paint;
        this.h = new Rect();
        this.f88447i = new Rect();
        this.f88448j = (int) OgvThemeColorHelper.f88261s;
        this.f88453o = new int[2];
        this.f88454p = BitmapProcessType.FIT_HEIGHT_BOTH_SHADOW;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{2130969563});
        typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        this.f88448j = (int) OgvThemeColorHelper.f88261s;
        setWillNotDraw(false);
    }

    private final int getBackgroundDrawableHeight() {
        return getHeight() - this.f88451m;
    }

    public final int getTopBarHeightPx() {
        return this.f88452n;
    }

    @NotNull
    public final BitmapProcessType getType() {
        return this.f88454p;
    }

    public final void j0(@Nullable Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        this.f88443d = true;
        this.f88445f = bitmap;
        int iD = e.d(getContext());
        this.h.set(iD, this.f88448j, getWidth() + iD, this.f88448j + getBackgroundDrawableHeight());
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(@NotNull Canvas canvas) {
        super.onDraw(canvas);
        Bitmap bitmap = this.f88445f;
        if (bitmap == null || !this.f88443d || bitmap.isRecycled()) {
            return;
        }
        int width = (this.f88452n <= 0 || getWidth() <= 0) ? 0 : (int) ((bitmap.getWidth() * this.f88452n) / getWidth());
        if (width > 0) {
            this.h.offset(0, width);
        }
        canvas.drawBitmap(bitmap, this.h, this.f88447i, this.f88446g);
        if (width > 0) {
            this.h.offset(0, -width);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) throws NoWhenBranchMatchedException {
        OgvThemeColorHelper ogvThemeColorHelper;
        WeakReference<OgvThemeColorHelper> weakReference;
        OgvThemeColorHelper ogvThemeColorHelper2;
        super.onLayout(z6, i7, i8, i9, i10);
        getLocationOnScreen(this.f88453o);
        this.f88448j = (int) OgvThemeColorHelper.f88261s;
        int iD = e.d(getContext());
        if (this.f88445f != null) {
            this.h.set(iD, this.f88448j, getWidth() + iD, this.f88448j + getBackgroundDrawableHeight());
        }
        int iA = 0;
        this.f88447i.set(0, 0, getWidth(), getBackgroundDrawableHeight());
        Context context = getContext();
        int width = getWidth();
        e.a aVarB = e.b(context);
        if (aVarB.a()) {
            if (aVarB.f86403d > ListExtentionsKt.toPx(600)) {
                width = ListExtentionsKt.toPx(584);
            }
        }
        int backgroundDrawableHeight = this.f88448j + getBackgroundDrawableHeight() + this.f88444e + this.f88452n;
        WeakReference<OgvThemeColorHelper> weakReference2 = this.f88450l;
        if (weakReference2 == null || (ogvThemeColorHelper = weakReference2.get()) == null) {
            return;
        }
        ogvThemeColorHelper.f88272g = width;
        ogvThemeColorHelper.h = backgroundDrawableHeight;
        int iA2 = OgvThemeColorHelper.a.a();
        BitmapProcessType bitmapProcessType = this.f88454p;
        StringBuilder sbB = A.b(width, backgroundDrawableHeight, " downOgvThemeImage width:", " height:", " ");
        sbB.append(iA2);
        sbB.append(" type:");
        sbB.append(bitmapProcessType);
        BLog.i("[Search]AtmosphereConstraintLayout", sbB.toString());
        String str = this.f88449k;
        if (str == null || (weakReference = this.f88450l) == null || (ogvThemeColorHelper2 = weakReference.get()) == null) {
            return;
        }
        Context context2 = getContext();
        if (this.f88454p == BitmapProcessType.FIT_HEIGHT_BOTH_SHADOW) {
            iA = OgvThemeColorHelper.a.a();
        }
        ogvThemeColorHelper2.downLoadOgvBackGroundImage(context2, str, width, backgroundDrawableHeight - iA, null, this.f88454p);
    }

    public final void setBgDrawableMarginBottom(int i7) {
        this.f88451m = i7;
        invalidate();
    }

    public final void setOgvThemeHelper(@NotNull OgvThemeColorHelper ogvThemeColorHelper) {
        this.f88450l = new WeakReference<>(ogvThemeColorHelper);
    }

    public final void setTopBarHeightPx(int i7) {
        this.f88452n = i7;
    }

    public final void setType(@NotNull BitmapProcessType bitmapProcessType) {
        this.f88454p = bitmapProcessType;
    }
}
