package com.bilibili.ship.theseus.ugc.ad;

import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.internal.i;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/ad/DetailAdService$onViewsCreated$6.class */
final class DetailAdService$onViewsCreated$6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final DetailAdService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailAdService$onViewsCreated$6(DetailAdService detailAdService, Continuation<? super DetailAdService$onViewsCreated$6> continuation) {
        super(2, continuation);
        this.this$0 = detailAdService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DetailAdService$onViewsCreated$6(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            final DetailAdService detailAdService = this.this$0;
            TheseusFloatLayerService theseusFloatLayerService = detailAdService.f96262l;
            final Flow[] flowArr = {theseusFloatLayerService.f99658g, theseusFloatLayerService.f99660j, detailAdService.f96258g};
            Flow<Boolean> flow = new Flow<Boolean>(flowArr, detailAdService) { // from class: com.bilibili.ship.theseus.ugc.ad.DetailAdService$onViewsCreated$6$invokeSuspend$lambda$0$$inlined$combine$1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Flow[] f96281a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final DetailAdService f96282b;

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.ad.DetailAdService$onViewsCreated$6$invokeSuspend$lambda$0$$inlined$combine$1$3, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/ad/DetailAdService$onViewsCreated$6$invokeSuspend$lambda$0$$inlined$combine$1$3.class */
                public static final class AnonymousClass3 extends SuspendLambda implements Function3<FlowCollector<? super Boolean>, Boolean[], Continuation<? super Unit>, Object> {
                    private Object L$0;
                    Object L$1;
                    int label;
                    final DetailAdService this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass3(Continuation continuation, DetailAdService detailAdService) {
                        super(3, continuation);
                        this.this$0 = detailAdService;
                    }

                    public final Object invoke(FlowCollector<? super Boolean> flowCollector, Boolean[] boolArr, Continuation<? super Unit> continuation) {
                        AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation, this.this$0);
                        anonymousClass3.L$0 = flowCollector;
                        anonymousClass3.L$1 = boolArr;
                        return anonymousClass3.invokeSuspend(Unit.INSTANCE);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:17:0x00b6  */
                    /* JADX WARN: Removed duplicated region for block: B:20:0x00d1  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                        /*
                            Method dump skipped, instruction units count: 216
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.ad.DetailAdService$onViewsCreated$6$invokeSuspend$lambda$0$$inlined$combine$1.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/ad/DetailAdService$onViewsCreated$6$invokeSuspend$lambda$0$$inlined$combine$1$a.class */
                public static final class a implements Function0<Boolean[]> {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final Flow[] f96283a;

                    public a(Flow[] flowArr) {
                        this.f96283a = flowArr;
                    }

                    public final Object invoke() {
                        return new Boolean[this.f96283a.length];
                    }
                }

                {
                    this.f96281a = flowArr;
                    this.f96282b = detailAdService;
                }

                public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                    Flow[] flowArr2 = this.f96281a;
                    Object objA = i.a(flowArr2, new a(flowArr2), new AnonymousClass3(null, this.f96282b), flowCollector, continuation);
                    return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : Unit.INSTANCE;
                }
            };
            DetailAdService$onViewsCreated$6$1$2 detailAdService$onViewsCreated$6$1$2 = new DetailAdService$onViewsCreated$6$1$2(detailAdService, null);
            this.L$0 = theseusFloatLayerService;
            this.label = 1;
            if (FlowKt.collectLatest(flow, detailAdService$onViewsCreated$6$1$2, this) == coroutine_suspended) {
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
