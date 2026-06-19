package com.bilibili.upper.module.uppercenterlocal.jsb;

import com.bilibili.app.comm.rubick.api.IJsbServiceProviderV3;
import com.bilibili.lib.gripper.api.internal.ProducerLambda;
import javax.annotation.Nonnull;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenterlocal/jsb/UpperUploadBridgeProvider$$asProvider$$Lambda.class */
public class UpperUploadBridgeProvider$$asProvider$$Lambda extends ProducerLambda<IJsbServiceProviderV3> {
    public UpperUploadBridgeProvider$$asProvider$$Lambda(Continuation<?> continuation) {
        super(continuation);
    }

    @Nonnull
    public Continuation<Unit> create(@Nonnull Continuation<?> continuation) {
        return new UpperUploadBridgeProvider$$asProvider$$Lambda(continuation);
    }

    public Object invokeProducer() {
        return new i().asProvider();
    }
}
