package com.bilibili.search2.result.holder.aichat;

import com.bapis.bilibili.app.search.v2.GetChatResultReq;
import com.bapis.bilibili.app.search.v2.SearchMoss;
import com.bapis.bilibili.app.search.v2.SearchMossKtxKt;
import com.bapis.bilibili.broadcast.message.main.ChatResultV2;
import com.bilibili.lib.moss.api.CallOptions;
import java.util.List;
import kntr.app.search.aicard.redux.c;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import q4.C8397q;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/aichat/SearchAIChatTyper$retry$1.class */
final class SearchAIChatTyper$retry$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchAIChatTyper$retry$1(l lVar, Continuation<? super SearchAIChatTyper$retry$1> continuation) {
        super(2, continuation);
        this.this$0 = lVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchAIChatTyper$retry$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        ChatResultV2 chatResultV2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                l lVar = this.this$0;
                String str = lVar.f87798b;
                String str2 = lVar.f87797a;
                String str3 = lVar.f87799c;
                this.label = 1;
                GetChatResultReq.b sessionId = GetChatResultReq.newBuilder().setQuery(str).setSessionId(str2);
                String str4 = str3;
                if (str3 == null) {
                    str4 = "";
                }
                Object objSuspendGetChatResultV2 = SearchMossKtxKt.suspendGetChatResultV2(new SearchMoss((String) null, 0, (CallOptions) null, 7, (DefaultConstructorMarker) null), sessionId.setTrackId(str4).setFromSource("search").setCardType("ai_chat").build(), this);
                obj = objSuspendGetChatResultV2;
                if (objSuspendGetChatResultV2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            chatResultV2 = (ChatResultV2) obj;
        } catch (Exception e7) {
            C8397q.a("retry error: ", "[Search]SearchAIChatTyper", e7);
            this.this$0.f87801e.a.b().a(new c.d(-1));
        }
        if (chatResultV2 != null && !Intrinsics.areEqual(chatResultV2.getSessionId(), this.this$0.f87797a)) {
            BLog.w("[Search]SearchAIChatTyper", "sessionId mismatch: request=" + this.this$0.f87797a + ", response=" + chatResultV2.getSessionId());
            this.this$0.f87801e.a.b().a(new c.d(-1));
            return Unit.INSTANCE;
        }
        if (chatResultV2 == null || chatResultV2.getCode() != 0) {
            this.this$0.f87801e.a.b().a(new c.d(chatResultV2 != null ? chatResultV2.getCode() : -1));
        } else {
            this.this$0.b(chatResultV2);
            this.this$0.f87802f.a(chatResultV2);
            this.this$0.getClass();
            Pair pairA = l.a(chatResultV2);
            List list = (List) pairA.component1();
            List list2 = (List) pairA.component2();
            a.h1 h1Var = this.this$0.f87801e.a;
            h1Var.b().a(new c.e(kntr.app.search.aicard.a.a(h1Var.a(), list), list2));
        }
        return Unit.INSTANCE;
    }
}
