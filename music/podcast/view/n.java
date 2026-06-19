package com.bilibili.music.podcast.view;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieTask;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/n.class */
public final class n implements Function1<Throwable, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LottieTask<LottieComposition> f67309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f67310b;

    public n(LottieTask lottieTask, o oVar) {
        this.f67309a = lottieTask;
        this.f67310b = oVar;
    }

    public final Object invoke(Object obj) {
        this.f67309a.removeListener(this.f67310b);
        return Unit.INSTANCE;
    }
}
