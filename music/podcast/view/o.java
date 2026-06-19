package com.bilibili.music.podcast.view;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieListener;
import kotlin.Result;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/o.class */
public final class o<T> implements LottieListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ref.BooleanRef f67311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CancellableContinuationImpl f67312b;

    public o(Ref.BooleanRef booleanRef, CancellableContinuationImpl cancellableContinuationImpl) {
        this.f67311a = booleanRef;
        this.f67312b = cancellableContinuationImpl;
    }

    @Override // com.airbnb.lottie.LottieListener
    public final void onResult(Object obj) {
        LottieComposition lottieComposition = (LottieComposition) obj;
        Ref.BooleanRef booleanRef = this.f67311a;
        if (booleanRef.element) {
            return;
        }
        booleanRef.element = true;
        this.f67312b.resumeWith(Result.constructor-impl(lottieComposition));
    }
}
