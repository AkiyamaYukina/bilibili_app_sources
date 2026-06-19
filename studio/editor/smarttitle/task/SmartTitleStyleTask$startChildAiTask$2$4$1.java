package com.bilibili.studio.editor.smarttitle.task;

import android.text.TextUtils;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/smarttitle/task/SmartTitleStyleTask$startChildAiTask$2$4$1.class */
final class SmartTitleStyleTask$startChildAiTask$2$4$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final int $errorCode;
    final String $errorMsg;
    final String $styleName;
    final String $taskId;
    int label;
    final SmartTitleStyleTask this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartTitleStyleTask$startChildAiTask$2$4$1(String str, SmartTitleStyleTask smartTitleStyleTask, String str2, int i7, String str3, Continuation<? super SmartTitleStyleTask$startChildAiTask$2$4$1> continuation) {
        super(2, continuation);
        this.$taskId = str;
        this.this$0 = smartTitleStyleTask;
        this.$styleName = str2;
        this.$errorCode = i7;
        this.$errorMsg = str3;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SmartTitleStyleTask$startChildAiTask$2$4$1(this.$taskId, this.this$0, this.$styleName, this.$errorCode, this.$errorMsg, continuation);
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
        this.this$0.a(this.$errorCode, this.$styleName, this.$errorMsg);
        SmartTitleStyleTask smartTitleStyleTask = this.this$0;
        if (smartTitleStyleTask.f108237l.isEmpty()) {
            smartTitleStyleTask.b();
        }
        return Unit.INSTANCE;
    }
}
