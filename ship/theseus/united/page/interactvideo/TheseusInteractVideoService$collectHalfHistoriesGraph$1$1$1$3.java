package com.bilibili.ship.theseus.united.page.interactvideo;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/TheseusInteractVideoService$collectHalfHistoriesGraph$1$1$1$3.class */
public final class TheseusInteractVideoService$collectHalfHistoriesGraph$1$1$1$3 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final MutableSharedFlow<Unit> $closeComponentFlow;
    final m $uiComponent;
    int label;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.interactvideo.TheseusInteractVideoService$collectHalfHistoriesGraph$1$1$1$3$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/TheseusInteractVideoService$collectHalfHistoriesGraph$1$1$1$3$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
        final m $uiComponent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(m mVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$uiComponent = mVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$uiComponent, continuation);
        }

        public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
            return create(unit, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.$uiComponent.c();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusInteractVideoService$collectHalfHistoriesGraph$1$1$1$3(MutableSharedFlow<Unit> mutableSharedFlow, m mVar, Continuation<? super TheseusInteractVideoService$collectHalfHistoriesGraph$1$1$1$3> continuation) {
        super(1, continuation);
        this.$closeComponentFlow = mutableSharedFlow;
        this.$uiComponent = mVar;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new TheseusInteractVideoService$collectHalfHistoriesGraph$1$1$1$3(this.$closeComponentFlow, this.$uiComponent, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            MutableSharedFlow<Unit> mutableSharedFlow = this.$closeComponentFlow;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$uiComponent, null);
            this.label = 1;
            if (FlowKt.collectLatest(mutableSharedFlow, anonymousClass1, this) == coroutine_suspended) {
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
