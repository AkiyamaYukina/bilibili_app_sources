package com.bilibili.ship.theseus.cheese.biz.certificate;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/certificate/CheeseCertificateService$checkIfMeetDurationThreshold$1.class */
final class CheeseCertificateService$checkIfMeetDurationThreshold$1 extends ContinuationImpl {
    Object L$0;
    int label;
    Object result;
    final CheeseCertificateService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseCertificateService$checkIfMeetDurationThreshold$1(CheeseCertificateService cheeseCertificateService, Continuation<? super CheeseCertificateService$checkIfMeetDurationThreshold$1> continuation) {
        super(continuation);
        this.this$0 = cheeseCertificateService;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return CheeseCertificateService.a(this.this$0, this);
    }
}
