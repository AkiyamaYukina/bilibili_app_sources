package com.bilibili.studio.editor.smarttitle.task;

import com.bilibili.studio.editor.smarttitle.entity.net.SmartTitleEntity;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/smarttitle/task/SmartTitleStyleTask$startAiTask$1.class */
public final class SmartTitleStyleTask$startAiTask$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Ref.BooleanRef $hasSuccess;
    final SmartTitleEntity $smartTitleEntity;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final SmartTitleStyleTask this$0;

    /* JADX INFO: renamed from: com.bilibili.studio.editor.smarttitle.task.SmartTitleStyleTask$startAiTask$1$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/smarttitle/task/SmartTitleStyleTask$startAiTask$1$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Ref.BooleanRef $hasSuccess;
        int label;
        final SmartTitleStyleTask this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Ref.BooleanRef booleanRef, SmartTitleStyleTask smartTitleStyleTask, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$hasSuccess = booleanRef;
            this.this$0 = smartTitleStyleTask;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$hasSuccess, this.this$0, continuation);
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
            if (!this.$hasSuccess.element) {
                SmartTitleTaskError smartTitleTaskError = SmartTitleTaskError.ERROR_AI_TASK;
                this.this$0.a(smartTitleTaskError.getCode(), "", smartTitleTaskError.getMsg());
                this.this$0.b();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartTitleStyleTask$startAiTask$1(SmartTitleEntity smartTitleEntity, SmartTitleStyleTask smartTitleStyleTask, Ref.BooleanRef booleanRef, Continuation<? super SmartTitleStyleTask$startAiTask$1> continuation) {
        super(2, continuation);
        this.$smartTitleEntity = smartTitleEntity;
        this.this$0 = smartTitleStyleTask;
        this.$hasSuccess = booleanRef;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SmartTitleStyleTask$startAiTask$1(this.$smartTitleEntity, this.this$0, this.$hasSuccess, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Path cross not found for [B:28:0x0175, B:32:0x0185], limit reached: 39 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01c3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0164 -> B:26:0x016a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 517
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.smarttitle.task.SmartTitleStyleTask$startAiTask$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
