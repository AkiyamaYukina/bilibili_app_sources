package com.bilibili.search2.result.holder.chatgpt;

import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/chatgpt/SearchChatGptHolder$setShrinkListener$1$1.class */
final class SearchChatGptHolder$setShrinkListener$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final int $chatContentMaxHeight;
    final int $shrinkHeight;
    final Bl.p $this_setShrinkListener;
    int I$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchChatGptHolder$setShrinkListener$1$1(int i7, int i8, Bl.p pVar, Continuation<? super SearchChatGptHolder$setShrinkListener$1$1> continuation) {
        super(2, continuation);
        this.$chatContentMaxHeight = i7;
        this.$shrinkHeight = i8;
        this.$this_setShrinkListener = pVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchChatGptHolder$setShrinkListener$1$1(this.$chatContentMaxHeight, this.$shrinkHeight, this.$this_setShrinkListener, continuation);
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
            px = this.$chatContentMaxHeight;
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            px = this.I$0;
            ResultKt.throwOnFailure(obj);
        }
        do {
            int i8 = this.$shrinkHeight;
            if (px <= i8) {
                this.$this_setShrinkListener.c.setExactHeight(i8);
                ListExtentionsKt.visible(this.$this_setShrinkListener.e);
                ListExtentionsKt.visible(this.$this_setShrinkListener.d);
                return Unit.INSTANCE;
            }
            this.$this_setShrinkListener.c.setExactHeight(px);
            px -= ListExtentionsKt.toPx(SearchChatGptHolder.f87921A);
            j7 = SearchChatGptHolder.f87931z;
            this.I$0 = px;
            this.label = 1;
        } while (DelayKt.delay(j7, this) != coroutine_suspended);
        return coroutine_suspended;
    }
}
