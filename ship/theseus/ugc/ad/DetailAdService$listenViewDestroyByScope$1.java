package com.bilibili.ship.theseus.ugc.ad;

import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import zv0.C9268a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/ad/DetailAdService$listenViewDestroyByScope$1.class */
final class DetailAdService$listenViewDestroyByScope$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Flow<C9268a.C1396a> $viewsFlow;
    int label;
    final DetailAdService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.ad.DetailAdService$listenViewDestroyByScope$1$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/ad/DetailAdService$listenViewDestroyByScope$1$3.class */
    public static final /* synthetic */ class AnonymousClass3 extends AdaptedFunctionReference implements Function3<Boolean, C9268a.C1396a, Continuation<? super Pair<? extends Boolean, ? extends C9268a.C1396a>>, Object>, SuspendFunction {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(3, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke(((Boolean) obj).booleanValue(), (C9268a.C1396a) obj2, (Continuation<? super Pair<Boolean, C9268a.C1396a>>) obj3);
        }

        public final Object invoke(boolean z6, C9268a.C1396a c1396a, Continuation<? super Pair<Boolean, C9268a.C1396a>> continuation) {
            return DetailAdService$listenViewDestroyByScope$1.invokeSuspend$lambda$0(z6, c1396a, continuation);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.ad.DetailAdService$listenViewDestroyByScope$1$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/ad/DetailAdService$listenViewDestroyByScope$1$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<Pair<? extends Boolean, ? extends C9268a.C1396a>, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final DetailAdService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(DetailAdService detailAdService, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = detailAdService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, continuation);
            anonymousClass4.L$0 = obj;
            return anonymousClass4;
        }

        public final Object invoke(Pair<Boolean, C9268a.C1396a> pair, Continuation<? super Unit> continuation) {
            return create(pair, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Pair pair = (Pair) this.L$0;
            boolean zBooleanValue = ((Boolean) pair.component1()).booleanValue();
            if (((C9268a.C1396a) pair.component2()) == null) {
                return Unit.INSTANCE;
            }
            if (zBooleanValue) {
                this.this$0.c();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailAdService$listenViewDestroyByScope$1(DetailAdService detailAdService, Flow<C9268a.C1396a> flow, Continuation<? super DetailAdService$listenViewDestroyByScope$1> continuation) {
        super(2, continuation);
        this.this$0 = detailAdService;
        this.$viewsFlow = flow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object invokeSuspend$lambda$0(boolean z6, C9268a.C1396a c1396a, Continuation continuation) {
        return new Pair(Boxing.boxBoolean(z6), c1396a);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DetailAdService$listenViewDestroyByScope$1(this.this$0, this.$viewsFlow, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flowCombine = FlowKt.combine(this.this$0.f96272v, this.$viewsFlow, AnonymousClass3.INSTANCE);
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowCombine, anonymousClass4, this) == coroutine_suspended) {
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
