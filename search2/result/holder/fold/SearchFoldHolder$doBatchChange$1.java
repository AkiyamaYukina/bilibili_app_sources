package com.bilibili.search2.result.holder.fold;

import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.search2.result.all.SearchResultAllFragment;
import com.bilibili.search2.result.all.SearchResultAllViewModel;
import com.bilibili.search2.result.base.SearchState;
import com.bilibili.search2.result.base.h;
import com.bilibili.search2.result.base.u;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/fold/SearchFoldHolder$doBatchChange$1.class */
final class SearchFoldHolder$doBatchChange$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final SearchResultAllFragment $this_doBatchChange;
    int label;
    final d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchFoldHolder$doBatchChange$1(d dVar, SearchResultAllFragment searchResultAllFragment, Continuation<? super SearchFoldHolder$doBatchChange$1> continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$this_doBatchChange = searchResultAllFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchFoldHolder$doBatchChange$1(this.this$0, this.$this_doBatchChange, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        int bindingAdapterPosition = this.this$0.getBindingAdapterPosition();
        if (bindingAdapterPosition > 0) {
            SearchResultAllViewModel searchResultAllViewModelRf = this.$this_doBatchChange.rf();
            List<BaseSearchItem> foldedItems = ((SearchState) this.$this_doBatchChange.rf().f87499f.getValue()).getFoldedItems();
            searchResultAllViewModelRf.V0(new u.a(new h(bindingAdapterPosition, foldedItems != null ? foldedItems.size() : 0)));
        }
        return Unit.INSTANCE;
    }
}
