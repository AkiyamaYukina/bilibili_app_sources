package com.bilibili.ship.theseus.united.page.videoquality;

import com.bilibili.player.tangram.basic.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/TheseusPlayerQualityService$2$1.class */
public final class TheseusPlayerQualityService$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final TheseusPlayerQualityService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusPlayerQualityService$2$1(TheseusPlayerQualityService theseusPlayerQualityService, Continuation<? super TheseusPlayerQualityService$2$1> continuation) {
        super(2, continuation);
        this.this$0 = theseusPlayerQualityService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TheseusPlayerQualityService$2$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            TheseusPlayerQualityService theseusPlayerQualityService = this.this$0;
            com.bilibili.player.tangram.basic.c bVar = theseusPlayerQualityService.f103794v;
            if (!(bVar instanceof c.a)) {
                if (!(bVar instanceof c.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar = new c.b(((com.bilibili.player.tangram.basic.a) ComparisonsKt.minOf(new com.bilibili.player.tangram.basic.a(theseusPlayerQualityService.f103795w), new com.bilibili.player.tangram.basic.a(((c.b) bVar).f79322a))).f79320a);
            }
            defpackage.a.b("[theseus-united-TheseusPlayerQualityService$2$1-invokeSuspend] ", "trial ended, switch to last non-trial quality: " + bVar, "TheseusPlayerQualityService$2$1-invokeSuspend");
            com.bilibili.ship.theseus.keel.player.h hVar = this.this$0.f103774a;
            this.label = 1;
            if (hVar.f91109c.d(bVar, this) == coroutine_suspended) {
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
