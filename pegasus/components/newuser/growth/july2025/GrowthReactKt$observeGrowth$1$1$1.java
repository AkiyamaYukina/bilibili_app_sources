package com.bilibili.pegasus.components.newuser.growth.july2025;

import Mh.c;
import android.app.Activity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/newuser/growth/july2025/GrowthReactKt$observeGrowth$1$1$1.class */
final class GrowthReactKt$observeGrowth$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Activity $activity;
    final c $event;
    final Rg0.c $loginPageStateHolder;
    final Function0<Unit> $tryInterestChoose;
    private Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GrowthReactKt$observeGrowth$1$1$1(Activity activity, Rg0.c cVar, c cVar2, Function0<Unit> function0, Continuation<? super GrowthReactKt$observeGrowth$1$1$1> continuation) {
        super(2, continuation);
        this.$activity = activity;
        this.$loginPageStateHolder = cVar;
        this.$event = cVar2;
        this.$tryInterestChoose = function0;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GrowthReactKt$observeGrowth$1$1$1 growthReactKt$observeGrowth$1$1$1 = new GrowthReactKt$observeGrowth$1$1$1(this.$activity, this.$loginPageStateHolder, this.$event, this.$tryInterestChoose, continuation);
        growthReactKt$observeGrowth$1$1$1.L$0 = obj;
        return growthReactKt$observeGrowth$1$1$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.newuser.growth.july2025.GrowthReactKt$observeGrowth$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
