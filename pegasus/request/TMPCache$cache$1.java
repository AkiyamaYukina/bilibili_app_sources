package com.bilibili.pegasus.request;

import com.bilibili.lib.arch.lifecycle.Resource;
import com.bilibili.pegasus.data.base.PegasusResponse;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/request/TMPCache$cache$1.class */
final class TMPCache$cache$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Deferred<Resource<PegasusResponse>> $deferred;
    final f $key;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TMPCache$cache$1(f fVar, Deferred<Resource<PegasusResponse>> deferred, Continuation<? super TMPCache$cache$1> continuation) {
        super(2, continuation);
        this.$key = fVar;
        this.$deferred = deferred;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TMPCache$cache$1(this.$key, this.$deferred, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Mutex mutex;
        f fVar;
        Deferred<Resource<PegasusResponse>> deferred;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            mutex = m.f78840d;
            fVar = this.$key;
            deferred = this.$deferred;
            this.L$0 = mutex;
            this.L$1 = fVar;
            this.L$2 = deferred;
            this.label = 1;
            if (mutex.lock((Object) null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            deferred = (Deferred) this.L$2;
            fVar = (f) this.L$1;
            Mutex mutex2 = (Mutex) this.L$0;
            ResultKt.throwOnFailure(obj);
            mutex = mutex2;
        }
        try {
            m.f78838b = fVar;
            m.f78839c = deferred;
            Unit unit = Unit.INSTANCE;
            mutex.unlock((Object) null);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            mutex.unlock((Object) null);
            throw th;
        }
    }
}
