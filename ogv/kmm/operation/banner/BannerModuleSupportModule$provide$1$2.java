package com.bilibili.ogv.kmm.operation.banner;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/banner/BannerModuleSupportModule$provide$1$2.class */
final class BannerModuleSupportModule$provide$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final CompletableDeferred<Unit> $allowingToScroll;
    final InterfaceC5439c $bannerInteraction;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerModuleSupportModule$provide$1$2(InterfaceC5439c interfaceC5439c, CompletableDeferred<Unit> completableDeferred, Continuation<? super BannerModuleSupportModule$provide$1$2> continuation) {
        super(2, continuation);
        this.$bannerInteraction = interfaceC5439c;
        this.$allowingToScroll = completableDeferred;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BannerModuleSupportModule$provide$1$2(this.$bannerInteraction, this.$allowingToScroll, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC5439c interfaceC5439c = this.$bannerInteraction;
            if (interfaceC5439c != null) {
                this.label = 1;
                if (interfaceC5439c.a(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        CompletableDeferred<Unit> completableDeferred = this.$allowingToScroll;
        Unit unit = Unit.INSTANCE;
        completableDeferred.complete(unit);
        return unit;
    }
}
