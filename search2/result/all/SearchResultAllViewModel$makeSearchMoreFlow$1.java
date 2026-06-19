package com.bilibili.search2.result.all;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/all/SearchResultAllViewModel$makeSearchMoreFlow$1.class */
final class SearchResultAllViewModel$makeSearchMoreFlow$1 extends SuspendLambda implements Function2<FlowCollector<? super com.bilibili.search2.result.base.q>, Continuation<? super Unit>, Object> {
    final boolean $isWideScreen;
    final com.bilibili.search2.result.base.v $searchMoreParams;
    long J$0;
    private Object L$0;
    Object L$1;
    int label;
    final SearchResultAllViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchResultAllViewModel$makeSearchMoreFlow$1(com.bilibili.search2.result.base.v vVar, SearchResultAllViewModel searchResultAllViewModel, boolean z6, Continuation<? super SearchResultAllViewModel$makeSearchMoreFlow$1> continuation) {
        super(2, continuation);
        this.$searchMoreParams = vVar;
        this.this$0 = searchResultAllViewModel;
        this.$isWideScreen = z6;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SearchResultAllViewModel$makeSearchMoreFlow$1 searchResultAllViewModel$makeSearchMoreFlow$1 = new SearchResultAllViewModel$makeSearchMoreFlow$1(this.$searchMoreParams, this.this$0, this.$isWideScreen, continuation);
        searchResultAllViewModel$makeSearchMoreFlow$1.L$0 = obj;
        return searchResultAllViewModel$makeSearchMoreFlow$1;
    }

    public final Object invoke(FlowCollector<? super com.bilibili.search2.result.base.q> flowCollector, Continuation<? super Unit> continuation) {
        return create(flowCollector, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x042c A[Catch: MossException -> 0x0460, BusinessException -> 0x0465, TRY_ENTER, TRY_LEAVE, TryCatch #10 {BusinessException -> 0x0465, MossException -> 0x0460, blocks: (B:88:0x0420, B:90:0x042c, B:97:0x046a, B:99:0x0477, B:101:0x0482), top: B:155:0x0420 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0477 A[Catch: MossException -> 0x0460, BusinessException -> 0x0465, TryCatch #10 {BusinessException -> 0x0465, MossException -> 0x0460, blocks: (B:88:0x0420, B:90:0x042c, B:97:0x046a, B:99:0x0477, B:101:0x0482), top: B:155:0x0420 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r34) {
        /*
            Method dump skipped, instruction units count: 1539
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.all.SearchResultAllViewModel$makeSearchMoreFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
