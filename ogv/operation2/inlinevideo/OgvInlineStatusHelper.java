package com.bilibili.ogv.operation2.inlinevideo;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Lifecycle;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/inlinevideo/OgvInlineStatusHelper.class */
@StabilityInferred(parameters = 0)
public final class OgvInlineStatusHelper {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f70896b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Lifecycle f70897a;

    public OgvInlineStatusHelper(@NotNull Lifecycle lifecycle) {
        this.f70897a = lifecycle;
    }

    @NotNull
    public final Flow<Boolean> a() {
        OgvVideoStatusHelper ogvVideoStatusHelper = new OgvVideoStatusHelper();
        Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.combine(ogvVideoStatusHelper.b(), ogvVideoStatusHelper.e(), this.f70897a.getCurrentStateFlow(), new OgvInlineStatusHelper$inlineVideoAllowedFlow$1(null)));
        Duration.Companion companion = Duration.Companion;
        return FlowKt.debounce-HG0u8IE(flowDistinctUntilChanged, DurationKt.toDuration(100, DurationUnit.MILLISECONDS));
    }
}
