package com.bilibili.player.tangram.playercore;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/l.class */
public final class l<T> implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PCSFacadeImpl f79450a;

    public l(PCSFacadeImpl pCSFacadeImpl) {
        this.f79450a = pCSFacadeImpl;
    }

    public final Object emit(Object obj, Continuation continuation) {
        ((Number) obj).intValue();
        this.f79450a.S();
        return Unit.INSTANCE;
    }
}
