package com.bilibili.search2.result.column;

import com.bilibili.search2.result.base.x;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/column/SearchResultColumnFragment$resetTabState$1.class */
public final class SearchResultColumnFragment$resetTabState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final SearchResultColumnFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchResultColumnFragment$resetTabState$1(SearchResultColumnFragment searchResultColumnFragment, Continuation<? super SearchResultColumnFragment$resetTabState$1> continuation) {
        super(2, continuation);
        this.this$0 = searchResultColumnFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchResultColumnFragment$resetTabState$1(this.this$0, continuation);
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
        SearchResultColumnFragment searchResultColumnFragment = this.this$0;
        searchResultColumnFragment.f87713C = 0L;
        searchResultColumnFragment.f87712B = null;
        searchResultColumnFragment.rf().getClass();
        SearchResultColumnFragment searchResultColumnFragment2 = this.this$0;
        String str = searchResultColumnFragment2.f87711A;
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        int iIncrementAndGet = searchResultColumnFragment2.rf().f87498e.incrementAndGet();
        SearchResultColumnFragment searchResultColumnFragment3 = this.this$0;
        searchResultColumnFragment2.f87718H = new x.a(null, str2, 0L, null, searchResultColumnFragment3.f87714D, searchResultColumnFragment3.f87715E, true, iIncrementAndGet, null, null);
        return Unit.INSTANCE;
    }
}
