package com.bilibili.upper.module.uppercenterlocal.repository;

import com.bilibili.upper.module.uppercenterlocal.repository.a;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenterlocal/repository/UpperCenterMainDataRepository$fetchMainResponse$deferred$1$4$1.class */
final class UpperCenterMainDataRepository$fetchMainResponse$deferred$1$4$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Deferred<a.C1236a> $it;
    Object L$0;
    Object L$1;
    int label;
    final a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpperCenterMainDataRepository$fetchMainResponse$deferred$1$4$1(Deferred<a.C1236a> deferred, a aVar, Continuation<? super UpperCenterMainDataRepository$fetchMainResponse$deferred$1$4$1> continuation) {
        super(2, continuation);
        this.$it = deferred;
        this.this$0 = aVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UpperCenterMainDataRepository$fetchMainResponse$deferred$1$4$1(this.$it, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar;
        Mutex mutex;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Deferred<a.C1236a> deferred = this.$it;
                this.label = 1;
                if (deferred.await(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (a) this.L$1;
                    Mutex mutex2 = (Mutex) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    mutex = mutex2;
                    aVar.f114257d = null;
                    Unit unit = Unit.INSTANCE;
                    mutex.unlock((Object) null);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            aVar.f114257d = null;
            Unit unit2 = Unit.INSTANCE;
            mutex.unlock((Object) null);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            mutex.unlock((Object) null);
            throw th;
        }
        aVar = this.this$0;
        mutex = aVar.f114256c;
        this.L$0 = mutex;
        this.L$1 = aVar;
        this.label = 2;
        if (mutex.lock((Object) null, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
    }
}
