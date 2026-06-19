package com.bilibili.upper.module.uppercenterlocal.jsb;

import com.bilibili.app.comm.rubick.api.IJsbServiceProviderV3;
import com.bilibili.lib.gripper.api.internal.ProducerLambda;
import javax.annotation.Nonnull;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenterlocal/jsb/UpperMuxBridgeProvider$$asProvider$$Lambda.class */
public class UpperMuxBridgeProvider$$asProvider$$Lambda extends ProducerLambda<IJsbServiceProviderV3> {
    public UpperMuxBridgeProvider$$asProvider$$Lambda(Continuation<?> continuation) {
        super(continuation);
    }

    @Nonnull
    public Continuation<Unit> create(@Nonnull Continuation<?> continuation) {
        return new UpperMuxBridgeProvider$$asProvider$$Lambda(continuation);
    }

    public Object invokeProducer() {
        return new g().asProvider();
    }
}
