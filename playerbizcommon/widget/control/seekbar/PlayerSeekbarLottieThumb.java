package com.bilibili.playerbizcommon.widget.control.seekbar;

import com.airbnb.lottie.LottieComposition;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/seekbar/PlayerSeekbarLottieThumb.class */
public final class PlayerSeekbarLottieThumb implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public f f80593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public d f80594b;

    @Override // com.bilibili.playerbizcommon.widget.control.seekbar.b
    public final void a(int i7) {
        d dVar = this.f80594b;
        if (dVar != null) {
            dVar.f80631x = i7;
            dVar.f80632y = false;
            LottieComposition lottieComposition = dVar.f80629v;
            if (lottieComposition != null) {
                dVar.setComposition(lottieComposition);
                dVar.setProgress(0.5f);
            }
        }
    }

    @Override // com.bilibili.playerbizcommon.widget.control.seekbar.b
    public final void b() {
        d dVar = this.f80594b;
        if (dVar != null) {
            dVar.f80632y = true;
            LottieComposition lottieComposition = dVar.f80630w;
            if (lottieComposition != null) {
                dVar.setComposition(lottieComposition);
                dVar.playAnimation();
            }
        }
    }

    @Override // com.bilibili.playerbizcommon.widget.control.seekbar.b
    public final boolean c() {
        d dVar = this.f80594b;
        return dVar != null ? dVar.isAnimating() : false;
    }

    @Override // com.bilibili.playerbizcommon.widget.control.seekbar.b
    public final void d(boolean z6) {
        d dVar = this.f80594b;
        if (dVar != null) {
            dVar.m(z6);
        }
    }

    @Override // com.bilibili.playerbizcommon.widget.control.seekbar.b
    @Nullable
    public final Object e(@Nullable e eVar, @NotNull Continuation<? super Boolean> continuation) {
        return eVar == null ? Boxing.boxBoolean(false) : BuildersKt.withContext(Dispatchers.getIO(), new PlayerSeekbarLottieThumb$load$2(eVar, this, null), continuation);
    }

    @Override // com.bilibili.playerbizcommon.widget.control.seekbar.b
    public final void f() {
        f fVar = this.f80593a;
        if (fVar != null) {
            fVar.b(this.f80594b);
        }
    }

    @Override // com.bilibili.playerbizcommon.widget.control.seekbar.b
    public final void g() {
        d dVar = this.f80594b;
        if (dVar != null) {
            dVar.cancelAnimation();
        }
    }

    @Override // com.bilibili.playerbizcommon.widget.control.seekbar.b
    public final void h(@Nullable f fVar) {
        this.f80593a = fVar;
    }

    @Override // com.bilibili.playerbizcommon.widget.control.seekbar.b
    public final void onProgressChanged(int i7) {
        d dVar = this.f80594b;
        if (dVar != null) {
            dVar.onProgressChanged(i7);
        }
    }

    @Override // com.bilibili.playerbizcommon.widget.control.seekbar.b
    public final void reset() {
        this.f80594b = null;
        this.f80593a = null;
    }
}
