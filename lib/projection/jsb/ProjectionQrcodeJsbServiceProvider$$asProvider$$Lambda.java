package com.bilibili.lib.projection.jsb;

import Re0.C2838b;
import com.bilibili.app.comm.rubick.api.IJsbServiceProviderV3;
import com.bilibili.lib.gripper.api.internal.ProducerLambda;
import javax.annotation.Nonnull;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/jsb/ProjectionQrcodeJsbServiceProvider$$asProvider$$Lambda.class */
public class ProjectionQrcodeJsbServiceProvider$$asProvider$$Lambda extends ProducerLambda<IJsbServiceProviderV3> {
    public ProjectionQrcodeJsbServiceProvider$$asProvider$$Lambda(Continuation<?> continuation) {
        super(continuation);
    }

    @Nonnull
    public Continuation<Unit> create(@Nonnull Continuation<?> continuation) {
        return new ProjectionQrcodeJsbServiceProvider$$asProvider$$Lambda(continuation);
    }

    public Object invokeProducer() {
        return new C2838b().asProvider();
    }
}
