package com.bilibili.opd.app.bizcommon.radar.core;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.opd.app.bizcommon.radar.data.RadarReportEvent;
import java.util.LinkedList;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/core/b.class */
@StabilityInferred(parameters = 0)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f74188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final BlockingQueue<RadarReportEvent> f74189b = new LinkedBlockingDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final LinkedList<RadarReportEvent> f74190c = new LinkedList<>();

    public b(int i7) {
        this.f74188a = i7;
    }
}
