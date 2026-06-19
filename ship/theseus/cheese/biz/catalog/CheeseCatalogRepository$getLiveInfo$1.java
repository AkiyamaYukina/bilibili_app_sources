package com.bilibili.ship.theseus.cheese.biz.catalog;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/catalog/CheeseCatalogRepository$getLiveInfo$1.class */
final class CheeseCatalogRepository$getLiveInfo$1 extends ContinuationImpl {
    int label;
    Object result;
    final CheeseCatalogRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseCatalogRepository$getLiveInfo$1(CheeseCatalogRepository cheeseCatalogRepository, Continuation<? super CheeseCatalogRepository$getLiveInfo$1> continuation) {
        super(continuation);
        this.this$0 = cheeseCatalogRepository;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(0L, this);
    }
}
