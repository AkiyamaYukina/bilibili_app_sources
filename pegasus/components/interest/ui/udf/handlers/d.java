package com.bilibili.pegasus.components.interest.ui.udf.handlers;

import Fo0.m;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.pegasus.components.interest.ui.udf.actions.Actions;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/udf/handlers/d.class */
@StabilityInferred(parameters = 1)
public final class d implements Co0.a<Actions.c> {
    public static final Object b(d dVar, long j7, String str, String str2, Continuation continuation) {
        dVar.getClass();
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        com.bilibili.pegasus.request.b.e(j7, str, str2, new c(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    @Override // Co0.a
    public final Co0.b a(StateFlow stateFlow, Actions actions) {
        Co0.b bVar;
        Fo0.k kVar = (Fo0.k) stateFlow.getValue();
        m mVar = kVar.f6371b;
        if (mVar instanceof m.c) {
            m.c cVar = (m.c) mVar;
            int i7 = cVar.f6383b;
            bVar = new Co0.b(Fo0.k.a(kVar, null, new m.b(cVar.f6382a, i7), 0, false, null, 29), FlowKt.flow(new FetchSecondHandler$reduce$2(this, kVar, i7, null)), null, 4);
        } else {
            bVar = mVar instanceof m.a ? new Co0.b(null, FlowKt.flow(new FetchSecondHandler$reduce$3(null)), null, 5) : new Co0.b(null, null, null, 7);
        }
        return bVar;
    }
}
