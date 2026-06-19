package com.bilibili.pegasus.common;

import com.bilibili.lib.gripper.api.internal.ProducerLambda;
import javax.annotation.Nonnull;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/common/PegasusServiceImplKt$$providePegasusServiceImpl$$Lambda.class */
public class PegasusServiceImplKt$$providePegasusServiceImpl$$Lambda extends ProducerLambda<u00.o> {
    public PegasusServiceImplKt$$providePegasusServiceImpl$$Lambda(Continuation<?> continuation) {
        super(continuation);
    }

    @Nonnull
    public Continuation<Unit> create(@Nonnull Continuation<?> continuation) {
        return new PegasusServiceImplKt$$providePegasusServiceImpl$$Lambda(continuation);
    }

    public Object invokeProducer() {
        return l.providePegasusServiceImpl();
    }
}
