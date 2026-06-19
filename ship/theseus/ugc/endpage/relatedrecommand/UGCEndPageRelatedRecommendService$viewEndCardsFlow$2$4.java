package com.bilibili.ship.theseus.ugc.endpage.relatedrecommand;

import com.bapis.bilibili.app.viewunite.v1.ViewEndPageCard;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/relatedrecommand/UGCEndPageRelatedRecommendService$viewEndCardsFlow$2$4.class */
final class UGCEndPageRelatedRecommendService$viewEndCardsFlow$2$4 extends SuspendLambda implements Function2<Boolean, Continuation<? super List<ViewEndPageCard>>, Object> {
    long J$0;
    int label;
    final UGCEndPageRelatedRecommendService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UGCEndPageRelatedRecommendService$viewEndCardsFlow$2$4(UGCEndPageRelatedRecommendService uGCEndPageRelatedRecommendService, Continuation<? super UGCEndPageRelatedRecommendService$viewEndCardsFlow$2$4> continuation) {
        super(2, continuation);
        this.this$0 = uGCEndPageRelatedRecommendService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UGCEndPageRelatedRecommendService$viewEndCardsFlow$2$4(this.this$0, continuation);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Boolean) obj).booleanValue(), (Continuation<? super List<ViewEndPageCard>>) obj2);
    }

    public final Object invoke(boolean z6, Continuation<? super List<ViewEndPageCard>> continuation) {
        return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r15 = r0
            r0 = r6
            int r0 = r0.label
            r8 = r0
            r0 = 0
            r14 = r0
            r0 = r8
            if (r0 == 0) goto L2d
            r0 = r8
            r1 = 1
            if (r0 != r1) goto L23
            r0 = r6
            long r0 = r0.J$0
            r10 = r0
            r0 = r7
            kotlin.ResultKt.throwOnFailure(r0)
            goto L70
        L23:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L2d:
            r0 = r7
            kotlin.ResultKt.throwOnFailure(r0)
            java.lang.String r0 = "EndPageRelatedRecommend"
            java.lang.String r1 = "ViewEndRecommend trigger detected, initiating view request"
            tv.danmaku.android.log.BLog.i(r0, r1)
            long r0 = java.lang.System.currentTimeMillis()
            r10 = r0
            r0 = r6
            com.bilibili.ship.theseus.ugc.endpage.relatedrecommand.UGCEndPageRelatedRecommendService r0 = r0.this$0
            r7 = r0
            r0 = r6
            r1 = r10
            r0.J$0 = r1
            r0 = r6
            r1 = 1
            r0.label = r1
            boolean r0 = com.bilibili.ship.theseus.ugc.endpage.relatedrecommand.UGCEndPageRelatedRecommendService.f96802x
            r9 = r0
            r0 = r7
            java.lang.Class r0 = r0.getClass()
            kotlinx.coroutines.CoroutineDispatcher r0 = kotlinx.coroutines.Dispatchers.getIO()
            com.bilibili.ship.theseus.ugc.endpage.relatedrecommand.UGCEndPageRelatedRecommendService$requestViewEndPage$2 r1 = new com.bilibili.ship.theseus.ugc.endpage.relatedrecommand.UGCEndPageRelatedRecommendService$requestViewEndPage$2
            r2 = r1
            r3 = r7
            r4 = 0
            r2.<init>(r3, r4)
            r2 = r6
            java.lang.Object r0 = kotlinx.coroutines.BuildersKt.withContext(r0, r1, r2)
            r7 = r0
            r0 = r7
            r1 = r15
            if (r0 != r1) goto L70
            r0 = r15
            return r0
        L70:
            r0 = r7
            com.bapis.bilibili.app.viewunite.v1.ViewEndPageReply r0 = (com.bapis.bilibili.app.viewunite.v1.ViewEndPageReply) r0
            r7 = r0
            r0 = r6
            com.bilibili.ship.theseus.ugc.endpage.relatedrecommand.UGCEndPageRelatedRecommendService r0 = r0.this$0
            r15 = r0
            r0 = r15
            r1 = 1
            r0.f96821t = r1
            r0 = r7
            if (r0 == 0) goto Lab
            long r0 = java.lang.System.currentTimeMillis()
            r12 = r0
            r0 = r15
            java.lang.Class r0 = r0.getClass()
            r0 = r12
            r1 = r10
            long r0 = r0 - r1
            r1 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto Lab
            java.lang.String r0 = "EndPageRelatedRecommend"
            java.lang.String r1 = "ViewEndRecommend response received in time, providing new cards"
            tv.danmaku.android.log.BLog.i(r0, r1)
            r0 = r7
            java.util.List r0 = r0.getRelatesList()
            r7 = r0
            goto Lb5
        Lab:
            java.lang.String r0 = "EndPageRelatedRecommend"
            java.lang.String r1 = "ViewEndRecommend response was null or too late, ignoring"
            tv.danmaku.android.log.BLog.i(r0, r1)
            r0 = r14
            r7 = r0
        Lb5:
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.endpage.relatedrecommand.UGCEndPageRelatedRecommendService$viewEndCardsFlow$2$4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
