package com.bilibili.lib.stagger.internal;

import com.bilibili.lib.stagger.internal.KStaggerAdapter;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/stagger/internal/KStaggerAdapter$KMPResource$delete$1.class */
public final class KStaggerAdapter$KMPResource$delete$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final KStaggerAdapter.KMPResource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KStaggerAdapter$KMPResource$delete$1(KStaggerAdapter.KMPResource kMPResource, Continuation<? super KStaggerAdapter$KMPResource$delete$1> continuation) {
        super(2, continuation);
        this.this$0 = kMPResource;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KStaggerAdapter$KMPResource$delete$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            k41.b bVar = k41.b.b;
            d41.g gVar = this.this$0.f64474a;
            String str = gVar.a;
            this.label = 1;
            if (bVar.a.b(str, gVar.b, this) == coroutine_suspended) {
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
