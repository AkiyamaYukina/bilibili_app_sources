package com.bilibili.ship.theseus.ugc.endpage.relatedrecommand;

import com.alipay.sdk.app.PayTask;
import com.bapis.bilibili.app.viewunite.v1.ViewEndPageCard;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import tv.danmaku.biliplayerv2.service.IPlayerCoreServiceKtxKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/relatedrecommand/UGCEndPageRelatedRecommendService$special$$inlined$flatMapLatest$1.class */
public final class UGCEndPageRelatedRecommendService$special$$inlined$flatMapLatest$1 extends SuspendLambda implements Function3<FlowCollector<? super List<ViewEndPageCard>>, Long, Continuation<? super Unit>, Object> {
    private Object L$0;
    Object L$1;
    int label;
    final UGCEndPageRelatedRecommendService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UGCEndPageRelatedRecommendService$special$$inlined$flatMapLatest$1(Continuation continuation, UGCEndPageRelatedRecommendService uGCEndPageRelatedRecommendService) {
        super(3, continuation);
        this.this$0 = uGCEndPageRelatedRecommendService;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((FlowCollector<? super List<ViewEndPageCard>>) obj, (Long) obj2, (Continuation<? super Unit>) obj3);
    }

    public final Object invoke(FlowCollector<? super List<ViewEndPageCard>> flowCollector, Long l7, Continuation<? super Unit> continuation) {
        UGCEndPageRelatedRecommendService$special$$inlined$flatMapLatest$1 uGCEndPageRelatedRecommendService$special$$inlined$flatMapLatest$1 = new UGCEndPageRelatedRecommendService$special$$inlined$flatMapLatest$1(continuation, this.this$0);
        uGCEndPageRelatedRecommendService$special$$inlined$flatMapLatest$1.L$0 = flowCollector;
        uGCEndPageRelatedRecommendService$special$$inlined$flatMapLatest$1.L$1 = l7;
        return uGCEndPageRelatedRecommendService$special$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            long jLongValue = ((Number) this.L$1).longValue();
            UGCEndPageRelatedRecommendService$viewEndCardsFlow$lambda$1$$inlined$filter$1 uGCEndPageRelatedRecommendService$viewEndCardsFlow$lambda$1$$inlined$filter$1 = new UGCEndPageRelatedRecommendService$viewEndCardsFlow$lambda$1$$inlined$filter$1(IPlayerCoreServiceKtxKt.g(this.this$0.f96804b, jLongValue - PayTask.f60018j, jLongValue - 1));
            final UGCEndPageRelatedRecommendService uGCEndPageRelatedRecommendService = this.this$0;
            final UGCEndPageRelatedRecommendService$viewEndCardsFlow$lambda$1$$inlined$filter$2 uGCEndPageRelatedRecommendService$viewEndCardsFlow$lambda$1$$inlined$filter$2 = new UGCEndPageRelatedRecommendService$viewEndCardsFlow$lambda$1$$inlined$filter$2(uGCEndPageRelatedRecommendService$viewEndCardsFlow$lambda$1$$inlined$filter$1, uGCEndPageRelatedRecommendService);
            Flow flowFilterNotNull = FlowKt.filterNotNull(FlowKt.mapLatest(new Flow<Boolean>(uGCEndPageRelatedRecommendService$viewEndCardsFlow$lambda$1$$inlined$filter$2, uGCEndPageRelatedRecommendService) { // from class: com.bilibili.ship.theseus.ugc.endpage.relatedrecommand.UGCEndPageRelatedRecommendService$viewEndCardsFlow$lambda$1$$inlined$filter$3

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final UGCEndPageRelatedRecommendService$viewEndCardsFlow$lambda$1$$inlined$filter$2 f96850a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final UGCEndPageRelatedRecommendService f96851b;

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.endpage.relatedrecommand.UGCEndPageRelatedRecommendService$viewEndCardsFlow$lambda$1$$inlined$filter$3$2, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/relatedrecommand/UGCEndPageRelatedRecommendService$viewEndCardsFlow$lambda$1$$inlined$filter$3$2.class */
                public static final class AnonymousClass2<T> implements FlowCollector {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final FlowCollector f96852a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final UGCEndPageRelatedRecommendService f96853b;

                    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.endpage.relatedrecommand.UGCEndPageRelatedRecommendService$viewEndCardsFlow$lambda$1$$inlined$filter$3$2$1, reason: invalid class name */
                    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/relatedrecommand/UGCEndPageRelatedRecommendService$viewEndCardsFlow$lambda$1$$inlined$filter$3$2$1.class */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        Object L$1;
                        int label;
                        Object result;
                        final AnonymousClass2 this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(AnonymousClass2 anonymousClass2, Continuation continuation) {
                            super(continuation);
                            this.this$0 = anonymousClass2;
                        }

                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return this.this$0.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector, UGCEndPageRelatedRecommendService uGCEndPageRelatedRecommendService) {
                        this.f96852a = flowCollector;
                        this.f96853b = uGCEndPageRelatedRecommendService;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                        /*
                            Method dump skipped, instruction units count: 354
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.endpage.relatedrecommand.UGCEndPageRelatedRecommendService$viewEndCardsFlow$lambda$1$$inlined$filter$3.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }

                {
                    this.f96850a = uGCEndPageRelatedRecommendService$viewEndCardsFlow$lambda$1$$inlined$filter$2;
                    this.f96851b = uGCEndPageRelatedRecommendService;
                }

                public final Object collect(FlowCollector flowCollector2, Continuation continuation) {
                    Object objCollect = this.f96850a.collect(new AnonymousClass2(flowCollector2, this.f96851b), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            }, new UGCEndPageRelatedRecommendService$viewEndCardsFlow$2$4(uGCEndPageRelatedRecommendService, null)));
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flowFilterNotNull, this) == coroutine_suspended) {
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
