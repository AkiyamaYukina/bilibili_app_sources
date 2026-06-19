package com.bilibili.ship.theseus.ogv.intro.kingposition;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/kingposition/OgvKingPositionShareService$onFollowedSeasonClick$1.class */
final class OgvKingPositionShareService$onFollowedSeasonClick$1 extends ContinuationImpl {
    int label;
    Object result;
    final OgvKingPositionShareService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvKingPositionShareService$onFollowedSeasonClick$1(OgvKingPositionShareService ogvKingPositionShareService, Continuation<? super OgvKingPositionShareService$onFollowedSeasonClick$1> continuation) {
        super(continuation);
        this.this$0 = ogvKingPositionShareService;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return OgvKingPositionShareService.c(this.this$0, this);
    }
}
