package com.bilibili.music.podcast.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import com.airbnb.lottie.LottieAnimationView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/MusicDragLoadViewHeader.class */
public final class MusicDragLoadViewHeader extends FrameLayout implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LottieAnimationView f67082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f67083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FrameLayout f67084c;

    public MusicDragLoadViewHeader(@NotNull Context context) {
        this(context, null);
    }

    public MusicDragLoadViewHeader(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View.inflate(context, 2131499558, this);
        this.f67084c = (FrameLayout) findViewById(2131298661);
        this.f67082a = (LottieAnimationView) findViewById(2131305925);
        this.f67083b = (TextView) findViewById(2131302649);
        FrameLayout frameLayout = this.f67084c;
        FrameLayout frameLayout2 = frameLayout;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContent");
            frameLayout2 = null;
        }
        FrameLayout frameLayout3 = this.f67084c;
        FrameLayout frameLayout4 = frameLayout3;
        if (frameLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContent");
            frameLayout4 = null;
        }
        ViewGroup.LayoutParams layoutParams = frameLayout4.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = null;
        if (layoutParams != null) {
            FrameLayout frameLayout5 = this.f67084c;
            if (frameLayout5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContent");
                frameLayout5 = null;
            }
            layoutParams.height = frameLayout5.getContext().getResources().getDimensionPixelSize(2131166705);
            layoutParams2 = layoutParams;
        }
        frameLayout2.setLayoutParams(layoutParams2);
    }

    @Override // com.bilibili.music.podcast.view.c
    @NotNull
    public View getView() {
        return this;
    }

    @Override // com.bilibili.music.podcast.view.c
    public void setRefreshState(boolean z6) {
        if (!z6) {
            LottieAnimationView lottieAnimationView = this.f67082a;
            LottieAnimationView lottieAnimationView2 = lottieAnimationView;
            if (lottieAnimationView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLottieView");
                lottieAnimationView2 = null;
            }
            if (lottieAnimationView2.isAnimating()) {
                LottieAnimationView lottieAnimationView3 = this.f67082a;
                LottieAnimationView lottieAnimationView4 = lottieAnimationView3;
                if (lottieAnimationView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mLottieView");
                    lottieAnimationView4 = null;
                }
                lottieAnimationView4.cancelAnimation();
            }
            LottieAnimationView lottieAnimationView5 = this.f67082a;
            LottieAnimationView lottieAnimationView6 = lottieAnimationView5;
            if (lottieAnimationView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLottieView");
                lottieAnimationView6 = null;
            }
            lottieAnimationView6.setVisibility(8);
            TextView textView = this.f67083b;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mHeaderText");
                textView = null;
            }
            textView.setVisibility(0);
            return;
        }
        LottieAnimationView lottieAnimationView7 = this.f67082a;
        LottieAnimationView lottieAnimationView8 = lottieAnimationView7;
        if (lottieAnimationView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLottieView");
            lottieAnimationView8 = null;
        }
        lottieAnimationView8.setVisibility(0);
        TextView textView2 = this.f67083b;
        TextView textView3 = textView2;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHeaderText");
            textView3 = null;
        }
        textView3.setVisibility(8);
        LottieAnimationView lottieAnimationView9 = this.f67082a;
        LottieAnimationView lottieAnimationView10 = lottieAnimationView9;
        if (lottieAnimationView9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLottieView");
            lottieAnimationView10 = null;
        }
        if (lottieAnimationView10.isAnimating()) {
            return;
        }
        LottieAnimationView lottieAnimationView11 = this.f67082a;
        if (lottieAnimationView11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLottieView");
            lottieAnimationView11 = null;
        }
        lottieAnimationView11.playAnimation();
    }

    @Override // com.bilibili.music.podcast.view.c
    public void setThemeColor(@ColorInt int i7) {
        TextView textView = this.f67083b;
        TextView textView2 = textView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHeaderText");
            textView2 = null;
        }
        textView2.setTextColor(i7);
    }
}
