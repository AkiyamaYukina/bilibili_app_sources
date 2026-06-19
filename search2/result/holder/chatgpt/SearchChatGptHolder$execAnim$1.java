package com.bilibili.search2.result.holder.chatgpt;

import android.os.SystemClock;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.search2.result.holder.chatgpt.SearchChatGptHolder;
import com.bilibili.search2.result.holder.chatgpt.api.SearchChatResultItem;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/chatgpt/SearchChatGptHolder$execAnim$1.class */
final class SearchChatGptHolder$execAnim$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final j $adapter;
    final long $animationProgressTime;
    final int $chatContentMaxHeight;
    final List<SearchChatResultItem.Bubble> $it;
    final int $shrinkHeight;
    final int $targetHeight;
    final Bl.p $this_execAnim;
    int I$0;
    int label;
    final SearchChatGptHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchChatGptHolder$execAnim$1(long j7, Bl.p pVar, int i7, int i8, SearchChatGptHolder searchChatGptHolder, int i9, j jVar, List<SearchChatResultItem.Bubble> list, Continuation<? super SearchChatGptHolder$execAnim$1> continuation) {
        super(2, continuation);
        this.$animationProgressTime = j7;
        this.$this_execAnim = pVar;
        this.$targetHeight = i7;
        this.$chatContentMaxHeight = i8;
        this.this$0 = searchChatGptHolder;
        this.$shrinkHeight = i9;
        this.$adapter = jVar;
        this.$it = list;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchChatGptHolder$execAnim$1(this.$animationProgressTime, this.$this_execAnim, this.$targetHeight, this.$chatContentMaxHeight, this.this$0, this.$shrinkHeight, this.$adapter, this.$it, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        int px;
        long j7;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            px = (int) ((this.$animationProgressTime / SearchChatGptHolder.f87931z) * ((long) SearchChatGptHolder.f87921A));
            ListExtentionsKt.visible(this.$this_execAnim.c);
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            px = this.I$0;
            ResultKt.throwOnFailure(obj);
        }
        do {
            int i8 = this.$targetHeight;
            if (px >= i8 || px >= this.$chatContentMaxHeight) {
                SearchChatGptHolder searchChatGptHolder = this.this$0;
                Bl.p pVar = this.$this_execAnim;
                int i9 = this.$shrinkHeight;
                j jVar = this.$adapter;
                List<SearchChatResultItem.Bubble> list = this.$it;
                long jUptimeMillis = SystemClock.uptimeMillis();
                SearchChatGptHolder.a aVar = SearchChatGptHolder.f87922q;
                searchChatGptHolder.getClass();
                SearchChatGptHolder.D0(pVar, i8, i9, jVar, list, jUptimeMillis);
                return Unit.INSTANCE;
            }
            if (this.this$0.f87941k) {
                return Unit.INSTANCE;
            }
            this.$this_execAnim.c.setExactHeight(px);
            px = ListExtentionsKt.toPx(SearchChatGptHolder.f87921A) + px;
            j7 = SearchChatGptHolder.f87931z;
            this.I$0 = px;
            this.label = 1;
        } while (DelayKt.delay(j7, this) != coroutine_suspended);
        return coroutine_suspended;
    }
}
