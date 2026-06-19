package com.bilibili.upper.module.uppercenterlocal.jsb;

import com.bilibili.app.comm.rubick.api.IJsbServiceProviderV3;
import com.bilibili.lib.gripper.api.internal.ProducerLambda;
import javax.annotation.Nonnull;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenterlocal/jsb/UpperArchiveBridgeProvider$$asProvider$$Lambda.class */
public class UpperArchiveBridgeProvider$$asProvider$$Lambda extends ProducerLambda<IJsbServiceProviderV3> {
    public UpperArchiveBridgeProvider$$asProvider$$Lambda(Continuation<?> continuation) {
        super(continuation);
    }

    @Nonnull
    public Continuation<Unit> create(@Nonnull Continuation<?> continuation) {
        return new UpperArchiveBridgeProvider$$asProvider$$Lambda(continuation);
    }

    public Object invokeProducer() {
        return new e().asProvider();
    }
}
