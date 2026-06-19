package com.bilibili.search2.result.all;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/all/SearchResultAllViewModel$searchRecAfterQuest$2.class */
final class SearchResultAllViewModel$searchRecAfterQuest$2 extends SuspendLambda implements Function2<FlowCollector<? super com.bilibili.search2.result.holder.recommend.p>, Continuation<? super Unit>, Object> {
    final com.bilibili.search2.result.base.o $params;
    long J$0;
    private Object L$0;
    Object L$1;
    int label;
    final SearchResultAllViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchResultAllViewModel$searchRecAfterQuest$2(SearchResultAllViewModel searchResultAllViewModel, com.bilibili.search2.result.base.o oVar, Continuation<? super SearchResultAllViewModel$searchRecAfterQuest$2> continuation) {
        super(2, continuation);
        this.this$0 = searchResultAllViewModel;
        this.$params = oVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SearchResultAllViewModel$searchRecAfterQuest$2 searchResultAllViewModel$searchRecAfterQuest$2 = new SearchResultAllViewModel$searchRecAfterQuest$2(this.this$0, this.$params, continuation);
        searchResultAllViewModel$searchRecAfterQuest$2.L$0 = obj;
        return searchResultAllViewModel$searchRecAfterQuest$2;
    }

    public final Object invoke(FlowCollector<? super com.bilibili.search2.result.holder.recommend.p> flowCollector, Continuation<? super Unit> continuation) {
        return create(flowCollector, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:97:0x03f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 1016
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.all.SearchResultAllViewModel$searchRecAfterQuest$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
