package com.bilibili.pegasus.components.interest;

import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/NewUserInterestChoosePlugin$onViewCreated$1$2.class */
public final class NewUserInterestChoosePlugin$onViewCreated$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final NewUserInterestChoosePlugin this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/NewUserInterestChoosePlugin$onViewCreated$1$2$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a<T> f76315a = (a<T>) new Object();

        public final Object emit(Object obj, Continuation continuation) {
            BLog.i("[Interest]NewUserInterestChoosePlugin", "login: " + ((Rg0.b) obj));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewUserInterestChoosePlugin$onViewCreated$1$2(NewUserInterestChoosePlugin newUserInterestChoosePlugin, Continuation<? super NewUserInterestChoosePlugin$onViewCreated$1$2> continuation) {
        super(2, continuation);
        this.this$0 = newUserInterestChoosePlugin;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NewUserInterestChoosePlugin$onViewCreated$1$2(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
        StateFlow<Rg0.b> state;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            j4.t.a("loginPageStateHolder: ", "[Interest]NewUserInterestChoosePlugin", this.this$0.b() != null);
            Rg0.c cVarB = this.this$0.b();
            if (cVarB == null || (state = cVarB.getState()) == null) {
                return Unit.INSTANCE;
            }
            FlowCollector flowCollector = a.f76315a;
            this.label = 1;
            if (state.collect(flowCollector, this) == coroutine_suspended) {
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
