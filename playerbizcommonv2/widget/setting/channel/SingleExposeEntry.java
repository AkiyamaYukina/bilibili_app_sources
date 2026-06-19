package com.bilibili.playerbizcommonv2.widget.setting.channel;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.framework.exposure.core.ExposureLayoutInfo;
import com.bilibili.framework.exposure.core.ExposureLayoutInfoReceiver;
import com.bilibili.framework.exposure.core.transformer.ExposureAreaVisibilityTransformerKt;
import com.bilibili.framework.exposure.core.transformer.ExposureVisibleDurationTransformerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.time.Duration;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/channel/SingleExposeEntry.class */
@StabilityInferred(parameters = 0)
public final class SingleExposeEntry implements ExposureLayoutInfoReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f83205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<ExposureLayoutInfo> f83206b = StateFlowKt.MutableStateFlow((Object) null);

    public SingleExposeEntry(@NotNull Function0<Unit> function0) {
        this.f83205a = function0;
    }

    public final void b(@NotNull CoroutineScope coroutineScope) {
        FlowKt.launchIn(FlowKt.onEach(FlowKt.take(ExposureVisibleDurationTransformerKt.exposeIfNoticeableFor-HG0u8IE(ExposureAreaVisibilityTransformerKt.noticeableWhenAreaRatioIsAtLeast(this.f83206b, 0.8f), Duration.Companion.getZERO-UwyO8pc()), 1), new SingleExposeEntry$launchIn$1(this, null)), coroutineScope);
    }

    public final void onNewLayoutInfoReceived(@Nullable ExposureLayoutInfo exposureLayoutInfo) {
        this.f83206b.setValue(exposureLayoutInfo);
    }
}
