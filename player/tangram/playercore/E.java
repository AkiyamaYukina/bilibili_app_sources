package com.bilibili.player.tangram.playercore;

import G3.B0;
import G3.C0;
import androidx.compose.animation.C3357h;
import com.bilibili.app.gemini.base.resolver.qn.AutoQualityControl;
import com.bilibili.app.gemini.base.resolver.qn.QualityScene;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/E.class */
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final StateFlow<ClosedRange<com.bilibili.player.tangram.basic.a>> f79345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final StateFlow<ClosedRange<com.bilibili.player.tangram.basic.a>> f79346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final StateFlow<ClosedRange<com.bilibili.player.tangram.basic.a>> f79347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Function2<u, com.bilibili.player.tangram.basic.a, com.bilibili.player.tangram.basic.a> f79348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Function1<AutoQualityControl, Unit> f79349e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final z f79350f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f79351g;

    @NotNull
    public final Function0<QualityScene> h;

    public E() {
        this(null, null, null, null, null, null, null, 255);
    }

    public E(MutableStateFlow mutableStateFlow, MutableStateFlow mutableStateFlow2, MutableStateFlow mutableStateFlow3, com.bilibili.ship.theseus.united.player.a aVar, z zVar, CH.a aVar2, com.bilibili.ship.theseus.united.player.b bVar, int i7) {
        mutableStateFlow = (i7 & 1) != 0 ? null : mutableStateFlow;
        mutableStateFlow2 = (i7 & 2) != 0 ? StateFlowKt.MutableStateFlow(RangesKt.rangeTo(new com.bilibili.player.tangram.basic.a(0), new com.bilibili.player.tangram.basic.a(0))) : mutableStateFlow2;
        mutableStateFlow3 = (i7 & 4) != 0 ? StateFlowKt.MutableStateFlow(RangesKt.rangeTo(new com.bilibili.player.tangram.basic.a(0), new com.bilibili.player.tangram.basic.a(Integer.MAX_VALUE))) : mutableStateFlow3;
        VideoQualityStrategy$1 videoQualityStrategy$1 = VideoQualityStrategy$1.INSTANCE;
        aVar = (i7 & 16) != 0 ? null : aVar;
        zVar = (i7 & 32) != 0 ? null : zVar;
        aVar2 = (i7 & 64) != 0 ? new B0(9) : aVar2;
        Function0<QualityScene> c02 = (i7 & 128) != 0 ? new C0(10) : bVar;
        this.f79345a = mutableStateFlow;
        this.f79346b = mutableStateFlow2;
        this.f79347c = mutableStateFlow3;
        this.f79348d = videoQualityStrategy$1;
        this.f79349e = aVar;
        this.f79350f = zVar;
        this.f79351g = aVar2;
        this.h = c02;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        E e7 = (E) obj;
        return Intrinsics.areEqual(this.f79345a, e7.f79345a) && Intrinsics.areEqual(this.f79346b, e7.f79346b) && Intrinsics.areEqual(this.f79347c, e7.f79347c) && Intrinsics.areEqual(this.f79348d, e7.f79348d) && Intrinsics.areEqual(this.f79349e, e7.f79349e) && Intrinsics.areEqual(this.f79350f, e7.f79350f) && Intrinsics.areEqual(this.f79351g, e7.f79351g) && Intrinsics.areEqual(this.h, e7.h);
    }

    public final int hashCode() {
        int iHashCode = 0;
        StateFlow<ClosedRange<com.bilibili.player.tangram.basic.a>> stateFlow = this.f79345a;
        int iA = androidx.core.content.b.a(this.f79347c, androidx.core.content.b.a(this.f79346b, (stateFlow == null ? 0 : stateFlow.hashCode()) * 31, 31), 31);
        int iHashCode2 = this.f79348d.hashCode();
        Function1<AutoQualityControl, Unit> function1 = this.f79349e;
        int iHashCode3 = function1 == null ? 0 : function1.hashCode();
        z zVar = this.f79350f;
        if (zVar != null) {
            iHashCode = zVar.hashCode();
        }
        return this.h.hashCode() + C3357h.a((((((iHashCode2 + iA) * 31) + iHashCode3) * 31) + iHashCode) * 31, 31, this.f79351g);
    }

    @NotNull
    public final String toString() {
        return "VideoQualityStrategy(rangeForInitialQualityWhenAuto=" + this.f79345a + ", specialQualityHalfRangeFlow=" + this.f79346b + ", autoQualityRangeFlow=" + this.f79347c + ", autoQualityStarter=" + this.f79348d + ", onQualityConfigChanged=" + this.f79349e + ", prioritizedQuality=" + this.f79350f + ", onStopHalfSpecialAuto=" + this.f79351g + ", qualityScene=" + this.h + ")";
    }
}
