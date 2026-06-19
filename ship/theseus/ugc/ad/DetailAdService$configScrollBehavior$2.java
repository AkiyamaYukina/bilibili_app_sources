package com.bilibili.ship.theseus.ugc.ad;

import com.bilibili.gripper.api.ad.biz.videodetail.underplayer.IAdUnderPlayerCallback;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/ad/DetailAdService$configScrollBehavior$2.class */
final class DetailAdService$configScrollBehavior$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final IAdUnderPlayerCallback $adView;
    int label;
    final DetailAdService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.ad.DetailAdService$configScrollBehavior$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/ad/DetailAdService$configScrollBehavior$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Float, Continuation<? super Unit>, Object> {
        final IAdUnderPlayerCallback $adView;
        float F$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(IAdUnderPlayerCallback iAdUnderPlayerCallback, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$adView = iAdUnderPlayerCallback;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$adView, continuation);
            anonymousClass1.F$0 = ((Number) obj).floatValue();
            return anonymousClass1;
        }

        public final Object invoke(float f7, Continuation<? super Unit> continuation) {
            return create(Float.valueOf(f7), continuation).invokeSuspend(Unit.INSTANCE);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Number) obj).floatValue(), (Continuation<? super Unit>) obj2);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.$adView.onCollapseRatioChanged(this.F$0);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailAdService$configScrollBehavior$2(DetailAdService detailAdService, IAdUnderPlayerCallback iAdUnderPlayerCallback, Continuation<? super DetailAdService$configScrollBehavior$2> continuation) {
        super(2, continuation);
        this.this$0 = detailAdService;
        this.$adView = iAdUnderPlayerCallback;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DetailAdService$configScrollBehavior$2(this.this$0, this.$adView, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            StateFlow<Float> stateFlow = this.this$0.f96251F;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$adView, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == coroutine_suspended) {
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
