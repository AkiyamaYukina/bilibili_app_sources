package com.bilibili.paycoin;

import android.view.View;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/paycoin/PayCoinsView$updateIconsFromFile$1.class */
final class PayCoinsView$updateIconsFromFile$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $pathBrick;
    final String $pathCoin1;
    final String $pathCoin2;
    final View $view;
    Object L$0;
    Object L$1;
    int label;
    final PayCoinsView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PayCoinsView$updateIconsFromFile$1(View view, String str, String str2, String str3, PayCoinsView payCoinsView, Continuation<? super PayCoinsView$updateIconsFromFile$1> continuation) {
        super(2, continuation);
        this.$view = view;
        this.$pathBrick = str;
        this.$pathCoin1 = str2;
        this.$pathCoin2 = str3;
        this.this$0 = payCoinsView;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PayCoinsView$updateIconsFromFile$1(this.$view, this.$pathBrick, this.$pathCoin1, this.$pathCoin2, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            Method dump skipped, instruction units count: 444
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.paycoin.PayCoinsView$updateIconsFromFile$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
