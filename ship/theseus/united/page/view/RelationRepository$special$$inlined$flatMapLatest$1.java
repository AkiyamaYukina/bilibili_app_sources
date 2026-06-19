package com.bilibili.ship.theseus.united.page.view;

import com.bilibili.community.favorite.FavorRepository$flowOfFavor$;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/view/RelationRepository$special$$inlined$flatMapLatest$1.class */
public final class RelationRepository$special$$inlined$flatMapLatest$1 extends SuspendLambda implements Function3<FlowCollector<? super Boolean>, Long, Continuation<? super Unit>, Object> {
    private Object L$0;
    Object L$1;
    int label;

    public RelationRepository$special$$inlined$flatMapLatest$1(Continuation continuation) {
        super(3, continuation);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((FlowCollector<? super Boolean>) obj, (Long) obj2, (Continuation<? super Unit>) obj3);
    }

    public final Object invoke(FlowCollector<? super Boolean> flowCollector, Long l7, Continuation<? super Unit> continuation) {
        RelationRepository$special$$inlined$flatMapLatest$1 relationRepository$special$$inlined$flatMapLatest$1 = new RelationRepository$special$$inlined$flatMapLatest$1(continuation);
        relationRepository$special$$inlined$flatMapLatest$1.L$0 = flowCollector;
        relationRepository$special$$inlined$flatMapLatest$1.L$1 = l7;
        return relationRepository$special$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            long jLongValue = ((Number) this.L$1).longValue();
            com.bilibili.community.favorite.d dVar = com.bilibili.community.favorite.d.a;
            FavorRepository$flowOfFavor$.inlined.map.1 r02 = new FavorRepository$flowOfFavor$.inlined.map.1(com.bilibili.community.favorite.d.c.b(com.bilibili.community.b.a(jLongValue)));
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, r02, this) == coroutine_suspended) {
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
