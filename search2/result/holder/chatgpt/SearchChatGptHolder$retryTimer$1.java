package com.bilibili.search2.result.holder.chatgpt;

import android.os.SystemClock;
import com.bilibili.search2.result.holder.chatgpt.SearchChatGptHolder;
import com.bilibili.search2.result.holder.chatgpt.api.SearchChatGptItem;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/chatgpt/SearchChatGptHolder$retryTimer$1.class */
public final class SearchChatGptHolder$retryTimer$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final SearchChatGptHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchChatGptHolder$retryTimer$1(SearchChatGptHolder searchChatGptHolder, Continuation<? super SearchChatGptHolder$retryTimer$1> continuation) {
        super(2, continuation);
        this.this$0 = searchChatGptHolder;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchChatGptHolder$retryTimer$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        long j7;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                SearchChatGptHolder.a aVar = SearchChatGptHolder.f87922q;
                try {
                    String str = SearchChatGptHolder.f87925t;
                    j7 = 30000;
                    if (str != null) {
                        j7 = Long.parseLong(str);
                    }
                } catch (NumberFormatException e7) {
                    SearchChatGptHolder.a.c(null, e7.toString());
                    j7 = 30000;
                }
                this.label = 1;
                if (DelayKt.delay(j7, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (((SearchChatGptItem) this.this$0.getData()).getCurrentState() == 0) {
                ((SearchChatGptItem) this.this$0.getData()).setCurrentState(1);
                this.this$0.v0();
                SearchChatGptHolder searchChatGptHolder = this.this$0;
                searchChatGptHolder.z0(searchChatGptHolder.f87946p, true);
                SearchChatGptHolder searchChatGptHolder2 = this.this$0;
                int i8 = searchChatGptHolder2.f87946p;
                long jUptimeMillis = SystemClock.uptimeMillis();
                SearchChatGptHolder searchChatGptHolder3 = this.this$0;
                Long l7 = (Long) ((LinkedHashMap) searchChatGptHolder3.f87933b.f88256b).get(((SearchChatGptItem) searchChatGptHolder3.getData()).getSessionId());
                searchChatGptHolder2.y0(i8, Boxing.boxLong(jUptimeMillis - (l7 != null ? l7.longValue() : 0L)));
                ((SearchChatGptItem) this.this$0.getData()).setWaitTimeout(true);
            }
        } catch (CancellationException e8) {
            SearchChatGptHolder.a aVar2 = SearchChatGptHolder.f87922q;
            e8.toString();
        }
        return Unit.INSTANCE;
    }
}
