package com.bilibili.tensorflow.data.mem;

import com.bilibili.lib.neuron.internal.model.NeuronEvent;
import com.bilibili.ogv.infra.util.i;
import com.bilibili.tensorflow.data.common.l;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tensorflow/data/mem/a.class */
public final class a<T> implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a<T> f110751a = (a<T>) new Object();

    public final Object emit(Object obj, Continuation continuation) {
        Object objB;
        NeuronEvent neuronEvent = (NeuronEvent) obj;
        String str = neuronEvent.mEventId;
        TfOpenMemberReportEventLoader tfOpenMemberReportEventLoader = TfOpenMemberReportEventLoader.f110745a;
        if (TfOpenMemberReportEventLoader.f110747c != null) {
            if (TfOpenMemberReportEventLoader.f110749e.containsKey(str)) {
                String string = StringsKt.trim(str).toString();
                l.a("1", string);
                Map map = neuronEvent.mExtend;
                if (Intrinsics.areEqual("pgc.pgc-video-detail.0.0.pv", string) && map.containsKey("season_status") && i.c((String) map.get("season_status")) >= 6) {
                    l.a("1", string + "_pay");
                }
            }
            objB = Unit.INSTANCE;
        } else {
            objB = tfOpenMemberReportEventLoader.b(continuation);
            if (objB != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objB = Unit.INSTANCE;
            }
        }
        return objB;
    }
}
