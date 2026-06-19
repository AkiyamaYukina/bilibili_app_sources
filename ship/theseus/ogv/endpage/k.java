package com.bilibili.ship.theseus.ogv.endpage;

import androidx.compose.runtime.internal.StabilityInferred;
import javax.inject.Inject;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.service.report.IReporterService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/endpage/k.class */
@StabilityInferred(parameters = 0)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f92097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final IReporterService f92098b;

    @Inject
    public k(@NotNull a aVar, @NotNull IReporterService iReporterService) {
        this.f92097a = aVar;
        this.f92098b = iReporterService;
    }
}
