package com.bilibili.player.tangram.basic;

import com.bilibili.player.tangram.basic.ResolveAndPlayPlayable;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/basic/ResolveAndPlayPlayable$resolveInner$resolvingJob$1.class */
final class ResolveAndPlayPlayable$resolveInner$resolvingJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final ResolveAndPlayPlayable<e>.a $action;
    final ResolveAndPlayPlayable.c<e> $stage;
    int label;
    final ResolveAndPlayPlayable<e> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResolveAndPlayPlayable$resolveInner$resolvingJob$1(ResolveAndPlayPlayable<e>.a aVar, ResolveAndPlayPlayable.c<e> cVar, ResolveAndPlayPlayable<e> resolveAndPlayPlayable, Continuation<? super ResolveAndPlayPlayable$resolveInner$resolvingJob$1> continuation) {
        super(2, continuation);
        this.$action = aVar;
        this.$stage = cVar;
        this.this$0 = resolveAndPlayPlayable;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ResolveAndPlayPlayable$resolveInner$resolvingJob$1(this.$action, this.$stage, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        e eVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                SuspendLambda suspendLambda = this.$action.f79309b;
                this.label = 1;
                Object objInvoke = suspendLambda.invoke(this);
                obj = objInvoke;
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            eVar = (e) obj;
        } catch (CancellationException e7) {
            this.$action.a(false);
            throw e7;
        } catch (Exception e8) {
            BLog.e("ResolveAndPlayPlayable$resolveInner$resolvingJob$1-invokeSuspend", "[tangram-basic-ResolveAndPlayPlayable$resolveInner$resolvingJob$1-invokeSuspend] Resolve failed", e8);
            this.$action.a(false);
        }
        if (eVar == null) {
            return Unit.INSTANCE;
        }
        if (((ResolveAndPlayPlayable.c.C0510c) this.$stage).f79314a.k() == PlayerAvailability.READY) {
            this.this$0.f79304c.setValue(Duration.box-impl(((ResolveAndPlayPlayable.c.C0510c) this.$stage).f79314a.F()));
            this.this$0.f79305d = true;
        }
        this.this$0.s(new ResolveAndPlayPlayable.c.C0510c(eVar, ((ResolveAndPlayPlayable.c.C0510c) this.$stage).f79314a.w()));
        this.$action.a(true);
        return Unit.INSTANCE;
    }
}
