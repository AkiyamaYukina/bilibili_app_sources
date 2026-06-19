package com.bilibili.music.podcast.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.airbnb.lottie.LottieAnimationView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/MusicViewPager2LoadViewFooter.class */
public final class MusicViewPager2LoadViewFooter extends FrameLayout implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LottieAnimationView f67154a;

    public MusicViewPager2LoadViewFooter(@NotNull Context context) {
        this(context, null);
    }

    public MusicViewPager2LoadViewFooter(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View.inflate(context, 2131499557, this);
        this.f67154a = (LottieAnimationView) findViewById(2131305925);
    }

    @Override // com.bilibili.music.podcast.view.b
    public final void a() {
        LottieAnimationView lottieAnimationView = this.f67154a;
        LottieAnimationView lottieAnimationView2 = lottieAnimationView;
        if (lottieAnimationView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLottieView");
            lottieAnimationView2 = null;
        }
        if (lottieAnimationView2.isAnimating()) {
            LottieAnimationView lottieAnimationView3 = this.f67154a;
            if (lottieAnimationView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLottieView");
                lottieAnimationView3 = null;
            }
            lottieAnimationView3.cancelAnimation();
        }
    }

    @Override // com.bilibili.music.podcast.view.b
    public final void b() {
        LottieAnimationView lottieAnimationView = this.f67154a;
        LottieAnimationView lottieAnimationView2 = lottieAnimationView;
        if (lottieAnimationView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLottieView");
            lottieAnimationView2 = null;
        }
        if (lottieAnimationView2.isAnimating()) {
            return;
        }
        LottieAnimationView lottieAnimationView3 = this.f67154a;
        if (lottieAnimationView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLottieView");
            lottieAnimationView3 = null;
        }
        lottieAnimationView3.playAnimation();
    }

    @Override // com.bilibili.music.podcast.view.b
    @NotNull
    public View getView() {
        return this;
    }
}
