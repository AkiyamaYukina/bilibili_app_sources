package com.bilibili.ogv.operation2.banner;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Lifecycle;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.moduleservice.list.IInlineVolumeService;
import com.bilibili.ogv.kmm.operation.banner.InterfaceC5438b;
import com.bilibili.ogv.operation2.inlinevideo.OgvVideoStatusHelper;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/banner/BannerHdrVideoConfigHelperImpl.class */
@StabilityInferred(parameters = 0)
public final class BannerHdrVideoConfigHelperImpl implements InterfaceC5438b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Lifecycle f70809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final OgvVideoStatusHelper f70810b = new OgvVideoStatusHelper();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final IInlineVolumeService f70811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f70812d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow f70813e;

    public BannerHdrVideoConfigHelperImpl(@NotNull Lifecycle lifecycle) {
        this.f70809a = lifecycle;
        IInlineVolumeService iInlineVolumeService = (IInlineVolumeService) BLRouter.INSTANCE.get(IInlineVolumeService.class, "pegasus_inline_volume_key");
        this.f70811c = iInlineVolumeService;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.valueOf(iInlineVolumeService != null ? iInlineVolumeService.isMuteState() : true));
        this.f70812d = MutableStateFlow;
        this.f70813e = MutableStateFlow;
    }

    @Override // com.bilibili.ogv.kmm.operation.banner.InterfaceC5438b
    @NotNull
    public final Flow<Boolean> a() {
        Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.combine(this.f70810b.e(), this.f70809a.getCurrentStateFlow(), new BannerHdrVideoConfigHelperImpl$isPlaybackAllowedFlow$1(null)));
        Duration.Companion companion = Duration.Companion;
        return FlowKt.debounce-HG0u8IE(flowDistinctUntilChanged, DurationKt.toDuration(100, DurationUnit.MILLISECONDS));
    }

    @Override // com.bilibili.ogv.kmm.operation.banner.InterfaceC5438b
    @NotNull
    public final MutableStateFlow b() {
        return this.f70813e;
    }

    @Override // com.bilibili.ogv.kmm.operation.banner.InterfaceC5438b
    public final void c() {
        IInlineVolumeService iInlineVolumeService = this.f70811c;
        this.f70812d.setValue(Boolean.valueOf(iInlineVolumeService != null ? iInlineVolumeService.isMuteState() : true));
    }
}
