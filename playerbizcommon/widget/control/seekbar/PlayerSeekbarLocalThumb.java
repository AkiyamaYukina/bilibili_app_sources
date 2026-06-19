package com.bilibili.playerbizcommon.widget.control.seekbar;

import com.airbnb.lottie.LottieComposition;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/seekbar/PlayerSeekbarLocalThumb.class */
public final class PlayerSeekbarLocalThumb implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public d f80585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public f f80586b;

    @Override // com.bilibili.playerbizcommon.widget.control.seekbar.b
    public final void a(int i7) {
        d dVar = this.f80585a;
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
        d dVar = this.f80585a;
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
        d dVar = this.f80585a;
        return dVar != null ? dVar.isAnimating() : false;
    }

    @Override // com.bilibili.playerbizcommon.widget.control.seekbar.b
    public final void d(boolean z6) {
        d dVar = this.f80585a;
        if (dVar != null) {
            dVar.m(z6);
        }
    }

    @Override // com.bilibili.playerbizcommon.widget.control.seekbar.b
    @Nullable
    public final Object e(@Nullable e eVar, @NotNull Continuation<? super Boolean> continuation) {
        BLog.i("SeekbarThumb-Local", "load start");
        return BuildersKt.withContext(Dispatchers.getIO(), new PlayerSeekbarLocalThumb$load$2(this, null), continuation);
    }

    @Override // com.bilibili.playerbizcommon.widget.control.seekbar.b
    public final void f() {
        f fVar = this.f80586b;
        if (fVar != null) {
            fVar.b(this.f80585a);
        }
    }

    @Override // com.bilibili.playerbizcommon.widget.control.seekbar.b
    public final void g() {
        d dVar = this.f80585a;
        if (dVar != null) {
            dVar.cancelAnimation();
        }
    }

    @Override // com.bilibili.playerbizcommon.widget.control.seekbar.b
    public final void h(@Nullable f fVar) {
        this.f80586b = fVar;
    }

    @Override // com.bilibili.playerbizcommon.widget.control.seekbar.b
    public final void onProgressChanged(int i7) {
        d dVar = this.f80585a;
        if (dVar != null) {
            dVar.onProgressChanged(i7);
        }
    }

    @Override // com.bilibili.playerbizcommon.widget.control.seekbar.b
    public final void reset() {
        d dVar = this.f80585a;
        if (dVar != null) {
            dVar.cancelAnimation();
        }
        this.f80585a = null;
        this.f80586b = null;
    }
}
