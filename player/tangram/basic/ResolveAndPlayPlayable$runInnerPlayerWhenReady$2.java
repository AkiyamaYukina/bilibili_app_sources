package com.bilibili.player.tangram.basic;

import com.bilibili.player.tangram.basic.ResolveAndPlayPlayable;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/basic/ResolveAndPlayPlayable$runInnerPlayerWhenReady$2.class */
final class ResolveAndPlayPlayable$runInnerPlayerWhenReady$2 extends SuspendLambda implements Function2<ResolveAndPlayPlayable.c<e>, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final ResolveAndPlayPlayable<e> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResolveAndPlayPlayable$runInnerPlayerWhenReady$2(ResolveAndPlayPlayable<e> resolveAndPlayPlayable, Continuation<? super ResolveAndPlayPlayable$runInnerPlayerWhenReady$2> continuation) {
        super(2, continuation);
        this.this$0 = resolveAndPlayPlayable;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ResolveAndPlayPlayable$runInnerPlayerWhenReady$2 resolveAndPlayPlayable$runInnerPlayerWhenReady$2 = new ResolveAndPlayPlayable$runInnerPlayerWhenReady$2(this.this$0, continuation);
        resolveAndPlayPlayable$runInnerPlayerWhenReady$2.L$0 = obj;
        return resolveAndPlayPlayable$runInnerPlayerWhenReady$2;
    }

    public final Object invoke(ResolveAndPlayPlayable.c<e> cVar, Continuation<? super Unit> continuation) {
        return create(cVar, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            ResolveAndPlayPlayable.c cVar = (ResolveAndPlayPlayable.c) this.L$0;
            if (!(cVar instanceof ResolveAndPlayPlayable.c.C0510c)) {
                return Unit.INSTANCE;
            }
            ResolveAndPlayPlayable.c.C0510c c0510c = (ResolveAndPlayPlayable.c.C0510c) cVar;
            InnerPlayer innerplayer = c0510c.f79314a;
            long j7 = ((Duration) this.this$0.f79304c.getValue()).unbox-impl();
            boolean z6 = this.this$0.f79305d;
            this.label = 1;
            if (innerplayer.I(j7, z6, c0510c.f79315b, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }
}
