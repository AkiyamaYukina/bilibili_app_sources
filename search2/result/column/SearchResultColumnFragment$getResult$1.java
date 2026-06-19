package com.bilibili.search2.result.column;

import com.bilibili.search2.result.base.SearchState;
import com.bilibili.search2.result.base.u;
import com.bilibili.search2.result.base.x;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/column/SearchResultColumnFragment$getResult$1.class */
final class SearchResultColumnFragment$getResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final boolean $isLoadMore;
    int label;
    final SearchResultColumnFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchResultColumnFragment$getResult$1(SearchResultColumnFragment searchResultColumnFragment, boolean z6, Continuation<? super SearchResultColumnFragment$getResult$1> continuation) {
        super(2, continuation);
        this.this$0 = searchResultColumnFragment;
        this.$isLoadMore = z6;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchResultColumnFragment$getResult$1(this.this$0, this.$isLoadMore, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            SearchResultColumnFragment searchResultColumnFragment = this.this$0;
            MutableSharedFlow<u> mutableSharedFlow = searchResultColumnFragment.f87474d;
            x.a aVar = searchResultColumnFragment.f87718H;
            x.a aVar2 = aVar;
            if (aVar == null) {
                String next = ((SearchState) searchResultColumnFragment.rf().f87499f.getValue()).getNext();
                SearchResultColumnFragment searchResultColumnFragment2 = this.this$0;
                String str = searchResultColumnFragment2.f87711A;
                long j7 = searchResultColumnFragment2.f87713C;
                boolean z6 = Xs0.b.f28321a;
                String str2 = z6 ? null : searchResultColumnFragment2.f87712B;
                boolean z7 = this.$isLoadMore;
                int iIncrementAndGet = searchResultColumnFragment2.rf().f87498e.incrementAndGet();
                SearchResultColumnFragment searchResultColumnFragment3 = this.this$0;
                String str3 = searchResultColumnFragment3.f87714D;
                String str4 = searchResultColumnFragment3.f87715E;
                if (!z6) {
                    searchResultColumnFragment3.rf().getClass();
                }
                aVar2 = new x.a(next, str, j7, str2, str3, str4, !z7, iIncrementAndGet, null, this.this$0.rf().L0());
            }
            u.k kVar = new u.k(aVar2);
            this.label = 1;
            if (mutableSharedFlow.emit(kVar, this) == coroutine_suspended) {
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
