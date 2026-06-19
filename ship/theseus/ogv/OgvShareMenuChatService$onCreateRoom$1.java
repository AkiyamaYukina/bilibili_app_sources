package com.bilibili.ship.theseus.ogv;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/OgvShareMenuChatService$onCreateRoom$1.class */
final class OgvShareMenuChatService$onCreateRoom$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    boolean Z$0;
    int label;
    Object result;
    final OgvShareMenuChatService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvShareMenuChatService$onCreateRoom$1(OgvShareMenuChatService ogvShareMenuChatService, Continuation<? super OgvShareMenuChatService$onCreateRoom$1> continuation) {
        super(continuation);
        this.this$0 = ogvShareMenuChatService;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return OgvShareMenuChatService.a(this.this$0, 0L, 0L, 0, null, false, this);
    }
}
