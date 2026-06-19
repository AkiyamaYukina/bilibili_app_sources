package com.bilibili.pegasus.common.oversea;

import com.bilibili.pegasus.holders.AbstractC5652d;
import ip0.e;
import ip0.g;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/common/oversea/TranslateApiKt$translateCard$2.class */
public final class TranslateApiKt$translateCard$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final e $data;
    final AbstractC5652d<?> $holder;
    final g $params;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TranslateApiKt$translateCard$2(e eVar, AbstractC5652d<?> abstractC5652d, g gVar, Continuation<? super TranslateApiKt$translateCard$2> continuation) {
        super(2, continuation);
        this.$data = eVar;
        this.$holder = abstractC5652d;
        this.$params = gVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TranslateApiKt$translateCard$2(this.$data, this.$holder, this.$params, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.common.oversea.TranslateApiKt$translateCard$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
