package com.bilibili.search2.result.holder.chatgpt;

import com.bilibili.search2.result.holder.chatgpt.api.SearchChatGptItem;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/chatgpt/SearchChatGptHolder$refreshSessionId$1.class */
final class SearchChatGptHolder$refreshSessionId$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final SearchChatGptHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchChatGptHolder$refreshSessionId$1(SearchChatGptHolder searchChatGptHolder, Continuation<? super SearchChatGptHolder$refreshSessionId$1> continuation) {
        super(2, continuation);
        this.this$0 = searchChatGptHolder;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchChatGptHolder$refreshSessionId$1(this.this$0, continuation);
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
            this.label = 1;
            Object objR0 = SearchChatGptHolder.r0(searchChatGptHolder, this);
            obj = objR0;
            if (objR0 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        String str = (String) obj;
        ((SearchChatGptItem) this.this$0.getData()).setSessionId(str);
        SearchChatGptHolder searchChatGptHolder2 = this.this$0;
        searchChatGptHolder2.f87939i = str;
        searchChatGptHolder2.B0();
        if (str != null) {
            this.this$0.w0(str);
            this.this$0.E0();
        }
        return Unit.INSTANCE;
    }
}
