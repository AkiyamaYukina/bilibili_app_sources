package com.bilibili.search2.result.holder.chatgpt;

import com.bapis.bilibili.app.search.v2.Action;
import com.bapis.bilibili.app.search.v2.SearchLikeReq;
import com.bapis.bilibili.app.search.v2.SearchMoss;
import com.bapis.bilibili.app.search.v2.SearchMossKtxKt;
import com.bilibili.lib.moss.api.CallOptions;
import com.bilibili.search2.result.holder.chatgpt.api.SearchChatResultItem;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/chatgpt/ChatBubbleViewHolder$reportClick$1.class */
public final class ChatBubbleViewHolder$reportClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Action $action;
    int label;
    final ChatBubbleViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatBubbleViewHolder$reportClick$1(ChatBubbleViewHolder chatBubbleViewHolder, Action action, Continuation<? super ChatBubbleViewHolder$reportClick$1> continuation) {
        super(2, continuation);
        this.this$0 = chatBubbleViewHolder;
        this.$action = action;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatBubbleViewHolder$reportClick$1(this.this$0, this.$action, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
        } catch (Exception e7) {
            e7.printStackTrace();
        }
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            SearchChatResultItem searchChatResultItem = this.this$0.f87907c.f87937f;
            Long messageId = null;
            String business = searchChatResultItem != null ? searchChatResultItem.getBusiness() : null;
            SearchChatResultItem searchChatResultItem2 = this.this$0.f87907c.f87937f;
            if (searchChatResultItem2 != null) {
                messageId = searchChatResultItem2.getMessageId();
            }
            Action action = this.$action;
            if (business != null && messageId != null) {
                long jLongValue = messageId.longValue();
                this.label = 1;
                if (SearchMossKtxKt.suspendSearchLike(new SearchMoss((String) null, 0, (CallOptions) null, 7, (DefaultConstructorMarker) null), SearchLikeReq.newBuilder().setAction(action).setBusiness(business).setMessageId(jLongValue).build(), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        if (i7 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Unit.INSTANCE;
    }
}
