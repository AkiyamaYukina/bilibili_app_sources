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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/chatgpt/SearchChatGptHolder$setExpendListener$1$1.class */
final class SearchChatGptHolder$setExpendListener$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final int $chatContentMaxHeight;
    final int $targetHeight;
    final Bl.p $this_setExpendListener;
    int I$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchChatGptHolder$setExpendListener$1$1(int i7, int i8, Bl.p pVar, Continuation<? super SearchChatGptHolder$setExpendListener$1$1> continuation) {
        super(2, continuation);
        this.$targetHeight = i7;
        this.$chatContentMaxHeight = i8;
        this.$this_setExpendListener = pVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchChatGptHolder$setExpendListener$1$1(this.$targetHeight, this.$chatContentMaxHeight, this.$this_setExpendListener, continuation);
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
            px = this.$targetHeight;
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            px = this.I$0;
            ResultKt.throwOnFailure(obj);
        }
        do {
            int i8 = this.$chatContentMaxHeight;
            if (px >= i8) {
                this.$this_setExpendListener.c.setExactHeight(i8);
                ListExtentionsKt.visible(this.$this_setExpendListener.f);
                return Unit.INSTANCE;
            }
            this.$this_setExpendListener.c.setExactHeight(px);
            px = ListExtentionsKt.toPx(SearchChatGptHolder.f87921A) + px;
            j7 = SearchChatGptHolder.f87931z;
            this.I$0 = px;
            this.label = 1;
        } while (DelayKt.delay(j7, this) != coroutine_suspended);
        return coroutine_suspended;
    }
}
