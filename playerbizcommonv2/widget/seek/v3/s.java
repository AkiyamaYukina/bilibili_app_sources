package com.bilibili.playerbizcommonv2.widget.seek.v3;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/seek/v3/s.class */
@StabilityInferred(parameters = 1)
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f83067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f83068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f83069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Function1<Float, Boolean> f83070d;

    /* JADX WARN: Multi-variable type inference failed */
    public s(int i7, int i8, boolean z6, @NotNull Function1<? super Float, Boolean> function1) {
        this.f83067a = i7;
        this.f83068b = i8;
        this.f83069c = z6;
        this.f83070d = function1;
    }
}
