package com.bilibili.search2.result.holder.chatgpt;

import com.bapis.bilibili.app.search.v2.CancelChatTaskReq;
import com.bapis.bilibili.app.search.v2.SearchMoss;
import com.bapis.bilibili.app.search.v2.SearchMossKtxKt;
import com.bilibili.lib.moss.api.CallOptions;
import com.bilibili.search2.result.holder.chatgpt.SearchChatGptHolder;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/chatgpt/SearchChatGptHolder$destroy$1$1.class */
public final class SearchChatGptHolder$destroy$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $it;
    int label;
    final SearchChatGptHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchChatGptHolder$destroy$1$1(String str, SearchChatGptHolder searchChatGptHolder, Continuation<? super SearchChatGptHolder$destroy$1$1> continuation) {
        super(2, continuation);
        this.$it = str;
        this.this$0 = searchChatGptHolder;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchChatGptHolder$destroy$1$1(this.$it, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                String str = this.$it;
                String str2 = this.this$0.f87935d;
                this.label = 1;
                if (SearchMossKtxKt.suspendCancelChatTask(new SearchMoss((String) null, 0, (CallOptions) null, 7, (DefaultConstructorMarker) null), CancelChatTaskReq.newBuilder().setSessionId(str).setFromSource(str2).build(), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            SearchChatGptHolder.a aVar = SearchChatGptHolder.f87922q;
            SearchChatGptHolder.a.c(null, "searchCancelChatTaskSuspend execute success");
        } catch (Throwable th) {
            SearchChatGptHolder.a aVar2 = SearchChatGptHolder.f87922q;
            SearchChatGptHolder.a.c(null, "reset error = " + th.getMessage());
        }
        return Unit.INSTANCE;
    }
}
