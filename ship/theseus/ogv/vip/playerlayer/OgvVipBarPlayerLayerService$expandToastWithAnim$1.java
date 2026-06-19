package com.bilibili.ship.theseus.ogv.vip.playerlayer;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/vip/playerlayer/OgvVipBarPlayerLayerService$expandToastWithAnim$1.class */
final class OgvVipBarPlayerLayerService$expandToastWithAnim$1 extends ContinuationImpl {
    Object L$0;
    int label;
    Object result;
    final OgvVipBarPlayerLayerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvVipBarPlayerLayerService$expandToastWithAnim$1(OgvVipBarPlayerLayerService ogvVipBarPlayerLayerService, Continuation<? super OgvVipBarPlayerLayerService$expandToastWithAnim$1> continuation) {
        super(continuation);
        this.this$0 = ogvVipBarPlayerLayerService;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return OgvVipBarPlayerLayerService.b(this.this$0, null, 0.0f, this);
    }
}
