package com.bilibili.studio.videoeditor.widgets;

import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.OnCompositionLoadedListener;
import com.bilibili.base.BiliContext;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/widgets/l.class */
public final class l implements OnCompositionLoadedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlayerSeekBar f110452a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/widgets/l$a.class */
    public final class a implements OnCompositionLoadedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LottieComposition f110453a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l f110454b;

        public a(l lVar, LottieComposition lottieComposition) {
            this.f110454b = lVar;
            this.f110453a = lottieComposition;
        }

        @Override // com.airbnb.lottie.OnCompositionLoadedListener
        public final void onCompositionLoaded(@Nullable LottieComposition lottieComposition) {
            LottieComposition lottieComposition2 = this.f110453a;
            if (lottieComposition2 != null) {
                l lVar = this.f110454b;
                lVar.f110452a.f110415b = new m(lottieComposition2, lottieComposition);
                PlayerSeekBar playerSeekBar = lVar.f110452a;
                playerSeekBar.setThumb(playerSeekBar.f110415b);
            }
        }
    }

    public l(PlayerSeekBar playerSeekBar) {
        this.f110452a = playerSeekBar;
    }

    @Override // com.airbnb.lottie.OnCompositionLoadedListener
    public final void onCompositionLoaded(@Nullable LottieComposition lottieComposition) {
        LottieComposition.Factory.fromAssetFileName(BiliContext.application(), "player_seek_bar_tv_2.json", new a(this, lottieComposition));
    }
}
