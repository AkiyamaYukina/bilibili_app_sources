package com.bilibili.ship.theseus.ugc.endpage.relatedrecommand;

import com.bapis.bilibili.app.viewunite.common.RelateCard;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/relatedrecommand/UGCEndPageRelatedRecommendService$special$$inlined$map$1.class */
public final class UGCEndPageRelatedRecommendService$special$$inlined$map$1 implements Flow<List<? extends RelateCard>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StateFlow f96840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UGCEndPageRelatedRecommendService f96841b;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.endpage.relatedrecommand.UGCEndPageRelatedRecommendService$special$$inlined$map$1$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/relatedrecommand/UGCEndPageRelatedRecommendService$special$$inlined$map$1$2.class */
    public static final class AnonymousClass2<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FlowCollector f96842a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final UGCEndPageRelatedRecommendService f96843b;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.endpage.relatedrecommand.UGCEndPageRelatedRecommendService$special$$inlined$map$1$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/relatedrecommand/UGCEndPageRelatedRecommendService$special$$inlined$map$1$2$1.class */
        public static final class AnonymousClass1 extends ContinuationImpl {
            Object L$0;
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
            this.f96842a = flowCollector;
            this.f96843b = uGCEndPageRelatedRecommendService;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
        /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.Comparator] */
        /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList, java.util.Collection] */
        /* JADX WARN: Type inference failed for: r6v5 */
        /* JADX WARN: Type inference failed for: r6v6 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
            /*
                Method dump skipped, instruction units count: 454
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.endpage.relatedrecommand.UGCEndPageRelatedRecommendService$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public UGCEndPageRelatedRecommendService$special$$inlined$map$1(StateFlow stateFlow, UGCEndPageRelatedRecommendService uGCEndPageRelatedRecommendService) {
        this.f96840a = stateFlow;
        this.f96841b = uGCEndPageRelatedRecommendService;
    }

    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        Object objCollect = this.f96840a.collect(new AnonymousClass2(flowCollector, this.f96841b), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }
}
