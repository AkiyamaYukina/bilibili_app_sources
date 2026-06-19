package com.bilibili.search2.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/widget/VerifyAvatarFrameLayout.class */
@StabilityInferred(parameters = 0)
public final class VerifyAvatarFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final ImageView f88974a;

    @JvmOverloads
    public VerifyAvatarFrameLayout(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View viewInflate = LayoutInflater.from(context).inflate(2131494817, (ViewGroup) this, true);
        viewInflate.findViewById(2131296796);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Al.a.d);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        int dimensionPixelOffset2 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        ImageView imageView = (ImageView) viewInflate.findViewById(2131316099);
        this.f88974a = imageView;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) (imageView != null ? imageView.getLayoutParams() : null);
        layoutParams.rightMargin = dimensionPixelOffset;
        layoutParams.bottomMargin = dimensionPixelOffset2;
        ImageView imageView2 = this.f88974a;
        if (imageView2 != null) {
            imageView2.setLayoutParams(layoutParams);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void setVerifyImg(int i7) {
        ImageView imageView = this.f88974a;
        if (imageView == null) {
            return;
        }
        imageView.setImageResource(i7);
        this.f88974a.setVisibility(0);
    }

    public final void setVerifyImgVisibility(int i7) {
        ImageView imageView = this.f88974a;
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(i7);
    }
}
