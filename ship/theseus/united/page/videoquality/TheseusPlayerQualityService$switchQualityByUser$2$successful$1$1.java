package com.bilibili.ship.theseus.united.page.videoquality;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/TheseusPlayerQualityService$switchQualityByUser$2$successful$1$1.class */
public final class TheseusPlayerQualityService$switchQualityByUser$2$successful$1$1 extends SuspendLambda implements Function1<Continuation<? super Boolean>, Object> {
    final Ref.BooleanRef $didVisionAnimation;
    final com.bilibili.player.tangram.basic.c $preference;
    int label;
    final TheseusPlayerQualityService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusPlayerQualityService$switchQualityByUser$2$successful$1$1(Ref.BooleanRef booleanRef, TheseusPlayerQualityService theseusPlayerQualityService, com.bilibili.player.tangram.basic.c cVar, Continuation<? super TheseusPlayerQualityService$switchQualityByUser$2$successful$1$1> continuation) {
        super(1, continuation);
        this.$didVisionAnimation = booleanRef;
        this.this$0 = theseusPlayerQualityService;
        this.$preference = cVar;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new TheseusPlayerQualityService$switchQualityByUser$2$successful$1$1(this.$didVisionAnimation, this.this$0, this.$preference, continuation);
    }

    public final Object invoke(Continuation<? super Boolean> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.$didVisionAnimation.element) {
                this.label = 1;
                if (DelayKt.delay(200L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
        }
        com.bilibili.ship.theseus.keel.player.h hVar = this.this$0.f103774a;
        com.bilibili.player.tangram.basic.c cVar = this.$preference;
        this.label = 2;
        Object objD = hVar.f91109c.d(cVar, this);
        obj = objD;
        if (objD == coroutine_suspended) {
            return coroutine_suspended;
        }
        return obj;
    }
}
