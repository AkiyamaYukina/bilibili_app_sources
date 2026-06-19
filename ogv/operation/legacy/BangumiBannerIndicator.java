package com.bilibili.ogv.operation.legacy;

import Uj0.c;
import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.magicasakura.widgets.Tintable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.Banner;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/legacy/BangumiBannerIndicator.class */
@StabilityInferred(parameters = 0)
public final class BangumiBannerIndicator extends View implements Tintable, ViewPager.OnPageChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Paint f70276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Paint f70277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final RectF f70278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f70279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f70280e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f70281f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public Banner f70282g;
    public int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final a f70283i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f70284j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f70285k;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/legacy/BangumiBannerIndicator$a.class */
    public static final class a extends DataSetObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BangumiBannerIndicator f70286a;

        public a(BangumiBannerIndicator bangumiBannerIndicator) {
            this.f70286a = bangumiBannerIndicator;
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            this.f70286a.requestLayout();
        }
    }

    public BangumiBannerIndicator(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f70276a = paint;
        Paint paint2 = new Paint();
        this.f70277b = paint2;
        this.f70278c = new RectF();
        this.f70279d = c.a(2, context);
        this.f70280e = c.a(8, context);
        this.f70281f = c.a(4, context);
        this.f70283i = new a(this);
        this.f70284j = R$color.Pi5;
        this.f70285k = R$color.Ga2;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setAntiAlias(true);
        paint2.setStyle(style);
        paint2.setAntiAlias(true);
        a();
    }

    public final void a() {
        this.f70277b.setColor(ThemeUtils.getColorById(getContext(), this.f70284j));
        this.f70276a.setColor(ThemeUtils.getColorById(getContext(), this.f70285k));
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(@NotNull Canvas canvas) {
        float f7;
        float f8;
        ViewPager pager;
        PagerAdapter adapter;
        super.onDraw(canvas);
        Banner banner = this.f70282g;
        int count = banner != null ? banner.getCount() : 0;
        if (count <= 0) {
            return;
        }
        int i7 = this.h;
        Banner banner2 = this.f70282g;
        if (i7 >= ((banner2 == null || (pager = banner2.getPager()) == null || (adapter = pager.getAdapter()) == null) ? 0 : adapter.getCount())) {
            this.h = 0;
            return;
        }
        this.f70278c.setEmpty();
        float paddingLeft = getPaddingLeft();
        float paddingTop = getPaddingTop();
        for (int i8 = 0; i8 < count; i8++) {
            if (i8 == this.h % count) {
                this.f70278c.set(paddingLeft, paddingTop, this.f70280e + paddingLeft, (this.f70279d * 2) + paddingTop);
                RectF rectF = this.f70278c;
                float f9 = this.f70279d;
                canvas.drawRoundRect(rectF, f9, f9, this.f70277b);
                f7 = this.f70280e;
                f8 = this.f70281f;
            } else {
                RectF rectF2 = this.f70278c;
                float f10 = this.f70279d;
                float f11 = 2;
                rectF2.set(paddingLeft, paddingTop, (f10 * f11) + paddingLeft, (f10 * f11) + paddingTop);
                RectF rectF3 = this.f70278c;
                float f12 = this.f70279d;
                canvas.drawRoundRect(rectF3, f12, f12, this.f70276a);
                f7 = this.f70279d * f11;
                f8 = this.f70281f;
            }
            paddingLeft = f7 + f8 + paddingLeft;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        int iMin = size;
        if (mode != 1073741824) {
            Banner banner = this.f70282g;
            if (banner == null) {
                iMin = size;
            } else {
                iMin = paddingRight;
                if ((banner != null ? banner.getCount() : 0) > 0) {
                    iMin = paddingRight + ((int) ((((2 * this.f70279d) + this.f70281f) * (r9 - 1)) + this.f70280e));
                }
                if (mode == Integer.MIN_VALUE) {
                    iMin = Math.min(iMin, size);
                }
            }
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int mode2 = View.MeasureSpec.getMode(i8);
        int size2 = View.MeasureSpec.getSize(i8);
        if (mode2 != 1073741824) {
            int i9 = paddingBottom + paddingTop + ((int) (2 * this.f70279d));
            size2 = mode2 == Integer.MIN_VALUE ? Math.min(i9, size2) : i9;
        }
        setMeasuredDimension(iMin, size2);
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrollStateChanged(int i7) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrolled(int i7, float f7, int i8) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageSelected(int i7) {
        this.h = i7;
        invalidate();
    }

    public final void setBanner(@NotNull Banner banner) {
        PagerAdapter adapter;
        ViewPager pager;
        ViewPager pager2;
        PagerAdapter adapter2;
        Banner banner2 = this.f70282g;
        if (banner2 == banner) {
            return;
        }
        if (banner2 != null && (pager2 = banner2.getPager()) != null && (adapter2 = pager2.getAdapter()) != null) {
            adapter2.unregisterDataSetObserver(this.f70283i);
        }
        Banner banner3 = this.f70282g;
        if (banner3 != null && (pager = banner3.getPager()) != null) {
            pager.removeOnPageChangeListener(this);
        }
        ViewPager pager3 = banner.getPager();
        if (pager3 != null && (adapter = pager3.getAdapter()) != null) {
            adapter.registerDataSetObserver(this.f70283i);
        }
        ViewPager pager4 = banner.getPager();
        if (pager4 != null) {
            pager4.addOnPageChangeListener(this);
        }
        this.h = banner.getPager().getCurrentItem();
        this.f70282g = banner;
        invalidate();
    }

    @Override // com.bilibili.magicasakura.widgets.Tintable
    public final void tint() {
        a();
    }
}
