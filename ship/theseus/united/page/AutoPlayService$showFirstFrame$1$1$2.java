package com.bilibili.ship.theseus.united.page;

import com.bilibili.ship.theseus.keel.player.j;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/AutoPlayService$showFirstFrame$1$1$2.class */
public final class AutoPlayService$showFirstFrame$1$1$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    int label;
    final AutoPlayService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.AutoPlayService$showFirstFrame$1$1$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/AutoPlayService$showFirstFrame$1$1$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<j, Continuation<? super Boolean>, Object> {
        final j $initialPlayable;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(j jVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$initialPlayable = jVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$initialPlayable, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(j jVar, Continuation<? super Boolean> continuation) {
            return create(jVar, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(((j) this.L$0) != this.$initialPlayable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoPlayService$showFirstFrame$1$1$2(AutoPlayService autoPlayService, Continuation<? super AutoPlayService$showFirstFrame$1$1$2> continuation) {
        super(1, continuation);
        this.this$0 = autoPlayService;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new AutoPlayService$showFirstFrame$1$1$2(this.this$0, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            StateFlow stateFlowAsStateFlow = FlowKt.asStateFlow(this.this$0.f98787a.f91111e);
            this.label = 1;
            Object objA = com.bilibili.ogv.infra.coroutine.b.a(stateFlowAsStateFlow, this);
            obj = objA;
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                BLog.i("AutoPlayService$showFirstFrame$1$1$2-invokeSuspend", "[theseus-united-AutoPlayService$showFirstFrame$1$1$2-invokeSuspend] dismiss overlay: playable switched");
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        StateFlow stateFlowAsStateFlow2 = FlowKt.asStateFlow(this.this$0.f98787a.f91111e);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1((j) obj, null);
        this.label = 2;
        if (FlowKt.first(stateFlowAsStateFlow2, anonymousClass1, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        BLog.i("AutoPlayService$showFirstFrame$1$1$2-invokeSuspend", "[theseus-united-AutoPlayService$showFirstFrame$1$1$2-invokeSuspend] dismiss overlay: playable switched");
        return Unit.INSTANCE;
    }
}
