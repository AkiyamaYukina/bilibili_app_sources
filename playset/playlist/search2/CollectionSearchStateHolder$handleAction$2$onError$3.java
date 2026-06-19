package com.bilibili.playset.playlist.search2;

import com.bilibili.playset.playlist.search2.o;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/search2/CollectionSearchStateHolder$handleAction$2$onError$3.class */
public final class CollectionSearchStateHolder$handleAction$2$onError$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionSearchStateHolder$handleAction$2$onError$3(i iVar, Continuation<? super CollectionSearchStateHolder$handleAction$2$onError$3> continuation) {
        super(2, continuation);
        this.this$0 = iVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CollectionSearchStateHolder$handleAction$2$onError$3(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            MutableSharedFlow<o> mutableSharedFlow = this.this$0.f85461c;
            o.a aVar = new o.a("网络失败");
            this.label = 1;
            if (mutableSharedFlow.emit(aVar, this) == coroutine_suspended) {
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
