package com.bilibili.search2.result.all;

import com.bilibili.search2.result.base.u;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/all/SearchResultAllViewModel$toEffectFlow$10.class */
final class SearchResultAllViewModel$toEffectFlow$10 extends SuspendLambda implements Function2<FlowCollector<? super com.bilibili.search2.result.base.q>, Continuation<? super Unit>, Object> {
    final u.h $this_toEffectFlow;
    private Object L$0;
    int label;
    final SearchResultAllViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchResultAllViewModel$toEffectFlow$10(SearchResultAllViewModel searchResultAllViewModel, u.h hVar, Continuation<? super SearchResultAllViewModel$toEffectFlow$10> continuation) {
        super(2, continuation);
        this.this$0 = searchResultAllViewModel;
        this.$this_toEffectFlow = hVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SearchResultAllViewModel$toEffectFlow$10 searchResultAllViewModel$toEffectFlow$10 = new SearchResultAllViewModel$toEffectFlow$10(this.this$0, this.$this_toEffectFlow, continuation);
        searchResultAllViewModel$toEffectFlow$10.L$0 = obj;
        return searchResultAllViewModel$toEffectFlow$10;
    }

    public final Object invoke(FlowCollector<? super com.bilibili.search2.result.base.q> flowCollector, Continuation<? super Unit> continuation) {
        return create(flowCollector, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r9 = r0
            r0 = r5
            int r0 = r0.label
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L24
            r0 = r7
            r1 = 1
            if (r0 != r1) goto L1a
            r0 = r6
            kotlin.ResultKt.throwOnFailure(r0)
            goto Lb6
        L1a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L24:
            r0 = r6
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r5
            java.lang.Object r0 = r0.L$0
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            r10 = r0
            r0 = r5
            com.bilibili.search2.result.all.SearchResultAllViewModel r0 = r0.this$0
            kotlinx.coroutines.flow.StateFlow<com.bilibili.search2.result.base.SearchState> r0 = r0.f87499f
            java.lang.Object r0 = r0.getValue()
            com.bilibili.search2.result.base.SearchState r0 = (com.bilibili.search2.result.base.SearchState) r0
            java.util.List r0 = r0.getAllResultList()
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L56
            r0 = r6
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.List r0 = kotlin.collections.CollectionsKt.toMutableList(r0)
            r8 = r0
            r0 = r8
            r6 = r0
            r0 = r8
            if (r0 != 0) goto L5e
        L56:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r6 = r0
        L5e:
            r0 = r6
            r1 = r5
            com.bilibili.search2.result.base.u$h r1 = r1.$this_toEffectFlow
            com.bilibili.search2.result.base.p r1 = r1.f87635a
            com.bilibili.search2.api.BaseSearchItem r1 = r1.f87573a
            int r0 = r0.indexOf(r1)
            r7 = r0
            r0 = r7
            if (r0 < 0) goto Lb6
            r0 = r7
            r1 = r6
            int r1 = r1.size()
            if (r0 >= r1) goto Lb6
            r0 = r5
            com.bilibili.search2.result.base.u$h r0 = r0.$this_toEffectFlow
            com.bilibili.search2.result.base.p r0 = r0.f87635a
            com.bilibili.search2.api.BaseSearchItem r0 = r0.f87573a
            boolean r0 = r0.getEnableFeedbackRemoveItem()
            if (r0 == 0) goto Lb6
            com.bilibili.search2.result.base.q$a$d r0 = new com.bilibili.search2.result.base.q$a$d
            r1 = r0
            r2 = r5
            com.bilibili.search2.result.base.u$h r2 = r2.$this_toEffectFlow
            com.bilibili.search2.result.base.p r2 = r2.f87635a
            com.bilibili.search2.api.BaseSearchItem r2 = r2.f87573a
            r3 = r7
            r1.<init>(r2, r3)
            r6 = r0
            r0 = r5
            r1 = 1
            r0.label = r1
            r0 = r10
            r1 = r6
            r2 = r5
            java.lang.Object r0 = r0.emit(r1, r2)
            r1 = r9
            if (r0 != r1) goto Lb6
            r0 = r9
            return r0
        Lb6:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.all.SearchResultAllViewModel$toEffectFlow$10.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
