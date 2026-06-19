package com.bilibili.ogv.operation2.community;

import com.bilibili.lib.gripper.api.internal.ProducerLambda;
import javax.annotation.Nonnull;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import qj0.InterfaceC8440b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/community/CommunityStateHelperProviderKt$$provideCommunityStateHelper$$Lambda.class */
public class CommunityStateHelperProviderKt$$provideCommunityStateHelper$$Lambda extends ProducerLambda<InterfaceC8440b> {
    public CommunityStateHelperProviderKt$$provideCommunityStateHelper$$Lambda(Continuation<?> continuation) {
        super(continuation);
    }

    @Nonnull
    public Continuation<Unit> create(@Nonnull Continuation<?> continuation) {
        return new CommunityStateHelperProviderKt$$provideCommunityStateHelper$$Lambda(continuation);
    }

    public Object invokeProducer() {
        return a.provideCommunityStateHelper();
    }
}
