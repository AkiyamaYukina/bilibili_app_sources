package com.bilibili.playerbizcommonv2.danmaku.input;

import W60.d0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.playerbizcommonv2.danmaku.input.panel.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/input/e.class */
@StabilityInferred(parameters = 2)
public final class e<T extends com.bilibili.playerbizcommonv2.danmaku.input.panel.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f80984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final d0 f80985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final b f80986c;

    public e(int i7, @NotNull d0 d0Var, @NotNull b bVar) {
        this.f80984a = i7;
        this.f80985b = d0Var;
        this.f80986c = bVar;
    }

    @Nullable
    public final T a() {
        return (T) this.f80985b.invoke(this);
    }

    public final void b() {
        this.f80986c.invoke(this);
    }
}
