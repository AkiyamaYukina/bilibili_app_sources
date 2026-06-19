package com.bilibili.pegasus.components.interest.ui.udf.handlers;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.pegasus.components.interest.ui.udf.actions.Actions;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/udf/handlers/e.class */
@StabilityInferred(parameters = 1)
public final class e implements Co0.a<Actions.d> {
    @Override // Co0.a
    public final Co0.b a(StateFlow stateFlow, Actions actions) {
        Fo0.k kVar = (Fo0.k) stateFlow.getValue();
        return new Co0.b(Fo0.k.a(kVar, null, null, RangesKt.coerceAtMost(kVar.f6372c + 1, 2), false, null, 27), null, null, 6);
    }
}
