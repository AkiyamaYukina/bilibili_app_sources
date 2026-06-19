package com.bilibili.ship.theseus.ogv.ipheadset;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import com.airbnb.lottie.LottieAnimationView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.injection.InjectPlayerService;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.widget.AbsFunctionWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/ipheadset/a.class */
@StabilityInferred(parameters = 0)
public final class a extends AbsFunctionWidget {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f93953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LottieAnimationView f93954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LottieAnimationView f93955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @InjectPlayerService
    private AbsFunctionWidgetService f93956d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final C0736a f93957e;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.ipheadset.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/ipheadset/a$a.class */
    public static final class C0736a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f93958a;

        public C0736a(a aVar) {
            this.f93958a = aVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            AbsFunctionWidgetService absFunctionWidgetService = this.f93958a.f93956d;
            AbsFunctionWidgetService absFunctionWidgetService2 = absFunctionWidgetService;
            if (absFunctionWidgetService == null) {
                Intrinsics.throwUninitializedPropertyAccessException("functionWidgetService");
                absFunctionWidgetService2 = null;
            }
            absFunctionWidgetService2.hideWidget(this.f93958a.getToken());
        }
    }

    public a(@NotNull Context context, boolean z6) {
        super(context);
        this.f93953a = z6;
        this.f93957e = new C0736a(this);
    }

    @NotNull
    public final View createContentView(@NotNull Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(2131500461, (ViewGroup) null);
        this.f93954b = (LottieAnimationView) viewInflate.findViewById(2131302655);
        this.f93955c = (LottieAnimationView) viewInflate.findViewById(2131302656);
        return viewInflate;
    }

    public final void onRelease() {
    }

    public final void onWidgetShow(@Nullable AbsFunctionWidget.Configuration configuration) {
        LottieAnimationView lottieAnimationView = this.f93954b;
        LottieAnimationView lottieAnimationView2 = lottieAnimationView;
        if (lottieAnimationView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPauseView");
            lottieAnimationView2 = null;
        }
        lottieAnimationView2.setRepeatCount(0);
        LottieAnimationView lottieAnimationView3 = this.f93954b;
        LottieAnimationView lottieAnimationView4 = lottieAnimationView3;
        if (lottieAnimationView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPauseView");
            lottieAnimationView4 = null;
        }
        C0736a c0736a = this.f93957e;
        lottieAnimationView4.addAnimatorListener(c0736a);
        LottieAnimationView lottieAnimationView5 = this.f93955c;
        LottieAnimationView lottieAnimationView6 = lottieAnimationView5;
        if (lottieAnimationView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayView");
            lottieAnimationView6 = null;
        }
        lottieAnimationView6.setRepeatCount(0);
        LottieAnimationView lottieAnimationView7 = this.f93955c;
        LottieAnimationView lottieAnimationView8 = lottieAnimationView7;
        if (lottieAnimationView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayView");
            lottieAnimationView8 = null;
        }
        lottieAnimationView8.addAnimatorListener(c0736a);
        if (this.f93953a) {
            LottieAnimationView lottieAnimationView9 = this.f93954b;
            LottieAnimationView lottieAnimationView10 = lottieAnimationView9;
            if (lottieAnimationView9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPauseView");
                lottieAnimationView10 = null;
            }
            lottieAnimationView10.setVisibility(0);
            LottieAnimationView lottieAnimationView11 = this.f93955c;
            LottieAnimationView lottieAnimationView12 = lottieAnimationView11;
            if (lottieAnimationView11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayView");
                lottieAnimationView12 = null;
            }
            lottieAnimationView12.setVisibility(8);
            LottieAnimationView lottieAnimationView13 = this.f93954b;
            if (lottieAnimationView13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPauseView");
                lottieAnimationView13 = null;
            }
            lottieAnimationView13.playAnimation();
        } else {
            LottieAnimationView lottieAnimationView14 = this.f93954b;
            LottieAnimationView lottieAnimationView15 = lottieAnimationView14;
            if (lottieAnimationView14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPauseView");
                lottieAnimationView15 = null;
            }
            lottieAnimationView15.setVisibility(8);
            LottieAnimationView lottieAnimationView16 = this.f93955c;
            LottieAnimationView lottieAnimationView17 = lottieAnimationView16;
            if (lottieAnimationView16 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayView");
                lottieAnimationView17 = null;
            }
            lottieAnimationView17.setVisibility(0);
            LottieAnimationView lottieAnimationView18 = this.f93955c;
            if (lottieAnimationView18 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayView");
                lottieAnimationView18 = null;
            }
            lottieAnimationView18.playAnimation();
        }
        super.onWidgetShow(configuration);
    }
}
