package com.bilibili.pegasus.components;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import com.bilibili.api.BiliConfig;
import com.bilibili.lib.performance.EntryPointKt;
import com.bilibili.okretro.ServiceGenerator;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/d0.class */
@StabilityInferred(parameters = 0)
public final class d0 extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<BiliNotice> f75951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final StateFlow<BiliNotice> f75952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Job f75953c;

    public d0() {
        MutableStateFlow<BiliNotice> MutableStateFlow = StateFlowKt.MutableStateFlow((Object) null);
        this.f75951a = MutableStateFlow;
        this.f75952b = FlowKt.asStateFlow(MutableStateFlow);
    }

    public static final Object I0(d0 d0Var, Continuation continuation) {
        d0Var.getClass();
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        if (EntryPointKt.getNetRequestOptEnable()) {
            Result.Companion companion = Result.Companion;
            safeContinuation.resumeWith(Result.constructor-impl(ResultKt.createFailure(new Exception("request was skip for netRequestOptEnable"))));
        } else {
            BiliNotice biliNotice = (BiliNotice) d0Var.f75951a.getValue();
            ((a0) ServiceGenerator.createService(a0.class)).getNotice(BiliConfig.getChannel(), 0, biliNotice != null ? biliNotice.getVer() : null).setParser(b0.f75896a).enqueue(new c0(safeContinuation));
        }
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }
}
