package com.bilibili.topix.center;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/center/TopixCenterViewModel$checkBubble$1.class */
final class TopixCenterViewModel$checkBubble$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final E this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopixCenterViewModel$checkBubble$1(E e7, Continuation<? super TopixCenterViewModel$checkBubble$1> continuation) {
        super(2, continuation);
        this.this$0 = e7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TopixCenterViewModel$checkBubble$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r7 = r0
            r0 = r4
            int r0 = r0.label
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L3b
            r0 = r6
            r1 = 1
            if (r0 == r1) goto L34
            r0 = r6
            r1 = 2
            if (r0 == r1) goto L2d
            r0 = r6
            r1 = 3
            if (r0 != r1) goto L23
            r0 = r5
            kotlin.ResultKt.throwOnFailure(r0)
            goto L95
        L23:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L2d:
            r0 = r5
            kotlin.ResultKt.throwOnFailure(r0)
            goto L73
        L34:
            r0 = r5
            kotlin.ResultKt.throwOnFailure(r0)
            goto L61
        L3b:
            r0 = r5
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r4
            com.bilibili.topix.center.E r0 = r0.this$0
            kotlinx.coroutines.flow.MutableSharedFlow<java.lang.Boolean> r0 = r0.h
            r8 = r0
            r0 = 1
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
            r5 = r0
            r0 = r4
            r1 = 1
            r0.label = r1
            r0 = r8
            r1 = r5
            r2 = r4
            java.lang.Object r0 = r0.emit(r1, r2)
            r1 = r7
            if (r0 != r1) goto L61
            r0 = r7
            return r0
        L61:
            r0 = r4
            r1 = 2
            r0.label = r1
            r0 = 5000(0x1388, double:2.4703E-320)
            r1 = r4
            java.lang.Object r0 = kotlinx.coroutines.DelayKt.delay(r0, r1)
            r1 = r7
            if (r0 != r1) goto L73
            r0 = r7
            return r0
        L73:
            r0 = r4
            com.bilibili.topix.center.E r0 = r0.this$0
            kotlinx.coroutines.flow.MutableSharedFlow<java.lang.Boolean> r0 = r0.h
            r8 = r0
            r0 = 0
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
            r5 = r0
            r0 = r4
            r1 = 3
            r0.label = r1
            r0 = r8
            r1 = r5
            r2 = r4
            java.lang.Object r0 = r0.emit(r1, r2)
            r1 = r7
            if (r0 != r1) goto L95
            r0 = r7
            return r0
        L95:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.topix.center.TopixCenterViewModel$checkBubble$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
