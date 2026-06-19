package com.bilibili.playerbizcommon.preload;

import Uq0.c;
import aZ.a;
import com.bilibili.lib.gripper.api.internal.ProducerLambda;
import javax.annotation.Nonnull;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/preload/PlayerPreloadGripperServiceKt$$provideService$$Lambda.class */
public class PlayerPreloadGripperServiceKt$$provideService$$Lambda extends ProducerLambda<a> {
    public PlayerPreloadGripperServiceKt$$provideService$$Lambda(Continuation<?> continuation) {
        super(continuation);
    }

    @Nonnull
    public Continuation<Unit> create(@Nonnull Continuation<?> continuation) {
        return new PlayerPreloadGripperServiceKt$$provideService$$Lambda(continuation);
    }

    public Object invokeProducer() {
        return c.provideService();
    }
}
