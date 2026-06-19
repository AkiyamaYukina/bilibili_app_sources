package com.bilibili.ship.theseus.united.page.intro.module.merchandise;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/merchandise/MerchandiseService$refreshFloorInfo$1.class */
final class MerchandiseService$refreshFloorInfo$1 extends ContinuationImpl {
    int label;
    Object result;
    final MerchandiseService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MerchandiseService$refreshFloorInfo$1(MerchandiseService merchandiseService, Continuation<? super MerchandiseService$refreshFloorInfo$1> continuation) {
        super(continuation);
        this.this$0 = merchandiseService;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return MerchandiseService.a(this.this$0, this);
    }
}
