package com.bilibili.playerbizcommonv2.widget.coin;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/coin/PayCoinFunctionWidget$updateCoinDrawable$1.class */
final class PayCoinFunctionWidget$updateCoinDrawable$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $icon22;
    final String $icon22Selected;
    final String $icon33;
    final String $icon33Selected;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PayCoinFunctionWidget$updateCoinDrawable$1(a aVar, String str, String str2, String str3, String str4, Continuation<? super PayCoinFunctionWidget$updateCoinDrawable$1> continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$icon22 = str;
        this.$icon22Selected = str2;
        this.$icon33 = str3;
        this.$icon33Selected = str4;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PayCoinFunctionWidget$updateCoinDrawable$1(this.this$0, this.$icon22, this.$icon22Selected, this.$icon33, this.$icon33Selected, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0290  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            Method dump skipped, instruction units count: 789
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.widget.coin.PayCoinFunctionWidget$updateCoinDrawable$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
