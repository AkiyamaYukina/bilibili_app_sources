package com.bilibili.search2.result.base;

import com.bilibili.ship.theseus.united.page.interactvideo.TheseusInteractVideoService$optionsPanel$$inlined$map$1$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/g.class */
public final class g implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f87547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Flow f87548b;

    public /* synthetic */ g(Flow flow, int i7) {
        this.f87547a = i7;
        this.f87548b = flow;
    }

    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f87547a) {
            case 0:
                Object objCollect = this.f87548b.collect(new BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$5$2(flowCollector), continuation);
                if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objCollect = Unit.INSTANCE;
                }
                return objCollect;
            default:
                Object objCollect2 = this.f87548b.collect(new TheseusInteractVideoService$optionsPanel$$inlined$map$1$2(flowCollector), continuation);
                if (objCollect2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objCollect2 = Unit.INSTANCE;
                }
                return objCollect2;
        }
    }
}
