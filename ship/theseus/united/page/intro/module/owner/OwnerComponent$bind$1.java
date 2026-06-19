package com.bilibili.ship.theseus.united.page.intro.module.owner;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/owner/OwnerComponent$bind$1.class */
public final class OwnerComponent$bind$1 extends ContinuationImpl {
    int label;
    Object result;
    final OwnerComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OwnerComponent$bind$1(OwnerComponent ownerComponent, Continuation<? super OwnerComponent$bind$1> continuation) {
        super(continuation);
        this.this$0 = ownerComponent;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
