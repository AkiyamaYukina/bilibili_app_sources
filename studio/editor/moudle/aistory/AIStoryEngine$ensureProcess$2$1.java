package com.bilibili.studio.editor.moudle.aistory;

import com.bilibili.studio.editor.moudle.aistory.bean.AIStoryBean;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/aistory/AIStoryEngine$ensureProcess$2$1.class */
final class AIStoryEngine$ensureProcess$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Function1<Result<AIStoryBean>, Unit> $onNext;
    final Result<AIStoryBean> $result;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AIStoryEngine$ensureProcess$2$1(Function1<? super Result<AIStoryBean>, Unit> function1, Result<AIStoryBean> result, Continuation<? super AIStoryEngine$ensureProcess$2$1> continuation) {
        super(2, continuation);
        this.$onNext = function1;
        this.$result = result;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AIStoryEngine$ensureProcess$2$1(this.$onNext, this.$result, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$onNext.invoke(this.$result);
        return Unit.INSTANCE;
    }
}
