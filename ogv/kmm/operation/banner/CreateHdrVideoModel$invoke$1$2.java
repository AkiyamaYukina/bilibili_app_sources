package com.bilibili.ogv.kmm.operation.banner;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/banner/CreateHdrVideoModel$invoke$1$2.class */
final class CreateHdrVideoModel$invoke$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final T this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateHdrVideoModel$invoke$1$2(T t7, Continuation<? super CreateHdrVideoModel$invoke$1$2> continuation) {
        super(2, continuation);
        this.this$0 = t7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateHdrVideoModel$invoke$1$2(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0036 -> B:14:0x003c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r12 = r0
            r0 = r5
            int r0 = r0.label
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L24
            r0 = r7
            r1 = 1
            if (r0 != r1) goto L1a
            r0 = r6
            kotlin.ResultKt.throwOnFailure(r0)
            goto L3c
        L1a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L24:
            r0 = r6
            kotlin.ResultKt.throwOnFailure(r0)
        L28:
            r0 = r5
            r1 = 1
            r0.label = r1
            r0 = 500(0x1f4, double:2.47E-321)
            r1 = r5
            java.lang.Object r0 = kotlinx.coroutines.DelayKt.delay(r0, r1)
            r1 = r12
            if (r0 != r1) goto L3c
            r0 = r12
            return r0
        L3c:
            r0 = r5
            com.bilibili.ogv.kmm.operation.banner.T r0 = r0.this$0
            androidx.compose.runtime.MutableState r0 = r0.f68050d
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L28
            r0 = r5
            com.bilibili.ogv.kmm.operation.banner.T r0 = r0.this$0
            r13 = r0
            r0 = r13
            kntr.common.dionysus.vod.url.VodUrlPlayer r0 = r0.b()
            kotlin.time.Duration r0 = r0.h()
            r6 = r0
            r0 = 0
            r9 = r0
            r0 = r9
            r8 = r0
            r0 = r6
            if (r0 == 0) goto La0
            r0 = r5
            com.bilibili.ogv.kmm.operation.banner.T r0 = r0.this$0
            r14 = r0
            r0 = r6
            long r0 = r0.unbox-impl()
            r10 = r0
            r0 = r9
            r8 = r0
            r0 = r10
            boolean r0 = kotlin.time.Duration.isPositive-impl(r0)
            if (r0 == 0) goto La0
            r0 = r9
            r8 = r0
            r0 = r10
            r1 = r14
            kntr.common.dionysus.vod.url.VodUrlPlayer r1 = r1.b()
            long r1 = r1.g()
            long r0 = kotlin.time.Duration.minus-LRDsOJo(r0, r1)
            r1 = 3
            kotlin.time.DurationUnit r2 = kotlin.time.DurationUnit.SECONDS
            long r1 = kotlin.time.DurationKt.toDuration(r1, r2)
            int r0 = kotlin.time.Duration.compareTo-LRDsOJo(r0, r1)
            if (r0 > 0) goto La0
            r0 = 1
            r8 = r0
        La0:
            r0 = r13
            androidx.compose.runtime.MutableState r0 = r0.f68056k
            r1 = r8
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.setValue(r1)
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.kmm.operation.banner.CreateHdrVideoModel$invoke$1$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
