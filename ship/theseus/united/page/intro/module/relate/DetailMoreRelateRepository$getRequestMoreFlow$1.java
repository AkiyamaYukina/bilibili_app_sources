package com.bilibili.ship.theseus.united.page.intro.module.relate;

import com.bilibili.ship.theseus.united.page.intro.module.relate.C6318i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailMoreRelateRepository$getRequestMoreFlow$1.class */
final class DetailMoreRelateRepository$getRequestMoreFlow$1 extends SuspendLambda implements Function2<FlowCollector<? super C6318i.a>, Continuation<? super Unit>, Object> {
    final long $category;
    final String $categoryName;
    final String $next;
    private Object L$0;
    int label;
    final C6318i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailMoreRelateRepository$getRequestMoreFlow$1(C6318i c6318i, String str, long j7, String str2, Continuation<? super DetailMoreRelateRepository$getRequestMoreFlow$1> continuation) {
        super(2, continuation);
        this.this$0 = c6318i;
        this.$next = str;
        this.$category = j7;
        this.$categoryName = str2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DetailMoreRelateRepository$getRequestMoreFlow$1 detailMoreRelateRepository$getRequestMoreFlow$1 = new DetailMoreRelateRepository$getRequestMoreFlow$1(this.this$0, this.$next, this.$category, this.$categoryName, continuation);
        detailMoreRelateRepository$getRequestMoreFlow$1.L$0 = obj;
        return detailMoreRelateRepository$getRequestMoreFlow$1;
    }

    public final Object invoke(FlowCollector<? super C6318i.a> flowCollector, Continuation<? super Unit> continuation) {
        return create(flowCollector, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 530
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.module.relate.DetailMoreRelateRepository$getRequestMoreFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
