package com.bilibili.ship.theseus.united.page.toolbar.actionview.home;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/actionview/home/ToolbarHomeRepository$1$1.class */
public final class ToolbarHomeRepository$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final ToolbarHomeRepository this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.actionview.home.ToolbarHomeRepository$1$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/actionview/home/ToolbarHomeRepository$1$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Lifecycle.Event, Continuation<? super Boolean>, Object> {
        Object L$0;
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(Lifecycle.Event event, Continuation<? super Boolean> continuation) {
            return create(event, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(((Lifecycle.Event) this.L$0) == Lifecycle.Event.ON_STOP);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToolbarHomeRepository$1$1(ToolbarHomeRepository toolbarHomeRepository, Continuation<? super ToolbarHomeRepository$1$1> continuation) {
        super(2, continuation);
        this.this$0 = toolbarHomeRepository;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ToolbarHomeRepository$1$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Flow<Lifecycle.Event> eventFlow = LifecycleKt.getEventFlow(this.this$0.f103326j);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
            this.label = 1;
            Object objFirstOrNull = FlowKt.firstOrNull(eventFlow, anonymousClass1, this);
            obj = objFirstOrNull;
            if (objFirstOrNull == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        if (((Lifecycle.Event) obj) == null) {
            return Unit.INSTANCE;
        }
        ToolbarHomeRepository toolbarHomeRepository = this.this$0;
        toolbarHomeRepository.f103325i.b(toolbarHomeRepository.f103328l);
        return Unit.INSTANCE;
    }
}
