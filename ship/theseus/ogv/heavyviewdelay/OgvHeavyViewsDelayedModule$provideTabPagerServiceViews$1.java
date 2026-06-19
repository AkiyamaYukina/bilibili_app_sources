package com.bilibili.ship.theseus.ogv.heavyviewdelay;

import com.bilibili.ship.theseus.united.page.tab.TheseusTabPagerService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/heavyviewdelay/OgvHeavyViewsDelayedModule$provideTabPagerServiceViews$1.class */
final class OgvHeavyViewsDelayedModule$provideTabPagerServiceViews$1 extends SuspendLambda implements Function3<FlowCollector<? super TheseusTabPagerService.c>, TheseusTabPagerService.c, Continuation<? super Unit>, Object> {
    final Deferred<Unit> $allowingHeavyViewsDeferred;
    private Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvHeavyViewsDelayedModule$provideTabPagerServiceViews$1(Deferred<Unit> deferred, Continuation<? super OgvHeavyViewsDelayedModule$provideTabPagerServiceViews$1> continuation) {
        super(3, continuation);
        this.$allowingHeavyViewsDeferred = deferred;
    }

    public final Object invoke(FlowCollector<? super TheseusTabPagerService.c> flowCollector, TheseusTabPagerService.c cVar, Continuation<? super Unit> continuation) {
        OgvHeavyViewsDelayedModule$provideTabPagerServiceViews$1 ogvHeavyViewsDelayedModule$provideTabPagerServiceViews$1 = new OgvHeavyViewsDelayedModule$provideTabPagerServiceViews$1(this.$allowingHeavyViewsDeferred, continuation);
        ogvHeavyViewsDelayedModule$provideTabPagerServiceViews$1.L$0 = flowCollector;
        ogvHeavyViewsDelayedModule$provideTabPagerServiceViews$1.L$1 = cVar;
        return ogvHeavyViewsDelayedModule$provideTabPagerServiceViews$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.heavyviewdelay.OgvHeavyViewsDelayedModule$provideTabPagerServiceViews$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
