package com.bilibili.pegasus.components.interest.ui.udf.handlers;

import Do0.a;
import Fo0.l;
import Fo0.m;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.pegasus.components.interest.ui.reporter.InterestPageCloseReason;
import com.bilibili.pegasus.components.interest.ui.udf.actions.Actions;
import com.bilibili.pegasus.components.interest.ui.udf.model.ReportableType;
import java.util.ArrayList;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/udf/handlers/a.class */
@StabilityInferred(parameters = 1)
public final class a implements Co0.a<Actions.e> {
    @Override // Co0.a
    public final Co0.b a(StateFlow stateFlow, Actions actions) {
        Co0.b bVar;
        Set<l> set;
        Fo0.k kVar = (Fo0.k) stateFlow.getValue();
        int i7 = kVar.f6372c;
        if (i7 > 0) {
            if (i7 == 1) {
                Set<l> set2 = kVar.f6374e;
                ArrayList arrayList = new ArrayList();
                for (Object obj : set2) {
                    ReportableType reportableType = ((l) obj).f6376a;
                    if (reportableType == ReportableType.P0Gender || reportableType == ReportableType.P0Age) {
                        arrayList.add(obj);
                    }
                }
                set = CollectionsKt.toSet(arrayList);
            } else {
                set = kVar.f6374e;
            }
            m mVar = kVar.f6371b;
            m cVar = mVar;
            if (i7 == 1) {
                cVar = new m.c(mVar.a(), mVar.getCnt() + 1);
            }
            bVar = new Co0.b(Fo0.k.a(kVar, null, cVar, i7 - 1, false, set, 9), FlowKt.flow(new BackPressHandler$reduce$2(null)), null, 4);
        } else {
            bVar = new Co0.b(kVar, null, FlowKt.flowOf(new a.C0021a(2, null, null, InterestPageCloseReason.GESTURE.getReason())), 2);
        }
        return bVar;
    }
}
