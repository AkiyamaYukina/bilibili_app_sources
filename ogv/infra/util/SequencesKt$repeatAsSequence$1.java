package com.bilibili.ogv.infra.util;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.n;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/util/SequencesKt$repeatAsSequence$1.class */
public final class SequencesKt$repeatAsSequence$1<T> extends RestrictedSuspendLambda implements Function2<n<? super T>, Continuation<? super Unit>, Object> {
    final int $count;
    final Iterable<T> $this_repeatAsSequence;
    int I$0;
    int I$1;
    private Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SequencesKt$repeatAsSequence$1(int i7, Iterable<? extends T> iterable, Continuation<? super SequencesKt$repeatAsSequence$1> continuation) {
        super(2, continuation);
        this.$count = i7;
        this.$this_repeatAsSequence = iterable;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SequencesKt$repeatAsSequence$1 sequencesKt$repeatAsSequence$1 = new SequencesKt$repeatAsSequence$1(this.$count, this.$this_repeatAsSequence, continuation);
        sequencesKt$repeatAsSequence$1.L$0 = obj;
        return sequencesKt$repeatAsSequence$1;
    }

    public final Object invoke(n<? super T> nVar, Continuation<? super Unit> continuation) {
        return create(nVar, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x008e -> B:16:0x0094). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r11 = r0
            r0 = r4
            int r0 = r0.label
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L43
            r0 = r6
            r1 = 1
            if (r0 != r1) goto L39
            r0 = r4
            int r0 = r0.I$1
            r6 = r0
            r0 = r4
            int r0 = r0.I$0
            r7 = r0
            r0 = r4
            java.lang.Object r0 = r0.L$1
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r8 = r0
            r0 = r4
            java.lang.Object r0 = r0.L$0
            kotlin.sequences.n r0 = (kotlin.sequences.n) r0
            r9 = r0
            r0 = r5
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r8
            r5 = r0
            goto L94
        L39:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L43:
            r0 = r5
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r4
            java.lang.Object r0 = r0.L$0
            kotlin.sequences.n r0 = (kotlin.sequences.n) r0
            r8 = r0
            r0 = r4
            int r0 = r0.$count
            r7 = r0
            r0 = r4
            java.lang.Iterable<T> r0 = r0.$this_repeatAsSequence
            r10 = r0
            r0 = 0
            r6 = r0
        L5d:
            r0 = r6
            r1 = r7
            if (r0 >= r1) goto La1
            r0 = r4
            r1 = r8
            r0.L$0 = r1
            r0 = r4
            r1 = r10
            r0.L$1 = r1
            r0 = r4
            r1 = r7
            r0.I$0 = r1
            r0 = r4
            r1 = r6
            r0.I$1 = r1
            r0 = r4
            r1 = 1
            r0.label = r1
            r0 = r10
            r5 = r0
            r0 = r8
            r9 = r0
            r0 = r8
            r1 = r10
            r2 = r4
            java.lang.Object r0 = r0.e(r1, r2)
            r1 = r11
            if (r0 != r1) goto L94
            r0 = r11
            return r0
        L94:
            int r6 = r6 + 1
            r0 = r5
            r10 = r0
            r0 = r9
            r8 = r0
            goto L5d
        La1:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.infra.util.SequencesKt$repeatAsSequence$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
