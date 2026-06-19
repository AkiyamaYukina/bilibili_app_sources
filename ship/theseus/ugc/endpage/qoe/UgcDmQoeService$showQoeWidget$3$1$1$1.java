package com.bilibili.ship.theseus.ugc.endpage.qoe;

import com.bilibili.ship.theseus.ugc.endpage.qoe.UgcDmQoeComponent;
import com.bilibili.ship.theseus.ugc.endpage.qoe.q;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/qoe/UgcDmQoeService$showQoeWidget$3$1$1$1.class */
final class UgcDmQoeService$showQoeWidget$3$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final long $total;
    final q $ugcDmQoeDialogComponent;
    int label;
    final x this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.endpage.qoe.UgcDmQoeService$showQoeWidget$3$1$1$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/qoe/UgcDmQoeService$showQoeWidget$3$1$1$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<q.b, Continuation<? super Unit>, Object> {
        final long $total;
        Object L$0;
        int label;
        final x this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(x xVar, long j7, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = xVar;
            this.$total = j7;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$total, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(q.b bVar, Continuation<? super Unit> continuation) {
            return create(bVar, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            q.b bVar = (q.b) this.L$0;
            if (!(bVar instanceof q.b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            x xVar = this.this$0;
            q.b.a aVar = (q.b.a) bVar;
            String str = aVar.f96742a;
            xVar.f96790s = str;
            xVar.f96789r = aVar.f96743b;
            x.a(xVar, false, str);
            MutableStateFlow<UgcDmQoeComponent.State> mutableStateFlow = this.this$0.f96781j;
            mutableStateFlow.tryEmit(UgcDmQoeComponent.State.a((UgcDmQoeComponent.State) mutableStateFlow.getValue(), null, 0L, Math.max(0L, this.$total - (System.currentTimeMillis() - this.this$0.f96786o)), 0, null, null, UgcDmQoeComponent.State.AnimType.DISMISS, 0L, 0, 315));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcDmQoeService$showQoeWidget$3$1$1$1(q qVar, x xVar, long j7, Continuation<? super UgcDmQoeService$showQoeWidget$3$1$1$1> continuation) {
        super(2, continuation);
        this.$ugcDmQoeDialogComponent = qVar;
        this.this$0 = xVar;
        this.$total = j7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UgcDmQoeService$showQoeWidget$3$1$1$1(this.$ugcDmQoeDialogComponent, this.this$0, this.$total, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            SharedFlow<q.b> sharedFlow = this.$ugcDmQoeDialogComponent.h;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$total, null);
            this.label = 1;
            if (FlowKt.collectLatest(sharedFlow, anonymousClass1, this) == coroutine_suspended) {
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
