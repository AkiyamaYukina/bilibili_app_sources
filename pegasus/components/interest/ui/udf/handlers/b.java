package com.bilibili.pegasus.components.interest.ui.udf.handlers;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.pegasus.components.interest.ui.udf.actions.Actions;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kp0.C7779b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/udf/handlers/b.class */
@StabilityInferred(parameters = 1)
public final class b implements Co0.a<Actions.b> {
    @Override // Co0.a
    public final Co0.b a(StateFlow stateFlow, Actions actions) {
        Co0.b bVar;
        Fo0.k kVar = (Fo0.k) stateFlow.getValue();
        C7779b c7779bB = kVar.b();
        if (c7779bB.f122928b) {
            bVar = new Co0.b(null, FlowKt.flow(new ConfirmHandler$reduce$2(null)), null, 4);
        } else {
            boolean z6 = c7779bB.f122929c;
            int i7 = kVar.f6372c;
            bVar = (i7 == 1 && z6) ? new Co0.b(null, FlowKt.flow(new ConfirmHandler$reduce$3(null)), null, 4) : (i7 == 0 && z6) ? new Co0.b(null, FlowKt.flow(new ConfirmHandler$reduce$4(null)), null, 4) : new Co0.b(null, null, null, 7);
        }
        return bVar;
    }
}
