package com.bilibili.studio.editor.smarttitle.task;

import com.bilibili.studio.editor.smarttitle.entity.aitask.SmartTitleAITaskResult;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/smarttitle/task/SmartTitleTask$startAiTask$3$1.class */
public final class SmartTitleTask$startAiTask$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final SmartTitleAITaskResult $data;
    final String $styleName;
    int label;
    final SmartTitleTask this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartTitleTask$startAiTask$3$1(SmartTitleAITaskResult smartTitleAITaskResult, SmartTitleTask smartTitleTask, String str, Continuation<? super SmartTitleTask$startAiTask$3$1> continuation) {
        super(2, continuation);
        this.$data = smartTitleAITaskResult;
        this.this$0 = smartTitleTask;
        this.$styleName = str;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SmartTitleTask$startAiTask$3$1(this.$data, this.this$0, this.$styleName, continuation);
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
        SmartTitleAITaskResult smartTitleAITaskResult = this.$data;
        if (smartTitleAITaskResult == null) {
            SmartTitleTaskError smartTitleTaskError = SmartTitleTaskError.ERROR_AI_TASK;
            this.this$0.a(smartTitleTaskError.getCode(), this.$styleName, smartTitleTaskError.getMsg());
            this.this$0.b();
            if (zw0.b.b()) {
                Long lBoxLong = Boxing.boxLong(System.currentTimeMillis() - this.this$0.f108247k);
                String msg = smartTitleTaskError.getMsg();
                SmartTitleTask smartTitleTask = this.this$0;
                Xz0.d.d0("error", lBoxLong, msg, smartTitleTask.h, smartTitleTask.f108239b, null);
            }
        } else {
            this.this$0.c(this.$styleName, true, smartTitleAITaskResult);
            this.this$0.b();
            if (zw0.b.b()) {
                Long lBoxLong2 = Boxing.boxLong(System.currentTimeMillis() - this.this$0.f108247k);
                SmartTitleTask smartTitleTask2 = this.this$0;
                Xz0.d.d0("success", lBoxLong2, null, smartTitleTask2.h, smartTitleTask2.f108239b, this.$data.titleList);
            }
        }
        return Unit.INSTANCE;
    }
}
