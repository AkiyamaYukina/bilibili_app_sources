package com.bilibili.search2.result.holder.chatgpt;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/chatgpt/SearchChatGptHolder$retryListener$1$1$1.class */
public final class SearchChatGptHolder$retryListener$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $keyword;
    final String $sessionId;
    int label;
    final SearchChatGptHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchChatGptHolder$retryListener$1$1$1(SearchChatGptHolder searchChatGptHolder, String str, String str2, Continuation<? super SearchChatGptHolder$retryListener$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = searchChatGptHolder;
        this.$keyword = str;
        this.$sessionId = str2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchChatGptHolder$retryListener$1$1$1(this.this$0, this.$keyword, this.$sessionId, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            SearchChatGptHolder searchChatGptHolder = this.this$0;
            String str = this.$keyword;
            String str2 = this.$sessionId;
            this.label = 1;
            if (SearchChatGptHolder.q0(searchChatGptHolder, str, str2, this) == coroutine_suspended) {
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
