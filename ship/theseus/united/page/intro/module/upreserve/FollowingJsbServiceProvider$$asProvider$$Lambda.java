package com.bilibili.ship.theseus.united.page.intro.module.upreserve;

import com.bilibili.app.comm.rubick.api.IJsbServiceProviderV3;
import com.bilibili.lib.gripper.api.internal.ProducerLambda;
import javax.annotation.Nonnull;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/upreserve/FollowingJsbServiceProvider$$asProvider$$Lambda.class */
public class FollowingJsbServiceProvider$$asProvider$$Lambda extends ProducerLambda<IJsbServiceProviderV3> {
    public FollowingJsbServiceProvider$$asProvider$$Lambda(Continuation<?> continuation) {
        super(continuation);
    }

    @Nonnull
    public Continuation<Unit> create(@Nonnull Continuation<?> continuation) {
        return new FollowingJsbServiceProvider$$asProvider$$Lambda(continuation);
    }

    public Object invokeProducer() {
        return new b().asProvider();
    }
}
