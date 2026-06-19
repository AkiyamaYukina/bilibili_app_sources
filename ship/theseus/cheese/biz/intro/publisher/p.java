package com.bilibili.ship.theseus.cheese.biz.intro.publisher;

import androidx.compose.runtime.internal.StabilityInferred;
import javax.inject.Inject;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/publisher/p.class */
@StabilityInferred(parameters = 0)
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<B> f89878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final StateFlow<B> f89879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<E> f89880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final StateFlow<E> f89881d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f89882e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f89883f;

    @Inject
    public p() {
        MutableStateFlow<B> MutableStateFlow = StateFlowKt.MutableStateFlow((Object) null);
        this.f89878a = MutableStateFlow;
        this.f89879b = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<E> MutableStateFlow2 = StateFlowKt.MutableStateFlow((Object) null);
        this.f89880c = MutableStateFlow2;
        this.f89881d = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<Boolean> MutableStateFlow3 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.f89882e = MutableStateFlow3;
        this.f89883f = FlowKt.asStateFlow(MutableStateFlow3);
    }
}
