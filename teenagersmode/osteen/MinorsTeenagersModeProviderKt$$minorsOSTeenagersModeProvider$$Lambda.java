package com.bilibili.teenagersmode.osteen;

import com.bilibili.app.comm.restrict.g;
import com.bilibili.lib.gripper.api.internal.ProducerLambda;
import javax.annotation.Nonnull;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/osteen/MinorsTeenagersModeProviderKt$$minorsOSTeenagersModeProvider$$Lambda.class */
public class MinorsTeenagersModeProviderKt$$minorsOSTeenagersModeProvider$$Lambda extends ProducerLambda<g> {
    public MinorsTeenagersModeProviderKt$$minorsOSTeenagersModeProvider$$Lambda(Continuation<?> continuation) {
        super(continuation);
    }

    @Nonnull
    public Continuation<Unit> create(@Nonnull Continuation<?> continuation) {
        return new MinorsTeenagersModeProviderKt$$minorsOSTeenagersModeProvider$$Lambda(continuation);
    }

    public Object invokeProducer() {
        return e.minorsOSTeenagersModeProvider();
    }
}
