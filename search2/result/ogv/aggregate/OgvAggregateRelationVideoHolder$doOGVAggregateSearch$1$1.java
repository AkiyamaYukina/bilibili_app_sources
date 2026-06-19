package com.bilibili.search2.result.ogv.aggregate;

import com.bilibili.search2.api.SearchOgvClusterRelationItem;
import com.bilibili.search2.result.all.SearchResultAllFragment;
import com.bilibili.search2.result.all.SearchResultAllViewModel;
import com.bilibili.search2.result.base.u;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/ogv/aggregate/OgvAggregateRelationVideoHolder$doOGVAggregateSearch$1$1.class */
final class OgvAggregateRelationVideoHolder$doOGVAggregateSearch$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final boolean $forceRetry;
    final SearchResultAllFragment $this_apply;
    int label;
    final s this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvAggregateRelationVideoHolder$doOGVAggregateSearch$1$1(boolean z6, s sVar, SearchResultAllFragment searchResultAllFragment, Continuation<? super OgvAggregateRelationVideoHolder$doOGVAggregateSearch$1$1> continuation) {
        super(2, continuation);
        this.$forceRetry = z6;
        this.this$0 = sVar;
        this.$this_apply = searchResultAllFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(int i7, int i8) {
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OgvAggregateRelationVideoHolder$doOGVAggregateSearch$1$1(this.$forceRetry, this.this$0, this.$this_apply, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [com.bilibili.search2.result.ogv.aggregate.t, java.lang.Object] */
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        String str = null;
        if (this.$forceRetry) {
            ((SearchOgvClusterRelationItem) this.this$0.getData()).setCurrentSelectedFirstExtra(null);
            ((SearchOgvClusterRelationItem) this.this$0.getData()).setCurrentSelectedSecondExtra(null);
            ((SearchOgvClusterRelationItem) this.this$0.getData()).setCurrentSelectedSort(SearchOgvClusterRelationItem.Sort.DEFAULT);
        }
        SearchResultAllViewModel searchResultAllViewModelRf = this.$this_apply.rf();
        s sVar = this.this$0;
        com.bilibili.search2.api.g gVar = sVar.f88404b;
        if (gVar != null) {
            str = gVar.f86341g;
        }
        int i7 = gVar != null ? gVar.f86338d : 0;
        SearchOgvClusterRelationItem.Sort currentSelectedSort = ((SearchOgvClusterRelationItem) sVar.getData()).getCurrentSelectedSort();
        String currentSelectedFirstExtra = ((SearchOgvClusterRelationItem) this.this$0.getData()).getCurrentSelectedFirstExtra();
        if (currentSelectedFirstExtra == null) {
            currentSelectedFirstExtra = "";
        }
        String currentSelectedSecondExtra = ((SearchOgvClusterRelationItem) this.this$0.getData()).getCurrentSelectedSecondExtra();
        if (currentSelectedSecondExtra == null) {
            currentSelectedSecondExtra = "";
        }
        searchResultAllViewModelRf.V0(new u.f(new a(i7, currentSelectedSort, currentSelectedFirstExtra, currentSelectedSecondExtra, str, new Object(), this.this$0.f88404b, this.$forceRetry)));
        return Unit.INSTANCE;
    }
}
