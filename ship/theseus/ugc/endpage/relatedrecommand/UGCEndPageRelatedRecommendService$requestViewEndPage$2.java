package com.bilibili.ship.theseus.ugc.endpage.relatedrecommand;

import com.bapis.bilibili.app.viewunite.v1.ViewEndPageReply;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/relatedrecommand/UGCEndPageRelatedRecommendService$requestViewEndPage$2.class */
final class UGCEndPageRelatedRecommendService$requestViewEndPage$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ViewEndPageReply>, Object> {
    int label;
    final UGCEndPageRelatedRecommendService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UGCEndPageRelatedRecommendService$requestViewEndPage$2(UGCEndPageRelatedRecommendService uGCEndPageRelatedRecommendService, Continuation<? super UGCEndPageRelatedRecommendService$requestViewEndPage$2> continuation) {
        super(2, continuation);
        this.this$0 = uGCEndPageRelatedRecommendService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UGCEndPageRelatedRecommendService$requestViewEndPage$2(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ViewEndPageReply> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 443
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.endpage.relatedrecommand.UGCEndPageRelatedRecommendService$requestViewEndPage$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
