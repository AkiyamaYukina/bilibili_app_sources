package com.bilibili.ship.theseus.ogv.vip.playerlayer;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/vip/playerlayer/OgvVipBarPlayerLayerService$playToastExpandAnim$1.class */
final class OgvVipBarPlayerLayerService$playToastExpandAnim$1 extends ContinuationImpl {
    float F$0;
    Object L$0;
    Object L$1;
    int label;
    Object result;
    final OgvVipBarPlayerLayerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvVipBarPlayerLayerService$playToastExpandAnim$1(OgvVipBarPlayerLayerService ogvVipBarPlayerLayerService, Continuation<? super OgvVipBarPlayerLayerService$playToastExpandAnim$1> continuation) {
        super(continuation);
        this.this$0 = ogvVipBarPlayerLayerService;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.e(null, 0.0f, this);
    }
}
