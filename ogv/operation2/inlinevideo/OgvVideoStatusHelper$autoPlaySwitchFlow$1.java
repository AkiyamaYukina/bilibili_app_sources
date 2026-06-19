package com.bilibili.ogv.operation2.inlinevideo;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/inlinevideo/OgvVideoStatusHelper$autoPlaySwitchFlow$1.class */
public final class OgvVideoStatusHelper$autoPlaySwitchFlow$1 extends SuspendLambda implements Function2<FlowCollector<? super Boolean>, Continuation<? super Unit>, Object> {
    private Object L$0;
    int label;
    final OgvVideoStatusHelper this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/inlinevideo/OgvVideoStatusHelper$autoPlaySwitchFlow$1$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final FlowCollector<Boolean> f70899a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final OgvVideoStatusHelper f70900b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(FlowCollector<? super Boolean> flowCollector, OgvVideoStatusHelper ogvVideoStatusHelper) {
            this.f70899a = flowCollector;
            this.f70900b = ogvVideoStatusHelper;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(Qh.d dVar, Continuation<? super Unit> continuation) {
            Object objEmit = this.f70899a.emit(Boxing.boxBoolean(this.f70900b.c()), continuation);
            return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvVideoStatusHelper$autoPlaySwitchFlow$1(OgvVideoStatusHelper ogvVideoStatusHelper, Continuation<? super OgvVideoStatusHelper$autoPlaySwitchFlow$1> continuation) {
        super(2, continuation);
        this.this$0 = ogvVideoStatusHelper;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OgvVideoStatusHelper$autoPlaySwitchFlow$1 ogvVideoStatusHelper$autoPlaySwitchFlow$1 = new OgvVideoStatusHelper$autoPlaySwitchFlow$1(this.this$0, continuation);
        ogvVideoStatusHelper$autoPlaySwitchFlow$1.L$0 = obj;
        return ogvVideoStatusHelper$autoPlaySwitchFlow$1;
    }

    public final Object invoke(FlowCollector<? super Boolean> flowCollector, Continuation<? super Unit> continuation) {
        return create(flowCollector, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector2 = (FlowCollector) this.L$0;
            Boolean boolBoxBoolean = Boxing.boxBoolean(this.this$0.c());
            this.L$0 = flowCollector2;
            this.label = 1;
            flowCollector = flowCollector2;
            if (flowCollector2.emit(boolBoxBoolean, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            FlowCollector flowCollector3 = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
            flowCollector = flowCollector3;
        }
        Flow flowA = com.bilibili.ogv.infra.violet.c.a(Qh.d.class);
        a aVar = new a(flowCollector, this.this$0);
        this.L$0 = null;
        this.label = 2;
        if (flowA.collect(aVar, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
