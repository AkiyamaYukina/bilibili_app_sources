package com.bilibili.ogv.kmm.operation.vippreview;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/vippreview/VipOfflinePreviewModuleSupportModule$provide$1$1$2$1$1$2$1$1.class */
final class VipOfflinePreviewModuleSupportModule$provide$1$1$2$1$1$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final i $activeCardModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VipOfflinePreviewModuleSupportModule$provide$1$1$2$1$1$2$1$1(i iVar, Continuation<? super VipOfflinePreviewModuleSupportModule$provide$1$1$2$1$1$2$1$1> continuation) {
        super(2, continuation);
        this.$activeCardModel = iVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VipOfflinePreviewModuleSupportModule$provide$1$1$2$1$1$2$1$1(this.$activeCardModel, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        i iVar = this.$activeCardModel;
        iVar.f68943c.a(iVar.f68941a.f68890a);
        return Unit.INSTANCE;
    }
}
