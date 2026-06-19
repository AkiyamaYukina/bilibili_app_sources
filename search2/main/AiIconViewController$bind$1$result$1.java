package com.bilibili.search2.main;

import com.bapis.bilibili.app.search.v2.GetChatAuthReply;
import com.bapis.bilibili.app.search.v2.GetChatAuthReq;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/AiIconViewController$bind$1$result$1.class */
public final class AiIconViewController$bind$1$result$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super GetChatAuthReply>, Object> {
    int label;

    public AiIconViewController$bind$1$result$1(Continuation<? super AiIconViewController$bind$1$result$1> continuation) {
        super(2, continuation);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AiIconViewController$bind$1$result$1(continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super GetChatAuthReply> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            Object objSuspendGetChatAuth = SearchMossKtxKt.suspendGetChatAuth(new SearchMoss((String) null, 0, (CallOptions) null, 7, (DefaultConstructorMarker) null), GetChatAuthReq.newBuilder().build(), this);
            obj = objSuspendGetChatAuth;
            if (objSuspendGetChatAuth == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
