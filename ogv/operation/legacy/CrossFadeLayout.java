package com.bilibili.ogv.operation.legacy;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ogv.operation.legacy.CrossFadeLayout;
import kotlin.jvm.JvmOverloads;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/legacy/CrossFadeLayout.class */
@StabilityInferred(parameters = 0)
public final class CrossFadeLayout extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public View f70287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public View f70288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Animator f70289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f70290d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f70291e;

    @JvmOverloads
    public CrossFadeLayout(@NotNull Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public CrossFadeLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public CrossFadeLayout(Context context, AttributeSet attributeSet, int i7) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    public static void a(CrossFadeLayout crossFadeLayout, ValueAnimator valueAnimator) {
        crossFadeLayout.setCrossFadeProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
        crossFadeLayout.requestLayout();
    }

    private final void setCrossFadeProgress(float f7) {
        this.f70290d = f7;
        View view = this.f70287a;
        if (view != null) {
            view.setAlpha(1.0f - f7);
        }
        View view2 = this.f70288b;
        if (view2 != null) {
            view2.setAlpha(f7);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(@NotNull View view, int i7, @Nullable ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i7, layoutParams);
        if (this.f70287a == null) {
            this.f70287a = view;
            view.setAlpha(1.0f - this.f70290d);
        } else {
            if (this.f70288b != null) {
                throw new IllegalStateException("Only two child views are allowed.");
            }
            this.f70288b = view;
            view.setAlpha(this.f70290d);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(@Nullable ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams;
    }

    @Override // android.view.ViewGroup
    @NotNull
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    @NotNull
    public final ViewGroup.LayoutParams generateLayoutParams(@Nullable AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    @NotNull
    public final ViewGroup.LayoutParams generateLayoutParams(@Nullable ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new ViewGroup.MarginLayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public final boolean getShowsSecondChild() {
        return this.f70291e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        View view;
        View view2;
        if (this.f70290d != 1.0f && (view2 = this.f70287a) != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
            int paddingLeft = getPaddingLeft() + marginLayoutParams.leftMargin;
            int measuredWidth = view2.getMeasuredWidth();
            int paddingTop = getPaddingTop() + marginLayoutParams.topMargin;
            view2.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, view2.getMeasuredHeight() + paddingTop);
        }
        if (this.f70290d == 0.0f || (view = this.f70288b) == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int paddingLeft2 = getPaddingLeft() + marginLayoutParams2.leftMargin;
        int measuredWidth2 = view.getMeasuredWidth();
        int paddingTop2 = getPaddingTop() + marginLayoutParams2.topMargin;
        view.layout(paddingLeft2, paddingTop2, measuredWidth2 + paddingLeft2, view.getMeasuredHeight() + paddingTop2);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        int i9;
        int measuredHeight;
        int measuredHeight2;
        int measuredWidth;
        float f7 = this.f70290d;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        View view = this.f70287a;
        boolean z6 = true;
        if (f7 == 1.0f) {
            view = null;
        }
        if (view != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            measureChildWithMargins(view, i7, 0, i8, 0);
            int measuredWidth2 = view.getMeasuredWidth();
            int i10 = marginLayoutParams.leftMargin;
            i9 = measuredWidth2 + i10 + marginLayoutParams.rightMargin;
            measuredHeight = view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        } else {
            i9 = 0;
            measuredHeight = 0;
        }
        View view2 = this.f70288b;
        if (f7 != 0.0f) {
            z6 = false;
        }
        View view3 = null;
        if (!z6) {
            view3 = view2;
        }
        if (view3 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
            measureChildWithMargins(view3, i7, 0, i8, 0);
            measuredWidth = view3.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin;
            measuredHeight2 = view3.getMeasuredHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
        } else {
            measuredHeight2 = 0;
            measuredWidth = 0;
        }
        float f8 = 1.0f - f7;
        setMeasuredDimension(MathKt.roundToInt((measuredWidth * f7) + (i9 * f8)) + paddingRight + paddingLeft, MathKt.roundToInt((measuredHeight2 * f7) + (measuredHeight * f8)) + paddingBottom + paddingTop);
    }

    public final void setShowsSecondChild(boolean z6) {
        if (this.f70291e == z6) {
            return;
        }
        this.f70291e = z6;
        Animator animator = this.f70289c;
        if (animator != null) {
            animator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f70290d, z6 ? 1.0f : 0.0f);
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: Nk0.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CrossFadeLayout f17262a;

            {
                this.f17262a = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CrossFadeLayout.a(this.f17262a, valueAnimator);
            }
        });
        valueAnimatorOfFloat.start();
        this.f70289c = valueAnimatorOfFloat;
    }
}
