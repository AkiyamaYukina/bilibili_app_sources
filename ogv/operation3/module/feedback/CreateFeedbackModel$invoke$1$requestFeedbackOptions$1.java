package com.bilibili.ogv.operation3.module.feedback;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/feedback/CreateFeedbackModel$invoke$1$requestFeedbackOptions$1.class */
final class CreateFeedbackModel$invoke$1$requestFeedbackOptions$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final y $feedbackable;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    int label;
    final h this$0;
    final g this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateFeedbackModel$invoke$1$requestFeedbackOptions$1(h hVar, y yVar, g gVar, Continuation<? super CreateFeedbackModel$invoke$1$requestFeedbackOptions$1> continuation) {
        super(2, continuation);
        this.this$0 = hVar;
        this.$feedbackable = yVar;
        this.this$1 = gVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateFeedbackModel$invoke$1$requestFeedbackOptions$1(this.this$0, this.$feedbackable, this.this$1, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:30:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0149 A[PHI: r8 r9 r10
  0x0149: PHI (r8v3 java.lang.Exception) = (r8v2 java.lang.Exception), (r8v4 java.lang.Exception) binds: [B:29:0x013b, B:40:0x01ba] A[DONT_GENERATE, DONT_INLINE]
  0x0149: PHI (r9v4 kntr.base.log.ILogger) = (r9v1 kntr.base.log.ILogger), (r9v5 kntr.base.log.ILogger) binds: [B:29:0x013b, B:40:0x01ba] A[DONT_GENERATE, DONT_INLINE]
  0x0149: PHI (r10v6 java.lang.String) = (r10v3 java.lang.String), (r10v7 java.lang.String) binds: [B:29:0x013b, B:40:0x01ba] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 561
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.operation3.module.feedback.CreateFeedbackModel$invoke$1$requestFeedbackOptions$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
