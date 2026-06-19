package com.bilibili.ogv.kmm.operation.reservation;

import androidx.compose.runtime.internal.StabilityInferred;
import javax.inject.Inject;
import kntr.common.trio.toast.Toaster;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/reservation/b.class */
@StabilityInferred(parameters = 0)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ogv.kmm.operation.reservation.api.a f68656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Toaster f68657b;

    @Inject
    public b(@NotNull com.bilibili.ogv.kmm.operation.reservation.api.a aVar, @NotNull Toaster toaster) {
        this.f68656a = aVar;
        this.f68657b = toaster;
    }
}
