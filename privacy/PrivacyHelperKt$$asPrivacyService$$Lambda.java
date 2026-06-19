package com.bilibili.privacy;

import As0.d;
import com.bilibili.gripper.api.privacy.PrivacyService;
import com.bilibili.lib.gripper.api.internal.ProducerLambda;
import javax.annotation.Nonnull;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/privacy/PrivacyHelperKt$$asPrivacyService$$Lambda.class */
public class PrivacyHelperKt$$asPrivacyService$$Lambda extends ProducerLambda<PrivacyService> {
    public PrivacyHelperKt$$asPrivacyService$$Lambda(Continuation<?> continuation) {
        super(continuation);
    }

    @Nonnull
    public Continuation<Unit> create(@Nonnull Continuation<?> continuation) {
        return new PrivacyHelperKt$$asPrivacyService$$Lambda(continuation);
    }

    public Object invokeProducer() {
        return d.asPrivacyService();
    }
}
