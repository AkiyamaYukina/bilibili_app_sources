package com.bilibili.ship.theseus.ogv.endpage;

import androidx.compose.runtime.internal.StabilityInferred;
import javax.inject.Inject;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.service.report.IReporterService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/endpage/c.class */
@StabilityInferred(parameters = 0)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f92077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final IReporterService f92078b;

    @Inject
    public c(@NotNull a aVar, @NotNull IReporterService iReporterService) {
        this.f92077a = aVar;
        this.f92078b = iReporterService;
    }
}
