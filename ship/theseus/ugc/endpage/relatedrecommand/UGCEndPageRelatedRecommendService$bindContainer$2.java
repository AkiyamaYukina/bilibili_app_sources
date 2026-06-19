package com.bilibili.ship.theseus.ugc.endpage.relatedrecommand;

import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.ogv.infra.util.g;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/relatedrecommand/UGCEndPageRelatedRecommendService$bindContainer$2.class */
public final class UGCEndPageRelatedRecommendService$bindContainer$2 extends SuspendLambda implements Function2<List<? extends RunningUIComponent>, Continuation<? super Unit>, Object> {
    final com.bilibili.app.gemini.ugc.feature.endpage.relatedreccommend.a $container;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UGCEndPageRelatedRecommendService$bindContainer$2(com.bilibili.app.gemini.ugc.feature.endpage.relatedreccommend.a aVar, Continuation<? super UGCEndPageRelatedRecommendService$bindContainer$2> continuation) {
        super(2, continuation);
        this.$container = aVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UGCEndPageRelatedRecommendService$bindContainer$2 uGCEndPageRelatedRecommendService$bindContainer$2 = new UGCEndPageRelatedRecommendService$bindContainer$2(this.$container, continuation);
        uGCEndPageRelatedRecommendService$bindContainer$2.L$0 = obj;
        return uGCEndPageRelatedRecommendService$bindContainer$2;
    }

    public final Object invoke(List<RunningUIComponent> list, Continuation<? super Unit> continuation) {
        return create(list, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$container.b(g.a((List) this.L$0, new Object()));
        return Unit.INSTANCE;
    }
}
