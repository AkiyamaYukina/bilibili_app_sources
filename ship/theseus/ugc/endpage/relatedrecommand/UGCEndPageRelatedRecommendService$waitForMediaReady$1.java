package com.bilibili.ship.theseus.ugc.endpage.relatedrecommand;

import com.bilibili.player.tangram.playercore.u;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/relatedrecommand/UGCEndPageRelatedRecommendService$waitForMediaReady$1.class */
final class UGCEndPageRelatedRecommendService$waitForMediaReady$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final UGCEndPageRelatedRecommendService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.endpage.relatedrecommand.UGCEndPageRelatedRecommendService$waitForMediaReady$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/relatedrecommand/UGCEndPageRelatedRecommendService$waitForMediaReady$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<u, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final UGCEndPageRelatedRecommendService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UGCEndPageRelatedRecommendService uGCEndPageRelatedRecommendService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = uGCEndPageRelatedRecommendService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(u uVar, Continuation<? super Unit> continuation) {
            return create(uVar, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            u uVar = (u) this.L$0;
            if (uVar != null && uVar.f79458a.getState() >= 3) {
                Long lH = this.this$0.f96812k.h();
                long jLongValue = lH != null ? lH.longValue() : 0L;
                if (((Number) this.this$0.f96822u.getValue()).longValue() != jLongValue) {
                    this.this$0.f96822u.setValue(Boxing.boxLong(jLongValue));
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UGCEndPageRelatedRecommendService$waitForMediaReady$1(UGCEndPageRelatedRecommendService uGCEndPageRelatedRecommendService, Continuation<? super UGCEndPageRelatedRecommendService$waitForMediaReady$1> continuation) {
        super(2, continuation);
        this.this$0 = uGCEndPageRelatedRecommendService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UGCEndPageRelatedRecommendService$waitForMediaReady$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Flow<u> flowB = this.this$0.f96812k.b();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowB, anonymousClass1, this) == coroutine_suspended) {
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
