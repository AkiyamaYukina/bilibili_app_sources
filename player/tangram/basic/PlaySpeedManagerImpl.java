package com.bilibili.player.tangram.basic;

import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/basic/PlaySpeedManagerImpl.class */
public final class PlaySpeedManagerImpl implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Float> f79291a = StateFlowKt.MutableStateFlow(Float.valueOf(1.0f));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Float> f79292b = StateFlowKt.MutableStateFlow((Object) null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Mutex f79293c = MutexKt.Mutex$default(false, 1, (Object) null);

    public final float a() {
        Float f7 = (Float) this.f79292b.getValue();
        return f7 != null ? f7.floatValue() : ((Number) this.f79291a.getValue()).floatValue();
    }

    public final float b() {
        return ((Number) this.f79291a.getValue()).floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(float r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r7) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.player.tangram.basic.PlaySpeedManagerImpl.c(float, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.bilibili.player.tangram.basic.f
    @NotNull
    public final Flow<Float> f() {
        return FlowKt.distinctUntilChanged(FlowKt.combine(this.f79291a, this.f79292b, new PlaySpeedManagerImpl$composedPlaySpeedFlow$1(null)));
    }
}
