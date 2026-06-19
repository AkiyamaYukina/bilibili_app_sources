package com.bilibili.pegasus.widget;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/widget/i.class */
public final class i implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecommendBar f79153a;

    public i(RecommendBar recommendBar) {
        this.f79153a = recommendBar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.f79153a.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        RecommendBar recommendBar = this.f79153a;
        Drawable background = recommendBar.getBackground();
        GradientDrawable gradientDrawable = null;
        GradientDrawable gradientDrawable2 = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        if (gradientDrawable2 != null) {
            RecommendBar recommendBar2 = this.f79153a;
            gradientDrawable2.setCornerRadius(Math.max(recommendBar2.getMeasuredHeight() / 2.0f, recommendBar2.f79126g));
            gradientDrawable = gradientDrawable2;
        }
        recommendBar.setBackgroundDrawable(gradientDrawable);
    }
}
