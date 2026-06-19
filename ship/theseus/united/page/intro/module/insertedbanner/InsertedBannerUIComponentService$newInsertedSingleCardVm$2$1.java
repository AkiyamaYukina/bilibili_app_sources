package com.bilibili.ship.theseus.united.page.intro.module.insertedbanner;

import com.bilibili.ship.theseus.united.page.intro.module.insertedbanner.InsertedBanner;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import ov0.InterfaceC8269a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/insertedbanner/InsertedBannerUIComponentService$newInsertedSingleCardVm$2$1.class */
public final class InsertedBannerUIComponentService$newInsertedSingleCardVm$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final InsertedBanner.Item $card;
    int label;
    final InsertedBannerUIComponentService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InsertedBannerUIComponentService$newInsertedSingleCardVm$2$1(InsertedBannerUIComponentService insertedBannerUIComponentService, InsertedBanner.Item item, Continuation<? super InsertedBannerUIComponentService$newInsertedSingleCardVm$2$1> continuation) {
        super(2, continuation);
        this.this$0 = insertedBannerUIComponentService;
        this.$card = item;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InsertedBannerUIComponentService$newInsertedSingleCardVm$2$1(this.this$0, this.$card, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC8269a interfaceC8269a = this.this$0.f100157c;
            String str = this.$card.f100152b;
            this.label = 1;
            if (interfaceC8269a.a(str, this) == coroutine_suspended) {
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
