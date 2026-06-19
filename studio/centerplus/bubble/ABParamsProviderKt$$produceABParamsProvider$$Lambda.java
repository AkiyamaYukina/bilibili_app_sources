package com.bilibili.studio.centerplus.bubble;

import com.bilibili.lib.gripper.api.internal.ProducerLambda;
import javax.annotation.Nonnull;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/bubble/ABParamsProviderKt$$produceABParamsProvider$$Lambda.class */
public class ABParamsProviderKt$$produceABParamsProvider$$Lambda extends ProducerLambda<kntr.app.upper.entrance.ab.b> {
    public ABParamsProviderKt$$produceABParamsProvider$$Lambda(Continuation<?> continuation) {
        super(continuation);
    }

    @Nonnull
    public Continuation<Unit> create(@Nonnull Continuation<?> continuation) {
        return new ABParamsProviderKt$$produceABParamsProvider$$Lambda(continuation);
    }

    public Object invokeProducer() {
        return a.produceABParamsProvider();
    }
}
