package com.bilibili.search2.result.holder.chatgpt.api;

import com.bilibili.search2.result.holder.chatgpt.api.SearchChatResultItem;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/chatgpt/api/SearchChatResultItem$Bubble$typeWriterAnim$2.class */
public final class SearchChatResultItem$Bubble$typeWriterAnim$2 extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    Object result;
    final SearchChatResultItem.Bubble this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchChatResultItem$Bubble$typeWriterAnim$2(SearchChatResultItem.Bubble bubble, Continuation<? super SearchChatResultItem$Bubble$typeWriterAnim$2> continuation) {
        super(continuation);
        this.this$0 = bubble;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.typeWriterAnim(null, null, null, null, this);
    }
}
