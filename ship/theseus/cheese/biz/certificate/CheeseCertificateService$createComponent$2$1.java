package com.bilibili.ship.theseus.cheese.biz.certificate;

import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/certificate/CheeseCertificateService$createComponent$2$1.class */
final class CheeseCertificateService$createComponent$2$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final b $cheeseCertComponent;
    int label;
    final CheeseCertificateService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseCertificateService$createComponent$2$1(CheeseCertificateService cheeseCertificateService, b bVar, Continuation<? super CheeseCertificateService$createComponent$2$1> continuation) {
        super(1, continuation);
        this.this$0 = cheeseCertificateService;
        this.$cheeseCertComponent = bVar;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new CheeseCertificateService$createComponent$2$1(this.this$0, this.$cheeseCertComponent, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            TheseusFloatLayerService theseusFloatLayerService = this.this$0.f89231c;
            b bVar = this.$cheeseCertComponent;
            this.label = 1;
            if (theseusFloatLayerService.h(bVar, theseusFloatLayerService.f99664n, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
