package com.bilibili.playset;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/MultiTypeListDetailActivityV2$switchTranslate$1.class */
final class MultiTypeListDetailActivityV2$switchTranslate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final com.bilibili.playset.api.c $item;
    int I$0;
    Object L$0;
    int label;
    final MultiTypeListDetailActivityV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiTypeListDetailActivityV2$switchTranslate$1(MultiTypeListDetailActivityV2 multiTypeListDetailActivityV2, com.bilibili.playset.api.c cVar, Continuation<? super MultiTypeListDetailActivityV2$switchTranslate$1> continuation) {
        super(2, continuation);
        this.this$0 = multiTypeListDetailActivityV2;
        this.$item = cVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MultiTypeListDetailActivityV2$switchTranslate$1(this.this$0, this.$item, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            Method dump skipped, instruction units count: 381
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.MultiTypeListDetailActivityV2$switchTranslate$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
