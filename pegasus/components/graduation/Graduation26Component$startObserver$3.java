package com.bilibili.pegasus.components.graduation;

import com.bilibili.pegasus.Action;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/graduation/Graduation26Component$startObserver$3.class */
final class Graduation26Component$startObserver$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final Graduation26Component this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/graduation/Graduation26Component$startObserver$3$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Graduation26Component f76019a;

        public a(Graduation26Component graduation26Component) {
            this.f76019a = graduation26Component;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00c6  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
            /*
                Method dump skipped, instruction units count: 206
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.graduation.Graduation26Component$startObserver$3.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Graduation26Component$startObserver$3(Graduation26Component graduation26Component, Continuation<? super Graduation26Component$startObserver$3> continuation) {
        super(2, continuation);
        this.this$0 = graduation26Component;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Graduation26Component$startObserver$3(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            SharedFlow<Action> sharedFlow = this.this$0.f().f79014f;
            a aVar = new a(this.this$0);
            this.label = 1;
            if (sharedFlow.collect(aVar, this) == coroutine_suspended) {
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
