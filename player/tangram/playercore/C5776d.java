package com.bilibili.player.tangram.playercore;

import com.bilibili.player.tangram.basic.PlayNetworkEnv;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;

/* JADX INFO: renamed from: com.bilibili.player.tangram.playercore.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/d.class */
public final class C5776d implements com.bilibili.player.tangram.basic.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final IPlayerCoreService f79443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<PlayNetworkEnv> f79444b;

    public C5776d(@NotNull Function0<? extends PlayNetworkEnv> function0, @NotNull IPlayerCoreService iPlayerCoreService) {
        this.f79443a = iPlayerCoreService;
        this.f79444b = StateFlowKt.MutableStateFlow(function0.invoke());
    }

    public static final void c(C5776d c5776d, PlayNetworkEnv playNetworkEnv) {
        MutableStateFlow<PlayNetworkEnv> mutableStateFlow;
        Object value;
        do {
            mutableStateFlow = c5776d.f79444b;
            value = mutableStateFlow.getValue();
            defpackage.a.b("[tangram-player-core-NetworkEnvByPlayCoreImpl-updatePlayNetworkEnv] ", "update play network from " + ((PlayNetworkEnv) value) + " to " + playNetworkEnv, "NetworkEnvByPlayCoreImpl-updatePlayNetworkEnv");
        } while (!mutableStateFlow.compareAndSet(value, playNetworkEnv));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5 = this;
            r0 = r6
            boolean r0 = r0 instanceof com.bilibili.player.tangram.playercore.NetworkEnvByPlayCoreImpl$collectPlayCoreNetwork$1
            if (r0 == 0) goto L25
            r0 = r6
            com.bilibili.player.tangram.playercore.NetworkEnvByPlayCoreImpl$collectPlayCoreNetwork$1 r0 = (com.bilibili.player.tangram.playercore.NetworkEnvByPlayCoreImpl$collectPlayCoreNetwork$1) r0
            r8 = r0
            r0 = r8
            int r0 = r0.label
            r7 = r0
            r0 = r7
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L25
            r0 = r8
            r1 = r7
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r8
            r6 = r0
            goto L2f
        L25:
            com.bilibili.player.tangram.playercore.NetworkEnvByPlayCoreImpl$collectPlayCoreNetwork$1 r0 = new com.bilibili.player.tangram.playercore.NetworkEnvByPlayCoreImpl$collectPlayCoreNetwork$1
            r1 = r0
            r2 = r5
            r3 = r6
            r1.<init>(r2, r3)
            r6 = r0
        L2f:
            r0 = r6
            java.lang.Object r0 = r0.result
            r9 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r10 = r0
            r0 = r6
            int r0 = r0.label
            r7 = r0
            r0 = r5
            tv.danmaku.biliplayerv2.service.IPlayerCoreService r0 = r0.f79443a
            r8 = r0
            r0 = r7
            if (r0 == 0) goto L63
            r0 = r7
            r1 = 1
            if (r0 == r1) goto L57
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L57:
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L5f
            goto L87
        L5f:
            r6 = move-exception
            goto L91
        L63:
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r8
            com.bilibili.player.tangram.playercore.c r1 = new com.bilibili.player.tangram.playercore.c
            r2 = r1
            r3 = r5
            r2.<init>(r3)
            r0.setMeteredNetworkUrlHookListener(r1)
            r0 = r6
            r1 = 1
            r0.label = r1     // Catch: java.lang.Throwable -> L5f
            r0 = r6
            java.lang.Object r0 = kotlinx.coroutines.DelayKt.awaitCancellation(r0)     // Catch: java.lang.Throwable -> L5f
            r1 = r10
            if (r0 != r1) goto L87
            r0 = r10
            return r0
        L87:
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException     // Catch: java.lang.Throwable -> L5f
            r6 = r0
            r0 = r6
            r0.<init>()     // Catch: java.lang.Throwable -> L5f
            r0 = r6
            throw r0     // Catch: java.lang.Throwable -> L5f
        L91:
            r0 = r8
            r1 = 0
            r0.setMeteredNetworkUrlHookListener(r1)
            r0 = r6
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.player.tangram.playercore.C5776d.d(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.bilibili.player.tangram.basic.k
    @NotNull
    public final Flow<PlayNetworkEnv> e() {
        return FlowKt.asStateFlow(this.f79444b);
    }
}
