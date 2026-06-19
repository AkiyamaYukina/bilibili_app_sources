package com.bilibili.studio.editor.moudle.aistory;

import android.content.Context;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/aistory/AIStoryEngine$startProcess$1.class */
public final class AIStoryEngine$startProcess$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final AIStoryBean $bean;
    final Context $context;
    final Function1<Result<AIStoryBean>, Unit> $onNext;
    final Function1<Integer, Unit> $onProgress;
    int label;
    final AIStoryEngine this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AIStoryEngine$startProcess$1(AIStoryEngine aIStoryEngine, Context context, AIStoryBean aIStoryBean, Function1<? super Integer, Unit> function1, Function1<? super Result<AIStoryBean>, Unit> function12, Continuation<? super AIStoryEngine$startProcess$1> continuation) {
        super(2, continuation);
        this.this$0 = aIStoryEngine;
        this.$context = context;
        this.$bean = aIStoryBean;
        this.$onProgress = function1;
        this.$onNext = function12;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AIStoryEngine$startProcess$1(this.this$0, this.$context, this.$bean, this.$onProgress, this.$onNext, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            AIStoryEngine aIStoryEngine = this.this$0;
            Context context = this.$context;
            AIStoryBean aIStoryBean = this.$bean;
            Function1<Integer, Unit> function1 = this.$onProgress;
            Function1<Result<AIStoryBean>, Unit> function12 = this.$onNext;
            this.label = 1;
            if (AIStoryEngine.a(aIStoryEngine, context, aIStoryBean, function1, function12, this) == coroutine_suspended) {
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
