package com.bilibili.ship.theseus.ogv.intro;

import com.bilibili.ship.theseus.united.page.screenstate.c;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/UnitedActivityComposeContainerService$handleLimitedTimeFreeTicketsComponent$2$2.class */
final class UnitedActivityComposeContainerService$handleLimitedTimeFreeTicketsComponent$2$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final com.bilibili.ship.theseus.ogv.intro.limitedtimefree.u $limitedTimeFreeTicketsViewModel;
    int label;
    final UnitedActivityComposeContainerService this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/UnitedActivityComposeContainerService$handleLimitedTimeFreeTicketsComponent$2$2$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.bilibili.ship.theseus.ogv.intro.limitedtimefree.u f92287a;

        public a(com.bilibili.ship.theseus.ogv.intro.limitedtimefree.u uVar) {
            this.f92287a = uVar;
        }

        public final Object emit(Object obj, Continuation continuation) {
            this.f92287a.f93282f.setValue(Boolean.valueOf(((c.a) obj).f102988b));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnitedActivityComposeContainerService$handleLimitedTimeFreeTicketsComponent$2$2(UnitedActivityComposeContainerService unitedActivityComposeContainerService, com.bilibili.ship.theseus.ogv.intro.limitedtimefree.u uVar, Continuation<? super UnitedActivityComposeContainerService$handleLimitedTimeFreeTicketsComponent$2$2> continuation) {
        super(1, continuation);
        this.this$0 = unitedActivityComposeContainerService;
        this.$limitedTimeFreeTicketsViewModel = uVar;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new UnitedActivityComposeContainerService$handleLimitedTimeFreeTicketsComponent$2$2(this.this$0, this.$limitedTimeFreeTicketsViewModel, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            StateFlow stateFlowC = this.this$0.f92283e.c();
            a aVar = new a(this.$limitedTimeFreeTicketsViewModel);
            this.label = 1;
            if (stateFlowC.collect(aVar, this) == coroutine_suspended) {
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
