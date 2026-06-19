package com.bilibili.pegasus.holders.bannerv8;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comm.list.widget.banneradapter.BannerController;
import com.bilibili.app.comm.list.widget.swiper.Indicator;
import com.bilibili.app.comm.list.widget.swiper.SwiperBanner;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/bannerv8/y.class */
@StabilityInferred(parameters = 0)
public final class y extends BannerController {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final SwiperBanner f77835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f77836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final l f77837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final p f77838e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public String f77839f;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/bannerv8/y$a.class */
    public static final class a implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f77840a;

        public a(View view) {
            this.f77840a = view;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            this.f77840a.setVisibility(8);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }
    }

    public y(@NotNull SwiperBanner swiperBanner, int i7, @NotNull l lVar, @NotNull p pVar) {
        super(swiperBanner);
        this.f77835b = swiperBanner;
        this.f77836c = i7;
        this.f77837d = lVar;
        this.f77838e = pVar;
        this.f77839f = "IdentityBannerController";
    }

    public final int getBannerScrollState() {
        S9.o.a(this.f77839f, " :getBannerScrollState", "IdentityBannerController");
        return super.getBannerScrollState();
    }

    public final int getItemCount() {
        S9.o.a(this.f77839f, " :getItemCount", "IdentityBannerController");
        return super.getItemCount();
    }

    public final void reportItemClick(int i7) {
        S9.o.a(this.f77839f, " :reportItemClick", "IdentityBannerController");
        super.reportItemClick(i7);
        this.f77838e.invoke(Integer.valueOf(i7));
    }

    public final void setIndicatorVisible(boolean z6) {
        View contentView;
        SwiperBanner swiperBanner = this.f77835b;
        Indicator indicator = swiperBanner.getIndicator();
        if (indicator == null || (contentView = indicator.getContentView()) == null) {
            return;
        }
        BLog.i("IdentityBannerController", this.f77839f + " :setIndicatorVisible show:" + z6);
        if (this.f77837d.a(this, this.f77836c, BannerPermission.INDICATOR)) {
            if (swiperBanner.getItemCount() == 1) {
                Indicator indicator2 = swiperBanner.getIndicator();
                if (indicator2 != null) {
                    indicator2.setVisible(false);
                    return;
                }
                return;
            }
            if (z6 && contentView.getVisibility() == 0) {
                return;
            }
            if (z6 || contentView.getVisibility() == 0) {
                contentView.clearAnimation();
                if (z6) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                    alphaAnimation.setDuration(300L);
                    contentView.setVisibility(0);
                    contentView.startAnimation(alphaAnimation);
                    return;
                }
                AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation2.setDuration(300L);
                alphaAnimation2.setAnimationListener(new a(contentView));
                contentView.startAnimation(alphaAnimation2);
            }
        }
    }

    public final void startAutoLoop(long j7) {
        BLog.i("IdentityBannerController", this.f77839f + " :startAutoLoop: delay:" + j7);
        if (this.f77837d.a(this, this.f77836c, BannerPermission.LOOP)) {
            SwiperBanner swiperBanner = this.f77835b;
            if (swiperBanner.getViewPager2().getScrollState() == 0) {
                if (swiperBanner.getItemCount() == 1) {
                    return;
                }
                super.startAutoLoop(j7);
                return;
            }
            BLog.i("IdentityBannerController", this.f77839f + " :startAutoLoop failed, current scroll state is " + swiperBanner + ".viewPager2.scrollState");
        }
    }

    public final void stopAutoLoop() {
        S9.o.a(this.f77839f, " :stopAutoLoop", "IdentityBannerController");
        if (this.f77837d.a(this, this.f77836c, BannerPermission.LOOP)) {
            super.stopAutoLoop();
        }
    }
}
