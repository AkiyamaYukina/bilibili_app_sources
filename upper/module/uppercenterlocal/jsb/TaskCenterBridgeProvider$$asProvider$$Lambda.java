package com.bilibili.upper.module.uppercenterlocal.jsb;

import com.bilibili.app.comm.rubick.api.IJsbServiceProviderV3;
import com.bilibili.lib.gripper.api.internal.ProducerLambda;
import javax.annotation.Nonnull;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenterlocal/jsb/TaskCenterBridgeProvider$$asProvider$$Lambda.class */
public class TaskCenterBridgeProvider$$asProvider$$Lambda extends ProducerLambda<IJsbServiceProviderV3> {
    public TaskCenterBridgeProvider$$asProvider$$Lambda(Continuation<?> continuation) {
        super(continuation);
    }

    @Nonnull
    public Continuation<Unit> create(@Nonnull Continuation<?> continuation) {
        return new TaskCenterBridgeProvider$$asProvider$$Lambda(continuation);
    }

    public Object invokeProducer() {
        return new b().asProvider();
    }
}
