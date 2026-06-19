package com.bilibili.search2.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.viewpager.widget.ViewPager;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.search2.utils.h;
import com.bilibili.search2.widget.AlignLeftAndRightPagerSlidingTabStrip;
import kotlin.jvm.JvmOverloads;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.PagerSlidingTabStrip;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/widget/AlignLeftAndRightPagerSlidingTabStrip.class */
@StabilityInferred(parameters = 0)
public final class AlignLeftAndRightPagerSlidingTabStrip extends PagerSlidingTabStrip {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final int f88879E = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f88880A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final int f88881B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f88882C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f88883D;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public AttributeSet f88884u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float f88885v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final float f88886w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f88887x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f88888y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f88889z;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/widget/AlignLeftAndRightPagerSlidingTabStrip$a.class */
    public static final class a implements ViewPager.OnPageChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ViewPager.OnPageChangeListener f88890a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AlignLeftAndRightPagerSlidingTabStrip f88891b;

        public a(ViewPager.OnPageChangeListener onPageChangeListener, AlignLeftAndRightPagerSlidingTabStrip alignLeftAndRightPagerSlidingTabStrip) {
            this.f88890a = onPageChangeListener;
            this.f88891b = alignLeftAndRightPagerSlidingTabStrip;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageScrollStateChanged(int i7) {
            this.f88890a.onPageScrollStateChanged(i7);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageScrolled(int i7, float f7, int i8) {
            this.f88890a.onPageScrolled(i7, f7, i8);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageSelected(int i7) {
            this.f88890a.onPageSelected(i7);
            if (h.f88825a) {
                return;
            }
            AlignLeftAndRightPagerSlidingTabStrip.d(this.f88891b, i7);
        }
    }

    @JvmOverloads
    public AlignLeftAndRightPagerSlidingTabStrip(@NotNull Context context) {
        this(context, null, 6, 0);
    }

    @JvmOverloads
    public AlignLeftAndRightPagerSlidingTabStrip(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AlignLeftAndRightPagerSlidingTabStrip(Context context, AttributeSet attributeSet, int i7, int i8) {
        attributeSet = (i7 & 2) != 0 ? null : attributeSet;
        super(context, attributeSet, 0);
        this.f88884u = attributeSet;
        boolean z6 = h.f88825a;
        if (!h.f88825a) {
            setIndicatorEnable(false);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(this.f88884u, Al.a.a);
            try {
                this.f88880A = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
                typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0);
                typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
                this.f88881B = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
                this.f88885v = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 0);
                this.f88886w = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, 0);
                this.f88887x = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
                this.f88888y = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
                this.f88889z = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, 0);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        this.f88883D = true;
    }

    public static final void d(final AlignLeftAndRightPagerSlidingTabStrip alignLeftAndRightPagerSlidingTabStrip, int i7) {
        int childCount = ((PagerSlidingTabStrip) alignLeftAndRightPagerSlidingTabStrip).tabsContainer.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = ((PagerSlidingTabStrip) alignLeftAndRightPagerSlidingTabStrip).tabsContainer.getChildAt(i8);
            TintTextView tintTextView = childAt instanceof TintTextView ? (TintTextView) childAt : null;
            if (tintTextView != null) {
                if (i7 == i8) {
                    if (tintTextView.isAttachedToWindow()) {
                        final boolean z6 = true;
                        final TintTextView tintTextView2 = tintTextView;
                        tintTextView.post(new Runnable(z6, alignLeftAndRightPagerSlidingTabStrip, tintTextView2) { // from class: Yt0.a

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final boolean f29174a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final AlignLeftAndRightPagerSlidingTabStrip f29175b;

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            public final TintTextView f29176c;

                            {
                                this.f29174a = z6;
                                this.f29175b = alignLeftAndRightPagerSlidingTabStrip;
                                this.f29176c = tintTextView2;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean z7 = this.f29174a;
                                AlignLeftAndRightPagerSlidingTabStrip alignLeftAndRightPagerSlidingTabStrip2 = this.f29175b;
                                final TintTextView tintTextView3 = this.f29176c;
                                ValueAnimator duration = z7 ? ValueAnimator.ofFloat(alignLeftAndRightPagerSlidingTabStrip2.f88886w, alignLeftAndRightPagerSlidingTabStrip2.f88885v).setDuration(150L) : ValueAnimator.ofFloat(alignLeftAndRightPagerSlidingTabStrip2.f88885v, alignLeftAndRightPagerSlidingTabStrip2.f88886w).setDuration(150L);
                                duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(tintTextView3) { // from class: Yt0.b

                                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                                    public final TintTextView f29186a;

                                    {
                                        this.f29186a = tintTextView3;
                                    }

                                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                        TintTextView tintTextView4 = this.f29186a;
                                        int i9 = AlignLeftAndRightPagerSlidingTabStrip.f88879E;
                                        tintTextView4.setTextSize(0, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                                    }
                                });
                                duration.addListener(new C3149c(tintTextView3, z7));
                                duration.start();
                            }
                        });
                    }
                } else if (!tintTextView.isSelected()) {
                    tintTextView.setTextSize(0, alignLeftAndRightPagerSlidingTabStrip.f88886w);
                    tintTextView.setTypeface(Typeface.DEFAULT);
                } else if (tintTextView.isAttachedToWindow()) {
                    final boolean z7 = false;
                    final TintTextView tintTextView3 = tintTextView;
                    tintTextView.post(new Runnable(z7, alignLeftAndRightPagerSlidingTabStrip, tintTextView3) { // from class: Yt0.a

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final boolean f29174a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final AlignLeftAndRightPagerSlidingTabStrip f29175b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final TintTextView f29176c;

                        {
                            this.f29174a = z7;
                            this.f29175b = alignLeftAndRightPagerSlidingTabStrip;
                            this.f29176c = tintTextView3;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean z72 = this.f29174a;
                            AlignLeftAndRightPagerSlidingTabStrip alignLeftAndRightPagerSlidingTabStrip2 = this.f29175b;
                            final TintTextView tintTextView32 = this.f29176c;
                            ValueAnimator duration = z72 ? ValueAnimator.ofFloat(alignLeftAndRightPagerSlidingTabStrip2.f88886w, alignLeftAndRightPagerSlidingTabStrip2.f88885v).setDuration(150L) : ValueAnimator.ofFloat(alignLeftAndRightPagerSlidingTabStrip2.f88885v, alignLeftAndRightPagerSlidingTabStrip2.f88886w).setDuration(150L);
                            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(tintTextView32) { // from class: Yt0.b

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final TintTextView f29186a;

                                {
                                    this.f29186a = tintTextView32;
                                }

                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    TintTextView tintTextView4 = this.f29186a;
                                    int i9 = AlignLeftAndRightPagerSlidingTabStrip.f88879E;
                                    tintTextView4.setTextSize(0, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                                }
                            });
                            duration.addListener(new C3149c(tintTextView32, z72));
                            duration.start();
                        }
                    });
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final View generateTab(int i7, @Nullable CharSequence charSequence) {
        boolean z6 = h.f88825a;
        if (h.f88825a) {
            return super.generateTab(i7, charSequence);
        }
        TintTextView tintTextView = new TintTextView(getContext());
        tintTextView.setText(charSequence);
        tintTextView.setMaxWidth(getTabTextMaxWidth());
        tintTextView.setGravity(17);
        tintTextView.setEllipsize(TextUtils.TruncateAt.END);
        tintTextView.setSingleLine(true);
        int i8 = this.f88880A;
        tintTextView.setPadding(i8, 0, i8, 0);
        tintTextView.setId(2131308533);
        return tintTextView;
    }

    @Nullable
    public final AttributeSet getAttrs() {
        return this.f88884u;
    }

    public final boolean getNeedRefreshParent() {
        return this.f88882C;
    }

    @Nullable
    public ViewPager.OnPageChangeListener getPageListener() {
        return new a(super.getPageListener(), this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDraw(@NotNull Canvas canvas) {
        super.onDraw(canvas);
        if (this.f88882C && this.f88883D) {
            Object parent = getParent();
            View view = parent instanceof View ? (View) parent : null;
            if (view != null) {
                view.postInvalidate();
            }
            this.f88883D = false;
        } else {
            this.f88883D = true;
        }
        if (h.f88825a) {
            return;
        }
        int height = getHeight();
        ((PagerSlidingTabStrip) this).rectPaint.setColor(getIndicatorColor());
        View childAt = ((PagerSlidingTabStrip) this).tabsContainer.getChildAt(((PagerSlidingTabStrip) this).currentPosition);
        int left = ((PagerSlidingTabStrip) this).tabsContainer.getLeft();
        float left2 = (childAt != null ? childAt.getLeft() : 0) + left + (childAt != null ? childAt.getPaddingLeft() : 0);
        int right = childAt != null ? childAt.getRight() : 0;
        int paddingRight = 0;
        if (childAt != null) {
            paddingRight = childAt.getPaddingRight();
        }
        float f7 = (right + left) - paddingRight;
        float f8 = f7;
        float f9 = left2;
        if (((PagerSlidingTabStrip) this).currentPositionOffset > 0.0f) {
            f8 = f7;
            f9 = left2;
            if (((PagerSlidingTabStrip) this).currentPosition < getTabCount() - 1) {
                View childAt2 = ((PagerSlidingTabStrip) this).tabsContainer.getChildAt(((PagerSlidingTabStrip) this).currentPosition + 1);
                int left3 = childAt2.getLeft();
                int paddingLeft = childAt2.getPaddingLeft();
                int right2 = childAt2.getRight();
                int paddingRight2 = childAt2.getPaddingRight();
                float f10 = ((PagerSlidingTabStrip) this).currentPositionOffset;
                float f11 = paddingLeft + left3 + left;
                float f12 = 1.0f - f10;
                f9 = (left2 * f12) + (f11 * f10);
                f8 = (f12 * f7) + (f10 * ((right2 + left) - paddingRight2));
            }
        }
        float f13 = f8 - f9;
        float f14 = this.f88887x;
        float f15 = f8;
        float f16 = f9;
        if (f13 > f14) {
            f16 = f9 + ((f13 - f14) / 2);
            f15 = f16 + f14;
        }
        int i7 = this.f88888y;
        int i8 = this.f88881B;
        float f17 = (height - i7) - i8;
        float f18 = height - i8;
        float f19 = this.f88889z;
        canvas.drawRoundRect(f16, f17, f15, f18, f19, f19, ((PagerSlidingTabStrip) this).rectPaint);
    }

    public final void setAttrs(@Nullable AttributeSet attributeSet) {
        this.f88884u = attributeSet;
    }

    public final void setNeedRefreshParent(boolean z6) {
        this.f88882C = z6;
    }

    public final void setTabLayoutPaddingLeftAndRight(int i7) {
        boolean z6 = h.f88825a;
        if (h.f88825a) {
            setTabPaddingLeftRight(i7);
        } else {
            int iCoerceAtLeast = RangesKt.coerceAtLeast(i7 - this.f88880A, 0);
            ((PagerSlidingTabStrip) this).tabsContainer.setPadding(iCoerceAtLeast, 0, iCoerceAtLeast, 0);
        }
    }

    public final void updateTabStyles() {
        super.updateTabStyles();
        boolean z6 = h.f88825a;
        if (h.f88825a) {
            return;
        }
        int i7 = ((PagerSlidingTabStrip) this).currentPosition;
        int childCount = ((PagerSlidingTabStrip) this).tabsContainer.getChildCount();
        int i8 = 0;
        while (i8 < childCount) {
            View childAt = ((PagerSlidingTabStrip) this).tabsContainer.getChildAt(i8);
            TextView textView = childAt instanceof TextView ? (TextView) childAt : null;
            if (textView != null) {
                textView.setTypeface(i8 == i7 ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
                textView.setTextSize(0, i8 == i7 ? this.f88885v : this.f88886w);
            }
            i8++;
        }
    }
}
