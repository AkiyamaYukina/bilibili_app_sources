package com.bilibili.pegasus.components.cny;

import com.bilibili.lib.blrouter.BLRouter;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import u00.j;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/cny/TabPatchReportComponent$reportTabPatch$2.class */
final class TabPatchReportComponent$reportTabPatch$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;

    public TabPatchReportComponent$reportTabPatch$2(Continuation<? super TabPatchReportComponent$reportTabPatch$2> continuation) {
        super(2, continuation);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TabPatchReportComponent$reportTabPatch$2(continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            j jVar = (j) BLRouter.get$default(BLRouter.INSTANCE, j.class, (String) null, 2, (Object) null);
            if (jVar != null) {
                this.label = 1;
                if (jVar.b() == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
