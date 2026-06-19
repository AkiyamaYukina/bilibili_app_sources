package com.bilibili.pegasus.interest;

import Fp0.c;
import com.bilibili.lib.gripper.api.internal.ProducerLambda;
import com.bilibili.moduleservice.main.f;
import javax.annotation.Nonnull;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/interest/InterestDialogServiceImplKt$$provideInterestDialogState$$Lambda.class */
public class InterestDialogServiceImplKt$$provideInterestDialogState$$Lambda extends ProducerLambda<f> {
    public InterestDialogServiceImplKt$$provideInterestDialogState$$Lambda(Continuation<?> continuation) {
        super(continuation);
    }

    @Nonnull
    public Continuation<Unit> create(@Nonnull Continuation<?> continuation) {
        return new InterestDialogServiceImplKt$$provideInterestDialogState$$Lambda(continuation);
    }

    public Object invokeProducer() {
        return c.provideInterestDialogState();
    }
}
