package com.bilibili.player.tangram.playercore;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/j.class */
public final class j<T> implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PCSFacadeImpl f79448a;

    public j(PCSFacadeImpl pCSFacadeImpl) {
        this.f79448a = pCSFacadeImpl;
    }

    public final Object emit(Object obj, Continuation continuation) {
        this.f79448a.f79384a.setPlaySpeed(((Number) obj).floatValue());
        return Unit.INSTANCE;
    }
}
