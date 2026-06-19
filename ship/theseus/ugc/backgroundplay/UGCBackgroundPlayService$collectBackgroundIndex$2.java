package com.bilibili.ship.theseus.ugc.backgroundplay;

import Av0.a;
import com.bilibili.ship.theseus.united.page.background.PageBackgroundPlayRepository;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/backgroundplay/UGCBackgroundPlayService$collectBackgroundIndex$2.class */
final class UGCBackgroundPlayService$collectBackgroundIndex$2 extends SuspendLambda implements Function2<a, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final UGCBackgroundPlayService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UGCBackgroundPlayService$collectBackgroundIndex$2(UGCBackgroundPlayService uGCBackgroundPlayService, Continuation<? super UGCBackgroundPlayService$collectBackgroundIndex$2> continuation) {
        super(2, continuation);
        this.this$0 = uGCBackgroundPlayService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UGCBackgroundPlayService$collectBackgroundIndex$2 uGCBackgroundPlayService$collectBackgroundIndex$2 = new UGCBackgroundPlayService$collectBackgroundIndex$2(this.this$0, continuation);
        uGCBackgroundPlayService$collectBackgroundIndex$2.L$0 = obj;
        return uGCBackgroundPlayService$collectBackgroundIndex$2;
    }

    public final Object invoke(a aVar, Continuation<? super Unit> continuation) {
        return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        a aVar = (a) this.L$0;
        if (aVar == null) {
            return Unit.INSTANCE;
        }
        PageBackgroundPlayRepository pageBackgroundPlayRepository = this.this$0.f96303b;
        pageBackgroundPlayRepository.f99002l = pageBackgroundPlayRepository.c(aVar.f591b);
        return Unit.INSTANCE;
    }
}
