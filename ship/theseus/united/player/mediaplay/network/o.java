package com.bilibili.ship.theseus.united.player.mediaplay.network;

import F3.C1757j0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.player.mediaplay.network.d;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/network/o.class */
@StabilityInferred(parameters = 0)
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f104589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.h f104590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final IPlayerCoreService f104591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final TheseusFloatLayerService f104592d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f104593e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.playingarea.i f104594f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f104595g;

    @NotNull
    public final StateFlow<Boolean> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Lazy f104596i;

    @Inject
    public o(@NotNull CoroutineScope coroutineScope, @NotNull com.bilibili.ship.theseus.keel.player.h hVar, @NotNull IPlayerCoreService iPlayerCoreService, @NotNull TheseusFloatLayerService theseusFloatLayerService, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar, @NotNull com.bilibili.ship.theseus.united.page.playingarea.i iVar) {
        this.f104589a = coroutineScope;
        this.f104590b = hVar;
        this.f104591c = iPlayerCoreService;
        this.f104592d = theseusFloatLayerService;
        this.f104593e = cVar;
        this.f104594f = iVar;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.f104595g = MutableStateFlow;
        this.h = FlowKt.asStateFlow(MutableStateFlow);
        this.f104596i = LazyKt.lazy(new C1757j0(12));
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new PlayerNetworkLimitService$1(this, null), 3, (Object) null);
    }

    public final MutableStateFlow<d.c> a() {
        return (MutableStateFlow) this.f104596i.getValue();
    }

    public final void b() {
        this.f104595g.setValue(Boolean.FALSE);
    }
}
