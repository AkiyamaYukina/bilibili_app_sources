package com.bilibili.studio.editor.smarttitle.task;

import android.text.TextUtils;
import com.bilibili.studio.editor.smarttitle.entity.aitask.SmartTitleAITaskResult;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/smarttitle/task/SmartTitleStyleTask$startChildAiTask$2$3$1.class */
final class SmartTitleStyleTask$startChildAiTask$2$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final SmartTitleAITaskResult $data;
    final String $styleName;
    final String $taskId;
    int label;
    final SmartTitleStyleTask this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartTitleStyleTask$startChildAiTask$2$3$1(String str, SmartTitleStyleTask smartTitleStyleTask, SmartTitleAITaskResult smartTitleAITaskResult, String str2, Continuation<? super SmartTitleStyleTask$startChildAiTask$2$3$1> continuation) {
        super(2, continuation);
        this.$taskId = str;
        this.this$0 = smartTitleStyleTask;
        this.$data = smartTitleAITaskResult;
        this.$styleName = str2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SmartTitleStyleTask$startChildAiTask$2$3$1(this.$taskId, this.this$0, this.$data, this.$styleName, continuation);
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
        if (!TextUtils.isEmpty(this.$taskId)) {
            this.this$0.f108237l.remove(this.$taskId);
        }
        if (this.$data == null) {
            SmartTitleTaskError smartTitleTaskError = SmartTitleTaskError.ERROR_AI_TASK;
            this.this$0.a(smartTitleTaskError.getCode(), this.$styleName, smartTitleTaskError.getMsg());
            SmartTitleStyleTask smartTitleStyleTask = this.this$0;
            if (smartTitleStyleTask.f108237l.isEmpty()) {
                smartTitleStyleTask.b();
            }
        } else {
            SmartTitleStyleTask smartTitleStyleTask2 = this.this$0;
            smartTitleStyleTask2.c(this.$styleName, smartTitleStyleTask2.f108237l.isEmpty(), this.$data);
            SmartTitleStyleTask smartTitleStyleTask3 = this.this$0;
            if (smartTitleStyleTask3.f108237l.isEmpty()) {
                smartTitleStyleTask3.b();
            }
        }
        return Unit.INSTANCE;
    }
}
