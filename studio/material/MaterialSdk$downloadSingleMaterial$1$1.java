package com.bilibili.studio.material;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/MaterialSdk$downloadSingleMaterial$1$1.class */
public final class MaterialSdk$downloadSingleMaterial$1$1 extends SuspendLambda implements Function2<j, Continuation<? super Unit>, Object> {
    final ISingleMaterialListener $listener;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaterialSdk$downloadSingleMaterial$1$1(ISingleMaterialListener iSingleMaterialListener, Continuation<? super MaterialSdk$downloadSingleMaterial$1$1> continuation) {
        super(2, continuation);
        this.$listener = iSingleMaterialListener;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MaterialSdk$downloadSingleMaterial$1$1 materialSdk$downloadSingleMaterial$1$1 = new MaterialSdk$downloadSingleMaterial$1$1(this.$listener, continuation);
        materialSdk$downloadSingleMaterial$1$1.L$0 = obj;
        return materialSdk$downloadSingleMaterial$1$1;
    }

    public final Object invoke(j jVar, Continuation<? super Unit> continuation) {
        return create(jVar, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        MaterialSdk.access$handleMaterialState(MaterialSdk.INSTANCE, (j) this.L$0, this.$listener);
        return Unit.INSTANCE;
    }
}
