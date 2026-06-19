package com.bilibili.ship.theseus.ogv.intro.livereserve;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/livereserve/OgvLiveReserveUIComponentService$clickLiveReserveBar$1.class */
final class OgvLiveReserveUIComponentService$clickLiveReserveBar$1 extends ContinuationImpl {
    int label;
    Object result;
    final e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvLiveReserveUIComponentService$clickLiveReserveBar$1(e eVar, Continuation<? super OgvLiveReserveUIComponentService$clickLiveReserveBar$1> continuation) {
        super(continuation);
        this.this$0 = eVar;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return e.a(this.this$0, null, this);
    }
}
