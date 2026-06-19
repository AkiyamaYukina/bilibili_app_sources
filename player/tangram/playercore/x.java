package com.bilibili.player.tangram.playercore;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/x.class */
public final class x<T> implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PCSPlayableImpl f79467a;

    public x(PCSPlayableImpl pCSPlayableImpl) {
        this.f79467a = pCSPlayableImpl;
    }

    public final Object emit(Object obj, Continuation continuation) {
        this.f79467a.f79420i = true;
        return Unit.INSTANCE;
    }
}
