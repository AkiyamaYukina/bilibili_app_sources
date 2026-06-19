package com.bilibili.search2.result.ogv.weight;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comm.list.common.search.BitmapProcessType;
import com.bilibili.lib.image2.bean.ThumbnailUrlTransformStrategy;
import com.bilibili.lib.ui.util.StatusBarCompat;
import com.bilibili.magicasakura.widgets.TintConstraintLayout;
import com.bilibili.search2.component.e;
import com.bilibili.search2.result.ogv.OgvThemeColorHelper;
import java.lang.ref.WeakReference;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/ogv/weight/OgvConstraintLayout.class */
@StabilityInferred(parameters = 0)
public final class OgvConstraintLayout extends TintConstraintLayout {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f88455d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Bitmap f88456e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Paint f88457f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Rect f88458g;

    @NotNull
    public final Rect h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f88459i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public String f88460j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public WeakReference<OgvThemeColorHelper> f88461k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f88462l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f88463m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final int[] f88464n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public ThumbnailUrlTransformStrategy f88465o;

    public OgvConstraintLayout(@Nullable Context context) {
        super(context);
        Paint paint = new Paint();
        this.f88457f = paint;
        this.f88458g = new Rect();
        this.h = new Rect();
        this.f88459i = (int) OgvThemeColorHelper.f88261s;
        this.f88464n = new int[2];
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        StatusBarCompat.getStatusBarHeight(getContext());
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{2130969563});
        typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        this.f88459i = (int) OgvThemeColorHelper.f88261s;
        setWillNotDraw(false);
    }

    public OgvConstraintLayout(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f88457f = paint;
        this.f88458g = new Rect();
        this.h = new Rect();
        this.f88459i = (int) OgvThemeColorHelper.f88261s;
        this.f88464n = new int[2];
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        StatusBarCompat.getStatusBarHeight(getContext());
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{2130969563});
        typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        this.f88459i = (int) OgvThemeColorHelper.f88261s;
        setWillNotDraw(false);
    }

    private final int getBackgroundDrawableHeight() {
        return getHeight() - this.f88462l;
    }

    @Nullable
    public final ThumbnailUrlTransformStrategy getBlurStrategy() {
        return this.f88465o;
    }

    public final int getTopBarHeightPx() {
        return this.f88463m;
    }

    @Override // android.view.View
    public final void onDraw(@NotNull Canvas canvas) {
        super.onDraw(canvas);
        Bitmap bitmap = this.f88456e;
        if (bitmap == null || !this.f88455d || bitmap.isRecycled()) {
            return;
        }
        int width = (this.f88463m <= 0 || getWidth() <= 0) ? 0 : (int) ((bitmap.getWidth() * this.f88463m) / getWidth());
        if (width > 0) {
            this.f88458g.offset(0, width);
        }
        canvas.drawBitmap(bitmap, this.f88458g, this.h, this.f88457f);
        if (width > 0) {
            this.f88458g.offset(0, -width);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) throws NoWhenBranchMatchedException {
        OgvThemeColorHelper ogvThemeColorHelper;
        WeakReference<OgvThemeColorHelper> weakReference;
        OgvThemeColorHelper ogvThemeColorHelper2;
        super.onLayout(z6, i7, i8, i9, i10);
        getLocationOnScreen(this.f88464n);
        this.f88459i = (int) OgvThemeColorHelper.f88261s;
        int iD = e.d(getContext());
        this.f88458g.set(iD, this.f88459i, getWidth() + iD, this.f88459i + getBackgroundDrawableHeight());
        this.h.set(0, 0, getWidth(), getBackgroundDrawableHeight());
        Context context = getContext();
        int width = getWidth();
        e.a aVarB = e.b(context);
        if (aVarB.a()) {
            width = aVarB.f86403d;
        }
        int backgroundDrawableHeight = this.f88459i + getBackgroundDrawableHeight() + this.f88463m;
        WeakReference<OgvThemeColorHelper> weakReference2 = this.f88461k;
        if (weakReference2 == null || (ogvThemeColorHelper = weakReference2.get()) == null) {
            return;
        }
        ogvThemeColorHelper.f88272g = width;
        ogvThemeColorHelper.h = backgroundDrawableHeight;
        String str = this.f88460j;
        if (str == null || (weakReference = this.f88461k) == null || (ogvThemeColorHelper2 = weakReference.get()) == null) {
            return;
        }
        ogvThemeColorHelper2.downLoadOgvBackGroundImage(getContext(), str, width, backgroundDrawableHeight, this.f88465o, BitmapProcessType.CENTER_CROP);
    }

    public final void setBgDrawableMarginBottom(int i7) {
        this.f88462l = i7;
        invalidate();
    }

    public final void setBlurStrategy(@Nullable ThumbnailUrlTransformStrategy thumbnailUrlTransformStrategy) {
        this.f88465o = thumbnailUrlTransformStrategy;
    }

    public final void setImageUrl(@NotNull String str) {
        this.f88460j = str;
    }

    public final void setOgvThemeHelper(@NotNull OgvThemeColorHelper ogvThemeColorHelper) {
        this.f88461k = new WeakReference<>(ogvThemeColorHelper);
    }

    public final void setTopBarHeightPx(int i7) {
        this.f88463m = i7;
    }
}
