package com.bilibili.ship.theseus.ogv.router;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/router/OpenPageInterceptor$intercept$1.class */
public final class OpenPageInterceptor$intercept$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $fillType;
    final boolean $forceWeb;
    final String $targetUrl;
    final String $title;
    int label;
    final OpenPageInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenPageInterceptor$intercept$1(OpenPageInterceptor openPageInterceptor, String str, boolean z6, String str2, String str3, Continuation<? super OpenPageInterceptor$intercept$1> continuation) {
        super(2, continuation);
        this.this$0 = openPageInterceptor;
        this.$targetUrl = str;
        this.$forceWeb = z6;
        this.$title = str2;
        this.$fillType = str3;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OpenPageInterceptor$intercept$1(this.this$0, this.$targetUrl, this.$forceWeb, this.$title, this.$fillType, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x0219  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 544
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.router.OpenPageInterceptor$intercept$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
