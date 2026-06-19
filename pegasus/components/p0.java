package com.bilibili.pegasus.components;

import androidx.lifecycle.MutableLiveData;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.neuron.api.Neurons;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/p0.class */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static long f77112a;

    /* JADX WARN: Multi-variable type inference failed */
    public static final int a() {
        MutableLiveData mutableLiveDataB;
        Integer num;
        u00.f fVar = (u00.f) BLRouter.INSTANCE.get(u00.f.class, "HomePageJumpService");
        return (fVar == null || (mutableLiveDataB = fVar.b()) == null || (num = (Integer) mutableLiveDataB.getValue()) == null) ? -1 : num.intValue();
    }

    public static final void b(String str, Map<String, String> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(((Object) entry.getKey()) + ":" + ((Object) entry.getValue()));
        }
        j4.o.a("event_type:", str, " ", CollectionsKt.p(arrayList, (CharSequence) null, (CharSequence) null, (CharSequence) null, (Function1) null, 63), "PegasusSceneUriReporter");
        Map mapMutableMapOf = MapsKt.mutableMapOf(new Pair[]{TuplesKt.to("event_type", str)});
        mapMutableMapOf.putAll(map);
        Unit unit = Unit.INSTANCE;
        Neurons.trackT$default(false, "pegasus.scene.uri.report.track", mapMutableMapOf, 0, new AT0.c(8), 8, (Object) null);
    }
}
