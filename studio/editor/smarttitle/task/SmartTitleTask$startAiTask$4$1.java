package com.bilibili.studio.editor.smarttitle.task;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/smarttitle/task/SmartTitleTask$startAiTask$4$1.class */
public final class SmartTitleTask$startAiTask$4$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final int $errorCode;
    final String $errorMsg;
    final String $styleName;
    int label;
    final SmartTitleTask this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartTitleTask$startAiTask$4$1(SmartTitleTask smartTitleTask, String str, int i7, String str2, Continuation<? super SmartTitleTask$startAiTask$4$1> continuation) {
        super(2, continuation);
        this.this$0 = smartTitleTask;
        this.$styleName = str;
        this.$errorCode = i7;
        this.$errorMsg = str2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SmartTitleTask$startAiTask$4$1(this.this$0, this.$styleName, this.$errorCode, this.$errorMsg, continuation);
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
        this.this$0.a(this.$errorCode, this.$styleName, this.$errorMsg);
        this.this$0.b();
        return Unit.INSTANCE;
    }
}
