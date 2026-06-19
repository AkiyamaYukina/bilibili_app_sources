package com.bilibili.ship.theseus.ogv.activity;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/OgvActivityService$loadActivityInfo$1.class */
final class OgvActivityService$loadActivityInfo$1 extends ContinuationImpl {
    int label;
    Object result;
    final OgvActivityService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvActivityService$loadActivityInfo$1(OgvActivityService ogvActivityService, Continuation<? super OgvActivityService$loadActivityInfo$1> continuation) {
        super(continuation);
        this.this$0 = ogvActivityService;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return OgvActivityService.a(this.this$0, null, this);
    }
}
