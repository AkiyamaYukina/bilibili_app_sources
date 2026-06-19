package com.bilibili.player.tangram.basic;

import com.bilibili.player.tangram.basic.ResolveAndPlayPlayable;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/basic/ResolveAndPlayPlayable$receiveResolveActions$2$1.class */
final class ResolveAndPlayPlayable$receiveResolveActions$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final ResolveAndPlayPlayable<e>.a $it;
    private Object L$0;
    int label;
    final ResolveAndPlayPlayable<e> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResolveAndPlayPlayable$receiveResolveActions$2$1(ResolveAndPlayPlayable<e> resolveAndPlayPlayable, ResolveAndPlayPlayable<e>.a aVar, Continuation<? super ResolveAndPlayPlayable$receiveResolveActions$2$1> continuation) {
        super(2, continuation);
        this.this$0 = resolveAndPlayPlayable;
        this.$it = aVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ResolveAndPlayPlayable$receiveResolveActions$2$1 resolveAndPlayPlayable$receiveResolveActions$2$1 = new ResolveAndPlayPlayable$receiveResolveActions$2$1(this.this$0, this.$it, continuation);
        resolveAndPlayPlayable$receiveResolveActions$2$1.L$0 = obj;
        return resolveAndPlayPlayable$receiveResolveActions$2$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        ResolveAndPlayPlayable<e> resolveAndPlayPlayable = this.this$0;
        ResolveAndPlayPlayable<e>.a aVar = this.$it;
        ResolveAndPlayPlayable.c<InnerPlayer> cVarH0 = resolveAndPlayPlayable.h0();
        if (cVarH0 instanceof ResolveAndPlayPlayable.c.C0510c) {
            ResolveAndPlayPlayable.c.C0510c c0510c = (ResolveAndPlayPlayable.c.C0510c) cVarH0;
            Job job = c0510c.f79316c;
            if (job != null) {
                job.cancel(new CancellationException("Cancelled by subsequent resolving request."));
            }
            c0510c.f79316c = BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, CoroutineStart.UNDISPATCHED, new ResolveAndPlayPlayable$resolveInner$resolvingJob$1(aVar, cVarH0, resolveAndPlayPlayable, null), 1, (Object) null);
        } else if (cVarH0 instanceof ResolveAndPlayPlayable.c.d) {
            ((ResolveAndPlayPlayable.c.d) cVarH0).f79317a.cancel(new CancellationException("Cancelled by subsequent resolving request."));
            ResolveAndPlayPlayable.m(coroutineScope, resolveAndPlayPlayable, aVar);
        } else {
            ResolveAndPlayPlayable.m(coroutineScope, resolveAndPlayPlayable, aVar);
        }
        return Unit.INSTANCE;
    }
}
