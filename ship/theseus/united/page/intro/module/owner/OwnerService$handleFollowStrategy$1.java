package com.bilibili.ship.theseus.united.page.intro.module.owner;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/owner/OwnerService$handleFollowStrategy$1.class */
final class OwnerService$handleFollowStrategy$1 extends ContinuationImpl {
    Object L$0;
    int label;
    Object result;
    final OwnerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OwnerService$handleFollowStrategy$1(OwnerService ownerService, Continuation<? super OwnerService$handleFollowStrategy$1> continuation) {
        super(continuation);
        this.this$0 = ownerService;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return OwnerService.b(this.this$0, null, this);
    }
}
