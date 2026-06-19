package com.bilibili.ship.theseus.united.page.miniplayer;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/miniplayer/DetailMiniPlayerService$observerLifecycle$2.class */
final class DetailMiniPlayerService$observerLifecycle$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final b this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/miniplayer/DetailMiniPlayerService$observerLifecycle$2$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f102027a;

        public a(b bVar) {
            this.f102027a = bVar;
        }

        public final Object emit(Object obj, Continuation continuation) {
            this.f102027a.f102066w = false;
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailMiniPlayerService$observerLifecycle$2(b bVar, Continuation<? super DetailMiniPlayerService$observerLifecycle$2> continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DetailMiniPlayerService$observerLifecycle$2(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Flow<Lifecycle.Event> eventFlow = LifecycleKt.getEventFlow(this.this$0.f102050f);
            a aVar = new a(this.this$0);
            this.label = 1;
            Object objCollect = eventFlow.collect(new DetailMiniPlayerService$observerLifecycle$2$invokeSuspend$$inlined$filter$1$2(aVar), this);
            if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objCollect = Unit.INSTANCE;
            }
            if (objCollect == coroutine_suspended) {
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
