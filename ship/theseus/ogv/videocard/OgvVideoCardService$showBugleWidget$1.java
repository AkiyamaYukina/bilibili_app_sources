package com.bilibili.ship.theseus.ogv.videocard;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videocard/OgvVideoCardService$showBugleWidget$1.class */
final class OgvVideoCardService$showBugleWidget$1 extends ContinuationImpl {
    Object L$0;
    int label;
    Object result;
    final OgvVideoCardService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvVideoCardService$showBugleWidget$1(OgvVideoCardService ogvVideoCardService, Continuation<? super OgvVideoCardService$showBugleWidget$1> continuation) {
        super(continuation);
        this.this$0 = ogvVideoCardService;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return OgvVideoCardService.b(this.this$0, null, this);
    }
}
