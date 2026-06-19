package com.bilibili.search2.result.holder.chatgpt;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/chatgpt/SearchChatGptHolder$getChatResult$1.class */
final class SearchChatGptHolder$getChatResult$1 extends ContinuationImpl {
    int label;
    Object result;
    final SearchChatGptHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchChatGptHolder$getChatResult$1(SearchChatGptHolder searchChatGptHolder, Continuation<? super SearchChatGptHolder$getChatResult$1> continuation) {
        super(continuation);
        this.this$0 = searchChatGptHolder;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return SearchChatGptHolder.q0(this.this$0, null, null, this);
    }
}
