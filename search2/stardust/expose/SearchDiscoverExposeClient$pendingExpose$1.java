package com.bilibili.search2.stardust.expose;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/stardust/expose/SearchDiscoverExposeClient$pendingExpose$1.class */
public final class SearchDiscoverExposeClient$pendingExpose$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $from;
    int label;
    final SearchDiscoverExposeClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchDiscoverExposeClient$pendingExpose$1(SearchDiscoverExposeClient searchDiscoverExposeClient, String str, Continuation<? super SearchDiscoverExposeClient$pendingExpose$1> continuation) {
        super(2, continuation);
        this.this$0 = searchDiscoverExposeClient;
        this.$from = str;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchDiscoverExposeClient$pendingExpose$1(this.this$0, this.$from, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x01f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 970
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.stardust.expose.SearchDiscoverExposeClient$pendingExpose$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
