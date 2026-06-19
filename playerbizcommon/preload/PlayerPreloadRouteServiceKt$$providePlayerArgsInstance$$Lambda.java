package com.bilibili.playerbizcommon.preload;

import Uq0.e;
import com.bilibili.lib.gripper.api.internal.ProducerLambda;
import com.bilibili.playerbizcommon.IPlayerPreloadRouteService;
import javax.annotation.Nonnull;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/preload/PlayerPreloadRouteServiceKt$$providePlayerArgsInstance$$Lambda.class */
public class PlayerPreloadRouteServiceKt$$providePlayerArgsInstance$$Lambda extends ProducerLambda<IPlayerPreloadRouteService> {
    public PlayerPreloadRouteServiceKt$$providePlayerArgsInstance$$Lambda(Continuation<?> continuation) {
        super(continuation);
    }

    @Nonnull
    public Continuation<Unit> create(@Nonnull Continuation<?> continuation) {
        return new PlayerPreloadRouteServiceKt$$providePlayerArgsInstance$$Lambda(continuation);
    }

    public Object invokeProducer() {
        return e.providePlayerArgsInstance();
    }
}
