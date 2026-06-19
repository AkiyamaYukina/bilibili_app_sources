package com.bilibili.ogv.operation3.module.followable;

import kntr.common.trio.toast.Toaster;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/followable/CreateFavorModel$invoke$1$toggle$1$1.class */
public final class CreateFavorModel$invoke$1$toggle$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final i $favorable;
    final Toaster $toaster;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    int label;
    final CreateFavorModel$invoke$1 this$0;
    final b this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateFavorModel$invoke$1$toggle$1$1(CreateFavorModel$invoke$1 createFavorModel$invoke$1, b bVar, i iVar, Toaster toaster, Continuation<? super CreateFavorModel$invoke$1$toggle$1$1> continuation) {
        super(2, continuation);
        this.this$0 = createFavorModel$invoke$1;
        this.this$1 = bVar;
        this.$favorable = iVar;
        this.$toaster = toaster;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateFavorModel$invoke$1$toggle$1$1(this.this$0, this.this$1, this.$favorable, this.$toaster, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x01db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 557
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.operation3.module.followable.CreateFavorModel$invoke$1$toggle$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
