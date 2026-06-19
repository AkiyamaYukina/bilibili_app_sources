package com.bilibili.search2.result.holder.chatgpt.api;

import com.bilibili.search2.result.holder.chatgpt.api.SearchChatResultItem;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/chatgpt/api/SearchChatResultItem$Bubble$showTypeWriterAnim$2$1.class */
public final class SearchChatResultItem$Bubble$showTypeWriterAnim$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Function2<Integer, Integer, Unit> $progressComplete;
    final Function1<Integer, Triple<Boolean, Long, Integer>> $progressFirstFrame;
    final Function2<Integer, Integer, Unit> $progressStep;
    int label;
    final SearchChatResultItem.Bubble this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SearchChatResultItem$Bubble$showTypeWriterAnim$2$1(SearchChatResultItem.Bubble bubble, Function2<? super Integer, ? super Integer, Unit> function2, Function2<? super Integer, ? super Integer, Unit> function22, Function1<? super Integer, Triple<Boolean, Long, Integer>> function1, Continuation<? super SearchChatResultItem$Bubble$showTypeWriterAnim$2$1> continuation) {
        super(2, continuation);
        this.this$0 = bubble;
        this.$progressStep = function2;
        this.$progressComplete = function22;
        this.$progressFirstFrame = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Triple invokeSuspend$lambda$0(Function1 function1, SearchChatResultItem.Bubble bubble, int i7) {
        return (Triple) function1.invoke(Integer.valueOf(bubble.getNodeSize()));
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchChatResultItem$Bubble$showTypeWriterAnim$2$1(this.this$0, this.$progressStep, this.$progressComplete, this.$progressFirstFrame, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            final SearchChatResultItem.Bubble bubble = this.this$0;
            final Function1<Integer, Triple<Boolean, Long, Integer>> function1 = this.$progressFirstFrame;
            Function1 function12 = new Function1(function1, bubble) { // from class: com.bilibili.search2.result.holder.chatgpt.api.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Function1 f87987a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final SearchChatResultItem.Bubble f87988b;

                {
                    this.f87987a = function1;
                    this.f87988b = bubble;
                }

                public final Object invoke(Object obj2) {
                    return SearchChatResultItem$Bubble$showTypeWriterAnim$2$1.invokeSuspend$lambda$0(this.f87987a, this.f87988b, ((Integer) obj2).intValue());
                }
            };
            Function2<Integer, Integer, Unit> function2 = this.$progressStep;
            Function2<Integer, Integer, Unit> function22 = this.$progressComplete;
            this.label = 1;
            if (bubble.typeWriterAnim(function12, function2, function22, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
