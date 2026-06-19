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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/aistory/AIStoryEngine$retry$1.class */
public final class AIStoryEngine$retry$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final AIStoryEngine this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AIStoryEngine$retry$1(AIStoryEngine aIStoryEngine, Continuation<? super AIStoryEngine$retry$1> continuation) {
        super(2, continuation);
        this.this$0 = aIStoryEngine;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AIStoryEngine$retry$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        AIStoryBean aIStoryBean;
        Function1<? super Integer, Unit> function1;
        Function1<? super Result<AIStoryBean>, Unit> function12;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            AIStoryEngine aIStoryEngine = this.this$0;
            Context context = aIStoryEngine.h;
            if (context != null && (aIStoryBean = aIStoryEngine.f105698e) != null && (function1 = aIStoryEngine.f105699f) != null && (function12 = aIStoryEngine.f105700g) != null) {
                this.label = 1;
                if (AIStoryEngine.a(aIStoryEngine, context, aIStoryBean, function1, function12, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        if (i7 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Unit.INSTANCE;
    }
}
