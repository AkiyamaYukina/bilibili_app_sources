package com.bilibili.ship.theseus.united.page.intro.module.season;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.e0;
import java.util.List;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.receive.UpdateVideoDetailState;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.send.VideoDetailStateChange;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/E.class */
@StabilityInferred(parameters = 0)
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<a> f101452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final StateFlow<a> f101453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<V> f101454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final SharedFlow<V> f101455d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Boolean> f101456e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final SharedFlow<Boolean> f101457f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<VideoDetailStateChange.CheckInState> f101458g;

    @NotNull
    public final SharedFlow<VideoDetailStateChange.CheckInState> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Unit> f101459i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final SharedFlow<Unit> f101460j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f101461k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f101462l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<UpdateVideoDetailState.CheckInState> f101463m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final SharedFlow<UpdateVideoDetailState.CheckInState> f101464n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Pair<Long, Long>> f101465o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final SharedFlow<Pair<Long, Long>> f101466p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public String f101467q;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/E$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final C6353o f101468a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final List<C6353o> f101469b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final C f101470c;

        public a(@NotNull C6353o c6353o, @NotNull List<C6353o> list, @NotNull C c7) {
            this.f101468a = c6353o;
            this.f101469b = list;
            this.f101470c = c7;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f101468a, aVar.f101468a) && Intrinsics.areEqual(this.f101469b, aVar.f101469b) && Intrinsics.areEqual(this.f101470c, aVar.f101470c);
        }

        public final int hashCode() {
            return this.f101470c.hashCode() + e0.a(this.f101468a.hashCode() * 31, 31, this.f101469b);
        }

        @NotNull
        public final String toString() {
            return "Data(panelSeasonData=" + this.f101468a + ", allSeasonData=" + this.f101469b + ", panelData=" + this.f101470c + ")";
        }
    }

    @Inject
    public E() {
        MutableStateFlow<a> MutableStateFlow = StateFlowKt.MutableStateFlow((Object) null);
        this.f101452a = MutableStateFlow;
        this.f101453b = FlowKt.asStateFlow(MutableStateFlow);
        BufferOverflow bufferOverflow = BufferOverflow.DROP_OLDEST;
        MutableSharedFlow<V> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, (Object) null);
        this.f101454c = mutableSharedFlowMutableSharedFlow$default;
        this.f101455d = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<Boolean> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, (Object) null);
        this.f101456e = mutableSharedFlowMutableSharedFlow$default2;
        this.f101457f = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        MutableSharedFlow<VideoDetailStateChange.CheckInState> mutableSharedFlowMutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, (Object) null);
        this.f101458g = mutableSharedFlowMutableSharedFlow$default3;
        this.h = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default3);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default4 = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, (Object) null);
        this.f101459i = mutableSharedFlowMutableSharedFlow$default4;
        this.f101460j = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default4);
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.f101461k = MutableStateFlow2;
        this.f101462l = FlowKt.asStateFlow(MutableStateFlow2);
        MutableSharedFlow<UpdateVideoDetailState.CheckInState> mutableSharedFlowMutableSharedFlow$default5 = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, (Object) null);
        this.f101463m = mutableSharedFlowMutableSharedFlow$default5;
        this.f101464n = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default5);
        MutableSharedFlow<Pair<Long, Long>> mutableSharedFlowMutableSharedFlow$default6 = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, (Object) null);
        this.f101465o = mutableSharedFlowMutableSharedFlow$default6;
        this.f101466p = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default6);
    }
}
