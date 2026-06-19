package com.bilibili.ship.theseus.united.page.danmaku;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.HashSet;
import javax.inject.Inject;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/DanmakuInputRepository.class */
@StabilityInferred(parameters = 0)
public final class DanmakuInputRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final IPlayerSettingService f99400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final m f99401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f99402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f99403d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final DanmakuCompoundRepository f99404e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final IInteractLayerService f99405f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Context f99406g;

    @NotNull
    public final Flow<Boolean> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f99407i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f99408j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f99409k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final HashSet<Object> f99410l;

    @Inject
    public DanmakuInputRepository(@NotNull IPlayerSettingService iPlayerSettingService, @NotNull m mVar, @NotNull StateFlow<Boolean> stateFlow, @NotNull StateFlow<Boolean> stateFlow2, @NotNull DanmakuCompoundRepository danmakuCompoundRepository, @NotNull IInteractLayerService iInteractLayerService, @NotNull Context context) {
        this.f99400a = iPlayerSettingService;
        this.f99401b = mVar;
        this.f99402c = stateFlow;
        this.f99403d = stateFlow2;
        this.f99404e = danmakuCompoundRepository;
        this.f99405f = iInteractLayerService;
        this.f99406g = context;
        this.h = FlowKt.distinctUntilChanged(FlowKt.combine(stateFlow, stateFlow2, new DanmakuInputRepository$inputGoneFlow$1(this, null)));
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.TRUE);
        this.f99407i = MutableStateFlow;
        this.f99408j = FlowKt.asStateFlow(MutableStateFlow);
        this.f99409k = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.f99410l = new HashSet<>();
    }
}
