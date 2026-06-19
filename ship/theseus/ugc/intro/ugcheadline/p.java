package com.bilibili.ship.theseus.ugc.intro.ugcheadline;

import androidx.compose.runtime.internal.StabilityInferred;
import javax.inject.Inject;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcheadline/p.class */
@StabilityInferred(parameters = 0)
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f97371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f97372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f97373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f97374d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f97375e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f97376f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f97377g;

    @NotNull
    public final StateFlow<Boolean> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<C6266b> f97378i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final StateFlow<C6266b> f97379j;

    @Inject
    public p(@NotNull CoroutineScope coroutineScope, @NotNull StateFlow<Boolean> stateFlow) {
        this.f97371a = coroutineScope;
        this.f97372b = stateFlow;
        Boolean bool = Boolean.FALSE;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(bool);
        this.f97373c = MutableStateFlow;
        this.f97374d = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(bool);
        this.f97375e = MutableStateFlow2;
        this.f97376f = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<Boolean> MutableStateFlow3 = StateFlowKt.MutableStateFlow(bool);
        this.f97377g = MutableStateFlow3;
        this.h = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<C6266b> MutableStateFlow4 = StateFlowKt.MutableStateFlow((Object) null);
        this.f97378i = MutableStateFlow4;
        this.f97379j = FlowKt.asStateFlow(MutableStateFlow4);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001c  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String a() {
        /*
            r2 = this;
            r0 = r2
            kotlinx.coroutines.flow.MutableStateFlow<com.bilibili.ship.theseus.ugc.intro.ugcheadline.b> r0 = r0.f97378i
            java.lang.Object r0 = r0.getValue()
            com.bilibili.ship.theseus.ugc.intro.ugcheadline.b r0 = (com.bilibili.ship.theseus.ugc.intro.ugcheadline.C6266b) r0
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L1c
            r0 = r3
            java.lang.String r0 = r0.f97303a
            r4 = r0
            r0 = r4
            r3 = r0
            r0 = r4
            if (r0 != 0) goto L1f
        L1c:
            java.lang.String r0 = ""
            r3 = r0
        L1f:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.intro.ugcheadline.p.a():java.lang.String");
    }
}
