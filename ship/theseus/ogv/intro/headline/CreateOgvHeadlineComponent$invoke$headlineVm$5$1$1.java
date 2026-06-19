package com.bilibili.ship.theseus.ogv.intro.headline;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/headline/CreateOgvHeadlineComponent$invoke$headlineVm$5$1$1.class */
public final class CreateOgvHeadlineComponent$invoke$headlineVm$5$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final DeliveryButton $it;
    int label;
    final CreateOgvHeadlineComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateOgvHeadlineComponent$invoke$headlineVm$5$1$1(CreateOgvHeadlineComponent createOgvHeadlineComponent, DeliveryButton deliveryButton, Continuation<? super CreateOgvHeadlineComponent$invoke$headlineVm$5$1$1> continuation) {
        super(2, continuation);
        this.this$0 = createOgvHeadlineComponent;
        this.$it = deliveryButton;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateOgvHeadlineComponent$invoke$headlineVm$5$1$1(this.this$0, this.$it, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            com.bilibili.ship.theseus.ogv.web.b bVar = this.this$0.f93099g;
            String strA = com.bilibili.ship.theseus.ogv.web.b.a(bVar, this.$it.f93105c, false, false, null, 14);
            this.label = 1;
            if (bVar.b(strA, false, this) == coroutine_suspended) {
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
