package com.bilibili.ship.theseus.ogv.activity;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/OgvActivityService$reportAction$1.class */
public final class OgvActivityService$reportAction$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final ActivityDialogActionType $action;
    final String $code;
    final String $id;
    int label;
    final OgvActivityService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvActivityService$reportAction$1(OgvActivityService ogvActivityService, String str, String str2, ActivityDialogActionType activityDialogActionType, Continuation<? super OgvActivityService$reportAction$1> continuation) {
        super(2, continuation);
        this.this$0 = ogvActivityService;
        this.$id = str;
        this.$code = str2;
        this.$action = activityDialogActionType;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OgvActivityService$reportAction$1(this.this$0, this.$id, this.$code, this.$action, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.activity.OgvActivityService$reportAction$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
