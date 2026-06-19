package com.bilibili.search2.result.holder.aichat;

import com.bapis.bilibili.app.search.v2.Action;
import com.bapis.bilibili.app.search.v2.SearchLikeReq;
import com.bapis.bilibili.app.search.v2.SearchMoss;
import com.bapis.bilibili.app.search.v2.SearchMossKtxKt;
import com.bilibili.lib.moss.api.CallOptions;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/aichat/SearchAIChatHolder$reportLikeAction$1.class */
final class SearchAIChatHolder$reportLikeAction$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Action $action;
    final String $business;
    final long $messageId;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchAIChatHolder$reportLikeAction$1(Action action, String str, long j7, Continuation<? super SearchAIChatHolder$reportLikeAction$1> continuation) {
        super(2, continuation);
        this.$action = action;
        this.$business = str;
        this.$messageId = j7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchAIChatHolder$reportLikeAction$1(this.$action, this.$business, this.$messageId, continuation);
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
                Action action = this.$action;
                String str = this.$business;
                long j7 = this.$messageId;
                this.label = 1;
                if (SearchMossKtxKt.suspendSearchLike(new SearchMoss((String) null, 0, (CallOptions) null, 7, (DefaultConstructorMarker) null), SearchLikeReq.newBuilder().setAction(action).setBusiness(str).setMessageId(j7).build(), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (Exception e7) {
        }
        return Unit.INSTANCE;
    }
}
