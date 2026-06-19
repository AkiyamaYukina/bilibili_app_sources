package com.bilibili.ship.theseus.united.page.autofloat;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import javax.inject.Inject;
import kotlin.Unit;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.service.interact.biz.model.ChronosThumbnailInfo;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/autofloat/a.class */
@StabilityInferred(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Unit> f98977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final SharedFlow<Unit> f98978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<String> f98979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final SharedFlow<String> f98980d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Unit> f98981e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final SharedFlow<Unit> f98982f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Unit> f98983g;

    @NotNull
    public final SharedFlow<Unit> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<List<ChronosThumbnailInfo.WatchPoint>> f98984i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final SharedFlow<List<ChronosThumbnailInfo.WatchPoint>> f98985j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<List<ChronosThumbnailInfo.WatchPoint>> f98986k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final SharedFlow<List<ChronosThumbnailInfo.WatchPoint>> f98987l;

    @Inject
    public a() {
        BufferOverflow bufferOverflow = BufferOverflow.DROP_OLDEST;
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, (Object) null);
        this.f98977a = mutableSharedFlowMutableSharedFlow$default;
        this.f98978b = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<String> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, (Object) null);
        this.f98979c = mutableSharedFlowMutableSharedFlow$default2;
        this.f98980d = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, (Object) null);
        this.f98981e = mutableSharedFlowMutableSharedFlow$default3;
        this.f98982f = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default3);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default4 = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, (Object) null);
        this.f98983g = mutableSharedFlowMutableSharedFlow$default4;
        this.h = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default4);
        MutableSharedFlow<List<ChronosThumbnailInfo.WatchPoint>> mutableSharedFlowMutableSharedFlow$default5 = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, (Object) null);
        this.f98984i = mutableSharedFlowMutableSharedFlow$default5;
        this.f98985j = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default5);
        MutableSharedFlow<List<ChronosThumbnailInfo.WatchPoint>> mutableSharedFlowMutableSharedFlow$default6 = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, (Object) null);
        this.f98986k = mutableSharedFlowMutableSharedFlow$default6;
        this.f98987l = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default6);
    }
}
