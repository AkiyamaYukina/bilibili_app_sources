package com.bilibili.upper.module.datacollect;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/datacollect/UpperMaterialCollect$checkMaterialUpload$1.class */
final class UpperMaterialCollect$checkMaterialUpload$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final c $uploader;
    private Object L$0;
    Object L$1;
    int label;
    final e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpperMaterialCollect$checkMaterialUpload$1(e eVar, c cVar, Continuation<? super UpperMaterialCollect$checkMaterialUpload$1> continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$uploader = cVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UpperMaterialCollect$checkMaterialUpload$1 upperMaterialCollect$checkMaterialUpload$1 = new UpperMaterialCollect$checkMaterialUpload$1(this.this$0, this.$uploader, continuation);
        upperMaterialCollect$checkMaterialUpload$1.L$0 = obj;
        return upperMaterialCollect$checkMaterialUpload$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x02a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            Method dump skipped, instruction units count: 690
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.datacollect.UpperMaterialCollect$checkMaterialUpload$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
