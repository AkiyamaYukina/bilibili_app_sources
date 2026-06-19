package com.bilibili.search2.main;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateInterpolator;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.magicasakura.widgets.TintLinearLayout;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.search2.main.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/d.class */
@StabilityInferred(parameters = 0)
public final class C6037d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final View f86752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final TintLinearLayout f86753b;

    public C6037d(@Nullable View view, @Nullable TintLinearLayout tintLinearLayout) {
        this.f86752a = view;
        this.f86753b = tintLinearLayout;
    }

    public final void a(boolean z6) {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorAlpha;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator interpolator;
        TintLinearLayout tintLinearLayout = this.f86753b;
        LinearLayout.LayoutParams layoutParams = null;
        LinearLayout.LayoutParams layoutParams2 = null;
        if (z6) {
            View view = this.f86752a;
            if (view != null) {
                view.setAlpha(0.0f);
            }
            View view2 = this.f86752a;
            if (view2 != null) {
                view2.setClickable(false);
            }
            ViewGroup.LayoutParams layoutParams3 = tintLinearLayout != null ? tintLinearLayout.getLayoutParams() : null;
            if (layoutParams3 instanceof LinearLayout.LayoutParams) {
                layoutParams2 = (LinearLayout.LayoutParams) layoutParams3;
            }
            if (layoutParams2 != null) {
                layoutParams2.setMarginStart(ListExtentionsKt.toPx(12.0f) + (-ListExtentionsKt.toPx(38.0f)));
                tintLinearLayout.setLayoutParams(layoutParams2);
                return;
            }
            return;
        }
        View view3 = this.f86752a;
        if (view3 != null && (viewPropertyAnimatorAnimate = view3.animate()) != null && (viewPropertyAnimatorAlpha = viewPropertyAnimatorAnimate.alpha(1.0f)) != null && (duration = viewPropertyAnimatorAlpha.setDuration(100L)) != null && (interpolator = duration.setInterpolator(new AccelerateInterpolator())) != null) {
            interpolator.start();
        }
        View view4 = this.f86752a;
        if (view4 != null) {
            view4.setClickable(true);
        }
        ViewGroup.LayoutParams layoutParams4 = tintLinearLayout != null ? tintLinearLayout.getLayoutParams() : null;
        if (layoutParams4 instanceof LinearLayout.LayoutParams) {
            layoutParams = (LinearLayout.LayoutParams) layoutParams4;
        }
        if (layoutParams != null) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(layoutParams.getMarginStart(), 0);
            valueAnimatorOfInt.setDuration(100L);
            valueAnimatorOfInt.setInterpolator(new AccelerateInterpolator());
            final LinearLayout.LayoutParams layoutParams5 = layoutParams;
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(layoutParams5, this) { // from class: com.bilibili.search2.main.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final LinearLayout.LayoutParams f86750a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final C6037d f86751b;

                {
                    this.f86750a = layoutParams5;
                    this.f86751b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    LinearLayout.LayoutParams layoutParams6 = this.f86750a;
                    C6037d c6037d = this.f86751b;
                    layoutParams6.setMarginStart(((Integer) valueAnimator.getAnimatedValue()).intValue());
                    c6037d.f86753b.setLayoutParams(layoutParams6);
                }
            });
            valueAnimatorOfInt.start();
        }
    }
}
