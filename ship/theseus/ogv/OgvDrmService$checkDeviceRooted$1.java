package com.bilibili.ship.theseus.ogv;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/OgvDrmService$checkDeviceRooted$1.class */
final class OgvDrmService$checkDeviceRooted$1 extends ContinuationImpl {
    int label;
    Object result;
    final OgvDrmService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvDrmService$checkDeviceRooted$1(OgvDrmService ogvDrmService, Continuation<? super OgvDrmService$checkDeviceRooted$1> continuation) {
        super(continuation);
        this.this$0 = ogvDrmService;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return OgvDrmService.a(this.this$0, this);
    }
}
