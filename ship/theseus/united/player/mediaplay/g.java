package com.bilibili.ship.theseus.united.player.mediaplay;

import com.google.common.collect.ImmutableSet;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/g.class */
public final class g implements com.bilibili.ship.theseus.keel.player.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImmutableSet f104524a;

    public g(ImmutableSet immutableSet) {
        this.f104524a = immutableSet;
    }

    @Override // com.bilibili.ship.theseus.keel.player.f
    public final Object a(com.bilibili.ship.theseus.keel.player.q qVar, SuspendLambda suspendLambda) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new MediaPlayableModule$provide$2$1(this.f104524a, qVar, null), suspendLambda);
        return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }
}
