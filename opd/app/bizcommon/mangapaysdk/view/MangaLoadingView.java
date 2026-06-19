package com.bilibili.opd.app.bizcommon.mangapaysdk.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.bilibili.droid.DimenUtilsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mangapaysdk/view/MangaLoadingView.class */
public final class MangaLoadingView extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ImageView f74074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Animation f74075b;

    public MangaLoadingView(@NotNull Context context) {
        super(context);
        ImageView imageView = new ImageView(getContext());
        this.f74074a = imageView;
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        this.f74075b = rotateAnimation;
        rotateAnimation.setRepeatCount(-1);
        rotateAnimation.setDuration(1000L);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        imageView.setAnimation(rotateAnimation);
        setBackground(ContextCompat.getDrawable(getContext(), 2131241750));
        imageView.setImageResource(2131233365);
        addView(imageView);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        ((ViewGroup.MarginLayoutParams) layoutParams2).width = -1;
        ((ViewGroup.MarginLayoutParams) layoutParams2).height = -1;
        layoutParams2.setMargins(DimenUtilsKt.dpToPx(5.0d), DimenUtilsKt.dpToPx(5.0d), DimenUtilsKt.dpToPx(4.0d), DimenUtilsKt.dpToPx(4.0d));
        imageView.setLayoutParams(layoutParams2);
    }

    public MangaLoadingView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ImageView imageView = new ImageView(getContext());
        this.f74074a = imageView;
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        this.f74075b = rotateAnimation;
        rotateAnimation.setRepeatCount(-1);
        rotateAnimation.setDuration(1000L);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        imageView.setAnimation(rotateAnimation);
        setBackground(ContextCompat.getDrawable(getContext(), 2131241750));
        imageView.setImageResource(2131233365);
        addView(imageView);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        ((ViewGroup.MarginLayoutParams) layoutParams2).width = -1;
        ((ViewGroup.MarginLayoutParams) layoutParams2).height = -1;
        layoutParams2.setMargins(DimenUtilsKt.dpToPx(5.0d), DimenUtilsKt.dpToPx(5.0d), DimenUtilsKt.dpToPx(4.0d), DimenUtilsKt.dpToPx(4.0d));
        imageView.setLayoutParams(layoutParams2);
    }
}
