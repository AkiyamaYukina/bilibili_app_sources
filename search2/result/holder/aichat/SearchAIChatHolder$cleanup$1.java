package com.bilibili.search2.result.holder.aichat;

import com.bapis.bilibili.app.search.v2.CancelChatTaskReq;
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
import q4.M;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/aichat/SearchAIChatHolder$cleanup$1.class */
final class SearchAIChatHolder$cleanup$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $from;
    final String $sessionId;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchAIChatHolder$cleanup$1(String str, String str2, Continuation<? super SearchAIChatHolder$cleanup$1> continuation) {
        super(2, continuation);
        this.$sessionId = str;
        this.$from = str2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchAIChatHolder$cleanup$1(this.$sessionId, this.$from, continuation);
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
                String str = this.$sessionId;
                String str2 = this.$from;
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
            BLog.e("[Search]SearchAIChatHolder", "searchCancelChatTaskSuspend execute success");
        } catch (Throwable th) {
            M.b("reset error = ", th.getMessage(), "[Search]SearchAIChatHolder");
        }
        return Unit.INSTANCE;
    }
}
