package com.bilibili.playerbizcommon.widget.control;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.OnCompositionLoadedListener;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/e.class */
public final /* synthetic */ class e implements OnCompositionLoadedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LottieComposition f80575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PlayerSeekWidget f80576b;

    public /* synthetic */ e(LottieComposition lottieComposition, PlayerSeekWidget playerSeekWidget) {
        this.f80575a = lottieComposition;
        this.f80576b = playerSeekWidget;
    }

    @Override // com.airbnb.lottie.OnCompositionLoadedListener
    public final void onCompositionLoaded(LottieComposition lottieComposition) {
        PlayerSeekWidget.k(this.f80575a, this.f80576b, lottieComposition);
    }
}
