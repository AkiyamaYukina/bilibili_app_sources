package com.bilibili.ogv.misc.timeline.ui;

import androidx.compose.runtime.MutableState;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.ogv.misc.timeline.ui.entity.BangumiTimeline;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import yk0.C9061a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/timeline/ui/o.class */
public final class o implements Function0<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C9061a f69584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BangumiTimeline f69585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MutableState<Boolean> f69586c;

    public o(C9061a c9061a, BangumiTimeline bangumiTimeline, MutableState<Boolean> mutableState) {
        this.f69584a = c9061a;
        this.f69585b = bangumiTimeline;
        this.f69586c = mutableState;
    }

    public final Object invoke() {
        BangumiTimeline bangumiTimeline = this.f69585b;
        long j7 = bangumiTimeline.f69521a;
        MutableState<Boolean> mutableState = this.f69586c;
        Boolean value = mutableState.getValue();
        boolean zBooleanValue = value.booleanValue();
        Map<String, String> map = bangumiTimeline.f69539t;
        this.f69584a.f129714a.invoke(Long.valueOf(j7), value, new n(bangumiTimeline, mutableState));
        String str = zBooleanValue ? "pgc.bangumi-timeline.works.unfollow.click" : "pgc.bangumi-timeline.works.follow.click";
        Map<String, String> mapEmptyMap = map;
        if (map == null) {
            mapEmptyMap = MapsKt.emptyMap();
        }
        Neurons.reportClick(false, str, mapEmptyMap);
        return Unit.INSTANCE;
    }
}
