package com.bilibili.ogv.bdesign.placeholder;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.painter.Painter;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/bdesign/placeholder/LoadingKt$LoadingImage$1$1.class */
final class LoadingKt$LoadingImage$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Painter[] $loadingPainters;
    final MutableState<Painter> $painter$delegate;
    long J$0;
    long J$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadingKt$LoadingImage$1$1(Painter[] painterArr, MutableState<Painter> mutableState, Continuation<? super LoadingKt$LoadingImage$1$1> continuation) {
        super(2, continuation);
        this.$loadingPainters = painterArr;
        this.$painter$delegate = mutableState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long invokeSuspend$lambda$0(long j7) {
        return j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long invokeSuspend$lambda$1(long j7) {
        return j7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LoadingKt$LoadingImage$1$1(this.$loadingPainters, this.$painter$delegate, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0096  */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0093 -> B:21:0x0099). Please report as a decompilation issue!!! */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r17 = r0
            r0 = r7
            int r0 = r0.label
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L3b
            r0 = r9
            r1 = 1
            if (r0 == r1) goto L34
            r0 = r9
            r1 = 2
            if (r0 != r1) goto L2a
            r0 = r7
            long r0 = r0.J$1
            r10 = r0
            r0 = r7
            long r0 = r0.J$0
            r12 = r0
            r0 = r8
            kotlin.ResultKt.throwOnFailure(r0)
            goto L99
        L2a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L34:
            r0 = r8
            kotlin.ResultKt.throwOnFailure(r0)
            goto L60
        L3b:
            r0 = r8
            kotlin.ResultKt.throwOnFailure(r0)
            java.lang.Object r0 = new java.lang.Object
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = r7
            r1 = 1
            r0.label = r1
            r0 = r8
            r1 = r7
            java.lang.Object r0 = androidx.compose.runtime.MonotonicFrameClockKt.withFrameMillis(r0, r1)
            r16 = r0
            r0 = r16
            r8 = r0
            r0 = r16
            r1 = r17
            if (r0 != r1) goto L60
            r0 = r17
            return r0
        L60:
            r0 = r8
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            r12 = r0
            r0 = 125(0x7d, double:6.2E-322)
            r10 = r0
        L6d:
            java.lang.Object r0 = new java.lang.Object
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = r7
            r1 = r12
            r0.J$0 = r1
            r0 = r7
            r1 = r10
            r0.J$1 = r1
            r0 = r7
            r1 = 2
            r0.label = r1
            r0 = r8
            r1 = r7
            java.lang.Object r0 = androidx.compose.runtime.MonotonicFrameClockKt.withFrameMillis(r0, r1)
            r16 = r0
            r0 = r16
            r8 = r0
            r0 = r16
            r1 = r17
            if (r0 != r1) goto L99
            r0 = r17
            return r0
        L99:
            r0 = r8
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            r1 = r12
            long r0 = r0 - r1
            r1 = r10
            long r0 = r0 / r1
            r14 = r0
            r0 = r7
            androidx.compose.runtime.MutableState<androidx.compose.ui.graphics.painter.Painter> r0 = r0.$painter$delegate
            r16 = r0
            r0 = r7
            androidx.compose.ui.graphics.painter.Painter[] r0 = r0.$loadingPainters
            r8 = r0
            r0 = r16
            r1 = r8
            r2 = r14
            r3 = r8
            int r3 = r3.length
            long r3 = (long) r3
            long r2 = r2 % r3
            int r2 = (int) r2
            r1 = r1[r2]
            r0.setValue(r1)
            goto L6d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.bdesign.placeholder.LoadingKt$LoadingImage$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
