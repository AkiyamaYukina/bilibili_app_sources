package com.bilibili.ship.theseus.ugc.ad;

import com.bilibili.ship.theseus.ugc.play.UGCPlaybackRepository$special$$inlined$map$1;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/ad/DetailAdService$onViewsCreated$7.class */
final class DetailAdService$onViewsCreated$7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final DetailAdService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.ad.DetailAdService$onViewsCreated$7$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/ad/DetailAdService$onViewsCreated$7$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Av0.a, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final DetailAdService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DetailAdService detailAdService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = detailAdService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(Av0.a aVar, Continuation<? super Unit> continuation) {
            return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x009e  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00b6  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x008e A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                Method dump skipped, instruction units count: 267
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.ad.DetailAdService$onViewsCreated$7.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailAdService$onViewsCreated$7(DetailAdService detailAdService, Continuation<? super DetailAdService$onViewsCreated$7> continuation) {
        super(2, continuation);
        this.this$0 = detailAdService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DetailAdService$onViewsCreated$7(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            DetailAdService detailAdService = this.this$0;
            UGCPlaybackRepository$special$$inlined$map$1 uGCPlaybackRepository$special$$inlined$map$1 = detailAdService.f96264n.f98076u;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(detailAdService, null);
            this.label = 1;
            if (FlowKt.collectLatest(uGCPlaybackRepository$special$$inlined$map$1, anonymousClass1, this) == coroutine_suspended) {
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
