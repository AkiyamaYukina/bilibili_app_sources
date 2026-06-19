package com.bilibili.player.tangram.playercore;

import com.bilibili.player.tangram.basic.PlayerAvailability;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/SequentialPCSPlayableKt$withPreloadingStage$1.class */
public final class SequentialPCSPlayableKt$withPreloadingStage$1 implements com.bilibili.player.tangram.basic.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.bilibili.player.tangram.basic.d f79435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.bilibili.player.tangram.basic.d f79436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MutableStateFlow f79437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Flow<Boolean> f79438d;

    public SequentialPCSPlayableKt$withPreloadingStage$1(com.bilibili.player.tangram.basic.d dVar, MutableStateFlow mutableStateFlow, Flow flow) {
        this.f79436b = dVar;
        this.f79437c = mutableStateFlow;
        this.f79438d = flow;
        this.f79435a = dVar;
    }

    @Override // com.bilibili.player.tangram.basic.d
    public final boolean a() {
        return this.f79436b.a() && !((Boolean) this.f79437c.getValue()).booleanValue();
    }

    @Override // com.bilibili.player.tangram.basic.d
    public final Flow<PlayerAvailability> d() {
        return this.f79435a.d();
    }

    @Override // com.bilibili.player.tangram.basic.d
    public final void i(Object obj) {
        this.f79435a.i(obj);
    }

    @Override // com.bilibili.player.tangram.basic.d
    public final PlayerAvailability k() {
        return this.f79435a.k();
    }

    @Override // com.bilibili.player.tangram.basic.d
    public final Flow<Boolean> l() {
        return this.f79435a.l();
    }

    @Override // com.bilibili.player.tangram.basic.d
    public final boolean m() {
        return this.f79435a.m();
    }

    @Override // com.bilibili.player.tangram.basic.d
    public final Flow<Boolean> n() {
        return FlowKt.combine(this.f79436b.n(), this.f79437c, new SequentialPCSPlayableKt$withPreloadingStage$1$playWhenReadyFlow$1(null));
    }

    @Override // com.bilibili.player.tangram.basic.d
    public final Object o(com.bilibili.player.tangram.basic.j jVar, Continuation<? super Unit> continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new SequentialPCSPlayableKt$withPreloadingStage$1$associateWith$2(this.f79438d, jVar, this.f79437c, this.f79436b, null), continuation);
        return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }

    @Override // com.bilibili.player.tangram.basic.d
    public final void pause() {
        this.f79435a.pause();
    }
}
